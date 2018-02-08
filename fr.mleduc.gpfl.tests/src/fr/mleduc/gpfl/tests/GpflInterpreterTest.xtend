package fr.mleduc.gpfl.tests

import com.google.inject.Inject
import fr.mleduc.gpfl.gpfl.Program
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Packet
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Tuple
import fr.mleduc.gpfl.interpreter.IGpflInterpreter
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static fr.mleduc.gpfl.interpreter.GpflInterpreter.Port.*
import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(GpflInjectorProvider)
class GpflInterpreterTest {

	@Inject private extension ParseHelper<Program> parseHelper
	@Inject private extension IGpflInterpreter

	@Test
	def test1() {

		val program = '''
			package test1
			PROLOGUE
			AUTOMATAS
			AUTOMATA dhcp init = s0
				s0
					- disc -> s1
					- rel -> s3
				s1
					- req -> s2
					- rej -> s2
				s2
					- ack -> s0
				s3
				  	- ack -> s0
			INIT
				newAutomaton(A, dhcp)
				set(ignorePacketCount, 0)
				set(ignorePacketThreshold, 5)
				newInterrupt(60, true, set(ignorePacketCount, 0))
			FILTER
				cond(_inPort == inSide, 
					cond( pktType == "Ack" && clientId == currentClient, 
						step(A, ack, nop)
						set(currentClient, "")
					)
					accept
				)
				
				cond(_inPort == outSide,
					cond(pktType == "Disc",
						step(A, disc,
							set(ignorePacketCount, ignorePacketCount+1)
							cond(ignorePacketCount >= ignorePacketThreshold,
								alarm("Many external messages ignored!")
								set(ignorePacketCount, 0)
							)
							drop
						)
						set(currentClient, clientId)
						accept
					)
					cond(pktType == "Req" || pktType == "Rej",
						cond(!(clientId == currentClient),
							set(ignorePacketCount, ignorePacketCount+1)
							cond(ignorePacketCount >= ignorePacketThreshold,
								alarm("Many external messages ignored!")
								set(ignorePacketCount, 0)
							)
							drop
						)
						accept
					)
					cond(pktType == "Rel", 
						step(A, rel,
							set(ignorePacketCount, ignorePacketCount+1)
							cond(ignorePacketCount >= ignorePacketThreshold,
								alarm("Many external messages ignored!")
								set(ignorePacketCount, 0)
							)
							drop
						)
						set(currentClient, clientId)
						accept
					)
					drop
				)
				alarm("Unhandled message")
				drop
		'''.parse

		val res = program.run(
			newArrayList(new Tuple(10, new Packet(OUT, #{"pktType" -> "Rel", "clientId" -> "1"})),
				new Tuple(20, new Packet(OUT, #{"pktType" -> "Ack", "clientId" -> "1"}))))

		assertEquals(newArrayList, res)

	}
}

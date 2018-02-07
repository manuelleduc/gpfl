package fr.mleduc.gpfl.tests

import com.google.inject.Inject
import com.google.inject.Provider
import fr.mleduc.gpfl.interpreter.GpflInterpreter
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Packet
import fr.mleduc.gpfl.interpreter.GpflInterpreter.Tuple
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.util.StringInputStream
import org.junit.Test
import org.junit.runner.RunWith

import static fr.mleduc.gpfl.interpreter.GpflInterpreter.Port.*
import static org.junit.Assert.*
import fr.mleduc.gpfl.gpfl.Program

@RunWith(XtextRunner)
@InjectWith(GpflInjectorProvider)
class GpflInterpreterTest {

//	@Inject private extension ParseHelper<Program> parseHelper
	@Inject private extension GpflInterpreter
	@Inject ValidationTestHelper helper
	@Inject Provider<XtextResourceSet> rsp

//	@Inject private IBatchTypeResolver typeResolver
	@Test
	def test1() {

		val rs = rsp.get
		rs.classpathURIContext = GpflInterpreterTest

		val r = rs.createResource(URI.createURI("test.gpfl"))
		val program = '''
			package test 
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
			alarm("Unhandled message")
			drop
		'''

		r.load(new StringInputStream(program), null)

		helper.assertNoIssues(r)

		val programModel = r.contents.head as Program
		val res = programModel.run(newArrayList(new Tuple(1, new Packet(IN, #{"pktType" -> "Ack", "clientId" -> "1"}))))

		assertEquals(newArrayList, res)

	}
}

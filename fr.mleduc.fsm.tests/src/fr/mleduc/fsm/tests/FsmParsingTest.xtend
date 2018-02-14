/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.fsm.tests

import com.google.inject.Inject
import fr.mleduc.fsm.fsm.Fsm
import fr.mleduc.fsm.interpreter.IFsmInterpreter
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(FsmInjectorProvider)
class FsmParsingTest {
	@Inject extension ParseHelper<Fsm>

	@Inject private extension IFsmInterpreter

	@Test
	def void loadModel() {
		val result = '''
			fsm test init = s0
			s0
			- a => s1
			- b => s2 
			- c => s0
			s1
			- a => s0
			- b => s1
			- c => s1
			s2
			- a => s0
			- b => s1 
			- c => s2
		'''.parse
		assertNotNull(result)
		assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void testInterpreter() {
		val result = '''
			fsm test init = s0
			s0
			- c => s0
			- a => s1
			- b => s2 
			s1
			- a => s0
			- c => s1
			- b => s2
			s2
			- a => s0
			- b => s1 
			- c => s2
		'''.parse

		val ret = result.run(#['a', 'b', 'a'])

		assertEquals(#['s0', 's1', 's2'], ret)
	}
}

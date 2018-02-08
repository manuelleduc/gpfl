package fr.mleduc.gpfl.tests;

import com.google.inject.Inject;
import fr.mleduc.gpfl.gpfl.Program;
import fr.mleduc.gpfl.interpreter.GpflInterpreter;
import fr.mleduc.gpfl.tests.GpflInjectorProvider;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GpflInjectorProvider.class)
@SuppressWarnings("all")
public class GpflInterpreterTest {
  @Inject
  @Extension
  private ParseHelper<Program> parseHelper;
  
  @Inject
  @Extension
  private GpflInterpreter _gpflInterpreter;
  
  @Test
  public void test1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test ");
      _builder.newLine();
      _builder.append("PROLOGUE");
      _builder.newLine();
      _builder.append("AUTOMATAS");
      _builder.newLine();
      _builder.append("AUTOMATA dhcp init = s0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s0");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("- disc -> s1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("- rel -> s3");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("- req -> s2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("- rej -> s2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("- ack -> s0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s3");
      _builder.newLine();
      _builder.append("\t  \t");
      _builder.append("- ack -> s0");
      _builder.newLine();
      _builder.append("INIT");
      _builder.newLine();
      _builder.append("newAutomaton(A, dhcp)");
      _builder.newLine();
      _builder.append("set(ignorePacketCount, 0)");
      _builder.newLine();
      _builder.append("set(ignorePacketThreshold, 5)");
      _builder.newLine();
      _builder.append("newInterrupt(60, true, set(ignorePacketCount, 0))");
      _builder.newLine();
      _builder.append("FILTER");
      _builder.newLine();
      _builder.append("cond(_inPort == inSide, ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("cond( pktType == \"Ack\" && clientId == currentClient, ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("step(A, ack, nop)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("set(currentClient, \"\")");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("accept");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _builder.append("alarm(\"Unhandled message\")");
      _builder.newLine();
      _builder.append("drop");
      _builder.newLine();
      final Program program = this.parseHelper.parse(_builder);
      Pair<String, String> _mappedTo = Pair.<String, String>of("pktType", "Ack");
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("clientId", "1");
      GpflInterpreter.Packet _packet = new GpflInterpreter.Packet(GpflInterpreter.Port.IN, Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1)));
      GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet> _tuple = new GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet>(Integer.valueOf(1), _packet);
      final List<String> res = this._gpflInterpreter.run(program, CollectionLiterals.<GpflInterpreter.Tuple<Integer, GpflInterpreter.Packet>>newArrayList(_tuple));
      Assert.assertEquals(CollectionLiterals.<Object>newArrayList(), res);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

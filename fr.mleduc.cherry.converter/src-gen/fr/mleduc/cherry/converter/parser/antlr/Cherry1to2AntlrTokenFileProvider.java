/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.cherry.converter.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Cherry1to2AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/mleduc/cherry/converter/parser/antlr/internal/InternalCherry1to2.tokens");
	}
}
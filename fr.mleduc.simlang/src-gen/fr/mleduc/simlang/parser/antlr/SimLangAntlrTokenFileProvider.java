/*
 * generated by Xtext 2.12.0
 */
package fr.mleduc.simlang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/mleduc/simlang/parser/antlr/internal/InternalSimLang.tokens");
	}
}

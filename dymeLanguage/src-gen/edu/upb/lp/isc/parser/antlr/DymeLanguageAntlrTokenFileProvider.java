/*
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DymeLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("edu/upb/lp/isc/parser/antlr/internal/InternalDymeLanguage.tokens");
	}
}

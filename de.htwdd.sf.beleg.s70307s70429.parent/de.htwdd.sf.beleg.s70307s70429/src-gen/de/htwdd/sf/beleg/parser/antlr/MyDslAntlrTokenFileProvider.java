/*
 * generated by Xtext 2.9.2
 */
package de.htwdd.sf.beleg.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/htwdd/sf/beleg/parser/antlr/internal/InternalMyDsl.tokens");
	}
}

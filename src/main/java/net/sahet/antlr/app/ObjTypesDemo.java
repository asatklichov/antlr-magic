package net.sahet.antlr.app;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.sahet.parsers.ObjectTypesLexer;
import net.sahet.parsers.ObjectTypesParser;


public class ObjTypesDemo {

	//{3,{3,4},34324}
	//Ctrl+D or ^Z
	public static void main(String[] args) throws Exception {
		// read CharStream
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// lexer uses char-stream to feed parser
		ObjectTypesLexer lexer = new ObjectTypesLexer(input);
		// token stream made from lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// parser
		ObjectTypesParser parser = new ObjectTypesParser(tokens);
		ParseTree tree = parser.object(); // parse object rule
		System.out.println(tree.toStringTree(parser));
	}

}

// Generated from ShortestCobolGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShortestCobolGrammarParser}.
 */
public interface ShortestCobolGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#cobolProgram}.
	 * @param ctx the parse tree
	 */
	void enterCobolProgram(ShortestCobolGrammarParser.CobolProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#cobolProgram}.
	 * @param ctx the parse tree
	 */
	void exitCobolProgram(ShortestCobolGrammarParser.CobolProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#programUnit}.
	 * @param ctx the parse tree
	 */
	void enterProgramUnit(ShortestCobolGrammarParser.ProgramUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#programUnit}.
	 * @param ctx the parse tree
	 */
	void exitProgramUnit(ShortestCobolGrammarParser.ProgramUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	void enterIdentificationDivision(ShortestCobolGrammarParser.IdentificationDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#identificationDivision}.
	 * @param ctx the parse tree
	 */
	void exitIdentificationDivision(ShortestCobolGrammarParser.IdentificationDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#programId}.
	 * @param ctx the parse tree
	 */
	void enterProgramId(ShortestCobolGrammarParser.ProgramIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#programId}.
	 * @param ctx the parse tree
	 */
	void exitProgramId(ShortestCobolGrammarParser.ProgramIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(ShortestCobolGrammarParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(ShortestCobolGrammarParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDivision(ShortestCobolGrammarParser.ProcedureDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#procedureDivision}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDivision(ShortestCobolGrammarParser.ProcedureDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(ShortestCobolGrammarParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(ShortestCobolGrammarParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShortestCobolGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(ShortestCobolGrammarParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShortestCobolGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(ShortestCobolGrammarParser.MessageContext ctx);
}
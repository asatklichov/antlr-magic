// Generated from ShortestCobolGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShortestCobolGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DISPLAY=1, DIVISION=2, IDENTIFICATION=3, PROCEDURE=4, PROGRAM_ID=5, IDENTIFIER=6, 
		INT=7, NUMBER=8, WORD=9, DOT_FS=10, DOT=11, DOUBLEQUOTE=12, MINUSCHAR=13, 
		PLUSCHAR=14, WS=15, NEWLINE=16;
	public static final int
		RULE_cobolProgram = 0, RULE_programUnit = 1, RULE_identificationDivision = 2, 
		RULE_programId = 3, RULE_programName = 4, RULE_procedureDivision = 5, 
		RULE_displayStatement = 6, RULE_message = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"cobolProgram", "programUnit", "identificationDivision", "programId", 
			"programName", "procedureDivision", "displayStatement", "message"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'.'", 
			"'\"'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DISPLAY", "DIVISION", "IDENTIFICATION", "PROCEDURE", "PROGRAM_ID", 
			"IDENTIFIER", "INT", "NUMBER", "WORD", "DOT_FS", "DOT", "DOUBLEQUOTE", 
			"MINUSCHAR", "PLUSCHAR", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ShortestCobolGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShortestCobolGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CobolProgramContext extends ParserRuleContext {
		public ProgramUnitContext programUnit() {
			return getRuleContext(ProgramUnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ShortestCobolGrammarParser.EOF, 0); }
		public CobolProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobolProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterCobolProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitCobolProgram(this);
		}
	}

	public final CobolProgramContext cobolProgram() throws RecognitionException {
		CobolProgramContext _localctx = new CobolProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cobolProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			programUnit();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramUnitContext extends ParserRuleContext {
		public IdentificationDivisionContext identificationDivision() {
			return getRuleContext(IdentificationDivisionContext.class,0);
		}
		public ProcedureDivisionContext procedureDivision() {
			return getRuleContext(ProcedureDivisionContext.class,0);
		}
		public ProgramUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterProgramUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitProgramUnit(this);
		}
	}

	public final ProgramUnitContext programUnit() throws RecognitionException {
		ProgramUnitContext _localctx = new ProgramUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			identificationDivision();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDURE) {
				{
				setState(20);
				procedureDivision();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificationDivisionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION() { return getToken(ShortestCobolGrammarParser.IDENTIFICATION, 0); }
		public TerminalNode DIVISION() { return getToken(ShortestCobolGrammarParser.DIVISION, 0); }
		public TerminalNode DOT_FS() { return getToken(ShortestCobolGrammarParser.DOT_FS, 0); }
		public ProgramIdContext programId() {
			return getRuleContext(ProgramIdContext.class,0);
		}
		public IdentificationDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificationDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterIdentificationDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitIdentificationDivision(this);
		}
	}

	public final IdentificationDivisionContext identificationDivision() throws RecognitionException {
		IdentificationDivisionContext _localctx = new IdentificationDivisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identificationDivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(IDENTIFICATION);
			setState(24);
			match(DIVISION);
			setState(25);
			match(DOT_FS);
			setState(26);
			programId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramIdContext extends ParserRuleContext {
		public TerminalNode PROGRAM_ID() { return getToken(ShortestCobolGrammarParser.PROGRAM_ID, 0); }
		public List<TerminalNode> DOT_FS() { return getTokens(ShortestCobolGrammarParser.DOT_FS); }
		public TerminalNode DOT_FS(int i) {
			return getToken(ShortestCobolGrammarParser.DOT_FS, i);
		}
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public ProgramIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterProgramId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitProgramId(this);
		}
	}

	public final ProgramIdContext programId() throws RecognitionException {
		ProgramIdContext _localctx = new ProgramIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(PROGRAM_ID);
			setState(29);
			match(DOT_FS);
			setState(30);
			programName();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_FS) {
				{
				setState(31);
				match(DOT_FS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ShortestCobolGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ShortestCobolGrammarParser.IDENTIFIER, i);
		}
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				match(IDENTIFIER);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDivisionContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(ShortestCobolGrammarParser.PROCEDURE, 0); }
		public TerminalNode DIVISION() { return getToken(ShortestCobolGrammarParser.DIVISION, 0); }
		public TerminalNode DOT_FS() { return getToken(ShortestCobolGrammarParser.DOT_FS, 0); }
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public ProcedureDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterProcedureDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitProcedureDivision(this);
		}
	}

	public final ProcedureDivisionContext procedureDivision() throws RecognitionException {
		ProcedureDivisionContext _localctx = new ProcedureDivisionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(PROCEDURE);
			setState(40);
			match(DIVISION);
			setState(41);
			match(DOT_FS);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISPLAY) {
				{
				setState(42);
				displayStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(ShortestCobolGrammarParser.DISPLAY, 0); }
		public List<TerminalNode> DOUBLEQUOTE() { return getTokens(ShortestCobolGrammarParser.DOUBLEQUOTE); }
		public TerminalNode DOUBLEQUOTE(int i) {
			return getToken(ShortestCobolGrammarParser.DOUBLEQUOTE, i);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode DOT_FS() { return getToken(ShortestCobolGrammarParser.DOT_FS, 0); }
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitDisplayStatement(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(DISPLAY);
			setState(46);
			match(DOUBLEQUOTE);
			setState(47);
			message();
			setState(48);
			match(DOUBLEQUOTE);
			setState(49);
			match(DOT_FS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ShortestCobolGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ShortestCobolGrammarParser.IDENTIFIER, i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShortestCobolGrammarListener ) ((ShortestCobolGrammarListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_message);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(IDENTIFIER);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\6\6&\n\6"+
		"\r\6\16\6\'\3\7\3\7\3\7\3\7\5\7.\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\t\67"+
		"\n\t\r\t\16\t8\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\67\2\22\3\2\2\2\4\25"+
		"\3\2\2\2\6\31\3\2\2\2\b\36\3\2\2\2\n%\3\2\2\2\f)\3\2\2\2\16/\3\2\2\2\20"+
		"\66\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\27\5\6\4\2\26"+
		"\30\5\f\7\2\27\26\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\32\7\5\2\2\32"+
		"\33\7\4\2\2\33\34\7\f\2\2\34\35\5\b\5\2\35\7\3\2\2\2\36\37\7\7\2\2\37"+
		" \7\f\2\2 \"\5\n\6\2!#\7\f\2\2\"!\3\2\2\2\"#\3\2\2\2#\t\3\2\2\2$&\7\b"+
		"\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\13\3\2\2\2)*\7\6\2\2"+
		"*+\7\4\2\2+-\7\f\2\2,.\5\16\b\2-,\3\2\2\2-.\3\2\2\2.\r\3\2\2\2/\60\7\3"+
		"\2\2\60\61\7\16\2\2\61\62\5\20\t\2\62\63\7\16\2\2\63\64\7\f\2\2\64\17"+
		"\3\2\2\2\65\67\7\b\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9\21\3\2\2\2\7\27\"\'-8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
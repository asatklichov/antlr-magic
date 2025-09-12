// Generated from ShortestCobolLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShortestCobolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DISPLAY=1, DIVISION=2, IDENTIFICATION=3, PROCEDURE=4, PROGRAM_ID=5, IDENTIFIER=6, 
		INT=7, NUMBER=8, WORD=9, DOT_FS=10, DOT=11, DOUBLEQUOTE=12, MINUSCHAR=13, 
		PLUSCHAR=14, WS=15, NEWLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DISPLAY", "DIVISION", "IDENTIFICATION", "PROCEDURE", "PROGRAM_ID", "IDENTIFIER", 
			"INT", "NUMBER", "WORD", "DOT_FS", "DOT", "DOUBLEQUOTE", "MINUSCHAR", 
			"PLUSCHAR", "WS", "NEWLINE", "A", "B", "C", "D", "E", "F", "G", "H", 
			"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
			"W", "X", "Y", "Z", "LOWERCASE", "UPPERCASE", "DIGIT"
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


	public ShortestCobolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ShortestCobolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7\u0094\n\7\r\7\16\7\u0095\3\7\7\7\u0099"+
		"\n\7\f\7\16\7\u009c\13\7\3\b\3\b\5\b\u00a0\n\b\3\b\6\b\u00a3\n\b\r\b\16"+
		"\b\u00a4\3\t\6\t\u00a8\n\t\r\t\16\t\u00a9\3\t\3\t\6\t\u00ae\n\t\r\t\16"+
		"\t\u00af\5\t\u00b2\n\t\3\n\3\n\3\n\6\n\u00b7\n\n\r\n\16\n\u00b8\3\13\3"+
		"\13\6\13\u00bd\n\13\r\13\16\13\u00be\3\13\3\13\3\13\5\13\u00c4\n\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u00cf\n\20\r\20\16\20\u00d0"+
		"\3\20\3\20\3\21\5\21\u00d6\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2"+
		"?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2\3\2$\5\2\62;C\\c|\7\2//"+
		"\62;C\\aac|\3\2\62;\4\2..\60\60\5\2\13\f\16\17\"\"\6\2\13\13\16\16\"\""+
		"==\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\3\2c|\3\2C\\\2\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\3]\3\2\2\2\5e\3\2\2\2\7n\3\2\2\2\t}\3\2\2\2\13\u0087\3"+
		"\2\2\2\r\u0093\3\2\2\2\17\u009f\3\2\2\2\21\u00a7\3\2\2\2\23\u00b6\3\2"+
		"\2\2\25\u00c3\3\2\2\2\27\u00c5\3\2\2\2\31\u00c7\3\2\2\2\33\u00c9\3\2\2"+
		"\2\35\u00cb\3\2\2\2\37\u00ce\3\2\2\2!\u00d5\3\2\2\2#\u00db\3\2\2\2%\u00dd"+
		"\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3\2\2\2"+
		"/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67"+
		"\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2"+
		"\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u00ff\3\2\2\2I\u0101"+
		"\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2\2\2S"+
		"\u010b\3\2\2\2U\u010d\3\2\2\2W\u010f\3\2\2\2Y\u0111\3\2\2\2[\u0113\3\2"+
		"\2\2]^\5)\25\2^_\5\63\32\2_`\5G$\2`a\5A!\2ab\59\35\2bc\5#\22\2cd\5S*\2"+
		"d\4\3\2\2\2ef\5)\25\2fg\5\63\32\2gh\5M\'\2hi\5\63\32\2ij\5G$\2jk\5\63"+
		"\32\2kl\5? \2lm\5=\37\2m\6\3\2\2\2no\5\63\32\2op\5)\25\2pq\5+\26\2qr\5"+
		"=\37\2rs\5I%\2st\5\63\32\2tu\5-\27\2uv\5\63\32\2vw\5\'\24\2wx\5#\22\2"+
		"xy\5I%\2yz\5\63\32\2z{\5? \2{|\5=\37\2|\b\3\2\2\2}~\5A!\2~\177\5E#\2\177"+
		"\u0080\5? \2\u0080\u0081\5\'\24\2\u0081\u0082\5+\26\2\u0082\u0083\5)\25"+
		"\2\u0083\u0084\5K&\2\u0084\u0085\5E#\2\u0085\u0086\5+\26\2\u0086\n\3\2"+
		"\2\2\u0087\u0088\5A!\2\u0088\u0089\5E#\2\u0089\u008a\5? \2\u008a\u008b"+
		"\5/\30\2\u008b\u008c\5E#\2\u008c\u008d\5#\22\2\u008d\u008e\5;\36\2\u008e"+
		"\u008f\5\33\16\2\u008f\u0090\5\63\32\2\u0090\u0091\5)\25\2\u0091\f\3\2"+
		"\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0099\t\3"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\16\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\5\35\17"+
		"\2\u009e\u00a0\5\33\16\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\20\3\2\2\2\u00a6\u00a8\5[.\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ad"+
		"\t\5\2\2\u00ac\u00ae\5[.\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\22\3\2\2\2\u00b3\u00b7\5W,\2\u00b4\u00b7"+
		"\5Y-\2\u00b5\u00b7\7a\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\24\3\2\2\2\u00ba\u00bc\5\27\f\2\u00bb\u00bd\t\6\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c4\3\2\2\2\u00c0\u00c1\5\27\f\2\u00c1\u00c2\7\2\2\3\u00c2\u00c4\3"+
		"\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\26\3\2\2\2\u00c5"+
		"\u00c6\7\60\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8\32\3\2\2\2\u00c9"+
		"\u00ca\7/\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc\36\3\2\2\2\u00cd"+
		"\u00cf\t\7\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\20\2\2\u00d3"+
		" \3\2\2\2\u00d4\u00d6\7\17\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\b\21\2\2\u00da\"\3\2\2\2\u00db\u00dc\t\b\2\2\u00dc$\3\2\2\2\u00dd\u00de"+
		"\t\t\2\2\u00de&\3\2\2\2\u00df\u00e0\t\n\2\2\u00e0(\3\2\2\2\u00e1\u00e2"+
		"\t\13\2\2\u00e2*\3\2\2\2\u00e3\u00e4\t\f\2\2\u00e4,\3\2\2\2\u00e5\u00e6"+
		"\t\r\2\2\u00e6.\3\2\2\2\u00e7\u00e8\t\16\2\2\u00e8\60\3\2\2\2\u00e9\u00ea"+
		"\t\17\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\t\20\2\2\u00ec\64\3\2\2\2\u00ed"+
		"\u00ee\t\21\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\t\22\2\2\u00f08\3\2\2\2\u00f1"+
		"\u00f2\t\23\2\2\u00f2:\3\2\2\2\u00f3\u00f4\t\24\2\2\u00f4<\3\2\2\2\u00f5"+
		"\u00f6\t\25\2\2\u00f6>\3\2\2\2\u00f7\u00f8\t\26\2\2\u00f8@\3\2\2\2\u00f9"+
		"\u00fa\t\27\2\2\u00faB\3\2\2\2\u00fb\u00fc\t\30\2\2\u00fcD\3\2\2\2\u00fd"+
		"\u00fe\t\31\2\2\u00feF\3\2\2\2\u00ff\u0100\t\32\2\2\u0100H\3\2\2\2\u0101"+
		"\u0102\t\33\2\2\u0102J\3\2\2\2\u0103\u0104\t\34\2\2\u0104L\3\2\2\2\u0105"+
		"\u0106\t\35\2\2\u0106N\3\2\2\2\u0107\u0108\t\36\2\2\u0108P\3\2\2\2\u0109"+
		"\u010a\t\37\2\2\u010aR\3\2\2\2\u010b\u010c\t \2\2\u010cT\3\2\2\2\u010d"+
		"\u010e\t!\2\2\u010eV\3\2\2\2\u010f\u0110\t\"\2\2\u0110X\3\2\2\2\u0111"+
		"\u0112\t#\2\2\u0112Z\3\2\2\2\u0113\u0114\t\4\2\2\u0114\\\3\2\2\2\20\2"+
		"\u0095\u009a\u009f\u00a4\u00a9\u00af\u00b1\u00b6\u00b8\u00be\u00c3\u00d0"+
		"\u00d5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
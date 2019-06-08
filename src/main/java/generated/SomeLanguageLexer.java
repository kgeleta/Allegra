package generated;// Generated from SomeLanguage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SomeLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, IS=2, BEGIN=3, END=4, RETURN=5, FUNCTION=6, TIMES=7, DIV=8, PLUS=9, 
		MINUS=10, COLON=11, SEMI=12, COMMA=13, LEFT_PAREN=14, RIGHT_PAREN=15, 
		EQUAL=16, GREATER=17, LESSER=18, GREATER_EQUAL=19, LESSER_EQUAL=20, AND=21, 
		OR=22, PRINTF=23, RELATION_OPERATOR=24, ASSIGN=25, TYPE=26, INTEGER_VALUE=27, 
		STRING_VALUE=28, ID=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "IS", "BEGIN", "END", "RETURN", "FUNCTION", "TIMES", "DIV", "PLUS", 
		"MINUS", "COLON", "SEMI", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", "EQUAL", 
		"GREATER", "LESSER", "GREATER_EQUAL", "LESSER_EQUAL", "AND", "OR", "PRINTF", 
		"RELATION_OPERATOR", "ASSIGN", "TYPE", "INTEGER_VALUE", "STRING_VALUE", 
		"ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'is'", "'begin'", "'end'", "'return'", "'function'", 
		"'*'", "'/'", "'+'", "'-'", "':'", "';'", "','", "'('", "')'", "'=='", 
		"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'printf'", null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "IS", "BEGIN", "END", "RETURN", "FUNCTION", "TIMES", "DIV", 
		"PLUS", "MINUS", "COLON", "SEMI", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", 
		"EQUAL", "GREATER", "LESSER", "GREATER_EQUAL", "LESSER_EQUAL", "AND", 
		"OR", "PRINTF", "RELATION_OPERATOR", "ASSIGN", "TYPE", "INTEGER_VALUE", 
		"STRING_VALUE", "ID", "WS"
	};
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


	public SomeLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SomeLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0094\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00a6\n\33\3\34\3\34\3\34"+
		"\7\34\u00ab\n\34\f\34\16\34\u00ae\13\34\5\34\u00b0\n\34\3\35\3\35\7\35"+
		"\u00b4\n\35\f\35\16\35\u00b7\13\35\3\35\3\35\3\36\6\36\u00bc\n\36\r\36"+
		"\16\36\u00bd\3\36\7\36\u00c1\n\36\f\36\16\36\u00c4\13\36\3\37\6\37\u00c7"+
		"\n\37\r\37\16\37\u00c8\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\b\3\2\63;\3\2\62;\3\2$$\4\2"+
		"C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00d6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2"+
		"\2\2\5E\3\2\2\2\7H\3\2\2\2\tN\3\2\2\2\13R\3\2\2\2\rY\3\2\2\2\17b\3\2\2"+
		"\2\21d\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2"+
		"\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2"+
		")~\3\2\2\2+\u0081\3\2\2\2-\u0084\3\2\2\2/\u0087\3\2\2\2\61\u0093\3\2\2"+
		"\2\63\u0095\3\2\2\2\65\u00a5\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;"+
		"\u00bb\3\2\2\2=\u00c6\3\2\2\2?@\7e\2\2@A\7n\2\2AB\7c\2\2BC\7u\2\2CD\7"+
		"u\2\2D\4\3\2\2\2EF\7k\2\2FG\7u\2\2G\6\3\2\2\2HI\7d\2\2IJ\7g\2\2JK\7i\2"+
		"\2KL\7k\2\2LM\7p\2\2M\b\3\2\2\2NO\7g\2\2OP\7p\2\2PQ\7f\2\2Q\n\3\2\2\2"+
		"RS\7t\2\2ST\7g\2\2TU\7v\2\2UV\7w\2\2VW\7t\2\2WX\7p\2\2X\f\3\2\2\2YZ\7"+
		"h\2\2Z[\7w\2\2[\\\7p\2\2\\]\7e\2\2]^\7v\2\2^_\7k\2\2_`\7q\2\2`a\7p\2\2"+
		"a\16\3\2\2\2bc\7,\2\2c\20\3\2\2\2de\7\61\2\2e\22\3\2\2\2fg\7-\2\2g\24"+
		"\3\2\2\2hi\7/\2\2i\26\3\2\2\2jk\7<\2\2k\30\3\2\2\2lm\7=\2\2m\32\3\2\2"+
		"\2no\7.\2\2o\34\3\2\2\2pq\7*\2\2q\36\3\2\2\2rs\7+\2\2s \3\2\2\2tu\7?\2"+
		"\2uv\7?\2\2v\"\3\2\2\2wx\7@\2\2x$\3\2\2\2yz\7>\2\2z&\3\2\2\2{|\7@\2\2"+
		"|}\7?\2\2}(\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080*\3\2\2\2\u0081"+
		"\u0082\7(\2\2\u0082\u0083\7(\2\2\u0083,\3\2\2\2\u0084\u0085\7~\2\2\u0085"+
		"\u0086\7~\2\2\u0086.\3\2\2\2\u0087\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7h\2\2"+
		"\u008d\60\3\2\2\2\u008e\u0094\5!\21\2\u008f\u0094\5\'\24\2\u0090\u0094"+
		"\5#\22\2\u0091\u0094\5%\23\2\u0092\u0094\5)\25\2\u0093\u008e\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\62\3\2\2\2\u0095\u0096\7<\2\2\u0096\u0097\7?\2\2\u0097\64\3"+
		"\2\2\2\u0098\u0099\7K\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7i\2\2\u009d\u009e\7g\2\2\u009e\u00a6\7t\2\2"+
		"\u009f\u00a0\7U\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a6\7i\2\2\u00a5\u0098\3\2\2\2\u00a5"+
		"\u009f\3\2\2\2\u00a6\66\3\2\2\2\u00a7\u00b0\7\62\2\2\u00a8\u00ac\t\2\2"+
		"\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00af\u00a8\3\2\2\2\u00b08\3\2\2\2\u00b1\u00b5\7$\2\2\u00b2"+
		"\u00b4\n\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7$\2\2\u00b9:\3\2\2\2\u00ba\u00bc\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2"+
		"\2\2\u00bf\u00c1\t\6\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3<\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c7\t\7\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\37\2\2"+
		"\u00cb>\3\2\2\2\13\2\u0093\u00a5\u00ac\u00af\u00b5\u00bd\u00c2\u00c8\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
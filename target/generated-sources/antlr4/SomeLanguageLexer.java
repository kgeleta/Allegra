// Generated from SomeLanguage.g4 by ANTLR 4.7
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
		ASSIGN=16, TYPE=17, INTEGER_VALUE=18, STRING_VALUE=19, ID=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "IS", "BEGIN", "END", "RETURN", "FUNCTION", "TIMES", "DIV", "PLUS", 
		"MINUS", "COLON", "SEMI", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", "ASSIGN", 
		"TYPE", "INTEGER_VALUE", "STRING_VALUE", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'is'", "'begin'", "'end'", "'return'", "'function'", 
		"'*'", "'/'", "'+'", "'-'", "':'", "';'", "','", "'('", "')'", "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "IS", "BEGIN", "END", "RETURN", "FUNCTION", "TIMES", "DIV", 
		"PLUS", "MINUS", "COLON", "SEMI", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", 
		"ASSIGN", "TYPE", "INTEGER_VALUE", "STRING_VALUE", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"s\n\22\3\23\3\23\3\23\7\23x\n\23\f\23\16\23{\13\23\5\23}\n\23\3\24\3\24"+
		"\7\24\u0081\n\24\f\24\16\24\u0084\13\24\3\24\3\24\3\25\6\25\u0089\n\25"+
		"\r\25\16\25\u008a\3\25\7\25\u008e\n\25\f\25\16\25\u0091\13\25\3\26\6\26"+
		"\u0094\n\26\r\26\16\26\u0095\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27\3\2\b\3\2\63;\3\2\62;\3\2$$\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2"+
		"\2\5\63\3\2\2\2\7\66\3\2\2\2\t<\3\2\2\2\13@\3\2\2\2\rG\3\2\2\2\17P\3\2"+
		"\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\"+
		"\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#r\3\2\2\2%|\3\2\2\2\'~\3\2"+
		"\2\2)\u0088\3\2\2\2+\u0093\3\2\2\2-.\7e\2\2./\7n\2\2/\60\7c\2\2\60\61"+
		"\7u\2\2\61\62\7u\2\2\62\4\3\2\2\2\63\64\7k\2\2\64\65\7u\2\2\65\6\3\2\2"+
		"\2\66\67\7d\2\2\678\7g\2\289\7i\2\29:\7k\2\2:;\7p\2\2;\b\3\2\2\2<=\7g"+
		"\2\2=>\7p\2\2>?\7f\2\2?\n\3\2\2\2@A\7t\2\2AB\7g\2\2BC\7v\2\2CD\7w\2\2"+
		"DE\7t\2\2EF\7p\2\2F\f\3\2\2\2GH\7h\2\2HI\7w\2\2IJ\7p\2\2JK\7e\2\2KL\7"+
		"v\2\2LM\7k\2\2MN\7q\2\2NO\7p\2\2O\16\3\2\2\2PQ\7,\2\2Q\20\3\2\2\2RS\7"+
		"\61\2\2S\22\3\2\2\2TU\7-\2\2U\24\3\2\2\2VW\7/\2\2W\26\3\2\2\2XY\7<\2\2"+
		"Y\30\3\2\2\2Z[\7=\2\2[\32\3\2\2\2\\]\7.\2\2]\34\3\2\2\2^_\7*\2\2_\36\3"+
		"\2\2\2`a\7+\2\2a \3\2\2\2bc\7<\2\2cd\7?\2\2d\"\3\2\2\2ef\7K\2\2fg\7p\2"+
		"\2gh\7v\2\2hi\7g\2\2ij\7i\2\2jk\7g\2\2ks\7t\2\2lm\7U\2\2mn\7v\2\2no\7"+
		"t\2\2op\7k\2\2pq\7p\2\2qs\7i\2\2re\3\2\2\2rl\3\2\2\2s$\3\2\2\2t}\7\62"+
		"\2\2uy\t\2\2\2vx\t\3\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2|t\3\2\2\2|u\3\2\2\2}&\3\2\2\2~\u0082\7$\2\2\177\u0081\n"+
		"\4\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7$"+
		"\2\2\u0086(\3\2\2\2\u0087\u0089\t\5\2\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\3\2\2\2\u008c"+
		"\u008e\t\6\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090*\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094"+
		"\t\7\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\26\2\2\u0098,\3\2\2\2"+
		"\n\2ry|\u0082\u008a\u008f\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
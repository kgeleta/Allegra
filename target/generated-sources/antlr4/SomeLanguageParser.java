// Generated from SomeLanguage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SomeLanguageParser extends Parser {
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
	public static final int
		RULE_classDeclaration = 0, RULE_className = 1, RULE_variableDeclaration = 2, 
		RULE_function = 3, RULE_argument = 4, RULE_assignment = 5, RULE_value = 6, 
		RULE_expression = 7, RULE_functionCall = 8, RULE_logicalEquation = 9, 
		RULE_printfCall = 10, RULE_line = 11;
	public static final String[] ruleNames = {
		"classDeclaration", "className", "variableDeclaration", "function", "argument", 
		"assignment", "value", "expression", "functionCall", "logicalEquation", 
		"printfCall", "line"
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

	@Override
	public String getGrammarFileName() { return "SomeLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SomeLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SomeLanguageParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(SomeLanguageParser.IS, 0); }
		public TerminalNode BEGIN() { return getToken(SomeLanguageParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SomeLanguageParser.END, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(CLASS);
			setState(25);
			className();
			setState(26);
			match(IS);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(27);
				variableDeclaration();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(33);
				function();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(BEGIN);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTF || _la==ID) {
				{
				{
				setState(40);
				line();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(END);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SomeLanguageParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SomeLanguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(SomeLanguageParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(SomeLanguageParser.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TYPE);
			setState(51);
			match(ID);
			setState(52);
			match(SEMI);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SomeLanguageParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(SomeLanguageParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SomeLanguageParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SomeLanguageParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> RETURN() { return getTokens(SomeLanguageParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(SomeLanguageParser.RETURN, i);
		}
		public TerminalNode TYPE() { return getToken(SomeLanguageParser.TYPE, 0); }
		public TerminalNode IS() { return getToken(SomeLanguageParser.IS, 0); }
		public TerminalNode BEGIN() { return getToken(SomeLanguageParser.BEGIN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SomeLanguageParser.SEMI, 0); }
		public TerminalNode END() { return getToken(SomeLanguageParser.END, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FUNCTION);
			setState(55);
			match(ID);
			setState(56);
			match(LEFT_PAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(57);
				argument();
				}
			}

			setState(60);
			match(RIGHT_PAREN);
			setState(61);
			match(RETURN);
			setState(62);
			match(TYPE);
			setState(63);
			match(IS);
			setState(64);
			match(BEGIN);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTF || _la==ID) {
				{
				{
				setState(65);
				line();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(RETURN);
			setState(72);
			value();
			setState(73);
			match(SEMI);
			setState(74);
			match(END);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(SomeLanguageParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(SomeLanguageParser.TYPE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(SomeLanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SomeLanguageParser.COLON, i);
		}
		public List<TerminalNode> ID() { return getTokens(SomeLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SomeLanguageParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SomeLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SomeLanguageParser.COMMA, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(TYPE);
					setState(77);
					match(COLON);
					setState(78);
					match(ID);
					setState(79);
					match(COMMA);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			{
			setState(85);
			match(TYPE);
			setState(86);
			match(COLON);
			setState(87);
			match(ID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SomeLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SomeLanguageParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SomeLanguageParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(ASSIGN);
			setState(91);
			value();
			setState(92);
			match(SEMI);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(SomeLanguageParser.STRING_VALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(STRING_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				functionCall();
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SomeLanguageParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SomeLanguageParser.RIGHT_PAREN, 0); }
		public TerminalNode ID() { return getToken(SomeLanguageParser.ID, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SomeLanguageParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SomeLanguageParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(SomeLanguageParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(SomeLanguageParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SomeLanguageParser.PLUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(100);
				match(LEFT_PAREN);
				setState(101);
				expression(0);
				setState(102);
				match(RIGHT_PAREN);
				}
				break;
			case MINUS:
			case INTEGER_VALUE:
			case ID:
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(104);
					match(MINUS);
					}
				}

				setState(107);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SomeLanguageParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SomeLanguageParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SomeLanguageParser.RIGHT_PAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SomeLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SomeLanguageParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(LEFT_PAREN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_PAREN) | (1L << INTEGER_VALUE) | (1L << STRING_VALUE) | (1L << ID))) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						value();
						setState(124);
						match(COMMA);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(131);
				value();
				}
			}

			setState(134);
			match(RIGHT_PAREN);
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

	public static class LogicalEquationContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SomeLanguageParser.LEFT_PAREN, 0); }
		public List<LogicalEquationContext> logicalEquation() {
			return getRuleContexts(LogicalEquationContext.class);
		}
		public LogicalEquationContext logicalEquation(int i) {
			return getRuleContext(LogicalEquationContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SomeLanguageParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SomeLanguageParser.EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(SomeLanguageParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(SomeLanguageParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(SomeLanguageParser.LESSER, 0); }
		public TerminalNode LESSER_EQUAL() { return getToken(SomeLanguageParser.LESSER_EQUAL, 0); }
		public TerminalNode AND() { return getToken(SomeLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(SomeLanguageParser.OR, 0); }
		public LogicalEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterLogicalEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitLogicalEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitLogicalEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalEquationContext logicalEquation() throws RecognitionException {
		return logicalEquation(0);
	}

	private LogicalEquationContext logicalEquation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalEquationContext _localctx = new LogicalEquationContext(_ctx, _parentState);
		LogicalEquationContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logicalEquation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(137);
				match(LEFT_PAREN);
				setState(138);
				logicalEquation(0);
				setState(139);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(141);
				expression(0);
				setState(142);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << LESSER) | (1L << GREATER_EQUAL) | (1L << LESSER_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalEquationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalEquation);
					setState(147);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(148);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(149);
					logicalEquation(4);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintfCallContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(SomeLanguageParser.PRINTF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SomeLanguageParser.LEFT_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SomeLanguageParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMI() { return getToken(SomeLanguageParser.SEMI, 0); }
		public PrintfCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterPrintfCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitPrintfCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitPrintfCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfCallContext printfCall() throws RecognitionException {
		PrintfCallContext _localctx = new PrintfCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printfCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(PRINTF);
			setState(156);
			match(LEFT_PAREN);
			setState(157);
			value();
			setState(158);
			match(RIGHT_PAREN);
			setState(159);
			match(SEMI);
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

	public static class LineContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintfCallContext printfCall() {
			return getRuleContext(PrintfCallContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SomeLanguageListener ) ((SomeLanguageListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeLanguageVisitor ) return ((SomeLanguageVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(161);
				assignment();
				}
				break;
			case PRINTF:
				{
				setState(162);
				printfCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 9:
			return logicalEquation_sempred((LogicalEquationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logicalEquation_sempred(LogicalEquationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5E\n"+
		"\5\f\5\16\5H\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16"+
		"\6V\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bd\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\5\to\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"w\n\t\f\t\16\tz\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084"+
		"\13\n\3\n\5\n\u0087\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0094\n\13\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00a6\n\r\3\r\2\4\20\24\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\7\4\2\35\35\37\37\3\2\t\n\3\2\13\f\3"+
		"\2\22\26\3\2\27\30\2\u00ac\2\32\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b8\3"+
		"\2\2\2\nT\3\2\2\2\f[\3\2\2\2\16c\3\2\2\2\20n\3\2\2\2\22{\3\2\2\2\24\u0093"+
		"\3\2\2\2\26\u009d\3\2\2\2\30\u00a5\3\2\2\2\32\33\7\3\2\2\33\34\5\4\3\2"+
		"\34 \7\4\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3"+
		"\2\2\2!&\3\2\2\2\" \3\2\2\2#%\5\b\5\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'"+
		"\3\2\2\2\')\3\2\2\2(&\3\2\2\2)-\7\5\2\2*,\5\30\r\2+*\3\2\2\2,/\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\6\2\2\61\3\3\2\2\2"+
		"\62\63\7\37\2\2\63\5\3\2\2\2\64\65\7\34\2\2\65\66\7\37\2\2\66\67\7\16"+
		"\2\2\67\7\3\2\2\289\7\b\2\29:\7\37\2\2:<\7\20\2\2;=\5\n\6\2<;\3\2\2\2"+
		"<=\3\2\2\2=>\3\2\2\2>?\7\21\2\2?@\7\7\2\2@A\7\34\2\2AB\7\4\2\2BF\7\5\2"+
		"\2CE\5\30\r\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IJ\7\7\2\2JK\5\16\b\2KL\7\16\2\2LM\7\6\2\2M\t\3\2\2\2NO\7\34\2\2O"+
		"P\7\r\2\2PQ\7\37\2\2QS\7\17\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UW\3\2\2\2VT\3\2\2\2WX\7\34\2\2XY\7\r\2\2YZ\7\37\2\2Z\13\3\2\2\2[\\"+
		"\7\37\2\2\\]\7\33\2\2]^\5\16\b\2^_\7\16\2\2_\r\3\2\2\2`d\7\36\2\2ad\5"+
		"\20\t\2bd\5\22\n\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ef\b\t\1\2"+
		"fg\7\20\2\2gh\5\20\t\2hi\7\21\2\2io\3\2\2\2jl\7\f\2\2kj\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mo\t\2\2\2ne\3\2\2\2nk\3\2\2\2ox\3\2\2\2pq\f\6\2\2qr\t\3"+
		"\2\2rw\5\20\t\7st\f\5\2\2tu\t\4\2\2uw\5\20\t\6vp\3\2\2\2vs\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\7\37\2\2|\u0086\7\20"+
		"\2\2}~\5\16\b\2~\177\7\17\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\5\16\b\2\u0086\u0082\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\21\2\2\u0089\23\3\2\2\2\u008a"+
		"\u008b\b\13\1\2\u008b\u008c\7\20\2\2\u008c\u008d\5\24\13\2\u008d\u008e"+
		"\7\21\2\2\u008e\u0094\3\2\2\2\u008f\u0090\5\20\t\2\u0090\u0091\t\5\2\2"+
		"\u0091\u0092\5\20\t\2\u0092\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008f"+
		"\3\2\2\2\u0094\u009a\3\2\2\2\u0095\u0096\f\5\2\2\u0096\u0097\t\6\2\2\u0097"+
		"\u0099\5\24\13\6\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\31\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1"+
		"\7\21\2\2\u00a1\u00a2\7\16\2\2\u00a2\27\3\2\2\2\u00a3\u00a6\5\f\7\2\u00a4"+
		"\u00a6\5\26\f\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\31\3\2\2"+
		"\2\22 &-<FTcknvx\u0082\u0086\u0093\u009a\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
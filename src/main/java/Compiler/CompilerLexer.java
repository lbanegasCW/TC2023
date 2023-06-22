// Generated from /home/luisbanegas/IdeaProjects/TC2023/src/main/java/Compiler/Compiler.g4 by ANTLR 4.9.2

 package Compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, LA=2, LC=3, CA=4, CC=5, PA=6, PC=7, DC=8, EQU=9, COM=10, SUM=11, 
		RES=12, MUL=13, DIV=14, MOD=15, MIN=16, MAX=17, MIQ=18, MAQ=19, DEQ=20, 
		DIS=21, INC=22, DEC=23, TYPE=24, IF=25, ELSE=26, FOR=27, WHILE=28, RETURN=29, 
		ID=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "NUMERO", "LA", "LC", "CA", "CC", "PA", "PC", "DC", 
			"EQU", "COM", "SUM", "RES", "MUL", "DIV", "MOD", "MIN", "MAX", "MIQ", 
			"MAQ", "DEQ", "DIS", "INC", "DEC", "TYPE", "IF", "ELSE", "FOR", "WHILE", 
			"RETURN", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'++'", "'--'", null, "'if'", "'else'", "'for'", "'while'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "LA", "LC", "CA", "CC", "PA", "PC", "DC", "EQU", "COM", 
			"SUM", "RES", "MUL", "DIV", "MOD", "MIN", "MAX", "MIQ", "MAQ", "DEQ", 
			"DIS", "INC", "DEC", "TYPE", "IF", "ELSE", "FOR", "WHILE", "RETURN", 
			"ID", "WS"
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


	public CompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compiler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\6\4K\n\4\r\4\16\4L\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00ae\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\5!\u00cb\n!\3!\3!\3!\7!\u00d0\n!\f!\16!\u00d3\13!\3\"\3"+
		"\"\3\"\3\"\2\2#\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u00e2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7J\3\2\2\2\tN\3"+
		"\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z"+
		"\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2"+
		"!f\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'l\3\2\2\2)n\3\2\2\2+q\3\2\2\2-t\3\2\2"+
		"\2/w\3\2\2\2\61z\3\2\2\2\63}\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\2"+
		"9\u00b2\3\2\2\2;\u00b7\3\2\2\2=\u00bb\3\2\2\2?\u00c1\3\2\2\2A\u00ca\3"+
		"\2\2\2C\u00d4\3\2\2\2EF\t\2\2\2F\4\3\2\2\2GH\t\3\2\2H\6\3\2\2\2IK\5\5"+
		"\3\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\b\3\2\2\2NO\7}\2\2O\n\3"+
		"\2\2\2PQ\7\177\2\2Q\f\3\2\2\2RS\7]\2\2S\16\3\2\2\2TU\7_\2\2U\20\3\2\2"+
		"\2VW\7*\2\2W\22\3\2\2\2XY\7+\2\2Y\24\3\2\2\2Z[\7=\2\2[\26\3\2\2\2\\]\7"+
		"?\2\2]\30\3\2\2\2^_\7.\2\2_\32\3\2\2\2`a\7-\2\2a\34\3\2\2\2bc\7/\2\2c"+
		"\36\3\2\2\2de\7,\2\2e \3\2\2\2fg\7\61\2\2g\"\3\2\2\2hi\7\'\2\2i$\3\2\2"+
		"\2jk\7>\2\2k&\3\2\2\2lm\7@\2\2m(\3\2\2\2no\7>\2\2op\7?\2\2p*\3\2\2\2q"+
		"r\7@\2\2rs\7?\2\2s,\3\2\2\2tu\7?\2\2uv\7?\2\2v.\3\2\2\2wx\7#\2\2xy\7?"+
		"\2\2y\60\3\2\2\2z{\7-\2\2{|\7-\2\2|\62\3\2\2\2}~\7/\2\2~\177\7/\2\2\177"+
		"\64\3\2\2\2\u0080\u0081\7x\2\2\u0081\u0082\7q\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u00ae\7f\2\2\u0084\u0085\7e\2\2\u0085\u0086\7j\2\2\u0086\u0087\7c\2\2"+
		"\u0087\u00ae\7t\2\2\u0088\u0089\7u\2\2\u0089\u008a\7j\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7t\2\2\u008c\u00ae\7v\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u00ae\7v\2\2\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2"+
		"\u0092\u0093\7p\2\2\u0093\u00ae\7i\2\2\u0094\u0095\7h\2\2\u0095\u0096"+
		"\7n\2\2\u0096\u0097\7q\2\2\u0097\u0098\7c\2\2\u0098\u00ae\7v\2\2\u0099"+
		"\u009a\7f\2\2\u009a\u009b\7q\2\2\u009b\u009c\7w\2\2\u009c\u009d\7d\2\2"+
		"\u009d\u009e\7n\2\2\u009e\u00ae\7g\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00ae\7f\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7u\2\2"+
		"\u00a8\u00a9\7k\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ae\7f\2\2\u00ad\u0080\3\2\2\2\u00ad\u0084\3\2\2\2\u00ad"+
		"\u0088\3\2\2\2\u00ad\u008d\3\2\2\2\u00ad\u0090\3\2\2\2\u00ad\u0094\3\2"+
		"\2\2\u00ad\u0099\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ae"+
		"\66\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b18\3\2\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6:\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7t\2"+
		"\2\u00ba<\3\2\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7"+
		"k\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0>\3\2\2\2\u00c1\u00c2"+
		"\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7w\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7p\2\2\u00c7@\3\2\2\2\u00c8\u00cb\5\3\2\2\u00c9"+
		"\u00cb\7a\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d1\3\2"+
		"\2\2\u00cc\u00d0\5\3\2\2\u00cd\u00d0\5\5\3\2\u00ce\u00d0\7a\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2B\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\t\4\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\"\2\2\u00d7"+
		"D\3\2\2\2\b\2L\u00ad\u00ca\u00cf\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from E:/undergithub/flowingwater/flowingwater/springboot/driping-water/common/src/main/java/alex/learn/antlr/demo/demo4\OracleQuery.g4 by ANTLR 4.7
package alex.learn.antlr.demo4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OracleQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AS=11, SELECT=12, FROM=13, TABLE=14, MAX=15, SUM=16, AVG=17, 
		MIN=18, COUNT=19, ALL=20, DISTINCT=21, WHERE=22, GROUP=23, BY=24, ORDER=25, 
		HAVING=26, NOT=27, IS=28, TRUE=29, FALSE=30, UNKNOWN=31, BETWEEN=32, AND=33, 
		IN=34, NULL=35, OR=36, ASC=37, DESC=38, LIMIT=39, OFFSET=40, ID=41, TEXT_STRING=42, 
		ID_LITERAL=43, REVERSE_QUOTE_ID=44, DECIMAL_LITERAL=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "AS", "SELECT", "FROM", "TABLE", "MAX", "SUM", "AVG", "MIN", "COUNT", 
		"ALL", "DISTINCT", "WHERE", "GROUP", "BY", "ORDER", "HAVING", "NOT", "IS", 
		"TRUE", "FALSE", "UNKNOWN", "BETWEEN", "AND", "IN", "NULL", "OR", "ASC", 
		"DESC", "LIMIT", "OFFSET", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z", "HEX_DIGIT", "DEC_DIGIT", "LETTER", "ID", "TEXT_STRING", 
		"ID_LITERAL", "REVERSE_QUOTE_ID", "DECIMAL_LITERAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "','", "'('", "')'", "'&'", "'|'", "'='", "'>'", "'<'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "AS", 
		"SELECT", "FROM", "TABLE", "MAX", "SUM", "AVG", "MIN", "COUNT", "ALL", 
		"DISTINCT", "WHERE", "GROUP", "BY", "ORDER", "HAVING", "NOT", "IS", "TRUE", 
		"FALSE", "UNKNOWN", "BETWEEN", "AND", "IN", "NULL", "OR", "ASC", "DESC", 
		"LIMIT", "OFFSET", "ID", "TEXT_STRING", "ID_LITERAL", "REVERSE_QUOTE_ID", 
		"DECIMAL_LITERAL", "WS"
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


	public OracleQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OracleQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3"+
		"F\3F\3G\3G\7G\u0185\nG\fG\16G\u0188\13G\3H\3H\3H\3H\3H\3H\3H\3H\7H\u0192"+
		"\nH\fH\16H\u0195\13H\3H\3H\3I\3I\3I\5I\u019c\nI\3I\3I\3I\7I\u01a1\nI\f"+
		"I\16I\u01a4\13I\5I\u01a6\nI\3J\3J\6J\u01aa\nJ\rJ\16J\u01ab\3J\3J\3K\6"+
		"K\u01b1\nK\rK\16K\u01b2\3L\6L\u01b6\nL\rL\16L\u01b7\3L\3L\2\2M\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2"+
		"w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"+\u008f,\u0091-\u0093.\u0095/\u0097\60\3\2%\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\62;CH\3\2\62;\4\2C"+
		"\\c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2))\4\2BBaa\3\2bb\5\2\13\f\17\17"+
		"\"\"\2\u01aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\5\u009b\3\2\2\2\7\u009d\3\2\2"+
		"\2\t\u009f\3\2\2\2\13\u00a1\3\2\2\2\r\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21"+
		"\u00a7\3\2\2\2\23\u00a9\3\2\2\2\25\u00ab\3\2\2\2\27\u00ad\3\2\2\2\31\u00b0"+
		"\3\2\2\2\33\u00b7\3\2\2\2\35\u00bc\3\2\2\2\37\u00c2\3\2\2\2!\u00c6\3\2"+
		"\2\2#\u00ca\3\2\2\2%\u00ce\3\2\2\2\'\u00d2\3\2\2\2)\u00d8\3\2\2\2+\u00dc"+
		"\3\2\2\2-\u00e5\3\2\2\2/\u00eb\3\2\2\2\61\u00f1\3\2\2\2\63\u00f4\3\2\2"+
		"\2\65\u00fa\3\2\2\2\67\u0101\3\2\2\29\u0105\3\2\2\2;\u0108\3\2\2\2=\u010d"+
		"\3\2\2\2?\u0113\3\2\2\2A\u011b\3\2\2\2C\u0123\3\2\2\2E\u0127\3\2\2\2G"+
		"\u012a\3\2\2\2I\u012f\3\2\2\2K\u0132\3\2\2\2M\u0136\3\2\2\2O\u013b\3\2"+
		"\2\2Q\u0141\3\2\2\2S\u0148\3\2\2\2U\u014a\3\2\2\2W\u014c\3\2\2\2Y\u014e"+
		"\3\2\2\2[\u0150\3\2\2\2]\u0152\3\2\2\2_\u0154\3\2\2\2a\u0156\3\2\2\2c"+
		"\u0158\3\2\2\2e\u015a\3\2\2\2g\u015c\3\2\2\2i\u015e\3\2\2\2k\u0160\3\2"+
		"\2\2m\u0162\3\2\2\2o\u0164\3\2\2\2q\u0166\3\2\2\2s\u0168\3\2\2\2u\u016a"+
		"\3\2\2\2w\u016c\3\2\2\2y\u016e\3\2\2\2{\u0170\3\2\2\2}\u0172\3\2\2\2\177"+
		"\u0174\3\2\2\2\u0081\u0176\3\2\2\2\u0083\u0178\3\2\2\2\u0085\u017a\3\2"+
		"\2\2\u0087\u017c\3\2\2\2\u0089\u017e\3\2\2\2\u008b\u0180\3\2\2\2\u008d"+
		"\u0182\3\2\2\2\u008f\u0189\3\2\2\2\u0091\u01a5\3\2\2\2\u0093\u01a7\3\2"+
		"\2\2\u0095\u01b0\3\2\2\2\u0097\u01b5\3\2\2\2\u0099\u009a\7,\2\2\u009a"+
		"\4\3\2\2\2\u009b\u009c\7.\2\2\u009c\6\3\2\2\2\u009d\u009e\7*\2\2\u009e"+
		"\b\3\2\2\2\u009f\u00a0\7+\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2"+
		"\f\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		"\20\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa"+
		"\24\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\5S*\2\u00ae"+
		"\u00af\5w<\2\u00af\30\3\2\2\2\u00b0\u00b1\5w<\2\u00b1\u00b2\5[.\2\u00b2"+
		"\u00b3\5i\65\2\u00b3\u00b4\5[.\2\u00b4\u00b5\5W,\2\u00b5\u00b6\5y=\2\u00b6"+
		"\32\3\2\2\2\u00b7\u00b8\5]/\2\u00b8\u00b9\5u;\2\u00b9\u00ba\5o8\2\u00ba"+
		"\u00bb\5k\66\2\u00bb\34\3\2\2\2\u00bc\u00bd\5y=\2\u00bd\u00be\5S*\2\u00be"+
		"\u00bf\5U+\2\u00bf\u00c0\5i\65\2\u00c0\u00c1\5[.\2\u00c1\36\3\2\2\2\u00c2"+
		"\u00c3\5k\66\2\u00c3\u00c4\5S*\2\u00c4\u00c5\5\u0081A\2\u00c5 \3\2\2\2"+
		"\u00c6\u00c7\5w<\2\u00c7\u00c8\5{>\2\u00c8\u00c9\5k\66\2\u00c9\"\3\2\2"+
		"\2\u00ca\u00cb\5S*\2\u00cb\u00cc\5}?\2\u00cc\u00cd\5_\60\2\u00cd$\3\2"+
		"\2\2\u00ce\u00cf\5k\66\2\u00cf\u00d0\5c\62\2\u00d0\u00d1\5m\67\2\u00d1"+
		"&\3\2\2\2\u00d2\u00d3\5W,\2\u00d3\u00d4\5o8\2\u00d4\u00d5\5{>\2\u00d5"+
		"\u00d6\5m\67\2\u00d6\u00d7\5y=\2\u00d7(\3\2\2\2\u00d8\u00d9\5S*\2\u00d9"+
		"\u00da\5i\65\2\u00da\u00db\5i\65\2\u00db*\3\2\2\2\u00dc\u00dd\5Y-\2\u00dd"+
		"\u00de\5c\62\2\u00de\u00df\5w<\2\u00df\u00e0\5y=\2\u00e0\u00e1\5c\62\2"+
		"\u00e1\u00e2\5m\67\2\u00e2\u00e3\5W,\2\u00e3\u00e4\5y=\2\u00e4,\3\2\2"+
		"\2\u00e5\u00e6\5\177@\2\u00e6\u00e7\5a\61\2\u00e7\u00e8\5[.\2\u00e8\u00e9"+
		"\5u;\2\u00e9\u00ea\5[.\2\u00ea.\3\2\2\2\u00eb\u00ec\5_\60\2\u00ec\u00ed"+
		"\5u;\2\u00ed\u00ee\5o8\2\u00ee\u00ef\5{>\2\u00ef\u00f0\5q9\2\u00f0\60"+
		"\3\2\2\2\u00f1\u00f2\5U+\2\u00f2\u00f3\5\u0083B\2\u00f3\62\3\2\2\2\u00f4"+
		"\u00f5\5o8\2\u00f5\u00f6\5u;\2\u00f6\u00f7\5Y-\2\u00f7\u00f8\5[.\2\u00f8"+
		"\u00f9\5u;\2\u00f9\64\3\2\2\2\u00fa\u00fb\5a\61\2\u00fb\u00fc\5S*\2\u00fc"+
		"\u00fd\5}?\2\u00fd\u00fe\5c\62\2\u00fe\u00ff\5m\67\2\u00ff\u0100\5_\60"+
		"\2\u0100\66\3\2\2\2\u0101\u0102\5m\67\2\u0102\u0103\5o8\2\u0103\u0104"+
		"\5y=\2\u01048\3\2\2\2\u0105\u0106\5c\62\2\u0106\u0107\5w<\2\u0107:\3\2"+
		"\2\2\u0108\u0109\5y=\2\u0109\u010a\5u;\2\u010a\u010b\5{>\2\u010b\u010c"+
		"\5[.\2\u010c<\3\2\2\2\u010d\u010e\5]/\2\u010e\u010f\5S*\2\u010f\u0110"+
		"\5i\65\2\u0110\u0111\5w<\2\u0111\u0112\5[.\2\u0112>\3\2\2\2\u0113\u0114"+
		"\5{>\2\u0114\u0115\5m\67\2\u0115\u0116\5g\64\2\u0116\u0117\5m\67\2\u0117"+
		"\u0118\5o8\2\u0118\u0119\5\177@\2\u0119\u011a\5m\67\2\u011a@\3\2\2\2\u011b"+
		"\u011c\5U+\2\u011c\u011d\5[.\2\u011d\u011e\5y=\2\u011e\u011f\5\177@\2"+
		"\u011f\u0120\5[.\2\u0120\u0121\5[.\2\u0121\u0122\5m\67\2\u0122B\3\2\2"+
		"\2\u0123\u0124\5S*\2\u0124\u0125\5m\67\2\u0125\u0126\5Y-\2\u0126D\3\2"+
		"\2\2\u0127\u0128\5c\62\2\u0128\u0129\5m\67\2\u0129F\3\2\2\2\u012a\u012b"+
		"\5m\67\2\u012b\u012c\5{>\2\u012c\u012d\5i\65\2\u012d\u012e\5i\65\2\u012e"+
		"H\3\2\2\2\u012f\u0130\5o8\2\u0130\u0131\5u;\2\u0131J\3\2\2\2\u0132\u0133"+
		"\5S*\2\u0133\u0134\5w<\2\u0134\u0135\5W,\2\u0135L\3\2\2\2\u0136\u0137"+
		"\5Y-\2\u0137\u0138\5[.\2\u0138\u0139\5w<\2\u0139\u013a\5W,\2\u013aN\3"+
		"\2\2\2\u013b\u013c\5i\65\2\u013c\u013d\5c\62\2\u013d\u013e\5k\66\2\u013e"+
		"\u013f\5c\62\2\u013f\u0140\5y=\2\u0140P\3\2\2\2\u0141\u0142\5o8\2\u0142"+
		"\u0143\5]/\2\u0143\u0144\5]/\2\u0144\u0145\5w<\2\u0145\u0146\5[.\2\u0146"+
		"\u0147\5y=\2\u0147R\3\2\2\2\u0148\u0149\t\2\2\2\u0149T\3\2\2\2\u014a\u014b"+
		"\t\3\2\2\u014bV\3\2\2\2\u014c\u014d\t\4\2\2\u014dX\3\2\2\2\u014e\u014f"+
		"\t\5\2\2\u014fZ\3\2\2\2\u0150\u0151\t\6\2\2\u0151\\\3\2\2\2\u0152\u0153"+
		"\t\7\2\2\u0153^\3\2\2\2\u0154\u0155\t\b\2\2\u0155`\3\2\2\2\u0156\u0157"+
		"\t\t\2\2\u0157b\3\2\2\2\u0158\u0159\t\n\2\2\u0159d\3\2\2\2\u015a\u015b"+
		"\t\13\2\2\u015bf\3\2\2\2\u015c\u015d\t\f\2\2\u015dh\3\2\2\2\u015e\u015f"+
		"\t\r\2\2\u015fj\3\2\2\2\u0160\u0161\t\16\2\2\u0161l\3\2\2\2\u0162\u0163"+
		"\t\17\2\2\u0163n\3\2\2\2\u0164\u0165\t\20\2\2\u0165p\3\2\2\2\u0166\u0167"+
		"\t\21\2\2\u0167r\3\2\2\2\u0168\u0169\t\22\2\2\u0169t\3\2\2\2\u016a\u016b"+
		"\t\23\2\2\u016bv\3\2\2\2\u016c\u016d\t\24\2\2\u016dx\3\2\2\2\u016e\u016f"+
		"\t\25\2\2\u016fz\3\2\2\2\u0170\u0171\t\26\2\2\u0171|\3\2\2\2\u0172\u0173"+
		"\t\27\2\2\u0173~\3\2\2\2\u0174\u0175\t\30\2\2\u0175\u0080\3\2\2\2\u0176"+
		"\u0177\t\31\2\2\u0177\u0082\3\2\2\2\u0178\u0179\t\32\2\2\u0179\u0084\3"+
		"\2\2\2\u017a\u017b\t\33\2\2\u017b\u0086\3\2\2\2\u017c\u017d\t\34\2\2\u017d"+
		"\u0088\3\2\2\2\u017e\u017f\t\35\2\2\u017f\u008a\3\2\2\2\u0180\u0181\t"+
		"\36\2\2\u0181\u008c\3\2\2\2\u0182\u0186\t\37\2\2\u0183\u0185\t \2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u008e\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u0193\7)\2\2\u018a"+
		"\u018b\7^\2\2\u018b\u0192\7^\2\2\u018c\u018d\7)\2\2\u018d\u0192\7)\2\2"+
		"\u018e\u018f\7^\2\2\u018f\u0192\7)\2\2\u0190\u0192\n!\2\2\u0191\u018a"+
		"\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7)\2\2\u0197\u0090\3\2\2\2\u0198"+
		"\u01a6\7,\2\2\u0199\u019c\t\"\2\2\u019a\u019c\5\u008bF\2\u019b\u0199\3"+
		"\2\2\2\u019b\u019a\3\2\2\2\u019c\u01a2\3\2\2\2\u019d\u01a1\5\u008bF\2"+
		"\u019e\u01a1\5\u0089E\2\u019f\u01a1\7a\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u0198\3\2"+
		"\2\2\u01a5\u019b\3\2\2\2\u01a6\u0092\3\2\2\2\u01a7\u01a9\7b\2\2\u01a8"+
		"\u01aa\n#\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7b\2\2\u01ae"+
		"\u0094\3\2\2\2\u01af\u01b1\5\u0089E\2\u01b0\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u0096\3\2\2\2\u01b4"+
		"\u01b6\t$\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\bL\2\2\u01ba"+
		"\u0098\3\2\2\2\r\2\u0186\u0191\u0193\u019b\u01a0\u01a2\u01a5\u01ab\u01b2"+
		"\u01b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
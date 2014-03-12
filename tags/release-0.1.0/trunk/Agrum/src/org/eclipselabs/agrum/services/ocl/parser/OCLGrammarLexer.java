// $ANTLR 3.5 OCLGrammar.g 2013-03-19 10:41:53
package org.eclipselabs.agrum.services.ocl.parser;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OCLGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int DIF=5;
	public static final int DIGIT=6;
	public static final int EQ=7;
	public static final int FLOAT=8;
	public static final int GEQ=9;
	public static final int GT=10;
	public static final int INT=11;
	public static final int LB=12;
	public static final int LEQ=13;
	public static final int LETTER=14;
	public static final int LT=15;
	public static final int NAME=16;
	public static final int NOT=17;
	public static final int OR=18;
	public static final int PT=19;
	public static final int RB=20;
	public static final int VAR=21;
	public static final int WHITESPACE=22;
	public static final int XOR=23;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public OCLGrammarLexer() {} 
	public OCLGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public OCLGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "OCLGrammar.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:2:5: ( 'and' )
			// OCLGrammar.g:2:7: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "DIF"
	public final void mDIF() throws RecognitionException {
		try {
			int _type = DIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:3:5: ( '!=' )
			// OCLGrammar.g:3:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIF"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:4:4: ( '=' )
			// OCLGrammar.g:4:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GEQ"
	public final void mGEQ() throws RecognitionException {
		try {
			int _type = GEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:5:5: ( '>=' )
			// OCLGrammar.g:5:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:6:4: ( '>' )
			// OCLGrammar.g:6:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:7:4: ( '(' )
			// OCLGrammar.g:7:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:8:5: ( '<=' )
			// OCLGrammar.g:8:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEQ"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:9:4: ( '<' )
			// OCLGrammar.g:9:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:10:5: ( 'not' )
			// OCLGrammar.g:10:7: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:11:4: ( 'or' )
			// OCLGrammar.g:11:6: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PT"
	public final void mPT() throws RecognitionException {
		try {
			int _type = PT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:12:4: ( '.' )
			// OCLGrammar.g:12:6: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PT"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:13:4: ( ')' )
			// OCLGrammar.g:13:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:14:5: ( 'xor' )
			// OCLGrammar.g:14:7: 'xor'
			{
			match("xor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:84:5: ( NAME ( ( '_' ) NAME )* )
			// OCLGrammar.g:84:7: NAME ( ( '_' ) NAME )*
			{
			mNAME(); 

			// OCLGrammar.g:84:12: ( ( '_' ) NAME )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='_') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// OCLGrammar.g:84:13: ( '_' ) NAME
					{
					// OCLGrammar.g:84:13: ( '_' )
					// OCLGrammar.g:84:14: '_'
					{
					match('_'); 
					}

					mNAME(); 

					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:85:5: ( ( DIGIT )+ )
			// OCLGrammar.g:85:7: ( DIGIT )+
			{
			// OCLGrammar.g:85:7: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// OCLGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:86:7: ( ( DIGIT )+ '.' ( DIGIT )+ )
			// OCLGrammar.g:86:9: ( DIGIT )+ '.' ( DIGIT )+
			{
			// OCLGrammar.g:86:9: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// OCLGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// OCLGrammar.g:86:20: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// OCLGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// OCLGrammar.g:89:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// OCLGrammar.g:89:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// OCLGrammar.g:89:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// OCLGrammar.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// OCLGrammar.g:91:16: ( '0' .. '9' )
			// OCLGrammar.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// OCLGrammar.g:92:17: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
			// OCLGrammar.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			// OCLGrammar.g:93:15: ( ( LETTER ( DIGIT | LETTER )* ) )
			// OCLGrammar.g:93:17: ( LETTER ( DIGIT | LETTER )* )
			{
			// OCLGrammar.g:93:17: ( LETTER ( DIGIT | LETTER )* )
			// OCLGrammar.g:93:18: LETTER ( DIGIT | LETTER )*
			{
			mLETTER(); 

			// OCLGrammar.g:93:25: ( DIGIT | LETTER )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// OCLGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	@Override
	public void mTokens() throws RecognitionException {
		// OCLGrammar.g:1:8: ( AND | DIF | EQ | GEQ | GT | LB | LEQ | LT | NOT | OR | PT | RB | XOR | VAR | INT | FLOAT | WHITESPACE )
		int alt7=17;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// OCLGrammar.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// OCLGrammar.g:1:14: DIF
				{
				mDIF(); 

				}
				break;
			case 3 :
				// OCLGrammar.g:1:18: EQ
				{
				mEQ(); 

				}
				break;
			case 4 :
				// OCLGrammar.g:1:21: GEQ
				{
				mGEQ(); 

				}
				break;
			case 5 :
				// OCLGrammar.g:1:25: GT
				{
				mGT(); 

				}
				break;
			case 6 :
				// OCLGrammar.g:1:28: LB
				{
				mLB(); 

				}
				break;
			case 7 :
				// OCLGrammar.g:1:31: LEQ
				{
				mLEQ(); 

				}
				break;
			case 8 :
				// OCLGrammar.g:1:35: LT
				{
				mLT(); 

				}
				break;
			case 9 :
				// OCLGrammar.g:1:38: NOT
				{
				mNOT(); 

				}
				break;
			case 10 :
				// OCLGrammar.g:1:42: OR
				{
				mOR(); 

				}
				break;
			case 11 :
				// OCLGrammar.g:1:45: PT
				{
				mPT(); 

				}
				break;
			case 12 :
				// OCLGrammar.g:1:48: RB
				{
				mRB(); 

				}
				break;
			case 13 :
				// OCLGrammar.g:1:51: XOR
				{
				mXOR(); 

				}
				break;
			case 14 :
				// OCLGrammar.g:1:55: VAR
				{
				mVAR(); 

				}
				break;
			case 15 :
				// OCLGrammar.g:1:59: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// OCLGrammar.g:1:63: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 17 :
				// OCLGrammar.g:1:69: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\1\14\2\uffff\1\21\1\uffff\1\23\2\14\2\uffff\1\14\1\uffff\1\27"+
		"\1\uffff\1\14\4\uffff\1\14\1\33\1\14\2\uffff\1\35\1\36\1\uffff\1\37\3"+
		"\uffff";
	static final String DFA7_eofS =
		"\40\uffff";
	static final String DFA7_minS =
		"\1\11\1\156\2\uffff\1\75\1\uffff\1\75\1\157\1\162\2\uffff\1\157\1\uffff"+
		"\1\56\1\uffff\1\144\4\uffff\1\164\1\60\1\162\2\uffff\2\60\1\uffff\1\60"+
		"\3\uffff";
	static final String DFA7_maxS =
		"\1\172\1\156\2\uffff\1\75\1\uffff\1\75\1\157\1\162\2\uffff\1\157\1\uffff"+
		"\1\71\1\uffff\1\144\4\uffff\1\164\1\172\1\162\2\uffff\2\172\1\uffff\1"+
		"\172\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\6\3\uffff\1\13\1\14\1\uffff\1\16\1\uffff\1"+
		"\21\1\uffff\1\4\1\5\1\7\1\10\3\uffff\1\17\1\20\2\uffff\1\12\1\uffff\1"+
		"\1\1\11\1\15";
	static final String DFA7_specialS =
		"\40\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\16\1\uffff\2\16\22\uffff\1\16\1\2\6\uffff\1\5\1\12\4\uffff\1\11\1"+
			"\uffff\12\15\2\uffff\1\6\1\3\1\4\2\uffff\32\14\6\uffff\1\1\14\14\1\7"+
			"\1\10\10\14\1\13\2\14",
			"\1\17",
			"",
			"",
			"\1\20",
			"",
			"\1\22",
			"\1\24",
			"\1\25",
			"",
			"",
			"\1\26",
			"",
			"\1\30\1\uffff\12\15",
			"",
			"\1\31",
			"",
			"",
			"",
			"",
			"\1\32",
			"\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\1\34",
			"",
			"",
			"\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"",
			"\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | DIF | EQ | GEQ | GT | LB | LEQ | LT | NOT | OR | PT | RB | XOR | VAR | INT | FLOAT | WHITESPACE );";
		}
	}

}

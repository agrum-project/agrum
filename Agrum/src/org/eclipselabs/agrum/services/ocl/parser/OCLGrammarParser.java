// $ANTLR 3.5 OCLGrammar.g 2013-03-19 10:41:52
package org.eclipselabs.agrum.services.ocl.parser;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OCLGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "DIF", "DIGIT", "EQ", "FLOAT", 
		"GEQ", "GT", "INT", "LB", "LEQ", "LETTER", "LT", "NAME", "NOT", "OR", 
		"PT", "RB", "VAR", "WHITESPACE", "XOR"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public OCLGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OCLGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return OCLGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "OCLGrammar.g"; }


	public static class start_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start"
	// OCLGrammar.g:26:1: start : condition EOF ;
	public final OCLGrammarParser.start_return start() throws RecognitionException {
		OCLGrammarParser.start_return retval = new OCLGrammarParser.start_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope condition1 =null;

		Object EOF2_tree=null;

		try {
			// OCLGrammar.g:27:2: ( condition EOF )
			// OCLGrammar.g:27:4: condition EOF
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condition_in_start192);
			condition1=condition();
			state._fsp--;

			adaptor.addChild(root_0, condition1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start194); 
			EOF2_tree = (Object)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// OCLGrammar.g:31:1: condition : bool_and ;
	public final OCLGrammarParser.condition_return condition() throws RecognitionException {
		OCLGrammarParser.condition_return retval = new OCLGrammarParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope bool_and3 =null;


		try {
			// OCLGrammar.g:32:2: ( bool_and )
			// OCLGrammar.g:32:6: bool_and
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bool_and_in_condition207);
			bool_and3=bool_and();
			state._fsp--;

			adaptor.addChild(root_0, bool_and3.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class bool_and_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool_and"
	// OCLGrammar.g:36:1: bool_and : bool_or ( AND bool_or )* ;
	public final OCLGrammarParser.bool_and_return bool_and() throws RecognitionException {
		OCLGrammarParser.bool_and_return retval = new OCLGrammarParser.bool_and_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND5=null;
		ParserRuleReturnScope bool_or4 =null;
		ParserRuleReturnScope bool_or6 =null;

		Object AND5_tree=null;

		try {
			// OCLGrammar.g:37:2: ( bool_or ( AND bool_or )* )
			// OCLGrammar.g:37:6: bool_or ( AND bool_or )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bool_or_in_bool_and222);
			bool_or4=bool_or();
			state._fsp--;

			adaptor.addChild(root_0, bool_or4.getTree());

			// OCLGrammar.g:37:14: ( AND bool_or )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// OCLGrammar.g:37:15: AND bool_or
					{
					AND5=(Token)match(input,AND,FOLLOW_AND_in_bool_and225); 
					AND5_tree = (Object)adaptor.create(AND5);
					adaptor.addChild(root_0, AND5_tree);

					pushFollow(FOLLOW_bool_or_in_bool_and227);
					bool_or6=bool_or();
					state._fsp--;

					adaptor.addChild(root_0, bool_or6.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_and"


	public static class bool_or_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool_or"
	// OCLGrammar.g:40:1: bool_or : bool_xor ( OR bool_xor )* ;
	public final OCLGrammarParser.bool_or_return bool_or() throws RecognitionException {
		OCLGrammarParser.bool_or_return retval = new OCLGrammarParser.bool_or_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR8=null;
		ParserRuleReturnScope bool_xor7 =null;
		ParserRuleReturnScope bool_xor9 =null;

		Object OR8_tree=null;

		try {
			// OCLGrammar.g:41:2: ( bool_xor ( OR bool_xor )* )
			// OCLGrammar.g:41:6: bool_xor ( OR bool_xor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bool_xor_in_bool_or241);
			bool_xor7=bool_xor();
			state._fsp--;

			adaptor.addChild(root_0, bool_xor7.getTree());

			// OCLGrammar.g:41:15: ( OR bool_xor )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// OCLGrammar.g:41:16: OR bool_xor
					{
					OR8=(Token)match(input,OR,FOLLOW_OR_in_bool_or244); 
					OR8_tree = (Object)adaptor.create(OR8);
					adaptor.addChild(root_0, OR8_tree);

					pushFollow(FOLLOW_bool_xor_in_bool_or246);
					bool_xor9=bool_xor();
					state._fsp--;

					adaptor.addChild(root_0, bool_xor9.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_or"


	public static class bool_xor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool_xor"
	// OCLGrammar.g:44:1: bool_xor : bool_neg ( XOR bool_neg )* ;
	public final OCLGrammarParser.bool_xor_return bool_xor() throws RecognitionException {
		OCLGrammarParser.bool_xor_return retval = new OCLGrammarParser.bool_xor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token XOR11=null;
		ParserRuleReturnScope bool_neg10 =null;
		ParserRuleReturnScope bool_neg12 =null;

		Object XOR11_tree=null;

		try {
			// OCLGrammar.g:45:2: ( bool_neg ( XOR bool_neg )* )
			// OCLGrammar.g:45:6: bool_neg ( XOR bool_neg )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bool_neg_in_bool_xor260);
			bool_neg10=bool_neg();
			state._fsp--;

			adaptor.addChild(root_0, bool_neg10.getTree());

			// OCLGrammar.g:45:15: ( XOR bool_neg )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==XOR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// OCLGrammar.g:45:16: XOR bool_neg
					{
					XOR11=(Token)match(input,XOR,FOLLOW_XOR_in_bool_xor263); 
					XOR11_tree = (Object)adaptor.create(XOR11);
					adaptor.addChild(root_0, XOR11_tree);

					pushFollow(FOLLOW_bool_neg_in_bool_xor265);
					bool_neg12=bool_neg();
					state._fsp--;

					adaptor.addChild(root_0, bool_neg12.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_xor"


	public static class bool_neg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool_neg"
	// OCLGrammar.g:48:1: bool_neg : ( NOT bool | bool );
	public final OCLGrammarParser.bool_neg_return bool_neg() throws RecognitionException {
		OCLGrammarParser.bool_neg_return retval = new OCLGrammarParser.bool_neg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT13=null;
		ParserRuleReturnScope bool14 =null;
		ParserRuleReturnScope bool15 =null;

		Object NOT13_tree=null;

		try {
			// OCLGrammar.g:49:2: ( NOT bool | bool )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==NOT) ) {
				alt4=1;
			}
			else if ( (LA4_0==FLOAT||(LA4_0 >= INT && LA4_0 <= LB)||LA4_0==VAR) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// OCLGrammar.g:49:7: NOT bool
					{
					root_0 = (Object)adaptor.nil();


					NOT13=(Token)match(input,NOT,FOLLOW_NOT_in_bool_neg280); 
					NOT13_tree = (Object)adaptor.create(NOT13);
					adaptor.addChild(root_0, NOT13_tree);

					pushFollow(FOLLOW_bool_in_bool_neg282);
					bool14=bool();
					state._fsp--;

					adaptor.addChild(root_0, bool14.getTree());

					}
					break;
				case 2 :
					// OCLGrammar.g:50:5: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_bool_neg288);
					bool15=bool();
					state._fsp--;

					adaptor.addChild(root_0, bool15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_neg"


	public static class bool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// OCLGrammar.g:53:1: bool : ( LB condition RB | exp );
	public final OCLGrammarParser.bool_return bool() throws RecognitionException {
		OCLGrammarParser.bool_return retval = new OCLGrammarParser.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LB16=null;
		Token RB18=null;
		ParserRuleReturnScope condition17 =null;
		ParserRuleReturnScope exp19 =null;

		Object LB16_tree=null;
		Object RB18_tree=null;

		try {
			// OCLGrammar.g:54:2: ( LB condition RB | exp )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LB) ) {
				alt5=1;
			}
			else if ( (LA5_0==FLOAT||LA5_0==INT||LA5_0==VAR) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// OCLGrammar.g:54:6: LB condition RB
					{
					root_0 = (Object)adaptor.nil();


					LB16=(Token)match(input,LB,FOLLOW_LB_in_bool300); 
					LB16_tree = (Object)adaptor.create(LB16);
					adaptor.addChild(root_0, LB16_tree);

					pushFollow(FOLLOW_condition_in_bool302);
					condition17=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition17.getTree());

					RB18=(Token)match(input,RB,FOLLOW_RB_in_bool305); 
					RB18_tree = (Object)adaptor.create(RB18);
					adaptor.addChild(root_0, RB18_tree);

					}
					break;
				case 2 :
					// OCLGrammar.g:55:5: exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool311);
					exp19=exp();
					state._fsp--;

					adaptor.addChild(root_0, exp19.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// OCLGrammar.g:60:1: exp : ( atom comparaison_op atom | atom );
	public final OCLGrammarParser.exp_return exp() throws RecognitionException {
		OCLGrammarParser.exp_return retval = new OCLGrammarParser.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom20 =null;
		ParserRuleReturnScope comparaison_op21 =null;
		ParserRuleReturnScope atom22 =null;
		ParserRuleReturnScope atom23 =null;


		try {
			// OCLGrammar.g:61:2: ( atom comparaison_op atom | atom )
			int alt6=2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// OCLGrammar.g:61:7: atom comparaison_op atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_exp327);
					atom20=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom20.getTree());

					pushFollow(FOLLOW_comparaison_op_in_exp330);
					comparaison_op21=comparaison_op();
					state._fsp--;

					adaptor.addChild(root_0, comparaison_op21.getTree());

					pushFollow(FOLLOW_atom_in_exp334);
					atom22=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom22.getTree());

					}
					break;
				case 2 :
					// OCLGrammar.g:62:5: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_exp340);
					atom23=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp"


	public static class comparaison_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparaison_op"
	// OCLGrammar.g:65:1: comparaison_op : ( EQ | DIF | GT | LT | GEQ | LEQ ) ;
	public final OCLGrammarParser.comparaison_op_return comparaison_op() throws RecognitionException {
		OCLGrammarParser.comparaison_op_return retval = new OCLGrammarParser.comparaison_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set24=null;

		Object set24_tree=null;

		try {
			// OCLGrammar.g:66:5: ( ( EQ | DIF | GT | LT | GEQ | LEQ ) )
			// OCLGrammar.g:
			{
			root_0 = (Object)adaptor.nil();


			set24=input.LT(1);
			if ( input.LA(1)==DIF||input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GT)||input.LA(1)==LEQ||input.LA(1)==LT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set24));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparaison_op"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// OCLGrammar.g:69:1: atom : ( comp_var | INT | FLOAT );
	public final OCLGrammarParser.atom_return atom() throws RecognitionException {
		OCLGrammarParser.atom_return retval = new OCLGrammarParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT26=null;
		Token FLOAT27=null;
		ParserRuleReturnScope comp_var25 =null;

		Object INT26_tree=null;
		Object FLOAT27_tree=null;

		try {
			// OCLGrammar.g:70:2: ( comp_var | INT | FLOAT )
			int alt7=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt7=1;
				}
				break;
			case INT:
				{
				alt7=2;
				}
				break;
			case FLOAT:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// OCLGrammar.g:70:4: comp_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comp_var_in_atom385);
					comp_var25=comp_var();
					state._fsp--;

					adaptor.addChild(root_0, comp_var25.getTree());

					}
					break;
				case 2 :
					// OCLGrammar.g:71:4: INT
					{
					root_0 = (Object)adaptor.nil();


					INT26=(Token)match(input,INT,FOLLOW_INT_in_atom390); 
					INT26_tree = (Object)adaptor.create(INT26);
					adaptor.addChild(root_0, INT26_tree);

					}
					break;
				case 3 :
					// OCLGrammar.g:72:4: FLOAT
					{
					root_0 = (Object)adaptor.nil();


					FLOAT27=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom395); 
					FLOAT27_tree = (Object)adaptor.create(FLOAT27);
					adaptor.addChild(root_0, FLOAT27_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class comp_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comp_var"
	// OCLGrammar.g:75:1: comp_var : VAR ( ( PT ) VAR )* ;
	public final OCLGrammarParser.comp_var_return comp_var() throws RecognitionException {
		OCLGrammarParser.comp_var_return retval = new OCLGrammarParser.comp_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR28=null;
		Token PT29=null;
		Token VAR30=null;

		Object VAR28_tree=null;
		Object PT29_tree=null;
		Object VAR30_tree=null;

		try {
			// OCLGrammar.g:76:2: ( VAR ( ( PT ) VAR )* )
			// OCLGrammar.g:76:4: VAR ( ( PT ) VAR )*
			{
			root_0 = (Object)adaptor.nil();


			VAR28=(Token)match(input,VAR,FOLLOW_VAR_in_comp_var405); 
			VAR28_tree = (Object)adaptor.create(VAR28);
			adaptor.addChild(root_0, VAR28_tree);

			// OCLGrammar.g:76:8: ( ( PT ) VAR )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==PT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// OCLGrammar.g:76:9: ( PT ) VAR
					{
					// OCLGrammar.g:76:9: ( PT )
					// OCLGrammar.g:76:10: PT
					{
					PT29=(Token)match(input,PT,FOLLOW_PT_in_comp_var409); 
					PT29_tree = (Object)adaptor.create(PT29);
					adaptor.addChild(root_0, PT29_tree);

					}

					VAR30=(Token)match(input,VAR,FOLLOW_VAR_in_comp_var412); 
					VAR30_tree = (Object)adaptor.create(VAR30);
					adaptor.addChild(root_0, VAR30_tree);

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comp_var"

	// Delegated rules


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\10\uffff";
	static final String DFA6_eofS =
		"\1\uffff\3\6\3\uffff\1\6";
	static final String DFA6_minS =
		"\1\10\3\4\1\25\2\uffff\1\4";
	static final String DFA6_maxS =
		"\1\25\3\27\1\25\2\uffff\1\27";
	static final String DFA6_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA6_specialS =
		"\10\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\3\2\uffff\1\2\11\uffff\1\1",
			"\1\6\1\5\1\uffff\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\2\uffff\1\6"+
			"\1\4\1\6\2\uffff\1\6",
			"\1\6\1\5\1\uffff\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\2\uffff\1\6"+
			"\1\uffff\1\6\2\uffff\1\6",
			"\1\6\1\5\1\uffff\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\2\uffff\1\6"+
			"\1\uffff\1\6\2\uffff\1\6",
			"\1\7",
			"",
			"",
			"\1\6\1\5\1\uffff\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\2\uffff\1\6"+
			"\1\4\1\6\2\uffff\1\6"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "60:1: exp : ( atom comparaison_op atom | atom );";
		}
	}

	public static final BitSet FOLLOW_condition_in_start192 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_and_in_condition207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_or_in_bool_and222 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_bool_and225 = new BitSet(new long[]{0x0000000000221900L});
	public static final BitSet FOLLOW_bool_or_in_bool_and227 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_bool_xor_in_bool_or241 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_OR_in_bool_or244 = new BitSet(new long[]{0x0000000000221900L});
	public static final BitSet FOLLOW_bool_xor_in_bool_or246 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_bool_neg_in_bool_xor260 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_XOR_in_bool_xor263 = new BitSet(new long[]{0x0000000000221900L});
	public static final BitSet FOLLOW_bool_neg_in_bool_xor265 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_NOT_in_bool_neg280 = new BitSet(new long[]{0x0000000000201900L});
	public static final BitSet FOLLOW_bool_in_bool_neg282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_bool_neg288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_bool300 = new BitSet(new long[]{0x0000000000221900L});
	public static final BitSet FOLLOW_condition_in_bool302 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RB_in_bool305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_exp327 = new BitSet(new long[]{0x000000000000A6A0L});
	public static final BitSet FOLLOW_comparaison_op_in_exp330 = new BitSet(new long[]{0x0000000000200900L});
	public static final BitSet FOLLOW_atom_in_exp334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_exp340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comp_var_in_atom385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comp_var405 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_PT_in_comp_var409 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_in_comp_var412 = new BitSet(new long[]{0x0000000000080002L});
}

package fr.mleduc.fsm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.mleduc.fsm.services.FsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fsm'", "'init'", "'='", "'-'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFsmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFsm.g"; }



     	private FsmGrammarAccess grammarAccess;

        public InternalFsmParser(TokenStream input, FsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Fsm";
       	}

       	@Override
       	protected FsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFsm"
    // InternalFsm.g:64:1: entryRuleFsm returns [EObject current=null] : iv_ruleFsm= ruleFsm EOF ;
    public final EObject entryRuleFsm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFsm = null;


        try {
            // InternalFsm.g:64:44: (iv_ruleFsm= ruleFsm EOF )
            // InternalFsm.g:65:2: iv_ruleFsm= ruleFsm EOF
            {
             newCompositeNode(grammarAccess.getFsmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFsm=ruleFsm();

            state._fsp--;

             current =iv_ruleFsm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFsm"


    // $ANTLR start "ruleFsm"
    // InternalFsm.g:71:1: ruleFsm returns [EObject current=null] : (otherlv_0= 'fsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'init' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ( (lv_states_5_0= ruleState ) )* ) ;
    public final EObject ruleFsm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_states_5_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:77:2: ( (otherlv_0= 'fsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'init' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ( (lv_states_5_0= ruleState ) )* ) )
            // InternalFsm.g:78:2: (otherlv_0= 'fsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'init' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ( (lv_states_5_0= ruleState ) )* )
            {
            // InternalFsm.g:78:2: (otherlv_0= 'fsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'init' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ( (lv_states_5_0= ruleState ) )* )
            // InternalFsm.g:79:3: otherlv_0= 'fsm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'init' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) ( (lv_states_5_0= ruleState ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFsmAccess().getFsmKeyword_0());
            		
            // InternalFsm.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFsm.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFsm.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalFsm.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFsmAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFsmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFsmAccess().getInitKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFsmAccess().getEqualsSignKeyword_3());
            		
            // InternalFsm.g:109:3: ( (otherlv_4= RULE_ID ) )
            // InternalFsm.g:110:4: (otherlv_4= RULE_ID )
            {
            // InternalFsm.g:110:4: (otherlv_4= RULE_ID )
            // InternalFsm.g:111:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFsmRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getFsmAccess().getStateStateCrossReference_4_0());
            				

            }


            }

            // InternalFsm.g:122:3: ( (lv_states_5_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFsm.g:123:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalFsm.g:123:4: (lv_states_5_0= ruleState )
            	    // InternalFsm.g:124:5: lv_states_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getFsmAccess().getStatesStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFsmRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"fr.mleduc.fsm.Fsm.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFsm"


    // $ANTLR start "entryRuleState"
    // InternalFsm.g:145:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFsm.g:145:46: (iv_ruleState= ruleState EOF )
            // InternalFsm.g:146:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFsm.g:152:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_transitions_2_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:158:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) ) )* ) )
            // InternalFsm.g:159:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) ) )* )
            {
            // InternalFsm.g:159:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) ) )* )
            // InternalFsm.g:160:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) ) )*
            {
            // InternalFsm.g:160:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFsm.g:161:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFsm.g:161:4: (lv_name_0_0= RULE_ID )
            // InternalFsm.g:162:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFsm.g:178:3: (otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFsm.g:179:4: otherlv_1= '-' ( (lv_transitions_2_0= ruleTransition ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStateAccess().getHyphenMinusKeyword_1_0());
            	    			
            	    // InternalFsm.g:183:4: ( (lv_transitions_2_0= ruleTransition ) )
            	    // InternalFsm.g:184:5: (lv_transitions_2_0= ruleTransition )
            	    {
            	    // InternalFsm.g:184:5: (lv_transitions_2_0= ruleTransition )
            	    // InternalFsm.g:185:6: lv_transitions_2_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_transitions_2_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_2_0,
            	    							"fr.mleduc.fsm.Fsm.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFsm.g:207:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFsm.g:207:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFsm.g:208:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFsm.g:214:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFsm.g:220:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFsm.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFsm.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalFsm.g:222:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFsm.g:222:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFsm.g:223:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFsm.g:223:4: (lv_name_0_0= RULE_ID )
            // InternalFsm.g:224:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalFsm.g:244:3: ( (otherlv_2= RULE_ID ) )
            // InternalFsm.g:245:4: (otherlv_2= RULE_ID )
            {
            // InternalFsm.g:245:4: (otherlv_2= RULE_ID )
            // InternalFsm.g:246:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}
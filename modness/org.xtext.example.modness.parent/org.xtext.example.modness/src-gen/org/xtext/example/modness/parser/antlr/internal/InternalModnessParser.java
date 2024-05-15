package org.xtext.example.modness.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.modness.services.ModnessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModnessParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GroupBias'", "'{'", "'domain:'", "';'", "'source:'", "','", "'sensitiveVariables:'", "'};'", "'positiveOutcome:'", "'unprivilegedGroup:'", "'privilegedGroup:'", "'analysis:'", "'}'", "'SensitiveVariable{'", "'name:'", "'values:'", "'SensitiveGroup'", "'sensitiveValue:'", "'GroupAnalysis'", "'scope:'", "'metric:'", "'dataset:'", "'datasetUnprivilegedGroup:'", "'datasetPrivilegedGroup:'", "'Metric'", "'toleranceValue:'", "'operator:'", "'function:'", "'Dataset'", "'groundTruthLabelName:'", "'predictedLabelName:'", "'filePath:'", "'otherVariable:'", "'datasetSentiveVariable:'", "'mappingGroup'", "'('", "');'", "'-'", "'.'", "'E'", "'e'", "'parameter:'", "'value:'", "'lowerValue:'", "'greaterValue:'", "'Operation'", "'equalityOperator'", "'leftSide'", "'rightSide'", "'Probability'", "'object'", "'condition'", "'ExpectedValue'", "'columnName'", "'GroupSize'", "'variable'", "'groupCondition'", "'DatasetSize'", "'Logaritm'", "'operatorcomponent'", "'Summation'", "'startRange'", "'endRange'", "'body'", "'ExistingGroupFairnessMetric'", "'ExistingIndividualFairnessMetric'", "'OperatorComponent'", "'function'", "'operationvalue'", "'OperationValue'", "'value'", "'LogicalCondition'", "'sensitivegroup'", "'sublogicalcondition'", "'SubLogicalCondition'", "'logicalOperator'", "'logicalcondition'", "'relativeToDatasetSize'", "'VariableValue'", "'operator'", "'outcome:'", "'SensitiveVariableValue'", "'id:'", "'mappingValue:'", "'OtherVariable'", "'othervariablevalue'", "'DatasetSensitiveVariable'", "'mappingSensitiveVariable:'", "'WRONG_ALGORITHM_BEHAVIOUR'", "'HUMAN_DISCRIMINATION'", "'WRONG_MEASUREMENT'", "'OMITTED_VARIABLE'", "'WRONG_SAMPLING'", "'WRONG_AGGREGATION'", "'WRONG_LINKING'", "'WRONG_PRESENTATION'", "'RESULT_RANKING'", "'WRONG_SYSTEM_EVALUATION'", "'WRONG_SYSTEM_TARGET_POPULATION'", "'CHANGE_IN_TARGET_POPULATION'", "'EQUAL'", "'GREATER'", "'MINOR'", "'GREATER_EQUAL'", "'MINOR_EQUAL'", "'NOT_EQUAL'", "'IN_INCLUDED'", "'IN_EXCLUDED'", "'IN_LOWER_INCLUDED'", "'IN_GREATER_INCLUDED'", "'SUM'", "'DIFFERENCE'", "'MULTIPLICATION'", "'RATIO'", "'AND'", "'OR'", "'STATISTICAL_PARITY'", "'DISPARATE_IMPACT'", "'EQUALIZED_ODDS'", "'EQUAL_ACCURACY'", "'FALSE_POSITIVE_DIFFERENCE'", "'TRUE_POSITIVE_DIFFERENCE'", "'MANHATTAN_DISTANCE'", "'EUCLIDEAN_DISTANCE'", "'MAHALANOBIS_DISTANCE'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalModnessParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModnessParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModnessParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModness.g"; }



     	private ModnessGrammarAccess grammarAccess;

        public InternalModnessParser(TokenStream input, ModnessGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GroupBias";
       	}

       	@Override
       	protected ModnessGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGroupBias"
    // InternalModness.g:65:1: entryRuleGroupBias returns [EObject current=null] : iv_ruleGroupBias= ruleGroupBias EOF ;
    public final EObject entryRuleGroupBias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBias = null;


        try {
            // InternalModness.g:65:50: (iv_ruleGroupBias= ruleGroupBias EOF )
            // InternalModness.g:66:2: iv_ruleGroupBias= ruleGroupBias EOF
            {
             newCompositeNode(grammarAccess.getGroupBiasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupBias=ruleGroupBias();

            state._fsp--;

             current =iv_ruleGroupBias; 
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
    // $ANTLR end "entryRuleGroupBias"


    // $ANTLR start "ruleGroupBias"
    // InternalModness.g:72:1: ruleGroupBias returns [EObject current=null] : (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain:' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= ';' otherlv_6= 'source:' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= ';' otherlv_11= 'sensitiveVariables:' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '};' otherlv_17= 'positiveOutcome:' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= ';' otherlv_20= 'unprivilegedGroup:' otherlv_21= '{' ( (lv_unprivilegedGroup_22_0= ruleSensitiveGroup ) ) (otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) )* otherlv_25= '};' otherlv_26= 'privilegedGroup:' otherlv_27= '{' ( (lv_privilegedGroup_28_0= ruleSensitiveGroup ) ) (otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) )* otherlv_31= '};' otherlv_32= 'analysis:' otherlv_33= '{' ( (lv_analysis_34_0= ruleGroupAnalysis ) ) (otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) ) )* otherlv_37= '};' otherlv_38= '}' ) ;
    public final EObject ruleGroupBias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_domain_4_0 = null;

        Enumerator lv_source_7_0 = null;

        Enumerator lv_source_9_0 = null;

        EObject lv_sensitiveVariables_13_0 = null;

        EObject lv_sensitiveVariables_15_0 = null;

        EObject lv_positiveOutcome_18_0 = null;

        EObject lv_unprivilegedGroup_22_0 = null;

        EObject lv_unprivilegedGroup_24_0 = null;

        EObject lv_privilegedGroup_28_0 = null;

        EObject lv_privilegedGroup_30_0 = null;

        EObject lv_analysis_34_0 = null;

        EObject lv_analysis_36_0 = null;



        	enterRule();

        try {
            // InternalModness.g:78:2: ( (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain:' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= ';' otherlv_6= 'source:' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= ';' otherlv_11= 'sensitiveVariables:' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '};' otherlv_17= 'positiveOutcome:' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= ';' otherlv_20= 'unprivilegedGroup:' otherlv_21= '{' ( (lv_unprivilegedGroup_22_0= ruleSensitiveGroup ) ) (otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) )* otherlv_25= '};' otherlv_26= 'privilegedGroup:' otherlv_27= '{' ( (lv_privilegedGroup_28_0= ruleSensitiveGroup ) ) (otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) )* otherlv_31= '};' otherlv_32= 'analysis:' otherlv_33= '{' ( (lv_analysis_34_0= ruleGroupAnalysis ) ) (otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) ) )* otherlv_37= '};' otherlv_38= '}' ) )
            // InternalModness.g:79:2: (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain:' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= ';' otherlv_6= 'source:' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= ';' otherlv_11= 'sensitiveVariables:' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '};' otherlv_17= 'positiveOutcome:' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= ';' otherlv_20= 'unprivilegedGroup:' otherlv_21= '{' ( (lv_unprivilegedGroup_22_0= ruleSensitiveGroup ) ) (otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) )* otherlv_25= '};' otherlv_26= 'privilegedGroup:' otherlv_27= '{' ( (lv_privilegedGroup_28_0= ruleSensitiveGroup ) ) (otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) )* otherlv_31= '};' otherlv_32= 'analysis:' otherlv_33= '{' ( (lv_analysis_34_0= ruleGroupAnalysis ) ) (otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) ) )* otherlv_37= '};' otherlv_38= '}' )
            {
            // InternalModness.g:79:2: (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain:' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= ';' otherlv_6= 'source:' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= ';' otherlv_11= 'sensitiveVariables:' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '};' otherlv_17= 'positiveOutcome:' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= ';' otherlv_20= 'unprivilegedGroup:' otherlv_21= '{' ( (lv_unprivilegedGroup_22_0= ruleSensitiveGroup ) ) (otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) )* otherlv_25= '};' otherlv_26= 'privilegedGroup:' otherlv_27= '{' ( (lv_privilegedGroup_28_0= ruleSensitiveGroup ) ) (otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) )* otherlv_31= '};' otherlv_32= 'analysis:' otherlv_33= '{' ( (lv_analysis_34_0= ruleGroupAnalysis ) ) (otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) ) )* otherlv_37= '};' otherlv_38= '}' )
            // InternalModness.g:80:3: otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain:' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= ';' otherlv_6= 'source:' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= ';' otherlv_11= 'sensitiveVariables:' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '};' otherlv_17= 'positiveOutcome:' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= ';' otherlv_20= 'unprivilegedGroup:' otherlv_21= '{' ( (lv_unprivilegedGroup_22_0= ruleSensitiveGroup ) ) (otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) )* otherlv_25= '};' otherlv_26= 'privilegedGroup:' otherlv_27= '{' ( (lv_privilegedGroup_28_0= ruleSensitiveGroup ) ) (otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) )* otherlv_31= '};' otherlv_32= 'analysis:' otherlv_33= '{' ( (lv_analysis_34_0= ruleGroupAnalysis ) ) (otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) ) )* otherlv_37= '};' otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupBiasAccess().getGroupBiasKeyword_0());
            		
            // InternalModness.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:85:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupBiasAccess().getDomainKeyword_3());
            		
            // InternalModness.g:111:3: ( (lv_domain_4_0= ruleEString ) )
            // InternalModness.g:112:4: (lv_domain_4_0= ruleEString )
            {
            // InternalModness.g:112:4: (lv_domain_4_0= ruleEString )
            // InternalModness.g:113:5: lv_domain_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getDomainEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_domain_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_4_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupBiasAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupBiasAccess().getSourceKeyword_6());
            		
            // InternalModness.g:138:3: ( (lv_source_7_0= ruleBiasSource ) )
            // InternalModness.g:139:4: (lv_source_7_0= ruleBiasSource )
            {
            // InternalModness.g:139:4: (lv_source_7_0= ruleBiasSource )
            // InternalModness.g:140:5: lv_source_7_0= ruleBiasSource
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getSourceBiasSourceEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_source_7_0=ruleBiasSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"source",
            						lv_source_7_0,
            						"org.xtext.example.modness.Modness.BiasSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:157:3: (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModness.g:158:4: otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGroupBiasAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalModness.g:162:4: ( (lv_source_9_0= ruleBiasSource ) )
            	    // InternalModness.g:163:5: (lv_source_9_0= ruleBiasSource )
            	    {
            	    // InternalModness.g:163:5: (lv_source_9_0= ruleBiasSource )
            	    // InternalModness.g:164:6: lv_source_9_0= ruleBiasSource
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getSourceBiasSourceEnumRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_source_9_0=ruleBiasSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"source",
            	    							lv_source_9_0,
            	    							"org.xtext.example.modness.Modness.BiasSource");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupBiasAccess().getSemicolonKeyword_9());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupBiasAccess().getSensitiveVariablesKeyword_10());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalModness.g:194:3: ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) )
            // InternalModness.g:195:4: (lv_sensitiveVariables_13_0= ruleSensitiveVariable )
            {
            // InternalModness.g:195:4: (lv_sensitiveVariables_13_0= ruleSensitiveVariable )
            // InternalModness.g:196:5: lv_sensitiveVariables_13_0= ruleSensitiveVariable
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getSensitiveVariablesSensitiveVariableParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_sensitiveVariables_13_0=ruleSensitiveVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"sensitiveVariables",
            						lv_sensitiveVariables_13_0,
            						"org.xtext.example.modness.Modness.SensitiveVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:213:3: (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModness.g:214:4: otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) )
            	    {
            	    otherlv_14=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGroupBiasAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalModness.g:218:4: ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) )
            	    // InternalModness.g:219:5: (lv_sensitiveVariables_15_0= ruleSensitiveVariable )
            	    {
            	    // InternalModness.g:219:5: (lv_sensitiveVariables_15_0= ruleSensitiveVariable )
            	    // InternalModness.g:220:6: lv_sensitiveVariables_15_0= ruleSensitiveVariable
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getSensitiveVariablesSensitiveVariableParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_sensitiveVariables_15_0=ruleSensitiveVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensitiveVariables",
            	    							lv_sensitiveVariables_15_0,
            	    							"org.xtext.example.modness.Modness.SensitiveVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_14());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getGroupBiasAccess().getPositiveOutcomeKeyword_15());
            		
            // InternalModness.g:246:3: ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) )
            // InternalModness.g:247:4: (lv_positiveOutcome_18_0= rulePositiveOutcome )
            {
            // InternalModness.g:247:4: (lv_positiveOutcome_18_0= rulePositiveOutcome )
            // InternalModness.g:248:5: lv_positiveOutcome_18_0= rulePositiveOutcome
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getPositiveOutcomePositiveOutcomeParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_6);
            lv_positiveOutcome_18_0=rulePositiveOutcome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					set(
            						current,
            						"positiveOutcome",
            						lv_positiveOutcome_18_0,
            						"org.xtext.example.modness.Modness.PositiveOutcome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_19, grammarAccess.getGroupBiasAccess().getSemicolonKeyword_17());
            		
            otherlv_20=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getGroupBiasAccess().getUnprivilegedGroupKeyword_18());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_21, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalModness.g:277:3: ( (lv_unprivilegedGroup_22_0= ruleSensitiveGroup ) )
            // InternalModness.g:278:4: (lv_unprivilegedGroup_22_0= ruleSensitiveGroup )
            {
            // InternalModness.g:278:4: (lv_unprivilegedGroup_22_0= ruleSensitiveGroup )
            // InternalModness.g:279:5: lv_unprivilegedGroup_22_0= ruleSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getUnprivilegedGroupSensitiveGroupParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_12);
            lv_unprivilegedGroup_22_0=ruleSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"unprivilegedGroup",
            						lv_unprivilegedGroup_22_0,
            						"org.xtext.example.modness.Modness.SensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:296:3: (otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModness.g:297:4: otherlv_23= ',' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_15); 

            	    				newLeafNode(otherlv_23, grammarAccess.getGroupBiasAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalModness.g:301:4: ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) )
            	    // InternalModness.g:302:5: (lv_unprivilegedGroup_24_0= ruleSensitiveGroup )
            	    {
            	    // InternalModness.g:302:5: (lv_unprivilegedGroup_24_0= ruleSensitiveGroup )
            	    // InternalModness.g:303:6: lv_unprivilegedGroup_24_0= ruleSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getUnprivilegedGroupSensitiveGroupParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_unprivilegedGroup_24_0=ruleSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"unprivilegedGroup",
            	    							lv_unprivilegedGroup_24_0,
            	    							"org.xtext.example.modness.Modness.SensitiveGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_25=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_25, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_22());
            		
            otherlv_26=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_26, grammarAccess.getGroupBiasAccess().getPrivilegedGroupKeyword_23());
            		
            otherlv_27=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_27, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_24());
            		
            // InternalModness.g:333:3: ( (lv_privilegedGroup_28_0= ruleSensitiveGroup ) )
            // InternalModness.g:334:4: (lv_privilegedGroup_28_0= ruleSensitiveGroup )
            {
            // InternalModness.g:334:4: (lv_privilegedGroup_28_0= ruleSensitiveGroup )
            // InternalModness.g:335:5: lv_privilegedGroup_28_0= ruleSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getPrivilegedGroupSensitiveGroupParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_12);
            lv_privilegedGroup_28_0=ruleSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"privilegedGroup",
            						lv_privilegedGroup_28_0,
            						"org.xtext.example.modness.Modness.SensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:352:3: (otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalModness.g:353:4: otherlv_29= ',' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) )
            	    {
            	    otherlv_29=(Token)match(input,16,FOLLOW_15); 

            	    				newLeafNode(otherlv_29, grammarAccess.getGroupBiasAccess().getCommaKeyword_26_0());
            	    			
            	    // InternalModness.g:357:4: ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) )
            	    // InternalModness.g:358:5: (lv_privilegedGroup_30_0= ruleSensitiveGroup )
            	    {
            	    // InternalModness.g:358:5: (lv_privilegedGroup_30_0= ruleSensitiveGroup )
            	    // InternalModness.g:359:6: lv_privilegedGroup_30_0= ruleSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getPrivilegedGroupSensitiveGroupParserRuleCall_26_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_privilegedGroup_30_0=ruleSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"privilegedGroup",
            	    							lv_privilegedGroup_30_0,
            	    							"org.xtext.example.modness.Modness.SensitiveGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_31=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_31, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_27());
            		
            otherlv_32=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_32, grammarAccess.getGroupBiasAccess().getAnalysisKeyword_28());
            		
            otherlv_33=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_33, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_29());
            		
            // InternalModness.g:389:3: ( (lv_analysis_34_0= ruleGroupAnalysis ) )
            // InternalModness.g:390:4: (lv_analysis_34_0= ruleGroupAnalysis )
            {
            // InternalModness.g:390:4: (lv_analysis_34_0= ruleGroupAnalysis )
            // InternalModness.g:391:5: lv_analysis_34_0= ruleGroupAnalysis
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getAnalysisGroupAnalysisParserRuleCall_30_0());
            				
            pushFollow(FOLLOW_12);
            lv_analysis_34_0=ruleGroupAnalysis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"analysis",
            						lv_analysis_34_0,
            						"org.xtext.example.modness.Modness.GroupAnalysis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:408:3: (otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalModness.g:409:4: otherlv_35= ',' ( (lv_analysis_36_0= ruleGroupAnalysis ) )
            	    {
            	    otherlv_35=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_35, grammarAccess.getGroupBiasAccess().getCommaKeyword_31_0());
            	    			
            	    // InternalModness.g:413:4: ( (lv_analysis_36_0= ruleGroupAnalysis ) )
            	    // InternalModness.g:414:5: (lv_analysis_36_0= ruleGroupAnalysis )
            	    {
            	    // InternalModness.g:414:5: (lv_analysis_36_0= ruleGroupAnalysis )
            	    // InternalModness.g:415:6: lv_analysis_36_0= ruleGroupAnalysis
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getAnalysisGroupAnalysisParserRuleCall_31_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_analysis_36_0=ruleGroupAnalysis();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"analysis",
            	    							lv_analysis_36_0,
            	    							"org.xtext.example.modness.Modness.GroupAnalysis");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_37=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_37, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_32());
            		
            otherlv_38=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_33());
            		

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
    // $ANTLR end "ruleGroupBias"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalModness.g:445:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // InternalModness.g:445:57: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalModness.g:446:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
             newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;

             current =iv_ruleEqualityOperator; 
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
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalModness.g:452:1: ruleEqualityOperator returns [EObject current=null] : (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject this_SingleOperator_0 = null;

        EObject this_RangeOperator_1 = null;



        	enterRule();

        try {
            // InternalModness.g:458:2: ( (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator ) )
            // InternalModness.g:459:2: (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator )
            {
            // InternalModness.g:459:2: (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==52) ) {
                    int LA6_2 = input.LA(3);

                    if ( ((LA6_2>=117 && LA6_2<=120)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_2>=111 && LA6_2<=116)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModness.g:460:3: this_SingleOperator_0= ruleSingleOperator
                    {

                    			newCompositeNode(grammarAccess.getEqualityOperatorAccess().getSingleOperatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleOperator_0=ruleSingleOperator();

                    state._fsp--;


                    			current = this_SingleOperator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModness.g:469:3: this_RangeOperator_1= ruleRangeOperator
                    {

                    			newCompositeNode(grammarAccess.getEqualityOperatorAccess().getRangeOperatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeOperator_1=ruleRangeOperator();

                    state._fsp--;


                    			current = this_RangeOperator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleFunction"
    // InternalModness.g:481:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalModness.g:481:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalModness.g:482:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalModness.g:488:1: ruleFunction returns [EObject current=null] : (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Operation_0 = null;

        EObject this_Probability_1 = null;

        EObject this_ExpectedValue_2 = null;

        EObject this_GroupSize_3 = null;

        EObject this_DatasetSize_4 = null;

        EObject this_Logaritm_5 = null;

        EObject this_Summation_6 = null;

        EObject this_ExistingGroupFairnessMetric_7 = null;

        EObject this_ExistingIndividualFairnessMetric_8 = null;



        	enterRule();

        try {
            // InternalModness.g:494:2: ( (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric ) )
            // InternalModness.g:495:2: (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric )
            {
            // InternalModness.g:495:2: (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt7=1;
                }
                break;
            case 60:
                {
                alt7=2;
                }
                break;
            case 63:
                {
                alt7=3;
                }
                break;
            case 65:
                {
                alt7=4;
                }
                break;
            case 68:
                {
                alt7=5;
                }
                break;
            case 69:
                {
                alt7=6;
                }
                break;
            case 71:
                {
                alt7=7;
                }
                break;
            case 75:
                {
                alt7=8;
                }
                break;
            case 76:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalModness.g:496:3: this_Operation_0= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_0=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModness.g:505:3: this_Probability_1= ruleProbability
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getProbabilityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Probability_1=ruleProbability();

                    state._fsp--;


                    			current = this_Probability_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalModness.g:514:3: this_ExpectedValue_2= ruleExpectedValue
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getExpectedValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpectedValue_2=ruleExpectedValue();

                    state._fsp--;


                    			current = this_ExpectedValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalModness.g:523:3: this_GroupSize_3= ruleGroupSize
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getGroupSizeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupSize_3=ruleGroupSize();

                    state._fsp--;


                    			current = this_GroupSize_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalModness.g:532:3: this_DatasetSize_4= ruleDatasetSize
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getDatasetSizeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatasetSize_4=ruleDatasetSize();

                    state._fsp--;


                    			current = this_DatasetSize_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalModness.g:541:3: this_Logaritm_5= ruleLogaritm
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getLogaritmParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Logaritm_5=ruleLogaritm();

                    state._fsp--;


                    			current = this_Logaritm_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalModness.g:550:3: this_Summation_6= ruleSummation
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getSummationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Summation_6=ruleSummation();

                    state._fsp--;


                    			current = this_Summation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalModness.g:559:3: this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getExistingGroupFairnessMetricParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistingGroupFairnessMetric_7=ruleExistingGroupFairnessMetric();

                    state._fsp--;


                    			current = this_ExistingGroupFairnessMetric_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalModness.g:568:3: this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getExistingIndividualFairnessMetricParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistingIndividualFairnessMetric_8=ruleExistingIndividualFairnessMetric();

                    state._fsp--;


                    			current = this_ExistingIndividualFairnessMetric_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVariableValue"
    // InternalModness.g:580:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalModness.g:580:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalModness.g:581:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             newCompositeNode(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableValue=ruleVariableValue();

            state._fsp--;

             current =iv_ruleVariableValue; 
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
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // InternalModness.g:587:1: ruleVariableValue returns [EObject current=null] : (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject this_VariableValue_Impl_0 = null;

        EObject this_DatasetPositiveOutcome_1 = null;

        EObject this_DatasetSensitiveVariableValue_2 = null;



        	enterRule();

        try {
            // InternalModness.g:593:2: ( (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue ) )
            // InternalModness.g:594:2: (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue )
            {
            // InternalModness.g:594:2: (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==12) ) {
                    alt8=2;
                }
                else if ( (LA8_1==89) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 89:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 92:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalModness.g:595:3: this_VariableValue_Impl_0= ruleVariableValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getVariableValueAccess().getVariableValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableValue_Impl_0=ruleVariableValue_Impl();

                    state._fsp--;


                    			current = this_VariableValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModness.g:604:3: this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome
                    {

                    			newCompositeNode(grammarAccess.getVariableValueAccess().getDatasetPositiveOutcomeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatasetPositiveOutcome_1=ruleDatasetPositiveOutcome();

                    state._fsp--;


                    			current = this_DatasetPositiveOutcome_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalModness.g:613:3: this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue
                    {

                    			newCompositeNode(grammarAccess.getVariableValueAccess().getDatasetSensitiveVariableValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatasetSensitiveVariableValue_2=ruleDatasetSensitiveVariableValue();

                    state._fsp--;


                    			current = this_DatasetSensitiveVariableValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleEString"
    // InternalModness.g:625:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModness.g:625:47: (iv_ruleEString= ruleEString EOF )
            // InternalModness.g:626:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalModness.g:632:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModness.g:638:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModness.g:639:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModness.g:639:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalModness.g:640:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModness.g:648:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensitiveVariable"
    // InternalModness.g:659:1: entryRuleSensitiveVariable returns [EObject current=null] : iv_ruleSensitiveVariable= ruleSensitiveVariable EOF ;
    public final EObject entryRuleSensitiveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveVariable = null;


        try {
            // InternalModness.g:659:58: (iv_ruleSensitiveVariable= ruleSensitiveVariable EOF )
            // InternalModness.g:660:2: iv_ruleSensitiveVariable= ruleSensitiveVariable EOF
            {
             newCompositeNode(grammarAccess.getSensitiveVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensitiveVariable=ruleSensitiveVariable();

            state._fsp--;

             current =iv_ruleSensitiveVariable; 
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
    // $ANTLR end "entryRuleSensitiveVariable"


    // $ANTLR start "ruleSensitiveVariable"
    // InternalModness.g:666:1: ruleSensitiveVariable returns [EObject current=null] : (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' ) ;
    public final EObject ruleSensitiveVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensitiveVariableValue_5_0 = null;

        EObject lv_sensitiveVariableValue_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:672:2: ( (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' ) )
            // InternalModness.g:673:2: (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' )
            {
            // InternalModness.g:673:2: (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' )
            // InternalModness.g:674:3: otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveVariableAccess().getSensitiveVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensitiveVariableAccess().getNameKeyword_1());
            		
            // InternalModness.g:682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:683:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:683:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:684:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensitiveVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getSensitiveVariableAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveVariableAccess().getValuesKeyword_4());
            		
            // InternalModness.g:709:3: ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) )
            // InternalModness.g:710:4: (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue )
            {
            // InternalModness.g:710:4: (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue )
            // InternalModness.g:711:5: lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueSensitiveVariableValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_sensitiveVariableValue_5_0=ruleSensitiveVariableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensitiveVariableRule());
            					}
            					add(
            						current,
            						"sensitiveVariableValue",
            						lv_sensitiveVariableValue_5_0,
            						"org.xtext.example.modness.Modness.SensitiveVariableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:728:3: (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModness.g:729:4: otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSensitiveVariableAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalModness.g:733:4: ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) )
            	    // InternalModness.g:734:5: (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue )
            	    {
            	    // InternalModness.g:734:5: (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue )
            	    // InternalModness.g:735:6: lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue
            	    {

            	    						newCompositeNode(grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueSensitiveVariableValueParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_sensitiveVariableValue_7_0=ruleSensitiveVariableValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensitiveVariableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensitiveVariableValue",
            	    							lv_sensitiveVariableValue_7_0,
            	    							"org.xtext.example.modness.Modness.SensitiveVariableValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getSensitiveVariableAccess().getSemicolonKeyword_7());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSensitiveVariableAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSensitiveVariable"


    // $ANTLR start "entryRulePositiveOutcome"
    // InternalModness.g:765:1: entryRulePositiveOutcome returns [EObject current=null] : iv_rulePositiveOutcome= rulePositiveOutcome EOF ;
    public final EObject entryRulePositiveOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveOutcome = null;


        try {
            // InternalModness.g:765:56: (iv_rulePositiveOutcome= rulePositiveOutcome EOF )
            // InternalModness.g:766:2: iv_rulePositiveOutcome= rulePositiveOutcome EOF
            {
             newCompositeNode(grammarAccess.getPositiveOutcomeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveOutcome=rulePositiveOutcome();

            state._fsp--;

             current =iv_rulePositiveOutcome; 
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
    // $ANTLR end "entryRulePositiveOutcome"


    // $ANTLR start "rulePositiveOutcome"
    // InternalModness.g:772:1: rulePositiveOutcome returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject rulePositiveOutcome() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalModness.g:778:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalModness.g:779:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalModness.g:779:2: ( (lv_name_0_0= ruleEString ) )
            // InternalModness.g:780:3: (lv_name_0_0= ruleEString )
            {
            // InternalModness.g:780:3: (lv_name_0_0= ruleEString )
            // InternalModness.g:781:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getPositiveOutcomeAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPositiveOutcomeRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.modness.Modness.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulePositiveOutcome"


    // $ANTLR start "entryRuleSensitiveGroup"
    // InternalModness.g:801:1: entryRuleSensitiveGroup returns [EObject current=null] : iv_ruleSensitiveGroup= ruleSensitiveGroup EOF ;
    public final EObject entryRuleSensitiveGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveGroup = null;


        try {
            // InternalModness.g:801:55: (iv_ruleSensitiveGroup= ruleSensitiveGroup EOF )
            // InternalModness.g:802:2: iv_ruleSensitiveGroup= ruleSensitiveGroup EOF
            {
             newCompositeNode(grammarAccess.getSensitiveGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensitiveGroup=ruleSensitiveGroup();

            state._fsp--;

             current =iv_ruleSensitiveGroup; 
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
    // $ANTLR end "entryRuleSensitiveGroup"


    // $ANTLR start "ruleSensitiveGroup"
    // InternalModness.g:808:1: ruleSensitiveGroup returns [EObject current=null] : (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' ) ;
    public final EObject ruleSensitiveGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:814:2: ( (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' ) )
            // InternalModness.g:815:2: (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' )
            {
            // InternalModness.g:815:2: (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' )
            // InternalModness.g:816:3: otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveGroupAccess().getSensitiveGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSensitiveGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitiveGroupAccess().getNameKeyword_2());
            		
            // InternalModness.g:828:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:829:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:829:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:830:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveGroupAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensitiveGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveGroupAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSensitiveGroupAccess().getSensitiveValueKeyword_5());
            		
            // InternalModness.g:855:3: ( ( ruleEString ) )
            // InternalModness.g:856:4: ( ruleEString )
            {
            // InternalModness.g:856:4: ( ruleEString )
            // InternalModness.g:857:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensitiveGroupAccess().getSensitiveValueSensitiveVariableValueCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:871:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModness.g:872:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSensitiveGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalModness.g:876:4: ( ( ruleEString ) )
            	    // InternalModness.g:877:5: ( ruleEString )
            	    {
            	    // InternalModness.g:877:5: ( ruleEString )
            	    // InternalModness.g:878:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensitiveGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSensitiveGroupAccess().getSensitiveValueSensitiveVariableValueCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getSensitiveGroupAccess().getSemicolonKeyword_8());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSensitiveGroupAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleSensitiveGroup"


    // $ANTLR start "entryRuleGroupAnalysis"
    // InternalModness.g:905:1: entryRuleGroupAnalysis returns [EObject current=null] : iv_ruleGroupAnalysis= ruleGroupAnalysis EOF ;
    public final EObject entryRuleGroupAnalysis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupAnalysis = null;


        try {
            // InternalModness.g:905:54: (iv_ruleGroupAnalysis= ruleGroupAnalysis EOF )
            // InternalModness.g:906:2: iv_ruleGroupAnalysis= ruleGroupAnalysis EOF
            {
             newCompositeNode(grammarAccess.getGroupAnalysisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupAnalysis=ruleGroupAnalysis();

            state._fsp--;

             current =iv_ruleGroupAnalysis; 
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
    // $ANTLR end "entryRuleGroupAnalysis"


    // $ANTLR start "ruleGroupAnalysis"
    // InternalModness.g:912:1: ruleGroupAnalysis returns [EObject current=null] : (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'metric:' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '};' otherlv_11= 'dataset:' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '};' otherlv_17= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) (otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) ) )* otherlv_21= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup ) ) (otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) ) )* otherlv_25= '};' ) ;
    public final EObject ruleGroupAnalysis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_scope_3_0 = null;

        EObject lv_metric_7_0 = null;

        EObject lv_metric_9_0 = null;

        EObject lv_dataset_13_0 = null;

        EObject lv_dataset_15_0 = null;

        EObject lv_datasetUnprivilegedGroup_18_0 = null;

        EObject lv_datasetUnprivilegedGroup_20_0 = null;

        EObject lv_datasetPrivilegedGroup_22_0 = null;

        EObject lv_datasetPrivilegedGroup_24_0 = null;



        	enterRule();

        try {
            // InternalModness.g:918:2: ( (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'metric:' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '};' otherlv_11= 'dataset:' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '};' otherlv_17= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) (otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) ) )* otherlv_21= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup ) ) (otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) ) )* otherlv_25= '};' ) )
            // InternalModness.g:919:2: (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'metric:' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '};' otherlv_11= 'dataset:' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '};' otherlv_17= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) (otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) ) )* otherlv_21= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup ) ) (otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) ) )* otherlv_25= '};' )
            {
            // InternalModness.g:919:2: (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'metric:' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '};' otherlv_11= 'dataset:' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '};' otherlv_17= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) (otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) ) )* otherlv_21= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup ) ) (otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) ) )* otherlv_25= '};' )
            // InternalModness.g:920:3: otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'metric:' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '};' otherlv_11= 'dataset:' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '};' otherlv_17= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) (otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) ) )* otherlv_21= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup ) ) (otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) ) )* otherlv_25= '};'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAnalysisAccess().getGroupAnalysisKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalModness.g:928:3: (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModness.g:929:4: otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGroupAnalysisAccess().getScopeKeyword_2_0());
                    			
                    // InternalModness.g:933:4: ( (lv_scope_3_0= ruleEString ) )
                    // InternalModness.g:934:5: (lv_scope_3_0= ruleEString )
                    {
                    // InternalModness.g:934:5: (lv_scope_3_0= ruleEString )
                    // InternalModness.g:935:6: lv_scope_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getScopeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_scope_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_3_0,
                    							"org.xtext.example.modness.Modness.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAnalysisAccess().getSemicolonKeyword_3());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAnalysisAccess().getMetricKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalModness.g:965:3: ( (lv_metric_7_0= ruleMetric ) )
            // InternalModness.g:966:4: (lv_metric_7_0= ruleMetric )
            {
            // InternalModness.g:966:4: (lv_metric_7_0= ruleMetric )
            // InternalModness.g:967:5: lv_metric_7_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getMetricMetricParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_metric_7_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"metric",
            						lv_metric_7_0,
            						"org.xtext.example.modness.Modness.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:984:3: (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModness.g:985:4: otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_26); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalModness.g:989:4: ( (lv_metric_9_0= ruleMetric ) )
            	    // InternalModness.g:990:5: (lv_metric_9_0= ruleMetric )
            	    {
            	    // InternalModness.g:990:5: (lv_metric_9_0= ruleMetric )
            	    // InternalModness.g:991:6: lv_metric_9_0= ruleMetric
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getMetricMetricParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_metric_9_0=ruleMetric();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"metric",
            	    							lv_metric_9_0,
            	    							"org.xtext.example.modness.Modness.Metric");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketSemicolonKeyword_8());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAnalysisAccess().getDatasetKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalModness.g:1021:3: ( (lv_dataset_13_0= ruleDataset ) )
            // InternalModness.g:1022:4: (lv_dataset_13_0= ruleDataset )
            {
            // InternalModness.g:1022:4: (lv_dataset_13_0= ruleDataset )
            // InternalModness.g:1023:5: lv_dataset_13_0= ruleDataset
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetDatasetParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_dataset_13_0=ruleDataset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"dataset",
            						lv_dataset_13_0,
            						"org.xtext.example.modness.Modness.Dataset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1040:3: (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalModness.g:1041:4: otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) )
            	    {
            	    otherlv_14=(Token)match(input,16,FOLLOW_28); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalModness.g:1045:4: ( (lv_dataset_15_0= ruleDataset ) )
            	    // InternalModness.g:1046:5: (lv_dataset_15_0= ruleDataset )
            	    {
            	    // InternalModness.g:1046:5: (lv_dataset_15_0= ruleDataset )
            	    // InternalModness.g:1047:6: lv_dataset_15_0= ruleDataset
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetDatasetParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dataset_15_0=ruleDataset();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataset",
            	    							lv_dataset_15_0,
            	    							"org.xtext.example.modness.Modness.Dataset");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_16, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketSemicolonKeyword_13());
            		
            otherlv_17=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupKeyword_14());
            		
            // InternalModness.g:1073:3: ( (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup ) )
            // InternalModness.g:1074:4: (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup )
            {
            // InternalModness.g:1074:4: (lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup )
            // InternalModness.g:1075:5: lv_datasetUnprivilegedGroup_18_0= ruleDatasetSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupDatasetSensitiveGroupParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_30);
            lv_datasetUnprivilegedGroup_18_0=ruleDatasetSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"datasetUnprivilegedGroup",
            						lv_datasetUnprivilegedGroup_18_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1092:3: (otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalModness.g:1093:4: otherlv_19= ',' ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_19, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalModness.g:1097:4: ( (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup ) )
            	    // InternalModness.g:1098:5: (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup )
            	    {
            	    // InternalModness.g:1098:5: (lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup )
            	    // InternalModness.g:1099:6: lv_datasetUnprivilegedGroup_20_0= ruleDatasetSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupDatasetSensitiveGroupParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_datasetUnprivilegedGroup_20_0=ruleDatasetSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetUnprivilegedGroup",
            	    							lv_datasetUnprivilegedGroup_20_0,
            	    							"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_21=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupKeyword_17());
            		
            // InternalModness.g:1121:3: ( (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup ) )
            // InternalModness.g:1122:4: (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup )
            {
            // InternalModness.g:1122:4: (lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup )
            // InternalModness.g:1123:5: lv_datasetPrivilegedGroup_22_0= ruleDatasetSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupDatasetSensitiveGroupParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_12);
            lv_datasetPrivilegedGroup_22_0=ruleDatasetSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"datasetPrivilegedGroup",
            						lv_datasetPrivilegedGroup_22_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1140:3: (otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalModness.g:1141:4: otherlv_23= ',' ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_23, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_19_0());
            	    			
            	    // InternalModness.g:1145:4: ( (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup ) )
            	    // InternalModness.g:1146:5: (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup )
            	    {
            	    // InternalModness.g:1146:5: (lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup )
            	    // InternalModness.g:1147:6: lv_datasetPrivilegedGroup_24_0= ruleDatasetSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupDatasetSensitiveGroupParserRuleCall_19_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_datasetPrivilegedGroup_24_0=ruleDatasetSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetPrivilegedGroup",
            	    							lv_datasetPrivilegedGroup_24_0,
            	    							"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_25=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketSemicolonKeyword_20());
            		

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
    // $ANTLR end "ruleGroupAnalysis"


    // $ANTLR start "entryRuleSensitiveVariableValue"
    // InternalModness.g:1173:1: entryRuleSensitiveVariableValue returns [EObject current=null] : iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF ;
    public final EObject entryRuleSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveVariableValue = null;


        try {
            // InternalModness.g:1173:63: (iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF )
            // InternalModness.g:1174:2: iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF
            {
             newCompositeNode(grammarAccess.getSensitiveVariableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensitiveVariableValue=ruleSensitiveVariableValue();

            state._fsp--;

             current =iv_ruleSensitiveVariableValue; 
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
    // $ANTLR end "entryRuleSensitiveVariableValue"


    // $ANTLR start "ruleSensitiveVariableValue"
    // InternalModness.g:1180:1: ruleSensitiveVariableValue returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1186:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalModness.g:1187:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalModness.g:1187:2: ( (lv_name_0_0= ruleEString ) )
            // InternalModness.g:1188:3: (lv_name_0_0= ruleEString )
            {
            // InternalModness.g:1188:3: (lv_name_0_0= ruleEString )
            // InternalModness.g:1189:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getSensitiveVariableValueAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSensitiveVariableValueRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.modness.Modness.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSensitiveVariableValue"


    // $ANTLR start "entryRuleMetric"
    // InternalModness.g:1209:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalModness.g:1209:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalModness.g:1210:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalModness.g:1216:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'operator:' ( (lv_operator_9_0= ruleEqualityOperator ) ) otherlv_10= 'function:' ( (lv_function_11_0= ruleFunction ) ) otherlv_12= '};' ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_toleranceValue_6_0 = null;

        EObject lv_operator_9_0 = null;

        EObject lv_function_11_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1222:2: ( (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'operator:' ( (lv_operator_9_0= ruleEqualityOperator ) ) otherlv_10= 'function:' ( (lv_function_11_0= ruleFunction ) ) otherlv_12= '};' ) )
            // InternalModness.g:1223:2: (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'operator:' ( (lv_operator_9_0= ruleEqualityOperator ) ) otherlv_10= 'function:' ( (lv_function_11_0= ruleFunction ) ) otherlv_12= '};' )
            {
            // InternalModness.g:1223:2: (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'operator:' ( (lv_operator_9_0= ruleEqualityOperator ) ) otherlv_10= 'function:' ( (lv_function_11_0= ruleFunction ) ) otherlv_12= '};' )
            // InternalModness.g:1224:3: otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'operator:' ( (lv_operator_9_0= ruleEqualityOperator ) ) otherlv_10= 'function:' ( (lv_function_11_0= ruleFunction ) ) otherlv_12= '};'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMetricAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getNameKeyword_2());
            		
            // InternalModness.g:1236:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:1237:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:1237:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:1238:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getMetricAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getMetricAccess().getToleranceValueKeyword_5());
            		
            // InternalModness.g:1263:3: ( (lv_toleranceValue_6_0= ruleEFloat ) )
            // InternalModness.g:1264:4: (lv_toleranceValue_6_0= ruleEFloat )
            {
            // InternalModness.g:1264:4: (lv_toleranceValue_6_0= ruleEFloat )
            // InternalModness.g:1265:5: lv_toleranceValue_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getToleranceValueEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_toleranceValue_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"toleranceValue",
            						lv_toleranceValue_6_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getMetricAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getMetricAccess().getOperatorKeyword_8());
            		
            // InternalModness.g:1290:3: ( (lv_operator_9_0= ruleEqualityOperator ) )
            // InternalModness.g:1291:4: (lv_operator_9_0= ruleEqualityOperator )
            {
            // InternalModness.g:1291:4: (lv_operator_9_0= ruleEqualityOperator )
            // InternalModness.g:1292:5: lv_operator_9_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getOperatorEqualityOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_34);
            lv_operator_9_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_9_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getMetricAccess().getFunctionKeyword_10());
            		
            // InternalModness.g:1313:3: ( (lv_function_11_0= ruleFunction ) )
            // InternalModness.g:1314:4: (lv_function_11_0= ruleFunction )
            {
            // InternalModness.g:1314:4: (lv_function_11_0= ruleFunction )
            // InternalModness.g:1315:5: lv_function_11_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getFunctionFunctionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_23);
            lv_function_11_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_11_0,
            						"org.xtext.example.modness.Modness.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMetricAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleDataset"
    // InternalModness.g:1340:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalModness.g:1340:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalModness.g:1341:2: iv_ruleDataset= ruleDataset EOF
            {
             newCompositeNode(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataset=ruleDataset();

            state._fsp--;

             current =iv_ruleDataset; 
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
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // InternalModness.g:1347:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_groundTruthLabelName_6_0 = null;

        AntlrDatatypeRuleToken lv_predictedLabelName_9_0 = null;

        AntlrDatatypeRuleToken lv_filePath_12_0 = null;

        EObject lv_otherVariable_16_0 = null;

        EObject lv_otherVariable_18_0 = null;

        EObject lv_positiveOutcome_21_0 = null;

        EObject lv_datasetSentiveVariable_24_0 = null;

        EObject lv_datasetSentiveVariable_26_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1353:2: ( (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' ) )
            // InternalModness.g:1354:2: (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' )
            {
            // InternalModness.g:1354:2: (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' )
            // InternalModness.g:1355:3: otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDatasetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetAccess().getNameKeyword_2());
            		
            // InternalModness.g:1367:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:1368:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:1368:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:1369:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetAccess().getSemicolonKeyword_4());
            		
            // InternalModness.g:1390:3: (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModness.g:1391:4: otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDatasetAccess().getGroundTruthLabelNameKeyword_5_0());
                    			
                    // InternalModness.g:1395:4: ( (lv_groundTruthLabelName_6_0= ruleEString ) )
                    // InternalModness.g:1396:5: (lv_groundTruthLabelName_6_0= ruleEString )
                    {
                    // InternalModness.g:1396:5: (lv_groundTruthLabelName_6_0= ruleEString )
                    // InternalModness.g:1397:6: lv_groundTruthLabelName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getGroundTruthLabelNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_groundTruthLabelName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetRule());
                    						}
                    						set(
                    							current,
                    							"groundTruthLabelName",
                    							lv_groundTruthLabelName_6_0,
                    							"org.xtext.example.modness.Modness.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getDatasetAccess().getSemicolonKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalModness.g:1419:3: (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModness.g:1420:4: otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';'
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDatasetAccess().getPredictedLabelNameKeyword_6_0());
                    			
                    // InternalModness.g:1424:4: ( (lv_predictedLabelName_9_0= ruleEString ) )
                    // InternalModness.g:1425:5: (lv_predictedLabelName_9_0= ruleEString )
                    {
                    // InternalModness.g:1425:5: (lv_predictedLabelName_9_0= ruleEString )
                    // InternalModness.g:1426:6: lv_predictedLabelName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getPredictedLabelNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_predictedLabelName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetRule());
                    						}
                    						set(
                    							current,
                    							"predictedLabelName",
                    							lv_predictedLabelName_9_0,
                    							"org.xtext.example.modness.Modness.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,14,FOLLOW_38); 

                    				newLeafNode(otherlv_10, grammarAccess.getDatasetAccess().getSemicolonKeyword_6_2());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getDatasetAccess().getFilePathKeyword_7());
            		
            // InternalModness.g:1452:3: ( (lv_filePath_12_0= ruleEString ) )
            // InternalModness.g:1453:4: (lv_filePath_12_0= ruleEString )
            {
            // InternalModness.g:1453:4: (lv_filePath_12_0= ruleEString )
            // InternalModness.g:1454:5: lv_filePath_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getFilePathEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_filePath_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"filePath",
            						lv_filePath_12_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_13, grammarAccess.getDatasetAccess().getSemicolonKeyword_9());
            		
            // InternalModness.g:1475:3: (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModness.g:1476:4: otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};'
                    {
                    otherlv_14=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getDatasetAccess().getOtherVariableKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_15, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalModness.g:1484:4: ( (lv_otherVariable_16_0= ruleOtherVariable ) )
                    // InternalModness.g:1485:5: (lv_otherVariable_16_0= ruleOtherVariable )
                    {
                    // InternalModness.g:1485:5: (lv_otherVariable_16_0= ruleOtherVariable )
                    // InternalModness.g:1486:6: lv_otherVariable_16_0= ruleOtherVariable
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getOtherVariableOtherVariableParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_otherVariable_16_0=ruleOtherVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetRule());
                    						}
                    						add(
                    							current,
                    							"otherVariable",
                    							lv_otherVariable_16_0,
                    							"org.xtext.example.modness.Modness.OtherVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModness.g:1503:4: (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalModness.g:1504:5: otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_40); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getDatasetAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalModness.g:1508:5: ( (lv_otherVariable_18_0= ruleOtherVariable ) )
                    	    // InternalModness.g:1509:6: (lv_otherVariable_18_0= ruleOtherVariable )
                    	    {
                    	    // InternalModness.g:1509:6: (lv_otherVariable_18_0= ruleOtherVariable )
                    	    // InternalModness.g:1510:7: lv_otherVariable_18_0= ruleOtherVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getDatasetAccess().getOtherVariableOtherVariableParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_otherVariable_18_0=ruleOtherVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"otherVariable",
                    	    								lv_otherVariable_18_0,
                    	    								"org.xtext.example.modness.Modness.OtherVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getDatasetAccess().getRightCurlyBracketSemicolonKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FOLLOW_41); 

            			newLeafNode(otherlv_20, grammarAccess.getDatasetAccess().getPositiveOutcomeKeyword_11());
            		
            // InternalModness.g:1537:3: ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) )
            // InternalModness.g:1538:4: (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome )
            {
            // InternalModness.g:1538:4: (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome )
            // InternalModness.g:1539:5: lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getPositiveOutcomeDatasetPositiveOutcomeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_42);
            lv_positiveOutcome_21_0=ruleDatasetPositiveOutcome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"positiveOutcome",
            						lv_positiveOutcome_21_0,
            						"org.xtext.example.modness.Modness.DatasetPositiveOutcome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getDatasetAccess().getDatasetSentiveVariableKeyword_13());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_23, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalModness.g:1564:3: ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) )
            // InternalModness.g:1565:4: (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable )
            {
            // InternalModness.g:1565:4: (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable )
            // InternalModness.g:1566:5: lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getDatasetSentiveVariableDatasetSensitiveVariableParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_12);
            lv_datasetSentiveVariable_24_0=ruleDatasetSensitiveVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					add(
            						current,
            						"datasetSentiveVariable",
            						lv_datasetSentiveVariable_24_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1583:3: (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalModness.g:1584:4: otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) )
            	    {
            	    otherlv_25=(Token)match(input,16,FOLLOW_43); 

            	    				newLeafNode(otherlv_25, grammarAccess.getDatasetAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalModness.g:1588:4: ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) )
            	    // InternalModness.g:1589:5: (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable )
            	    {
            	    // InternalModness.g:1589:5: (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable )
            	    // InternalModness.g:1590:6: lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetAccess().getDatasetSentiveVariableDatasetSensitiveVariableParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_datasetSentiveVariable_26_0=ruleDatasetSensitiveVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatasetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetSentiveVariable",
            	    							lv_datasetSentiveVariable_26_0,
            	    							"org.xtext.example.modness.Modness.DatasetSensitiveVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_27=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_27, grammarAccess.getDatasetAccess().getRightCurlyBracketSemicolonKeyword_17());
            		
            otherlv_28=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRuleDatasetSensitiveGroup"
    // InternalModness.g:1620:1: entryRuleDatasetSensitiveGroup returns [EObject current=null] : iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF ;
    public final EObject entryRuleDatasetSensitiveGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveGroup = null;


        try {
            // InternalModness.g:1620:62: (iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF )
            // InternalModness.g:1621:2: iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF
            {
             newCompositeNode(grammarAccess.getDatasetSensitiveGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetSensitiveGroup=ruleDatasetSensitiveGroup();

            state._fsp--;

             current =iv_ruleDatasetSensitiveGroup; 
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
    // $ANTLR end "entryRuleDatasetSensitiveGroup"


    // $ANTLR start "ruleDatasetSensitiveGroup"
    // InternalModness.g:1627:1: ruleDatasetSensitiveGroup returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'mappingGroup' ( ( ruleEString ) ) otherlv_3= ';' otherlv_4= 'sensitiveVariables:' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ');' otherlv_10= '};' ) ;
    public final EObject ruleDatasetSensitiveGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalModness.g:1633:2: ( (otherlv_0= '{' otherlv_1= 'mappingGroup' ( ( ruleEString ) ) otherlv_3= ';' otherlv_4= 'sensitiveVariables:' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ');' otherlv_10= '};' ) )
            // InternalModness.g:1634:2: (otherlv_0= '{' otherlv_1= 'mappingGroup' ( ( ruleEString ) ) otherlv_3= ';' otherlv_4= 'sensitiveVariables:' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ');' otherlv_10= '};' )
            {
            // InternalModness.g:1634:2: (otherlv_0= '{' otherlv_1= 'mappingGroup' ( ( ruleEString ) ) otherlv_3= ';' otherlv_4= 'sensitiveVariables:' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ');' otherlv_10= '};' )
            // InternalModness.g:1635:3: otherlv_0= '{' otherlv_1= 'mappingGroup' ( ( ruleEString ) ) otherlv_3= ';' otherlv_4= 'sensitiveVariables:' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ');' otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveGroupAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveGroupAccess().getMappingGroupKeyword_1());
            		
            // InternalModness.g:1643:3: ( ( ruleEString ) )
            // InternalModness.g:1644:4: ( ruleEString )
            {
            // InternalModness.g:1644:4: ( ruleEString )
            // InternalModness.g:1645:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getMappingGroupSensitiveGroupCrossReference_2_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetSensitiveGroupAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesKeyword_4());
            		
            otherlv_5=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSensitiveGroupAccess().getLeftParenthesisKeyword_5());
            		
            // InternalModness.g:1671:3: ( ( ruleEString ) )
            // InternalModness.g:1672:4: ( ruleEString )
            {
            // InternalModness.g:1672:4: ( ruleEString )
            // InternalModness.g:1673:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesDatasetSensitiveVariableValueCrossReference_6_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1687:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalModness.g:1688:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDatasetSensitiveGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalModness.g:1692:4: ( ( ruleEString ) )
            	    // InternalModness.g:1693:5: ( ruleEString )
            	    {
            	    // InternalModness.g:1693:5: ( ruleEString )
            	    // InternalModness.g:1694:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesDatasetSensitiveVariableValueCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,47,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getDatasetSensitiveGroupAccess().getRightParenthesisSemicolonKeyword_8());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDatasetSensitiveGroupAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleDatasetSensitiveGroup"


    // $ANTLR start "entryRuleEFloat"
    // InternalModness.g:1721:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalModness.g:1721:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalModness.g:1722:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalModness.g:1728:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalModness.g:1734:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalModness.g:1735:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalModness.g:1735:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalModness.g:1736:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalModness.g:1736:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModness.g:1737:4: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModness.g:1743:3: (this_INT_1= RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModness.g:1744:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_48); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,49,FOLLOW_49); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_50); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalModness.g:1764:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=50 && LA27_0<=51)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModness.g:1765:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalModness.g:1765:4: (kw= 'E' | kw= 'e' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==50) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==51) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalModness.g:1766:5: kw= 'E'
                            {
                            kw=(Token)match(input,50,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalModness.g:1772:5: kw= 'e'
                            {
                            kw=(Token)match(input,51,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalModness.g:1778:4: (kw= '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==48) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalModness.g:1779:5: kw= '-'
                            {
                            kw=(Token)match(input,48,FOLLOW_49); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleSingleOperator"
    // InternalModness.g:1797:1: entryRuleSingleOperator returns [EObject current=null] : iv_ruleSingleOperator= ruleSingleOperator EOF ;
    public final EObject entryRuleSingleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleOperator = null;


        try {
            // InternalModness.g:1797:55: (iv_ruleSingleOperator= ruleSingleOperator EOF )
            // InternalModness.g:1798:2: iv_ruleSingleOperator= ruleSingleOperator EOF
            {
             newCompositeNode(grammarAccess.getSingleOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleOperator=ruleSingleOperator();

            state._fsp--;

             current =iv_ruleSingleOperator; 
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
    // $ANTLR end "entryRuleSingleOperator"


    // $ANTLR start "ruleSingleOperator"
    // InternalModness.g:1804:1: ruleSingleOperator returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' ) ;
    public final EObject ruleSingleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1810:2: ( (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' ) )
            // InternalModness.g:1811:2: (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' )
            {
            // InternalModness.g:1811:2: (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' )
            // InternalModness.g:1812:3: otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleOperatorAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleOperatorAccess().getParameterKeyword_1());
            		
            // InternalModness.g:1820:3: ( (lv_operator_2_0= ruleSingleOperatorParameter ) )
            // InternalModness.g:1821:4: (lv_operator_2_0= ruleSingleOperatorParameter )
            {
            // InternalModness.g:1821:4: (lv_operator_2_0= ruleSingleOperatorParameter )
            // InternalModness.g:1822:5: lv_operator_2_0= ruleSingleOperatorParameter
            {

            					newCompositeNode(grammarAccess.getSingleOperatorAccess().getOperatorSingleOperatorParameterEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_operator_2_0=ruleSingleOperatorParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleOperatorRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.modness.Modness.SingleOperatorParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleOperatorAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getSingleOperatorAccess().getValueKeyword_4());
            		
            // InternalModness.g:1847:3: ( (lv_value_5_0= ruleEFloat ) )
            // InternalModness.g:1848:4: (lv_value_5_0= ruleEFloat )
            {
            // InternalModness.g:1848:4: (lv_value_5_0= ruleEFloat )
            // InternalModness.g:1849:5: lv_value_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getSingleOperatorAccess().getValueEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_5_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleOperatorRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getSingleOperatorAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSingleOperatorAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleSingleOperator"


    // $ANTLR start "entryRuleRangeOperator"
    // InternalModness.g:1878:1: entryRuleRangeOperator returns [EObject current=null] : iv_ruleRangeOperator= ruleRangeOperator EOF ;
    public final EObject entryRuleRangeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeOperator = null;


        try {
            // InternalModness.g:1878:54: (iv_ruleRangeOperator= ruleRangeOperator EOF )
            // InternalModness.g:1879:2: iv_ruleRangeOperator= ruleRangeOperator EOF
            {
             newCompositeNode(grammarAccess.getRangeOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeOperator=ruleRangeOperator();

            state._fsp--;

             current =iv_ruleRangeOperator; 
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
    // $ANTLR end "entryRuleRangeOperator"


    // $ANTLR start "ruleRangeOperator"
    // InternalModness.g:1885:1: ruleRangeOperator returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' ) ;
    public final EObject ruleRangeOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_lowerValue_5_0 = null;

        AntlrDatatypeRuleToken lv_greaterValue_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1891:2: ( (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' ) )
            // InternalModness.g:1892:2: (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' )
            {
            // InternalModness.g:1892:2: (otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' )
            // InternalModness.g:1893:3: otherlv_0= '{' otherlv_1= 'parameter:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeOperatorAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeOperatorAccess().getParameterKeyword_1());
            		
            // InternalModness.g:1901:3: ( (lv_operator_2_0= ruleRangeOperatorParameter ) )
            // InternalModness.g:1902:4: (lv_operator_2_0= ruleRangeOperatorParameter )
            {
            // InternalModness.g:1902:4: (lv_operator_2_0= ruleRangeOperatorParameter )
            // InternalModness.g:1903:5: lv_operator_2_0= ruleRangeOperatorParameter
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getOperatorRangeOperatorParameterEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_operator_2_0=ruleRangeOperatorParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeOperatorRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.modness.Modness.RangeOperatorParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getRangeOperatorAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,54,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeOperatorAccess().getLowerValueKeyword_4());
            		
            // InternalModness.g:1928:3: ( (lv_lowerValue_5_0= ruleEFloat ) )
            // InternalModness.g:1929:4: (lv_lowerValue_5_0= ruleEFloat )
            {
            // InternalModness.g:1929:4: (lv_lowerValue_5_0= ruleEFloat )
            // InternalModness.g:1930:5: lv_lowerValue_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getLowerValueEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_lowerValue_5_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeOperatorRule());
            					}
            					set(
            						current,
            						"lowerValue",
            						lv_lowerValue_5_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_57); 

            			newLeafNode(otherlv_6, grammarAccess.getRangeOperatorAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,55,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getRangeOperatorAccess().getGreaterValueKeyword_7());
            		
            // InternalModness.g:1955:3: ( (lv_greaterValue_8_0= ruleEFloat ) )
            // InternalModness.g:1956:4: (lv_greaterValue_8_0= ruleEFloat )
            {
            // InternalModness.g:1956:4: (lv_greaterValue_8_0= ruleEFloat )
            // InternalModness.g:1957:5: lv_greaterValue_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getGreaterValueEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_greaterValue_8_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeOperatorRule());
            					}
            					set(
            						current,
            						"greaterValue",
            						lv_greaterValue_8_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getRangeOperatorAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRangeOperatorAccess().getRightCurlyBracketSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleRangeOperator"


    // $ANTLR start "entryRuleOperation"
    // InternalModness.g:1986:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalModness.g:1986:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalModness.g:1987:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalModness.g:1993:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_equalityOperator_4_0 = null;

        EObject lv_leftSide_6_0 = null;

        EObject lv_rightSide_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1999:2: ( (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) )
            // InternalModness.g:2000:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            {
            // InternalModness.g:2000:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            // InternalModness.g:2001:3: otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalModness.g:2005:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2006:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2006:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2007:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getEqualityOperatorKeyword_3());
            		
            // InternalModness.g:2032:3: ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) )
            // InternalModness.g:2033:4: (lv_equalityOperator_4_0= ruleArithmeticOperator )
            {
            // InternalModness.g:2033:4: (lv_equalityOperator_4_0= ruleArithmeticOperator )
            // InternalModness.g:2034:5: lv_equalityOperator_4_0= ruleArithmeticOperator
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getEqualityOperatorArithmeticOperatorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_60);
            lv_equalityOperator_4_0=ruleArithmeticOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"equalityOperator",
            						lv_equalityOperator_4_0,
            						"org.xtext.example.modness.Modness.ArithmeticOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_61); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftSideKeyword_5());
            		
            // InternalModness.g:2055:3: ( (lv_leftSide_6_0= ruleOperatorComponent ) )
            // InternalModness.g:2056:4: (lv_leftSide_6_0= ruleOperatorComponent )
            {
            // InternalModness.g:2056:4: (lv_leftSide_6_0= ruleOperatorComponent )
            // InternalModness.g:2057:5: lv_leftSide_6_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getLeftSideOperatorComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_62);
            lv_leftSide_6_0=ruleOperatorComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"leftSide",
            						lv_leftSide_6_0,
            						"org.xtext.example.modness.Modness.OperatorComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,59,FOLLOW_61); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightSideKeyword_7());
            		
            // InternalModness.g:2078:3: ( (lv_rightSide_8_0= ruleOperatorComponent ) )
            // InternalModness.g:2079:4: (lv_rightSide_8_0= ruleOperatorComponent )
            {
            // InternalModness.g:2079:4: (lv_rightSide_8_0= ruleOperatorComponent )
            // InternalModness.g:2080:5: lv_rightSide_8_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getRightSideOperatorComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_rightSide_8_0=ruleOperatorComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"rightSide",
            						lv_rightSide_8_0,
            						"org.xtext.example.modness.Modness.OperatorComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleProbability"
    // InternalModness.g:2105:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // InternalModness.g:2105:52: (iv_ruleProbability= ruleProbability EOF )
            // InternalModness.g:2106:2: iv_ruleProbability= ruleProbability EOF
            {
             newCompositeNode(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProbability=ruleProbability();

            state._fsp--;

             current =iv_ruleProbability; 
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
    // $ANTLR end "entryRuleProbability"


    // $ANTLR start "ruleProbability"
    // InternalModness.g:2112:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_object_4_0 = null;

        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2118:2: ( (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) )
            // InternalModness.g:2119:2: (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            {
            // InternalModness.g:2119:2: (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            // InternalModness.g:2120:3: otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getProbabilityKeyword_0());
            		
            // InternalModness.g:2124:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2125:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2125:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2126:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProbabilityAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProbabilityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getProbabilityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getProbabilityAccess().getObjectKeyword_3());
            		
            // InternalModness.g:2151:3: ( (lv_object_4_0= ruleLogicalCondition ) )
            // InternalModness.g:2152:4: (lv_object_4_0= ruleLogicalCondition )
            {
            // InternalModness.g:2152:4: (lv_object_4_0= ruleLogicalCondition )
            // InternalModness.g:2153:5: lv_object_4_0= ruleLogicalCondition
            {

            					newCompositeNode(grammarAccess.getProbabilityAccess().getObjectLogicalConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
            lv_object_4_0=ruleLogicalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProbabilityRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_4_0,
            						"org.xtext.example.modness.Modness.LogicalCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:2170:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModness.g:2171:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_64); 

                    				newLeafNode(otherlv_5, grammarAccess.getProbabilityAccess().getConditionKeyword_5_0());
                    			
                    // InternalModness.g:2175:4: ( (lv_condition_6_0= ruleLogicalCondition ) )
                    // InternalModness.g:2176:5: (lv_condition_6_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2176:5: (lv_condition_6_0= ruleLogicalCondition )
                    // InternalModness.g:2177:6: lv_condition_6_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getProbabilityAccess().getConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_condition_6_0=ruleLogicalCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProbabilityRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"org.xtext.example.modness.Modness.LogicalCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProbabilityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProbability"


    // $ANTLR start "entryRuleExpectedValue"
    // InternalModness.g:2203:1: entryRuleExpectedValue returns [EObject current=null] : iv_ruleExpectedValue= ruleExpectedValue EOF ;
    public final EObject entryRuleExpectedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectedValue = null;


        try {
            // InternalModness.g:2203:54: (iv_ruleExpectedValue= ruleExpectedValue EOF )
            // InternalModness.g:2204:2: iv_ruleExpectedValue= ruleExpectedValue EOF
            {
             newCompositeNode(grammarAccess.getExpectedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpectedValue=ruleExpectedValue();

            state._fsp--;

             current =iv_ruleExpectedValue; 
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
    // $ANTLR end "entryRuleExpectedValue"


    // $ANTLR start "ruleExpectedValue"
    // InternalModness.g:2210:1: ruleExpectedValue returns [EObject current=null] : (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleExpectedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_columnName_4_0 = null;

        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2216:2: ( (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) )
            // InternalModness.g:2217:2: (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            {
            // InternalModness.g:2217:2: (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            // InternalModness.g:2218:3: otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpectedValueAccess().getExpectedValueKeyword_0());
            		
            // InternalModness.g:2222:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2223:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2223:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2224:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExpectedValueAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpectedValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getExpectedValueAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getExpectedValueAccess().getColumnNameKeyword_3());
            		
            // InternalModness.g:2249:3: ( (lv_columnName_4_0= ruleEString ) )
            // InternalModness.g:2250:4: (lv_columnName_4_0= ruleEString )
            {
            // InternalModness.g:2250:4: (lv_columnName_4_0= ruleEString )
            // InternalModness.g:2251:5: lv_columnName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExpectedValueAccess().getColumnNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
            lv_columnName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpectedValueRule());
            					}
            					set(
            						current,
            						"columnName",
            						lv_columnName_4_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:2268:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModness.g:2269:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_64); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpectedValueAccess().getConditionKeyword_5_0());
                    			
                    // InternalModness.g:2273:4: ( (lv_condition_6_0= ruleLogicalCondition ) )
                    // InternalModness.g:2274:5: (lv_condition_6_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2274:5: (lv_condition_6_0= ruleLogicalCondition )
                    // InternalModness.g:2275:6: lv_condition_6_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getExpectedValueAccess().getConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_condition_6_0=ruleLogicalCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpectedValueRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_6_0,
                    							"org.xtext.example.modness.Modness.LogicalCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExpectedValueAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExpectedValue"


    // $ANTLR start "entryRuleGroupSize"
    // InternalModness.g:2301:1: entryRuleGroupSize returns [EObject current=null] : iv_ruleGroupSize= ruleGroupSize EOF ;
    public final EObject entryRuleGroupSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSize = null;


        try {
            // InternalModness.g:2301:50: (iv_ruleGroupSize= ruleGroupSize EOF )
            // InternalModness.g:2302:2: iv_ruleGroupSize= ruleGroupSize EOF
            {
             newCompositeNode(grammarAccess.getGroupSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupSize=ruleGroupSize();

            state._fsp--;

             current =iv_ruleGroupSize; 
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
    // $ANTLR end "entryRuleGroupSize"


    // $ANTLR start "ruleGroupSize"
    // InternalModness.g:2308:1: ruleGroupSize returns [EObject current=null] : ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGroupSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_groupCondition_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2314:2: ( ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' ) )
            // InternalModness.g:2315:2: ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' )
            {
            // InternalModness.g:2315:2: ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' )
            // InternalModness.g:2316:3: () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}'
            {
            // InternalModness.g:2316:3: ()
            // InternalModness.g:2317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupSizeAccess().getGroupSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupSizeAccess().getGroupSizeKeyword_1());
            		
            // InternalModness.g:2327:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2328:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2328:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2329:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupSizeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupSizeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupSizeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:2350:3: (otherlv_4= 'variable' ( ( ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalModness.g:2351:4: otherlv_4= 'variable' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGroupSizeAccess().getVariableKeyword_4_0());
                    			
                    // InternalModness.g:2355:4: ( ( ruleEString ) )
                    // InternalModness.g:2356:5: ( ruleEString )
                    {
                    // InternalModness.g:2356:5: ( ruleEString )
                    // InternalModness.g:2357:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupSizeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGroupSizeAccess().getVariableVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2372:3: (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalModness.g:2373:4: otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_64); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupSizeAccess().getGroupConditionKeyword_5_0());
                    			
                    // InternalModness.g:2377:4: ( (lv_groupCondition_7_0= ruleLogicalCondition ) )
                    // InternalModness.g:2378:5: (lv_groupCondition_7_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2378:5: (lv_groupCondition_7_0= ruleLogicalCondition )
                    // InternalModness.g:2379:6: lv_groupCondition_7_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getGroupSizeAccess().getGroupConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_groupCondition_7_0=ruleLogicalCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupSizeRule());
                    						}
                    						set(
                    							current,
                    							"groupCondition",
                    							lv_groupCondition_7_0,
                    							"org.xtext.example.modness.Modness.LogicalCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupSizeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGroupSize"


    // $ANTLR start "entryRuleDatasetSize"
    // InternalModness.g:2405:1: entryRuleDatasetSize returns [EObject current=null] : iv_ruleDatasetSize= ruleDatasetSize EOF ;
    public final EObject entryRuleDatasetSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSize = null;


        try {
            // InternalModness.g:2405:52: (iv_ruleDatasetSize= ruleDatasetSize EOF )
            // InternalModness.g:2406:2: iv_ruleDatasetSize= ruleDatasetSize EOF
            {
             newCompositeNode(grammarAccess.getDatasetSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetSize=ruleDatasetSize();

            state._fsp--;

             current =iv_ruleDatasetSize; 
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
    // $ANTLR end "entryRuleDatasetSize"


    // $ANTLR start "ruleDatasetSize"
    // InternalModness.g:2412:1: ruleDatasetSize returns [EObject current=null] : ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDatasetSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2418:2: ( ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalModness.g:2419:2: ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalModness.g:2419:2: ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) )
            // InternalModness.g:2420:3: () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalModness.g:2420:3: ()
            // InternalModness.g:2421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatasetSizeAccess().getDatasetSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSizeAccess().getDatasetSizeKeyword_1());
            		
            // InternalModness.g:2431:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2432:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2432:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2433:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSizeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSizeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDatasetSize"


    // $ANTLR start "entryRuleLogaritm"
    // InternalModness.g:2454:1: entryRuleLogaritm returns [EObject current=null] : iv_ruleLogaritm= ruleLogaritm EOF ;
    public final EObject entryRuleLogaritm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogaritm = null;


        try {
            // InternalModness.g:2454:49: (iv_ruleLogaritm= ruleLogaritm EOF )
            // InternalModness.g:2455:2: iv_ruleLogaritm= ruleLogaritm EOF
            {
             newCompositeNode(grammarAccess.getLogaritmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogaritm=ruleLogaritm();

            state._fsp--;

             current =iv_ruleLogaritm; 
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
    // $ANTLR end "entryRuleLogaritm"


    // $ANTLR start "ruleLogaritm"
    // InternalModness.g:2461:1: ruleLogaritm returns [EObject current=null] : (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' ) ;
    public final EObject ruleLogaritm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operatorcomponent_4_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2467:2: ( (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' ) )
            // InternalModness.g:2468:2: (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' )
            {
            // InternalModness.g:2468:2: (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' )
            // InternalModness.g:2469:3: otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogaritmAccess().getLogaritmKeyword_0());
            		
            // InternalModness.g:2473:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2474:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2474:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2475:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogaritmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogaritmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getLogaritmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,70,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getLogaritmAccess().getOperatorcomponentKeyword_3());
            		
            // InternalModness.g:2500:3: ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) )
            // InternalModness.g:2501:4: (lv_operatorcomponent_4_0= ruleOperatorComponent )
            {
            // InternalModness.g:2501:4: (lv_operatorcomponent_4_0= ruleOperatorComponent )
            // InternalModness.g:2502:5: lv_operatorcomponent_4_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getLogaritmAccess().getOperatorcomponentOperatorComponentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_operatorcomponent_4_0=ruleOperatorComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogaritmRule());
            					}
            					set(
            						current,
            						"operatorcomponent",
            						lv_operatorcomponent_4_0,
            						"org.xtext.example.modness.Modness.OperatorComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLogaritmAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLogaritm"


    // $ANTLR start "entryRuleSummation"
    // InternalModness.g:2527:1: entryRuleSummation returns [EObject current=null] : iv_ruleSummation= ruleSummation EOF ;
    public final EObject entryRuleSummation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummation = null;


        try {
            // InternalModness.g:2527:50: (iv_ruleSummation= ruleSummation EOF )
            // InternalModness.g:2528:2: iv_ruleSummation= ruleSummation EOF
            {
             newCompositeNode(grammarAccess.getSummationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSummation=ruleSummation();

            state._fsp--;

             current =iv_ruleSummation; 
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
    // $ANTLR end "entryRuleSummation"


    // $ANTLR start "ruleSummation"
    // InternalModness.g:2534:1: ruleSummation returns [EObject current=null] : (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) ;
    public final EObject ruleSummation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_startRange_4_0 = null;

        EObject lv_endRange_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2540:2: ( (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) )
            // InternalModness.g:2541:2: (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            {
            // InternalModness.g:2541:2: (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            // InternalModness.g:2542:3: otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSummationAccess().getSummationKeyword_0());
            		
            // InternalModness.g:2546:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2547:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2547:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2548:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSummationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getSummationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,72,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getSummationAccess().getStartRangeKeyword_3());
            		
            // InternalModness.g:2573:3: ( (lv_startRange_4_0= ruleOperatorComponent ) )
            // InternalModness.g:2574:4: (lv_startRange_4_0= ruleOperatorComponent )
            {
            // InternalModness.g:2574:4: (lv_startRange_4_0= ruleOperatorComponent )
            // InternalModness.g:2575:5: lv_startRange_4_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getStartRangeOperatorComponentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_71);
            lv_startRange_4_0=ruleOperatorComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSummationRule());
            					}
            					set(
            						current,
            						"startRange",
            						lv_startRange_4_0,
            						"org.xtext.example.modness.Modness.OperatorComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,73,FOLLOW_61); 

            			newLeafNode(otherlv_5, grammarAccess.getSummationAccess().getEndRangeKeyword_5());
            		
            // InternalModness.g:2596:3: ( (lv_endRange_6_0= ruleOperatorComponent ) )
            // InternalModness.g:2597:4: (lv_endRange_6_0= ruleOperatorComponent )
            {
            // InternalModness.g:2597:4: (lv_endRange_6_0= ruleOperatorComponent )
            // InternalModness.g:2598:5: lv_endRange_6_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getEndRangeOperatorComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_72);
            lv_endRange_6_0=ruleOperatorComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSummationRule());
            					}
            					set(
            						current,
            						"endRange",
            						lv_endRange_6_0,
            						"org.xtext.example.modness.Modness.OperatorComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,74,FOLLOW_61); 

            			newLeafNode(otherlv_7, grammarAccess.getSummationAccess().getBodyKeyword_7());
            		
            // InternalModness.g:2619:3: ( (lv_body_8_0= ruleOperatorComponent ) )
            // InternalModness.g:2620:4: (lv_body_8_0= ruleOperatorComponent )
            {
            // InternalModness.g:2620:4: (lv_body_8_0= ruleOperatorComponent )
            // InternalModness.g:2621:5: lv_body_8_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getBodyOperatorComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_body_8_0=ruleOperatorComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSummationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"org.xtext.example.modness.Modness.OperatorComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSummationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSummation"


    // $ANTLR start "entryRuleExistingGroupFairnessMetric"
    // InternalModness.g:2646:1: entryRuleExistingGroupFairnessMetric returns [EObject current=null] : iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF ;
    public final EObject entryRuleExistingGroupFairnessMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingGroupFairnessMetric = null;


        try {
            // InternalModness.g:2646:68: (iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF )
            // InternalModness.g:2647:2: iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF
            {
             newCompositeNode(grammarAccess.getExistingGroupFairnessMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistingGroupFairnessMetric=ruleExistingGroupFairnessMetric();

            state._fsp--;

             current =iv_ruleExistingGroupFairnessMetric; 
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
    // $ANTLR end "entryRuleExistingGroupFairnessMetric"


    // $ANTLR start "ruleExistingGroupFairnessMetric"
    // InternalModness.g:2653:1: ruleExistingGroupFairnessMetric returns [EObject current=null] : (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' ) ;
    public final EObject ruleExistingGroupFairnessMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_metric_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2659:2: ( (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' ) )
            // InternalModness.g:2660:2: (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' )
            {
            // InternalModness.g:2660:2: (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' )
            // InternalModness.g:2661:3: otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExistingGroupFairnessMetricAccess().getExistingGroupFairnessMetricKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExistingGroupFairnessMetricAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getExistingGroupFairnessMetricAccess().getMetricKeyword_2());
            		
            // InternalModness.g:2673:3: ( (lv_metric_3_0= ruleGroupFairnessMetric ) )
            // InternalModness.g:2674:4: (lv_metric_3_0= ruleGroupFairnessMetric )
            {
            // InternalModness.g:2674:4: (lv_metric_3_0= ruleGroupFairnessMetric )
            // InternalModness.g:2675:5: lv_metric_3_0= ruleGroupFairnessMetric
            {

            					newCompositeNode(grammarAccess.getExistingGroupFairnessMetricAccess().getMetricGroupFairnessMetricEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_metric_3_0=ruleGroupFairnessMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistingGroupFairnessMetricRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_3_0,
            						"org.xtext.example.modness.Modness.GroupFairnessMetric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getExistingGroupFairnessMetricAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExistingGroupFairnessMetricAccess().getRightCurlyBracketSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleExistingGroupFairnessMetric"


    // $ANTLR start "entryRuleExistingIndividualFairnessMetric"
    // InternalModness.g:2704:1: entryRuleExistingIndividualFairnessMetric returns [EObject current=null] : iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF ;
    public final EObject entryRuleExistingIndividualFairnessMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingIndividualFairnessMetric = null;


        try {
            // InternalModness.g:2704:73: (iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF )
            // InternalModness.g:2705:2: iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF
            {
             newCompositeNode(grammarAccess.getExistingIndividualFairnessMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistingIndividualFairnessMetric=ruleExistingIndividualFairnessMetric();

            state._fsp--;

             current =iv_ruleExistingIndividualFairnessMetric; 
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
    // $ANTLR end "entryRuleExistingIndividualFairnessMetric"


    // $ANTLR start "ruleExistingIndividualFairnessMetric"
    // InternalModness.g:2711:1: ruleExistingIndividualFairnessMetric returns [EObject current=null] : (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' ) ;
    public final EObject ruleExistingIndividualFairnessMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_metric_4_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2717:2: ( (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' ) )
            // InternalModness.g:2718:2: (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' )
            {
            // InternalModness.g:2718:2: (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' )
            // InternalModness.g:2719:3: otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExistingIndividualFairnessMetricAccess().getExistingIndividualFairnessMetricKeyword_0());
            		
            // InternalModness.g:2723:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2724:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2724:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2725:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExistingIndividualFairnessMetricAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistingIndividualFairnessMetricRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getExistingIndividualFairnessMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getExistingIndividualFairnessMetricAccess().getMetricKeyword_3());
            		
            // InternalModness.g:2750:3: ( (lv_metric_4_0= ruleIndividualFairnessMetric ) )
            // InternalModness.g:2751:4: (lv_metric_4_0= ruleIndividualFairnessMetric )
            {
            // InternalModness.g:2751:4: (lv_metric_4_0= ruleIndividualFairnessMetric )
            // InternalModness.g:2752:5: lv_metric_4_0= ruleIndividualFairnessMetric
            {

            					newCompositeNode(grammarAccess.getExistingIndividualFairnessMetricAccess().getMetricIndividualFairnessMetricEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_metric_4_0=ruleIndividualFairnessMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistingIndividualFairnessMetricRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_4_0,
            						"org.xtext.example.modness.Modness.IndividualFairnessMetric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getExistingIndividualFairnessMetricAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExistingIndividualFairnessMetricAccess().getRightCurlyBracketSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleExistingIndividualFairnessMetric"


    // $ANTLR start "entryRuleOperatorComponent"
    // InternalModness.g:2781:1: entryRuleOperatorComponent returns [EObject current=null] : iv_ruleOperatorComponent= ruleOperatorComponent EOF ;
    public final EObject entryRuleOperatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorComponent = null;


        try {
            // InternalModness.g:2781:58: (iv_ruleOperatorComponent= ruleOperatorComponent EOF )
            // InternalModness.g:2782:2: iv_ruleOperatorComponent= ruleOperatorComponent EOF
            {
             newCompositeNode(grammarAccess.getOperatorComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatorComponent=ruleOperatorComponent();

            state._fsp--;

             current =iv_ruleOperatorComponent; 
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
    // $ANTLR end "entryRuleOperatorComponent"


    // $ANTLR start "ruleOperatorComponent"
    // InternalModness.g:2788:1: ruleOperatorComponent returns [EObject current=null] : ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleOperatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_function_5_0 = null;

        EObject lv_operationvalue_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2794:2: ( ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' ) )
            // InternalModness.g:2795:2: ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' )
            {
            // InternalModness.g:2795:2: ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' )
            // InternalModness.g:2796:3: () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}'
            {
            // InternalModness.g:2796:3: ()
            // InternalModness.g:2797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperatorComponentAccess().getOperatorComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperatorComponentAccess().getOperatorComponentKeyword_1());
            		
            // InternalModness.g:2807:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2808:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2808:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2809:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperatorComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperatorComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getOperatorComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:2830:3: (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==78) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModness.g:2831:4: otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) )
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperatorComponentAccess().getFunctionKeyword_4_0());
                    			
                    // InternalModness.g:2835:4: ( (lv_function_5_0= ruleFunction ) )
                    // InternalModness.g:2836:5: (lv_function_5_0= ruleFunction )
                    {
                    // InternalModness.g:2836:5: (lv_function_5_0= ruleFunction )
                    // InternalModness.g:2837:6: lv_function_5_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getOperatorComponentAccess().getFunctionFunctionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_function_5_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorComponentRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_5_0,
                    							"org.xtext.example.modness.Modness.Function");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2855:3: (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModness.g:2856:4: otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_77); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperatorComponentAccess().getOperationvalueKeyword_5_0());
                    			
                    // InternalModness.g:2860:4: ( (lv_operationvalue_7_0= ruleOperationValue ) )
                    // InternalModness.g:2861:5: (lv_operationvalue_7_0= ruleOperationValue )
                    {
                    // InternalModness.g:2861:5: (lv_operationvalue_7_0= ruleOperationValue )
                    // InternalModness.g:2862:6: lv_operationvalue_7_0= ruleOperationValue
                    {

                    						newCompositeNode(grammarAccess.getOperatorComponentAccess().getOperationvalueOperationValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_operationvalue_7_0=ruleOperationValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorComponentRule());
                    						}
                    						set(
                    							current,
                    							"operationvalue",
                    							lv_operationvalue_7_0,
                    							"org.xtext.example.modness.Modness.OperationValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOperatorComponentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleOperatorComponent"


    // $ANTLR start "entryRuleOperationValue"
    // InternalModness.g:2888:1: entryRuleOperationValue returns [EObject current=null] : iv_ruleOperationValue= ruleOperationValue EOF ;
    public final EObject entryRuleOperationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationValue = null;


        try {
            // InternalModness.g:2888:55: (iv_ruleOperationValue= ruleOperationValue EOF )
            // InternalModness.g:2889:2: iv_ruleOperationValue= ruleOperationValue EOF
            {
             newCompositeNode(grammarAccess.getOperationValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationValue=ruleOperationValue();

            state._fsp--;

             current =iv_ruleOperationValue; 
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
    // $ANTLR end "entryRuleOperationValue"


    // $ANTLR start "ruleOperationValue"
    // InternalModness.g:2895:1: ruleOperationValue returns [EObject current=null] : (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) ;
    public final EObject ruleOperationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2901:2: ( (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) )
            // InternalModness.g:2902:2: (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            {
            // InternalModness.g:2902:2: (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            // InternalModness.g:2903:3: otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationValueAccess().getOperationValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,81,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationValueAccess().getValueKeyword_2());
            		
            // InternalModness.g:2915:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalModness.g:2916:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalModness.g:2916:4: (lv_value_3_0= ruleEFloat )
            // InternalModness.g:2917:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getOperationValueAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationValueAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOperationValue"


    // $ANTLR start "entryRuleLogicalCondition"
    // InternalModness.g:2942:1: entryRuleLogicalCondition returns [EObject current=null] : iv_ruleLogicalCondition= ruleLogicalCondition EOF ;
    public final EObject entryRuleLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCondition = null;


        try {
            // InternalModness.g:2942:57: (iv_ruleLogicalCondition= ruleLogicalCondition EOF )
            // InternalModness.g:2943:2: iv_ruleLogicalCondition= ruleLogicalCondition EOF
            {
             newCompositeNode(grammarAccess.getLogicalConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCondition=ruleLogicalCondition();

            state._fsp--;

             current =iv_ruleLogicalCondition; 
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
    // $ANTLR end "entryRuleLogicalCondition"


    // $ANTLR start "ruleLogicalCondition"
    // InternalModness.g:2949:1: ruleLogicalCondition returns [EObject current=null] : ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleLogicalCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sublogicalcondition_9_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2955:2: ( ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' ) )
            // InternalModness.g:2956:2: ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' )
            {
            // InternalModness.g:2956:2: ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' )
            // InternalModness.g:2957:3: () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}'
            {
            // InternalModness.g:2957:3: ()
            // InternalModness.g:2958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicalConditionAccess().getLogicalConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicalConditionAccess().getLogicalConditionKeyword_1());
            		
            // InternalModness.g:2968:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2969:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2969:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2970:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogicalConditionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalConditionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:2991:3: (otherlv_4= 'value' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==81) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModness.g:2992:4: otherlv_4= 'value' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,81,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalConditionAccess().getValueKeyword_4_0());
                    			
                    // InternalModness.g:2996:4: ( ( ruleEString ) )
                    // InternalModness.g:2997:5: ( ruleEString )
                    {
                    // InternalModness.g:2997:5: ( ruleEString )
                    // InternalModness.g:2998:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getValueVariableValueCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:3013:3: (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==83) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalModness.g:3014:4: otherlv_6= 'sensitivegroup' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalConditionAccess().getSensitivegroupKeyword_5_0());
                    			
                    // InternalModness.g:3018:4: ( ( ruleEString ) )
                    // InternalModness.g:3019:5: ( ruleEString )
                    {
                    // InternalModness.g:3019:5: ( ruleEString )
                    // InternalModness.g:3020:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getSensitivegroupDatasetSensitiveGroupCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:3035:3: (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==84) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModness.g:3036:4: otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) )
                    {
                    otherlv_8=(Token)match(input,84,FOLLOW_82); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalConditionAccess().getSublogicalconditionKeyword_6_0());
                    			
                    // InternalModness.g:3040:4: ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) )
                    // InternalModness.g:3041:5: (lv_sublogicalcondition_9_0= ruleSubLogicalCondition )
                    {
                    // InternalModness.g:3041:5: (lv_sublogicalcondition_9_0= ruleSubLogicalCondition )
                    // InternalModness.g:3042:6: lv_sublogicalcondition_9_0= ruleSubLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getSublogicalconditionSubLogicalConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_sublogicalcondition_9_0=ruleSubLogicalCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    						}
                    						set(
                    							current,
                    							"sublogicalcondition",
                    							lv_sublogicalcondition_9_0,
                    							"org.xtext.example.modness.Modness.SubLogicalCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalConditionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalCondition"


    // $ANTLR start "entryRuleSubLogicalCondition"
    // InternalModness.g:3068:1: entryRuleSubLogicalCondition returns [EObject current=null] : iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF ;
    public final EObject entryRuleSubLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubLogicalCondition = null;


        try {
            // InternalModness.g:3068:60: (iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF )
            // InternalModness.g:3069:2: iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF
            {
             newCompositeNode(grammarAccess.getSubLogicalConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubLogicalCondition=ruleSubLogicalCondition();

            state._fsp--;

             current =iv_ruleSubLogicalCondition; 
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
    // $ANTLR end "entryRuleSubLogicalCondition"


    // $ANTLR start "ruleSubLogicalCondition"
    // InternalModness.g:3075:1: ruleSubLogicalCondition returns [EObject current=null] : (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' ) ;
    public final EObject ruleSubLogicalCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_logicalOperator_4_0 = null;

        EObject lv_logicalcondition_6_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3081:2: ( (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' ) )
            // InternalModness.g:3082:2: (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' )
            {
            // InternalModness.g:3082:2: (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' )
            // InternalModness.g:3083:3: otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubLogicalConditionAccess().getSubLogicalConditionKeyword_0());
            		
            // InternalModness.g:3087:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:3088:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:3088:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:3089:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubLogicalConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_2, grammarAccess.getSubLogicalConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,86,FOLLOW_84); 

            			newLeafNode(otherlv_3, grammarAccess.getSubLogicalConditionAccess().getLogicalOperatorKeyword_3());
            		
            // InternalModness.g:3114:3: ( (lv_logicalOperator_4_0= ruleLogicalOperator ) )
            // InternalModness.g:3115:4: (lv_logicalOperator_4_0= ruleLogicalOperator )
            {
            // InternalModness.g:3115:4: (lv_logicalOperator_4_0= ruleLogicalOperator )
            // InternalModness.g:3116:5: lv_logicalOperator_4_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getLogicalOperatorLogicalOperatorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_85);
            lv_logicalOperator_4_0=ruleLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubLogicalConditionRule());
            					}
            					set(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_4_0,
            						"org.xtext.example.modness.Modness.LogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,87,FOLLOW_64); 

            			newLeafNode(otherlv_5, grammarAccess.getSubLogicalConditionAccess().getLogicalconditionKeyword_5());
            		
            // InternalModness.g:3137:3: ( (lv_logicalcondition_6_0= ruleLogicalCondition ) )
            // InternalModness.g:3138:4: (lv_logicalcondition_6_0= ruleLogicalCondition )
            {
            // InternalModness.g:3138:4: (lv_logicalcondition_6_0= ruleLogicalCondition )
            // InternalModness.g:3139:5: lv_logicalcondition_6_0= ruleLogicalCondition
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getLogicalconditionLogicalConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_logicalcondition_6_0=ruleLogicalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubLogicalConditionRule());
            					}
            					set(
            						current,
            						"logicalcondition",
            						lv_logicalcondition_6_0,
            						"org.xtext.example.modness.Modness.LogicalCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSubLogicalConditionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSubLogicalCondition"


    // $ANTLR start "entryRuleVariableValue_Impl"
    // InternalModness.g:3164:1: entryRuleVariableValue_Impl returns [EObject current=null] : iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF ;
    public final EObject entryRuleVariableValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue_Impl = null;


        try {
            // InternalModness.g:3164:59: (iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF )
            // InternalModness.g:3165:2: iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getVariableValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableValue_Impl=ruleVariableValue_Impl();

            state._fsp--;

             current =iv_ruleVariableValue_Impl; 
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
    // $ANTLR end "entryRuleVariableValue_Impl"


    // $ANTLR start "ruleVariableValue_Impl"
    // InternalModness.g:3171:1: ruleVariableValue_Impl returns [EObject current=null] : ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' ) ;
    public final EObject ruleVariableValue_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_relativeToDatasetSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operator_5_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3177:2: ( ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' ) )
            // InternalModness.g:3178:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' )
            {
            // InternalModness.g:3178:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' )
            // InternalModness.g:3179:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}'
            {
            // InternalModness.g:3179:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==88) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModness.g:3180:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3180:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3181:5: lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_0_0=(Token)match(input,88,FOLLOW_86); 

                    					newLeafNode(lv_relativeToDatasetSize_0_0, grammarAccess.getVariableValue_ImplAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableValue_ImplRule());
                    					}
                    					setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_0_0 != null, "relativeToDatasetSize");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableValue_ImplAccess().getVariableValueKeyword_1());
            		
            // InternalModness.g:3197:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3198:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3198:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3199:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableValue_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableValue_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableValue_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,90,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableValue_ImplAccess().getOperatorKeyword_4());
            		
            // InternalModness.g:3224:3: ( (lv_operator_5_0= ruleEqualityOperator ) )
            // InternalModness.g:3225:4: (lv_operator_5_0= ruleEqualityOperator )
            {
            // InternalModness.g:3225:4: (lv_operator_5_0= ruleEqualityOperator )
            // InternalModness.g:3226:5: lv_operator_5_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getVariableValue_ImplAccess().getOperatorEqualityOperatorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_operator_5_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableValue_ImplRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_5_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableValue_ImplAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleVariableValue_Impl"


    // $ANTLR start "entryRuleDatasetPositiveOutcome"
    // InternalModness.g:3251:1: entryRuleDatasetPositiveOutcome returns [EObject current=null] : iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF ;
    public final EObject entryRuleDatasetPositiveOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetPositiveOutcome = null;


        try {
            // InternalModness.g:3251:63: (iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF )
            // InternalModness.g:3252:2: iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF
            {
             newCompositeNode(grammarAccess.getDatasetPositiveOutcomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetPositiveOutcome=ruleDatasetPositiveOutcome();

            state._fsp--;

             current =iv_ruleDatasetPositiveOutcome; 
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
    // $ANTLR end "entryRuleDatasetPositiveOutcome"


    // $ANTLR start "ruleDatasetPositiveOutcome"
    // InternalModness.g:3258:1: ruleDatasetPositiveOutcome returns [EObject current=null] : ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= '{' otherlv_2= 'outcome:' ( ( ruleEString ) ) otherlv_4= ';' otherlv_5= 'value:' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= '};' ) ;
    public final EObject ruleDatasetPositiveOutcome() throws RecognitionException {
        EObject current = null;

        Token lv_relativeToDatasetSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_operator_6_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3264:2: ( ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= '{' otherlv_2= 'outcome:' ( ( ruleEString ) ) otherlv_4= ';' otherlv_5= 'value:' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= '};' ) )
            // InternalModness.g:3265:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= '{' otherlv_2= 'outcome:' ( ( ruleEString ) ) otherlv_4= ';' otherlv_5= 'value:' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= '};' )
            {
            // InternalModness.g:3265:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= '{' otherlv_2= 'outcome:' ( ( ruleEString ) ) otherlv_4= ';' otherlv_5= 'value:' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= '};' )
            // InternalModness.g:3266:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= '{' otherlv_2= 'outcome:' ( ( ruleEString ) ) otherlv_4= ';' otherlv_5= 'value:' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= '};'
            {
            // InternalModness.g:3266:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==88) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModness.g:3267:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3267:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3268:5: lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_0_0=(Token)match(input,88,FOLLOW_4); 

                    					newLeafNode(lv_relativeToDatasetSize_0_0, grammarAccess.getDatasetPositiveOutcomeAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatasetPositiveOutcomeRule());
                    					}
                    					setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_0_0 != null, "relativeToDatasetSize");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetPositiveOutcomeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetPositiveOutcomeAccess().getOutcomeKeyword_2());
            		
            // InternalModness.g:3288:3: ( ( ruleEString ) )
            // InternalModness.g:3289:4: ( ruleEString )
            {
            // InternalModness.g:3289:4: ( ruleEString )
            // InternalModness.g:3290:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getMappingPositiveOutcomePositiveOutcomeCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetPositiveOutcomeAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetPositiveOutcomeAccess().getValueKeyword_5());
            		
            // InternalModness.g:3312:3: ( (lv_operator_6_0= ruleEqualityOperator ) )
            // InternalModness.g:3313:4: (lv_operator_6_0= ruleEqualityOperator )
            {
            // InternalModness.g:3313:4: (lv_operator_6_0= ruleEqualityOperator )
            // InternalModness.g:3314:5: lv_operator_6_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getOperatorEqualityOperatorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_operator_6_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_6_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetPositiveOutcomeAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleDatasetPositiveOutcome"


    // $ANTLR start "entryRuleDatasetSensitiveVariableValue"
    // InternalModness.g:3339:1: entryRuleDatasetSensitiveVariableValue returns [EObject current=null] : iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF ;
    public final EObject entryRuleDatasetSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveVariableValue = null;


        try {
            // InternalModness.g:3339:70: (iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF )
            // InternalModness.g:3340:2: iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF
            {
             newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetSensitiveVariableValue=ruleDatasetSensitiveVariableValue();

            state._fsp--;

             current =iv_ruleDatasetSensitiveVariableValue; 
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
    // $ANTLR end "entryRuleDatasetSensitiveVariableValue"


    // $ANTLR start "ruleDatasetSensitiveVariableValue"
    // InternalModness.g:3346:1: ruleDatasetSensitiveVariableValue returns [EObject current=null] : (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' ) ;
    public final EObject ruleDatasetSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_relativeToDatasetSize_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_operator_9_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3352:2: ( (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' ) )
            // InternalModness.g:3353:2: (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' )
            {
            // InternalModness.g:3353:2: (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' )
            // InternalModness.g:3354:3: otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveVariableValueAccess().getSensitiveVariableValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveVariableValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSensitiveVariableValueAccess().getIdKeyword_2());
            		
            // InternalModness.g:3366:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:3367:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:3367:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:3368:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_90); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveVariableValueAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSensitiveVariableValueAccess().getMappingValueKeyword_5());
            		
            // InternalModness.g:3393:3: ( ( ruleEString ) )
            // InternalModness.g:3394:4: ( ruleEString )
            {
            // InternalModness.g:3394:4: ( ruleEString )
            // InternalModness.g:3395:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getMappingValueSensitiveVariableValueCrossReference_6_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_54); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetSensitiveVariableValueAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveVariableValueAccess().getValueKeyword_8());
            		
            // InternalModness.g:3417:3: ( (lv_operator_9_0= ruleEqualityOperator ) )
            // InternalModness.g:3418:4: (lv_operator_9_0= ruleEqualityOperator )
            {
            // InternalModness.g:3418:4: (lv_operator_9_0= ruleEqualityOperator )
            // InternalModness.g:3419:5: lv_operator_9_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getOperatorEqualityOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_91);
            lv_operator_9_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_9_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:3436:3: ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==88) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModness.g:3437:4: ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';'
                    {
                    // InternalModness.g:3437:4: ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) )
                    // InternalModness.g:3438:5: (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3438:5: (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3439:6: lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_10_0=(Token)match(input,88,FOLLOW_6); 

                    						newLeafNode(lv_relativeToDatasetSize_10_0, grammarAccess.getDatasetSensitiveVariableValueAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDatasetSensitiveVariableValueRule());
                    						}
                    						setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_10_0 != null, "relativeToDatasetSize");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getDatasetSensitiveVariableValueAccess().getSemicolonKeyword_10_1());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDatasetSensitiveVariableValueAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleDatasetSensitiveVariableValue"


    // $ANTLR start "entryRuleOtherVariable"
    // InternalModness.g:3464:1: entryRuleOtherVariable returns [EObject current=null] : iv_ruleOtherVariable= ruleOtherVariable EOF ;
    public final EObject entryRuleOtherVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherVariable = null;


        try {
            // InternalModness.g:3464:54: (iv_ruleOtherVariable= ruleOtherVariable EOF )
            // InternalModness.g:3465:2: iv_ruleOtherVariable= ruleOtherVariable EOF
            {
             newCompositeNode(grammarAccess.getOtherVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherVariable=ruleOtherVariable();

            state._fsp--;

             current =iv_ruleOtherVariable; 
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
    // $ANTLR end "entryRuleOtherVariable"


    // $ANTLR start "ruleOtherVariable"
    // InternalModness.g:3471:1: ruleOtherVariable returns [EObject current=null] : ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleOtherVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_othervariablevalue_6_0 = null;

        EObject lv_othervariablevalue_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3477:2: ( ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalModness.g:3478:2: ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalModness.g:3478:2: ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalModness.g:3479:3: () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalModness.g:3479:3: ()
            // InternalModness.g:3480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOtherVariableAccess().getOtherVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherVariableAccess().getOtherVariableKeyword_1());
            		
            // InternalModness.g:3490:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3491:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3491:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3492:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOtherVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOtherVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:3513:3: (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==96) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalModness.g:3514:4: otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,96,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOtherVariableAccess().getOthervariablevalueKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_93); 

                    				newLeafNode(otherlv_5, grammarAccess.getOtherVariableAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalModness.g:3522:4: ( (lv_othervariablevalue_6_0= ruleVariableValue ) )
                    // InternalModness.g:3523:5: (lv_othervariablevalue_6_0= ruleVariableValue )
                    {
                    // InternalModness.g:3523:5: (lv_othervariablevalue_6_0= ruleVariableValue )
                    // InternalModness.g:3524:6: lv_othervariablevalue_6_0= ruleVariableValue
                    {

                    						newCompositeNode(grammarAccess.getOtherVariableAccess().getOthervariablevalueVariableValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_othervariablevalue_6_0=ruleVariableValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOtherVariableRule());
                    						}
                    						add(
                    							current,
                    							"othervariablevalue",
                    							lv_othervariablevalue_6_0,
                    							"org.xtext.example.modness.Modness.VariableValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModness.g:3541:4: (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalModness.g:3542:5: otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_93); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOtherVariableAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalModness.g:3546:5: ( (lv_othervariablevalue_8_0= ruleVariableValue ) )
                    	    // InternalModness.g:3547:6: (lv_othervariablevalue_8_0= ruleVariableValue )
                    	    {
                    	    // InternalModness.g:3547:6: (lv_othervariablevalue_8_0= ruleVariableValue )
                    	    // InternalModness.g:3548:7: lv_othervariablevalue_8_0= ruleVariableValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherVariableAccess().getOthervariablevalueVariableValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_94);
                    	    lv_othervariablevalue_8_0=ruleVariableValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOtherVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"othervariablevalue",
                    	    								lv_othervariablevalue_8_0,
                    	    								"org.xtext.example.modness.Modness.VariableValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getOtherVariableAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getOtherVariableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOtherVariable"


    // $ANTLR start "entryRuleDatasetSensitiveVariable"
    // InternalModness.g:3579:1: entryRuleDatasetSensitiveVariable returns [EObject current=null] : iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF ;
    public final EObject entryRuleDatasetSensitiveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveVariable = null;


        try {
            // InternalModness.g:3579:65: (iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF )
            // InternalModness.g:3580:2: iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF
            {
             newCompositeNode(grammarAccess.getDatasetSensitiveVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetSensitiveVariable=ruleDatasetSensitiveVariable();

            state._fsp--;

             current =iv_ruleDatasetSensitiveVariable; 
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
    // $ANTLR end "entryRuleDatasetSensitiveVariable"


    // $ANTLR start "ruleDatasetSensitiveVariable"
    // InternalModness.g:3586:1: ruleDatasetSensitiveVariable returns [EObject current=null] : (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' ) ;
    public final EObject ruleDatasetSensitiveVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_datasetsensitivevariablevalue_10_0 = null;

        EObject lv_datasetsensitivevariablevalue_12_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3592:2: ( (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' ) )
            // InternalModness.g:3593:2: (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalModness.g:3593:2: (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' )
            // InternalModness.g:3594:3: otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveVariableAccess().getDatasetSensitiveVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSensitiveVariableAccess().getNameKeyword_2());
            		
            // InternalModness.g:3606:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:3607:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:3607:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:3608:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_95); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveVariableAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSensitiveVariableAccess().getMappingSensitiveVariableKeyword_5());
            		
            // InternalModness.g:3633:3: ( ( ruleEString ) )
            // InternalModness.g:3634:4: ( ruleEString )
            {
            // InternalModness.g:3634:4: ( ruleEString )
            // InternalModness.g:3635:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getMappingSensitiveVariableSensitiveVariableCrossReference_6_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetSensitiveVariableAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveVariableAccess().getValuesKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_9, grammarAccess.getDatasetSensitiveVariableAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalModness.g:3661:3: ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) )
            // InternalModness.g:3662:4: (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue )
            {
            // InternalModness.g:3662:4: (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue )
            // InternalModness.g:3663:5: lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueDatasetSensitiveVariableValueParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_94);
            lv_datasetsensitivevariablevalue_10_0=ruleDatasetSensitiveVariableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            					add(
            						current,
            						"datasetsensitivevariablevalue",
            						lv_datasetsensitivevariablevalue_10_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveVariableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:3680:3: (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModness.g:3681:4: otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_93); 

            	    				newLeafNode(otherlv_11, grammarAccess.getDatasetSensitiveVariableAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalModness.g:3685:4: ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) )
            	    // InternalModness.g:3686:5: (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue )
            	    {
            	    // InternalModness.g:3686:5: (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue )
            	    // InternalModness.g:3687:6: lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueDatasetSensitiveVariableValueParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_94);
            	    lv_datasetsensitivevariablevalue_12_0=ruleDatasetSensitiveVariableValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetsensitivevariablevalue",
            	    							lv_datasetsensitivevariablevalue_12_0,
            	    							"org.xtext.example.modness.Modness.DatasetSensitiveVariableValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_13=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getDatasetSensitiveVariableAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_14=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDatasetSensitiveVariableAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleDatasetSensitiveVariable"


    // $ANTLR start "ruleBiasSource"
    // InternalModness.g:3717:1: ruleBiasSource returns [Enumerator current=null] : ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) ) ;
    public final Enumerator ruleBiasSource() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalModness.g:3723:2: ( ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) ) )
            // InternalModness.g:3724:2: ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) )
            {
            // InternalModness.g:3724:2: ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) )
            int alt43=12;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt43=1;
                }
                break;
            case 100:
                {
                alt43=2;
                }
                break;
            case 101:
                {
                alt43=3;
                }
                break;
            case 102:
                {
                alt43=4;
                }
                break;
            case 103:
                {
                alt43=5;
                }
                break;
            case 104:
                {
                alt43=6;
                }
                break;
            case 105:
                {
                alt43=7;
                }
                break;
            case 106:
                {
                alt43=8;
                }
                break;
            case 107:
                {
                alt43=9;
                }
                break;
            case 108:
                {
                alt43=10;
                }
                break;
            case 109:
                {
                alt43=11;
                }
                break;
            case 110:
                {
                alt43=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalModness.g:3725:3: (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' )
                    {
                    // InternalModness.g:3725:3: (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' )
                    // InternalModness.g:3726:4: enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_ALGORITHM_BEHAVIOUREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBiasSourceAccess().getWRONG_ALGORITHM_BEHAVIOUREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3733:3: (enumLiteral_1= 'HUMAN_DISCRIMINATION' )
                    {
                    // InternalModness.g:3733:3: (enumLiteral_1= 'HUMAN_DISCRIMINATION' )
                    // InternalModness.g:3734:4: enumLiteral_1= 'HUMAN_DISCRIMINATION'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getHUMAN_DISCRIMINATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBiasSourceAccess().getHUMAN_DISCRIMINATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3741:3: (enumLiteral_2= 'WRONG_MEASUREMENT' )
                    {
                    // InternalModness.g:3741:3: (enumLiteral_2= 'WRONG_MEASUREMENT' )
                    // InternalModness.g:3742:4: enumLiteral_2= 'WRONG_MEASUREMENT'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_MEASUREMENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBiasSourceAccess().getWRONG_MEASUREMENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3749:3: (enumLiteral_3= 'OMITTED_VARIABLE' )
                    {
                    // InternalModness.g:3749:3: (enumLiteral_3= 'OMITTED_VARIABLE' )
                    // InternalModness.g:3750:4: enumLiteral_3= 'OMITTED_VARIABLE'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getOMITTED_VARIABLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBiasSourceAccess().getOMITTED_VARIABLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3757:3: (enumLiteral_4= 'WRONG_SAMPLING' )
                    {
                    // InternalModness.g:3757:3: (enumLiteral_4= 'WRONG_SAMPLING' )
                    // InternalModness.g:3758:4: enumLiteral_4= 'WRONG_SAMPLING'
                    {
                    enumLiteral_4=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SAMPLINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBiasSourceAccess().getWRONG_SAMPLINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3765:3: (enumLiteral_5= 'WRONG_AGGREGATION' )
                    {
                    // InternalModness.g:3765:3: (enumLiteral_5= 'WRONG_AGGREGATION' )
                    // InternalModness.g:3766:4: enumLiteral_5= 'WRONG_AGGREGATION'
                    {
                    enumLiteral_5=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_AGGREGATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBiasSourceAccess().getWRONG_AGGREGATIONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModness.g:3773:3: (enumLiteral_6= 'WRONG_LINKING' )
                    {
                    // InternalModness.g:3773:3: (enumLiteral_6= 'WRONG_LINKING' )
                    // InternalModness.g:3774:4: enumLiteral_6= 'WRONG_LINKING'
                    {
                    enumLiteral_6=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_LINKINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBiasSourceAccess().getWRONG_LINKINGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModness.g:3781:3: (enumLiteral_7= 'WRONG_PRESENTATION' )
                    {
                    // InternalModness.g:3781:3: (enumLiteral_7= 'WRONG_PRESENTATION' )
                    // InternalModness.g:3782:4: enumLiteral_7= 'WRONG_PRESENTATION'
                    {
                    enumLiteral_7=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_PRESENTATIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBiasSourceAccess().getWRONG_PRESENTATIONEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalModness.g:3789:3: (enumLiteral_8= 'RESULT_RANKING' )
                    {
                    // InternalModness.g:3789:3: (enumLiteral_8= 'RESULT_RANKING' )
                    // InternalModness.g:3790:4: enumLiteral_8= 'RESULT_RANKING'
                    {
                    enumLiteral_8=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getRESULT_RANKINGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBiasSourceAccess().getRESULT_RANKINGEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalModness.g:3797:3: (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' )
                    {
                    // InternalModness.g:3797:3: (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' )
                    // InternalModness.g:3798:4: enumLiteral_9= 'WRONG_SYSTEM_EVALUATION'
                    {
                    enumLiteral_9=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_EVALUATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_EVALUATIONEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalModness.g:3805:3: (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' )
                    {
                    // InternalModness.g:3805:3: (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' )
                    // InternalModness.g:3806:4: enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION'
                    {
                    enumLiteral_10=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_TARGET_POPULATIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_TARGET_POPULATIONEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalModness.g:3813:3: (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' )
                    {
                    // InternalModness.g:3813:3: (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' )
                    // InternalModness.g:3814:4: enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION'
                    {
                    enumLiteral_11=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getCHANGE_IN_TARGET_POPULATIONEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBiasSourceAccess().getCHANGE_IN_TARGET_POPULATIONEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleBiasSource"


    // $ANTLR start "ruleSingleOperatorParameter"
    // InternalModness.g:3824:1: ruleSingleOperatorParameter returns [Enumerator current=null] : ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) ) ;
    public final Enumerator ruleSingleOperatorParameter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalModness.g:3830:2: ( ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) ) )
            // InternalModness.g:3831:2: ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) )
            {
            // InternalModness.g:3831:2: ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt44=1;
                }
                break;
            case 112:
                {
                alt44=2;
                }
                break;
            case 113:
                {
                alt44=3;
                }
                break;
            case 114:
                {
                alt44=4;
                }
                break;
            case 115:
                {
                alt44=5;
                }
                break;
            case 116:
                {
                alt44=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalModness.g:3832:3: (enumLiteral_0= 'EQUAL' )
                    {
                    // InternalModness.g:3832:3: (enumLiteral_0= 'EQUAL' )
                    // InternalModness.g:3833:4: enumLiteral_0= 'EQUAL'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingleOperatorParameterAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3840:3: (enumLiteral_1= 'GREATER' )
                    {
                    // InternalModness.g:3840:3: (enumLiteral_1= 'GREATER' )
                    // InternalModness.g:3841:4: enumLiteral_1= 'GREATER'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingleOperatorParameterAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3848:3: (enumLiteral_2= 'MINOR' )
                    {
                    // InternalModness.g:3848:3: (enumLiteral_2= 'MINOR' )
                    // InternalModness.g:3849:4: enumLiteral_2= 'MINOR'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getMINOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingleOperatorParameterAccess().getMINOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3856:3: (enumLiteral_3= 'GREATER_EQUAL' )
                    {
                    // InternalModness.g:3856:3: (enumLiteral_3= 'GREATER_EQUAL' )
                    // InternalModness.g:3857:4: enumLiteral_3= 'GREATER_EQUAL'
                    {
                    enumLiteral_3=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getGREATER_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSingleOperatorParameterAccess().getGREATER_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3864:3: (enumLiteral_4= 'MINOR_EQUAL' )
                    {
                    // InternalModness.g:3864:3: (enumLiteral_4= 'MINOR_EQUAL' )
                    // InternalModness.g:3865:4: enumLiteral_4= 'MINOR_EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getMINOR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSingleOperatorParameterAccess().getMINOR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3872:3: (enumLiteral_5= 'NOT_EQUAL' )
                    {
                    // InternalModness.g:3872:3: (enumLiteral_5= 'NOT_EQUAL' )
                    // InternalModness.g:3873:4: enumLiteral_5= 'NOT_EQUAL'
                    {
                    enumLiteral_5=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getNOT_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSingleOperatorParameterAccess().getNOT_EQUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSingleOperatorParameter"


    // $ANTLR start "ruleRangeOperatorParameter"
    // InternalModness.g:3883:1: ruleRangeOperatorParameter returns [Enumerator current=null] : ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) ) ;
    public final Enumerator ruleRangeOperatorParameter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModness.g:3889:2: ( ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) ) )
            // InternalModness.g:3890:2: ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) )
            {
            // InternalModness.g:3890:2: ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt45=1;
                }
                break;
            case 118:
                {
                alt45=2;
                }
                break;
            case 119:
                {
                alt45=3;
                }
                break;
            case 120:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalModness.g:3891:3: (enumLiteral_0= 'IN_INCLUDED' )
                    {
                    // InternalModness.g:3891:3: (enumLiteral_0= 'IN_INCLUDED' )
                    // InternalModness.g:3892:4: enumLiteral_0= 'IN_INCLUDED'
                    {
                    enumLiteral_0=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_INCLUDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRangeOperatorParameterAccess().getIN_INCLUDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3899:3: (enumLiteral_1= 'IN_EXCLUDED' )
                    {
                    // InternalModness.g:3899:3: (enumLiteral_1= 'IN_EXCLUDED' )
                    // InternalModness.g:3900:4: enumLiteral_1= 'IN_EXCLUDED'
                    {
                    enumLiteral_1=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_EXCLUDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRangeOperatorParameterAccess().getIN_EXCLUDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3907:3: (enumLiteral_2= 'IN_LOWER_INCLUDED' )
                    {
                    // InternalModness.g:3907:3: (enumLiteral_2= 'IN_LOWER_INCLUDED' )
                    // InternalModness.g:3908:4: enumLiteral_2= 'IN_LOWER_INCLUDED'
                    {
                    enumLiteral_2=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_LOWER_INCLUDEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRangeOperatorParameterAccess().getIN_LOWER_INCLUDEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3915:3: (enumLiteral_3= 'IN_GREATER_INCLUDED' )
                    {
                    // InternalModness.g:3915:3: (enumLiteral_3= 'IN_GREATER_INCLUDED' )
                    // InternalModness.g:3916:4: enumLiteral_3= 'IN_GREATER_INCLUDED'
                    {
                    enumLiteral_3=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_GREATER_INCLUDEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRangeOperatorParameterAccess().getIN_GREATER_INCLUDEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRangeOperatorParameter"


    // $ANTLR start "ruleArithmeticOperator"
    // InternalModness.g:3926:1: ruleArithmeticOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModness.g:3932:2: ( ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) ) )
            // InternalModness.g:3933:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) )
            {
            // InternalModness.g:3933:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt46=1;
                }
                break;
            case 122:
                {
                alt46=2;
                }
                break;
            case 123:
                {
                alt46=3;
                }
                break;
            case 124:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalModness.g:3934:3: (enumLiteral_0= 'SUM' )
                    {
                    // InternalModness.g:3934:3: (enumLiteral_0= 'SUM' )
                    // InternalModness.g:3935:4: enumLiteral_0= 'SUM'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getSUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperatorAccess().getSUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3942:3: (enumLiteral_1= 'DIFFERENCE' )
                    {
                    // InternalModness.g:3942:3: (enumLiteral_1= 'DIFFERENCE' )
                    // InternalModness.g:3943:4: enumLiteral_1= 'DIFFERENCE'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getDIFFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperatorAccess().getDIFFERENCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3950:3: (enumLiteral_2= 'MULTIPLICATION' )
                    {
                    // InternalModness.g:3950:3: (enumLiteral_2= 'MULTIPLICATION' )
                    // InternalModness.g:3951:4: enumLiteral_2= 'MULTIPLICATION'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3958:3: (enumLiteral_3= 'RATIO' )
                    {
                    // InternalModness.g:3958:3: (enumLiteral_3= 'RATIO' )
                    // InternalModness.g:3959:4: enumLiteral_3= 'RATIO'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getRATIOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArithmeticOperatorAccess().getRATIOEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalModness.g:3969:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalModness.g:3975:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalModness.g:3976:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalModness.g:3976:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==125) ) {
                alt47=1;
            }
            else if ( (LA47_0==126) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalModness.g:3977:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalModness.g:3977:3: (enumLiteral_0= 'AND' )
                    // InternalModness.g:3978:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3985:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalModness.g:3985:3: (enumLiteral_1= 'OR' )
                    // InternalModness.g:3986:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "ruleGroupFairnessMetric"
    // InternalModness.g:3996:1: ruleGroupFairnessMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) ) ;
    public final Enumerator ruleGroupFairnessMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalModness.g:4002:2: ( ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) ) )
            // InternalModness.g:4003:2: ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) )
            {
            // InternalModness.g:4003:2: ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt48=1;
                }
                break;
            case 128:
                {
                alt48=2;
                }
                break;
            case 129:
                {
                alt48=3;
                }
                break;
            case 130:
                {
                alt48=4;
                }
                break;
            case 131:
                {
                alt48=5;
                }
                break;
            case 132:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalModness.g:4004:3: (enumLiteral_0= 'STATISTICAL_PARITY' )
                    {
                    // InternalModness.g:4004:3: (enumLiteral_0= 'STATISTICAL_PARITY' )
                    // InternalModness.g:4005:4: enumLiteral_0= 'STATISTICAL_PARITY'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getSTATISTICAL_PARITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGroupFairnessMetricAccess().getSTATISTICAL_PARITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:4012:3: (enumLiteral_1= 'DISPARATE_IMPACT' )
                    {
                    // InternalModness.g:4012:3: (enumLiteral_1= 'DISPARATE_IMPACT' )
                    // InternalModness.g:4013:4: enumLiteral_1= 'DISPARATE_IMPACT'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getDISPARATE_IMPACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGroupFairnessMetricAccess().getDISPARATE_IMPACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:4020:3: (enumLiteral_2= 'EQUALIZED_ODDS' )
                    {
                    // InternalModness.g:4020:3: (enumLiteral_2= 'EQUALIZED_ODDS' )
                    // InternalModness.g:4021:4: enumLiteral_2= 'EQUALIZED_ODDS'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getEQUALIZED_ODDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGroupFairnessMetricAccess().getEQUALIZED_ODDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:4028:3: (enumLiteral_3= 'EQUAL_ACCURACY' )
                    {
                    // InternalModness.g:4028:3: (enumLiteral_3= 'EQUAL_ACCURACY' )
                    // InternalModness.g:4029:4: enumLiteral_3= 'EQUAL_ACCURACY'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getEQUAL_ACCURACYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGroupFairnessMetricAccess().getEQUAL_ACCURACYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:4036:3: (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' )
                    {
                    // InternalModness.g:4036:3: (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' )
                    // InternalModness.g:4037:4: enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE'
                    {
                    enumLiteral_4=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getFALSE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getGroupFairnessMetricAccess().getFALSE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:4044:3: (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' )
                    {
                    // InternalModness.g:4044:3: (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' )
                    // InternalModness.g:4045:4: enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE'
                    {
                    enumLiteral_5=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getTRUE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getGroupFairnessMetricAccess().getTRUE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleGroupFairnessMetric"


    // $ANTLR start "ruleIndividualFairnessMetric"
    // InternalModness.g:4055:1: ruleIndividualFairnessMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) ) ;
    public final Enumerator ruleIndividualFairnessMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalModness.g:4061:2: ( ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) ) )
            // InternalModness.g:4062:2: ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) )
            {
            // InternalModness.g:4062:2: ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt49=1;
                }
                break;
            case 134:
                {
                alt49=2;
                }
                break;
            case 135:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalModness.g:4063:3: (enumLiteral_0= 'MANHATTAN_DISTANCE' )
                    {
                    // InternalModness.g:4063:3: (enumLiteral_0= 'MANHATTAN_DISTANCE' )
                    // InternalModness.g:4064:4: enumLiteral_0= 'MANHATTAN_DISTANCE'
                    {
                    enumLiteral_0=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getMANHATTAN_DISTANCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIndividualFairnessMetricAccess().getMANHATTAN_DISTANCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:4071:3: (enumLiteral_1= 'EUCLIDEAN_DISTANCE' )
                    {
                    // InternalModness.g:4071:3: (enumLiteral_1= 'EUCLIDEAN_DISTANCE' )
                    // InternalModness.g:4072:4: enumLiteral_1= 'EUCLIDEAN_DISTANCE'
                    {
                    enumLiteral_1=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIndividualFairnessMetricAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:4079:3: (enumLiteral_2= 'MAHALANOBIS_DISTANCE' )
                    {
                    // InternalModness.g:4079:3: (enumLiteral_2= 'MAHALANOBIS_DISTANCE' )
                    // InternalModness.g:4080:4: enumLiteral_2= 'MAHALANOBIS_DISTANCE'
                    {
                    enumLiteral_2=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getMAHALANOBIS_DISTANCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIndividualFairnessMetricAccess().getMAHALANOBIS_DISTANCEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleIndividualFairnessMetric"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x00007FF800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x9100000000000000L,0x00000000000018B2L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001000L,0x0000000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x001F800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000800000L,0x000000000000000CL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000800000L,0x000000000000C000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000800000L,0x0000000000008000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000800000L,0x00000000001A0000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000800000L,0x0000000000180000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000800000L,0x0000000000100000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000800000L,0x0000000001000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000800000L,0x0000000100000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000001000L,0x0000000013000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});

}
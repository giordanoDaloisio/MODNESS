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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GroupBias'", "'{'", "'domain'", "'source'", "','", "'}'", "'sensitiveVariables'", "'positiveOutcome'", "'unprivilegedGroup'", "'privilegedGroup'", "'analysis'", "'SensitiveVariable'", "'sensitiveVariableValue'", "'PositiveOutcome'", "'value'", "'SensitiveGroup'", "'sensitiveValue'", "'('", "')'", "'GroupAnalysis'", "'scope'", "'metric'", "'dataset'", "'datasetUnprivilegedGroup'", "'datasetPrivilegedGroup'", "'SensitiveVariableValue'", "'Metric'", "'toleranceValue'", "'operator'", "'function'", "'Dataset'", "'groundTruthLabelName'", "'predictedLabelName'", "'filePath'", "'otherVariable'", "'datasetSentiveVariable'", "'DatasetSensitiveGroup'", "'mappingGroup'", "'-'", "'.'", "'E'", "'e'", "'SingleOperator'", "'RangeOperator'", "'lowerValue'", "'greaterValue'", "'Operation'", "'equalityOperator'", "'leftSide'", "'rightSide'", "'Probability'", "'object'", "'condition'", "'ExpectedValue'", "'columnName'", "'GroupSize'", "'variable'", "'groupCondition'", "'DatasetSize'", "'Logaritm'", "'operatorcomponent'", "'Summation'", "'startRange'", "'endRange'", "'body'", "'ExistingGroupFairnessMetric'", "'ExistingIndividualFairnessMetric'", "'OperatorComponent'", "'operationvalue'", "'OperationValue'", "'LogicalCondition'", "'sensitivegroup'", "'sublogicalcondition'", "'SubLogicalCondition'", "'logicalOperator'", "'logicalcondition'", "'relativeToDatasetSize'", "'VariableValue'", "'DatasetPositiveOutcome'", "'mappingPositiveOutcome'", "'DatasetSensitiveVariableValue'", "'mappingValue'", "'OtherVariable'", "'othervariablevalue'", "'DatasetSensitiveVariable'", "'mappingSensitiveVariable'", "'datasetsensitivevariablevalue'", "'WRONG_ALGORITHM_BEHAVIOUR'", "'HUMAN_DISCRIMINATION'", "'WRONG_MEASUREMENT'", "'OMITTED_VARIABLE'", "'WRONG_SAMPLING'", "'WRONG_AGGREGATION'", "'WRONG_LINKING'", "'WRONG_PRESENTATION'", "'RESULT_RANKING'", "'WRONG_SYSTEM_EVALUATION'", "'WRONG_SYSTEM_TARGET_POPULATION'", "'CHANGE_IN_TARGET_POPULATION'", "'EQUAL'", "'GREATER'", "'MINOR'", "'GREATER_EQUAL'", "'MINOR_EQUAL'", "'NOT_EQUAL'", "'IN_INCLUDED'", "'IN_EXCLUDED'", "'IN_LOWER_INCLUDED'", "'IN_GREATER_INCLUDED'", "'SUM'", "'DIFFERENCE'", "'MULTIPLICATION'", "'RATIO'", "'AND'", "'OR'", "'STATISTICAL_PARITY'", "'DISPARATE_IMPACT'", "'EQUALIZED_ODDS'", "'EQUAL_ACCURACY'", "'FALSE_POSITIVE_DIFFERENCE'", "'TRUE_POSITIVE_DIFFERENCE'", "'MANHATTAN_DISTANCE'", "'EUCLIDEAN_DISTANCE'", "'MAHALANOBIS_DISTANCE'"
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
    // InternalModness.g:72:1: ruleGroupBias returns [EObject current=null] : (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= 'source' otherlv_6= '{' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= '}' otherlv_11= 'sensitiveVariables' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '}' otherlv_17= 'positiveOutcome' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= 'unprivilegedGroup' otherlv_20= '{' ( (lv_unprivilegedGroup_21_0= ruleSensitiveGroup ) ) (otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) ) )* otherlv_24= '}' otherlv_25= 'privilegedGroup' otherlv_26= '{' ( (lv_privilegedGroup_27_0= ruleSensitiveGroup ) ) (otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) ) )* otherlv_30= '}' otherlv_31= 'analysis' otherlv_32= '{' ( (lv_analysis_33_0= ruleGroupAnalysis ) ) (otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) ) )* otherlv_36= '}' otherlv_37= '}' ) ;
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
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_domain_4_0 = null;

        Enumerator lv_source_7_0 = null;

        Enumerator lv_source_9_0 = null;

        EObject lv_sensitiveVariables_13_0 = null;

        EObject lv_sensitiveVariables_15_0 = null;

        EObject lv_positiveOutcome_18_0 = null;

        EObject lv_unprivilegedGroup_21_0 = null;

        EObject lv_unprivilegedGroup_23_0 = null;

        EObject lv_privilegedGroup_27_0 = null;

        EObject lv_privilegedGroup_29_0 = null;

        EObject lv_analysis_33_0 = null;

        EObject lv_analysis_35_0 = null;



        	enterRule();

        try {
            // InternalModness.g:78:2: ( (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= 'source' otherlv_6= '{' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= '}' otherlv_11= 'sensitiveVariables' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '}' otherlv_17= 'positiveOutcome' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= 'unprivilegedGroup' otherlv_20= '{' ( (lv_unprivilegedGroup_21_0= ruleSensitiveGroup ) ) (otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) ) )* otherlv_24= '}' otherlv_25= 'privilegedGroup' otherlv_26= '{' ( (lv_privilegedGroup_27_0= ruleSensitiveGroup ) ) (otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) ) )* otherlv_30= '}' otherlv_31= 'analysis' otherlv_32= '{' ( (lv_analysis_33_0= ruleGroupAnalysis ) ) (otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) ) )* otherlv_36= '}' otherlv_37= '}' ) )
            // InternalModness.g:79:2: (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= 'source' otherlv_6= '{' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= '}' otherlv_11= 'sensitiveVariables' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '}' otherlv_17= 'positiveOutcome' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= 'unprivilegedGroup' otherlv_20= '{' ( (lv_unprivilegedGroup_21_0= ruleSensitiveGroup ) ) (otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) ) )* otherlv_24= '}' otherlv_25= 'privilegedGroup' otherlv_26= '{' ( (lv_privilegedGroup_27_0= ruleSensitiveGroup ) ) (otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) ) )* otherlv_30= '}' otherlv_31= 'analysis' otherlv_32= '{' ( (lv_analysis_33_0= ruleGroupAnalysis ) ) (otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) ) )* otherlv_36= '}' otherlv_37= '}' )
            {
            // InternalModness.g:79:2: (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= 'source' otherlv_6= '{' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= '}' otherlv_11= 'sensitiveVariables' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '}' otherlv_17= 'positiveOutcome' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= 'unprivilegedGroup' otherlv_20= '{' ( (lv_unprivilegedGroup_21_0= ruleSensitiveGroup ) ) (otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) ) )* otherlv_24= '}' otherlv_25= 'privilegedGroup' otherlv_26= '{' ( (lv_privilegedGroup_27_0= ruleSensitiveGroup ) ) (otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) ) )* otherlv_30= '}' otherlv_31= 'analysis' otherlv_32= '{' ( (lv_analysis_33_0= ruleGroupAnalysis ) ) (otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) ) )* otherlv_36= '}' otherlv_37= '}' )
            // InternalModness.g:80:3: otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' ( (lv_domain_4_0= ruleEString ) ) otherlv_5= 'source' otherlv_6= '{' ( (lv_source_7_0= ruleBiasSource ) ) (otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) ) )* otherlv_10= '}' otherlv_11= 'sensitiveVariables' otherlv_12= '{' ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) ) (otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) )* otherlv_16= '}' otherlv_17= 'positiveOutcome' ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) ) otherlv_19= 'unprivilegedGroup' otherlv_20= '{' ( (lv_unprivilegedGroup_21_0= ruleSensitiveGroup ) ) (otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) ) )* otherlv_24= '}' otherlv_25= 'privilegedGroup' otherlv_26= '{' ( (lv_privilegedGroup_27_0= ruleSensitiveGroup ) ) (otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) ) )* otherlv_30= '}' otherlv_31= 'analysis' otherlv_32= '{' ( (lv_analysis_33_0= ruleGroupAnalysis ) ) (otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) ) )* otherlv_36= '}' otherlv_37= '}'
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

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupBiasAccess().getSourceKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalModness.g:138:3: ( (lv_source_7_0= ruleBiasSource ) )
            // InternalModness.g:139:4: (lv_source_7_0= ruleBiasSource )
            {
            // InternalModness.g:139:4: (lv_source_7_0= ruleBiasSource )
            // InternalModness.g:140:5: lv_source_7_0= ruleBiasSource
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getSourceBiasSourceEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
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

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModness.g:158:4: otherlv_8= ',' ( (lv_source_9_0= ruleBiasSource ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGroupBiasAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalModness.g:162:4: ( (lv_source_9_0= ruleBiasSource ) )
            	    // InternalModness.g:163:5: (lv_source_9_0= ruleBiasSource )
            	    {
            	    // InternalModness.g:163:5: (lv_source_9_0= ruleBiasSource )
            	    // InternalModness.g:164:6: lv_source_9_0= ruleBiasSource
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getSourceBiasSourceEnumRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupBiasAccess().getSensitiveVariablesKeyword_10());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalModness.g:194:3: ( (lv_sensitiveVariables_13_0= ruleSensitiveVariable ) )
            // InternalModness.g:195:4: (lv_sensitiveVariables_13_0= ruleSensitiveVariable )
            {
            // InternalModness.g:195:4: (lv_sensitiveVariables_13_0= ruleSensitiveVariable )
            // InternalModness.g:196:5: lv_sensitiveVariables_13_0= ruleSensitiveVariable
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getSensitiveVariablesSensitiveVariableParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
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

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModness.g:214:4: otherlv_14= ',' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGroupBiasAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalModness.g:218:4: ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) )
            	    // InternalModness.g:219:5: (lv_sensitiveVariables_15_0= ruleSensitiveVariable )
            	    {
            	    // InternalModness.g:219:5: (lv_sensitiveVariables_15_0= ruleSensitiveVariable )
            	    // InternalModness.g:220:6: lv_sensitiveVariables_15_0= ruleSensitiveVariable
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getSensitiveVariablesSensitiveVariableParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            otherlv_16=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getGroupBiasAccess().getPositiveOutcomeKeyword_15());
            		
            // InternalModness.g:246:3: ( (lv_positiveOutcome_18_0= rulePositiveOutcome ) )
            // InternalModness.g:247:4: (lv_positiveOutcome_18_0= rulePositiveOutcome )
            {
            // InternalModness.g:247:4: (lv_positiveOutcome_18_0= rulePositiveOutcome )
            // InternalModness.g:248:5: lv_positiveOutcome_18_0= rulePositiveOutcome
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getPositiveOutcomePositiveOutcomeParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_19=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getGroupBiasAccess().getUnprivilegedGroupKeyword_17());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_20, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalModness.g:273:3: ( (lv_unprivilegedGroup_21_0= ruleSensitiveGroup ) )
            // InternalModness.g:274:4: (lv_unprivilegedGroup_21_0= ruleSensitiveGroup )
            {
            // InternalModness.g:274:4: (lv_unprivilegedGroup_21_0= ruleSensitiveGroup )
            // InternalModness.g:275:5: lv_unprivilegedGroup_21_0= ruleSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getUnprivilegedGroupSensitiveGroupParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_8);
            lv_unprivilegedGroup_21_0=ruleSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"unprivilegedGroup",
            						lv_unprivilegedGroup_21_0,
            						"org.xtext.example.modness.Modness.SensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:292:3: (otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModness.g:293:4: otherlv_22= ',' ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) )
            	    {
            	    otherlv_22=(Token)match(input,15,FOLLOW_14); 

            	    				newLeafNode(otherlv_22, grammarAccess.getGroupBiasAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalModness.g:297:4: ( (lv_unprivilegedGroup_23_0= ruleSensitiveGroup ) )
            	    // InternalModness.g:298:5: (lv_unprivilegedGroup_23_0= ruleSensitiveGroup )
            	    {
            	    // InternalModness.g:298:5: (lv_unprivilegedGroup_23_0= ruleSensitiveGroup )
            	    // InternalModness.g:299:6: lv_unprivilegedGroup_23_0= ruleSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getUnprivilegedGroupSensitiveGroupParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_unprivilegedGroup_23_0=ruleSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"unprivilegedGroup",
            	    							lv_unprivilegedGroup_23_0,
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

            otherlv_24=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_24, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_25, grammarAccess.getGroupBiasAccess().getPrivilegedGroupKeyword_22());
            		
            otherlv_26=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_26, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_23());
            		
            // InternalModness.g:329:3: ( (lv_privilegedGroup_27_0= ruleSensitiveGroup ) )
            // InternalModness.g:330:4: (lv_privilegedGroup_27_0= ruleSensitiveGroup )
            {
            // InternalModness.g:330:4: (lv_privilegedGroup_27_0= ruleSensitiveGroup )
            // InternalModness.g:331:5: lv_privilegedGroup_27_0= ruleSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getPrivilegedGroupSensitiveGroupParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_8);
            lv_privilegedGroup_27_0=ruleSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"privilegedGroup",
            						lv_privilegedGroup_27_0,
            						"org.xtext.example.modness.Modness.SensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:348:3: (otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalModness.g:349:4: otherlv_28= ',' ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) )
            	    {
            	    otherlv_28=(Token)match(input,15,FOLLOW_14); 

            	    				newLeafNode(otherlv_28, grammarAccess.getGroupBiasAccess().getCommaKeyword_25_0());
            	    			
            	    // InternalModness.g:353:4: ( (lv_privilegedGroup_29_0= ruleSensitiveGroup ) )
            	    // InternalModness.g:354:5: (lv_privilegedGroup_29_0= ruleSensitiveGroup )
            	    {
            	    // InternalModness.g:354:5: (lv_privilegedGroup_29_0= ruleSensitiveGroup )
            	    // InternalModness.g:355:6: lv_privilegedGroup_29_0= ruleSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getPrivilegedGroupSensitiveGroupParserRuleCall_25_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_privilegedGroup_29_0=ruleSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"privilegedGroup",
            	    							lv_privilegedGroup_29_0,
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

            otherlv_30=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_30, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_26());
            		
            otherlv_31=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_31, grammarAccess.getGroupBiasAccess().getAnalysisKeyword_27());
            		
            otherlv_32=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_32, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_28());
            		
            // InternalModness.g:385:3: ( (lv_analysis_33_0= ruleGroupAnalysis ) )
            // InternalModness.g:386:4: (lv_analysis_33_0= ruleGroupAnalysis )
            {
            // InternalModness.g:386:4: (lv_analysis_33_0= ruleGroupAnalysis )
            // InternalModness.g:387:5: lv_analysis_33_0= ruleGroupAnalysis
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getAnalysisGroupAnalysisParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_8);
            lv_analysis_33_0=ruleGroupAnalysis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"analysis",
            						lv_analysis_33_0,
            						"org.xtext.example.modness.Modness.GroupAnalysis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:404:3: (otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalModness.g:405:4: otherlv_34= ',' ( (lv_analysis_35_0= ruleGroupAnalysis ) )
            	    {
            	    otherlv_34=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_34, grammarAccess.getGroupBiasAccess().getCommaKeyword_30_0());
            	    			
            	    // InternalModness.g:409:4: ( (lv_analysis_35_0= ruleGroupAnalysis ) )
            	    // InternalModness.g:410:5: (lv_analysis_35_0= ruleGroupAnalysis )
            	    {
            	    // InternalModness.g:410:5: (lv_analysis_35_0= ruleGroupAnalysis )
            	    // InternalModness.g:411:6: lv_analysis_35_0= ruleGroupAnalysis
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getAnalysisGroupAnalysisParserRuleCall_30_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_analysis_35_0=ruleGroupAnalysis();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"analysis",
            	    							lv_analysis_35_0,
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

            otherlv_36=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_36, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_31());
            		
            otherlv_37=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_32());
            		

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
    // InternalModness.g:441:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // InternalModness.g:441:57: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalModness.g:442:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalModness.g:448:1: ruleEqualityOperator returns [EObject current=null] : (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject this_SingleOperator_0 = null;

        EObject this_RangeOperator_1 = null;



        	enterRule();

        try {
            // InternalModness.g:454:2: ( (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator ) )
            // InternalModness.g:455:2: (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator )
            {
            // InternalModness.g:455:2: (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==53) ) {
                alt6=1;
            }
            else if ( (LA6_0==54) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModness.g:456:3: this_SingleOperator_0= ruleSingleOperator
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
                    // InternalModness.g:465:3: this_RangeOperator_1= ruleRangeOperator
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
    // InternalModness.g:477:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalModness.g:477:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalModness.g:478:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalModness.g:484:1: ruleFunction returns [EObject current=null] : (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric ) ;
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
            // InternalModness.g:490:2: ( (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric ) )
            // InternalModness.g:491:2: (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric )
            {
            // InternalModness.g:491:2: (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt7=1;
                }
                break;
            case 61:
                {
                alt7=2;
                }
                break;
            case 64:
                {
                alt7=3;
                }
                break;
            case 66:
                {
                alt7=4;
                }
                break;
            case 69:
                {
                alt7=5;
                }
                break;
            case 70:
                {
                alt7=6;
                }
                break;
            case 72:
                {
                alt7=7;
                }
                break;
            case 76:
                {
                alt7=8;
                }
                break;
            case 77:
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
                    // InternalModness.g:492:3: this_Operation_0= ruleOperation
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
                    // InternalModness.g:501:3: this_Probability_1= ruleProbability
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
                    // InternalModness.g:510:3: this_ExpectedValue_2= ruleExpectedValue
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
                    // InternalModness.g:519:3: this_GroupSize_3= ruleGroupSize
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
                    // InternalModness.g:528:3: this_DatasetSize_4= ruleDatasetSize
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
                    // InternalModness.g:537:3: this_Logaritm_5= ruleLogaritm
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
                    // InternalModness.g:546:3: this_Summation_6= ruleSummation
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
                    // InternalModness.g:555:3: this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric
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
                    // InternalModness.g:564:3: this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric
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
    // InternalModness.g:576:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalModness.g:576:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalModness.g:577:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalModness.g:583:1: ruleVariableValue returns [EObject current=null] : (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject this_VariableValue_Impl_0 = null;

        EObject this_DatasetPositiveOutcome_1 = null;

        EObject this_DatasetSensitiveVariableValue_2 = null;



        	enterRule();

        try {
            // InternalModness.g:589:2: ( (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue ) )
            // InternalModness.g:590:2: (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue )
            {
            // InternalModness.g:590:2: (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                switch ( input.LA(2) ) {
                case 91:
                    {
                    alt8=3;
                    }
                    break;
                case 89:
                    {
                    alt8=2;
                    }
                    break;
                case 88:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case 88:
                {
                alt8=1;
                }
                break;
            case 89:
                {
                alt8=2;
                }
                break;
            case 91:
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
                    // InternalModness.g:591:3: this_VariableValue_Impl_0= ruleVariableValue_Impl
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
                    // InternalModness.g:600:3: this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome
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
                    // InternalModness.g:609:3: this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue
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
    // InternalModness.g:621:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModness.g:621:47: (iv_ruleEString= ruleEString EOF )
            // InternalModness.g:622:2: iv_ruleEString= ruleEString EOF
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
    // InternalModness.g:628:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModness.g:634:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModness.g:635:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModness.g:635:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalModness.g:636:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModness.g:644:3: this_ID_1= RULE_ID
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
    // InternalModness.g:655:1: entryRuleSensitiveVariable returns [EObject current=null] : iv_ruleSensitiveVariable= ruleSensitiveVariable EOF ;
    public final EObject entryRuleSensitiveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveVariable = null;


        try {
            // InternalModness.g:655:58: (iv_ruleSensitiveVariable= ruleSensitiveVariable EOF )
            // InternalModness.g:656:2: iv_ruleSensitiveVariable= ruleSensitiveVariable EOF
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
    // InternalModness.g:662:1: ruleSensitiveVariable returns [EObject current=null] : (otherlv_0= 'SensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariableValue' otherlv_4= '{' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleSensitiveVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sensitiveVariableValue_5_0 = null;

        EObject lv_sensitiveVariableValue_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:668:2: ( (otherlv_0= 'SensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariableValue' otherlv_4= '{' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalModness.g:669:2: (otherlv_0= 'SensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariableValue' otherlv_4= '{' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalModness.g:669:2: (otherlv_0= 'SensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariableValue' otherlv_4= '{' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalModness.g:670:3: otherlv_0= 'SensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariableValue' otherlv_4= '{' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveVariableAccess().getSensitiveVariableKeyword_0());
            		
            // InternalModness.g:674:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:675:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:675:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:676:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensitiveVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitiveVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveVariableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalModness.g:705:3: ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) )
            // InternalModness.g:706:4: (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue )
            {
            // InternalModness.g:706:4: (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue )
            // InternalModness.g:707:5: lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueSensitiveVariableValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalModness.g:724:3: (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModness.g:725:4: otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSensitiveVariableAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalModness.g:729:4: ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) )
            	    // InternalModness.g:730:5: (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue )
            	    {
            	    // InternalModness.g:730:5: (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue )
            	    // InternalModness.g:731:6: lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue
            	    {

            	    						newCompositeNode(grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueSensitiveVariableValueParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            otherlv_8=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getSensitiveVariableAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:761:1: entryRulePositiveOutcome returns [EObject current=null] : iv_rulePositiveOutcome= rulePositiveOutcome EOF ;
    public final EObject entryRulePositiveOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveOutcome = null;


        try {
            // InternalModness.g:761:56: (iv_rulePositiveOutcome= rulePositiveOutcome EOF )
            // InternalModness.g:762:2: iv_rulePositiveOutcome= rulePositiveOutcome EOF
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
    // InternalModness.g:768:1: rulePositiveOutcome returns [EObject current=null] : (otherlv_0= 'PositiveOutcome' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePositiveOutcome() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:774:2: ( (otherlv_0= 'PositiveOutcome' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalModness.g:775:2: (otherlv_0= 'PositiveOutcome' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalModness.g:775:2: (otherlv_0= 'PositiveOutcome' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalModness.g:776:3: otherlv_0= 'PositiveOutcome' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPositiveOutcomeAccess().getPositiveOutcomeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPositiveOutcomeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPositiveOutcomeAccess().getValueKeyword_2());
            		
            // InternalModness.g:788:3: ( (lv_value_3_0= ruleEString ) )
            // InternalModness.g:789:4: (lv_value_3_0= ruleEString )
            {
            // InternalModness.g:789:4: (lv_value_3_0= ruleEString )
            // InternalModness.g:790:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPositiveOutcomeAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositiveOutcomeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPositiveOutcomeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalModness.g:815:1: entryRuleSensitiveGroup returns [EObject current=null] : iv_ruleSensitiveGroup= ruleSensitiveGroup EOF ;
    public final EObject entryRuleSensitiveGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveGroup = null;


        try {
            // InternalModness.g:815:55: (iv_ruleSensitiveGroup= ruleSensitiveGroup EOF )
            // InternalModness.g:816:2: iv_ruleSensitiveGroup= ruleSensitiveGroup EOF
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
    // InternalModness.g:822:1: ruleSensitiveGroup returns [EObject current=null] : (otherlv_0= 'SensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveValue' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleSensitiveGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModness.g:828:2: ( (otherlv_0= 'SensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveValue' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalModness.g:829:2: (otherlv_0= 'SensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveValue' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalModness.g:829:2: (otherlv_0= 'SensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveValue' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalModness.g:830:3: otherlv_0= 'SensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveValue' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveGroupAccess().getSensitiveGroupKeyword_0());
            		
            // InternalModness.g:834:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:835:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:835:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:836:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveGroupAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensitiveGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitiveGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getSensitiveGroupAccess().getSensitiveValueKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveGroupAccess().getLeftParenthesisKeyword_4());
            		
            // InternalModness.g:865:3: ( ( ruleEString ) )
            // InternalModness.g:866:4: ( ruleEString )
            {
            // InternalModness.g:866:4: ( ruleEString )
            // InternalModness.g:867:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensitiveGroupAccess().getSensitiveValueSensitiveVariableValueCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:881:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModness.g:882:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSensitiveGroupAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalModness.g:886:4: ( ( ruleEString ) )
            	    // InternalModness.g:887:5: ( ruleEString )
            	    {
            	    // InternalModness.g:887:5: ( ruleEString )
            	    // InternalModness.g:888:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensitiveGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSensitiveGroupAccess().getSensitiveValueSensitiveVariableValueCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_8=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getSensitiveGroupAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSensitiveGroupAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalModness.g:915:1: entryRuleGroupAnalysis returns [EObject current=null] : iv_ruleGroupAnalysis= ruleGroupAnalysis EOF ;
    public final EObject entryRuleGroupAnalysis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupAnalysis = null;


        try {
            // InternalModness.g:915:54: (iv_ruleGroupAnalysis= ruleGroupAnalysis EOF )
            // InternalModness.g:916:2: iv_ruleGroupAnalysis= ruleGroupAnalysis EOF
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
    // InternalModness.g:922:1: ruleGroupAnalysis returns [EObject current=null] : (otherlv_0= 'GroupAnalysis' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) ) )? otherlv_5= 'metric' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '}' otherlv_11= 'dataset' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '}' otherlv_17= 'datasetUnprivilegedGroup' otherlv_18= '{' ( (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup ) ) (otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) ) )* otherlv_22= '}' otherlv_23= 'datasetPrivilegedGroup' otherlv_24= '{' ( (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup ) ) (otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleGroupAnalysis() throws RecognitionException {
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_scope_4_0 = null;

        EObject lv_metric_7_0 = null;

        EObject lv_metric_9_0 = null;

        EObject lv_dataset_13_0 = null;

        EObject lv_dataset_15_0 = null;

        EObject lv_datasetUnprivilegedGroup_19_0 = null;

        EObject lv_datasetUnprivilegedGroup_21_0 = null;

        EObject lv_datasetPrivilegedGroup_25_0 = null;

        EObject lv_datasetPrivilegedGroup_27_0 = null;



        	enterRule();

        try {
            // InternalModness.g:928:2: ( (otherlv_0= 'GroupAnalysis' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) ) )? otherlv_5= 'metric' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '}' otherlv_11= 'dataset' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '}' otherlv_17= 'datasetUnprivilegedGroup' otherlv_18= '{' ( (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup ) ) (otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) ) )* otherlv_22= '}' otherlv_23= 'datasetPrivilegedGroup' otherlv_24= '{' ( (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup ) ) (otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // InternalModness.g:929:2: (otherlv_0= 'GroupAnalysis' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) ) )? otherlv_5= 'metric' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '}' otherlv_11= 'dataset' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '}' otherlv_17= 'datasetUnprivilegedGroup' otherlv_18= '{' ( (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup ) ) (otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) ) )* otherlv_22= '}' otherlv_23= 'datasetPrivilegedGroup' otherlv_24= '{' ( (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup ) ) (otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // InternalModness.g:929:2: (otherlv_0= 'GroupAnalysis' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) ) )? otherlv_5= 'metric' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '}' otherlv_11= 'dataset' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '}' otherlv_17= 'datasetUnprivilegedGroup' otherlv_18= '{' ( (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup ) ) (otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) ) )* otherlv_22= '}' otherlv_23= 'datasetPrivilegedGroup' otherlv_24= '{' ( (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup ) ) (otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // InternalModness.g:930:3: otherlv_0= 'GroupAnalysis' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) ) )? otherlv_5= 'metric' otherlv_6= '{' ( (lv_metric_7_0= ruleMetric ) ) (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )* otherlv_10= '}' otherlv_11= 'dataset' otherlv_12= '{' ( (lv_dataset_13_0= ruleDataset ) ) (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )* otherlv_16= '}' otherlv_17= 'datasetUnprivilegedGroup' otherlv_18= '{' ( (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup ) ) (otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) ) )* otherlv_22= '}' otherlv_23= 'datasetPrivilegedGroup' otherlv_24= '{' ( (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup ) ) (otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAnalysisAccess().getGroupAnalysisKeyword_0());
            		
            // InternalModness.g:934:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:935:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:935:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:936:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModness.g:957:3: (otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModness.g:958:4: otherlv_3= 'scope' ( (lv_scope_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGroupAnalysisAccess().getScopeKeyword_3_0());
                    			
                    // InternalModness.g:962:4: ( (lv_scope_4_0= ruleEString ) )
                    // InternalModness.g:963:5: (lv_scope_4_0= ruleEString )
                    {
                    // InternalModness.g:963:5: (lv_scope_4_0= ruleEString )
                    // InternalModness.g:964:6: lv_scope_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getScopeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_scope_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_4_0,
                    							"org.xtext.example.modness.Modness.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAnalysisAccess().getMetricKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalModness.g:990:3: ( (lv_metric_7_0= ruleMetric ) )
            // InternalModness.g:991:4: (lv_metric_7_0= ruleMetric )
            {
            // InternalModness.g:991:4: (lv_metric_7_0= ruleMetric )
            // InternalModness.g:992:5: lv_metric_7_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getMetricMetricParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalModness.g:1009:3: (otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModness.g:1010:4: otherlv_8= ',' ( (lv_metric_9_0= ruleMetric ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalModness.g:1014:4: ( (lv_metric_9_0= ruleMetric ) )
            	    // InternalModness.g:1015:5: (lv_metric_9_0= ruleMetric )
            	    {
            	    // InternalModness.g:1015:5: (lv_metric_9_0= ruleMetric )
            	    // InternalModness.g:1016:6: lv_metric_9_0= ruleMetric
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getMetricMetricParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            otherlv_10=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAnalysisAccess().getDatasetKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalModness.g:1046:3: ( (lv_dataset_13_0= ruleDataset ) )
            // InternalModness.g:1047:4: (lv_dataset_13_0= ruleDataset )
            {
            // InternalModness.g:1047:4: (lv_dataset_13_0= ruleDataset )
            // InternalModness.g:1048:5: lv_dataset_13_0= ruleDataset
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetDatasetParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalModness.g:1065:3: (otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalModness.g:1066:4: otherlv_14= ',' ( (lv_dataset_15_0= ruleDataset ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_29); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalModness.g:1070:4: ( (lv_dataset_15_0= ruleDataset ) )
            	    // InternalModness.g:1071:5: (lv_dataset_15_0= ruleDataset )
            	    {
            	    // InternalModness.g:1071:5: (lv_dataset_15_0= ruleDataset )
            	    // InternalModness.g:1072:6: lv_dataset_15_0= ruleDataset
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetDatasetParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            otherlv_16=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_16, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupKeyword_14());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_18, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalModness.g:1102:3: ( (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup ) )
            // InternalModness.g:1103:4: (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup )
            {
            // InternalModness.g:1103:4: (lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup )
            // InternalModness.g:1104:5: lv_datasetUnprivilegedGroup_19_0= ruleDatasetSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupDatasetSensitiveGroupParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_8);
            lv_datasetUnprivilegedGroup_19_0=ruleDatasetSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"datasetUnprivilegedGroup",
            						lv_datasetUnprivilegedGroup_19_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1121:3: (otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalModness.g:1122:4: otherlv_20= ',' ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) )
            	    {
            	    otherlv_20=(Token)match(input,15,FOLLOW_31); 

            	    				newLeafNode(otherlv_20, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalModness.g:1126:4: ( (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup ) )
            	    // InternalModness.g:1127:5: (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup )
            	    {
            	    // InternalModness.g:1127:5: (lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup )
            	    // InternalModness.g:1128:6: lv_datasetUnprivilegedGroup_21_0= ruleDatasetSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupDatasetSensitiveGroupParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_datasetUnprivilegedGroup_21_0=ruleDatasetSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetUnprivilegedGroup",
            	    							lv_datasetUnprivilegedGroup_21_0,
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

            otherlv_22=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_22, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_23=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupKeyword_19());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_24, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_20());
            		
            // InternalModness.g:1158:3: ( (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup ) )
            // InternalModness.g:1159:4: (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup )
            {
            // InternalModness.g:1159:4: (lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup )
            // InternalModness.g:1160:5: lv_datasetPrivilegedGroup_25_0= ruleDatasetSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupDatasetSensitiveGroupParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_8);
            lv_datasetPrivilegedGroup_25_0=ruleDatasetSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"datasetPrivilegedGroup",
            						lv_datasetPrivilegedGroup_25_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1177:3: (otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalModness.g:1178:4: otherlv_26= ',' ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FOLLOW_31); 

            	    				newLeafNode(otherlv_26, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_22_0());
            	    			
            	    // InternalModness.g:1182:4: ( (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup ) )
            	    // InternalModness.g:1183:5: (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup )
            	    {
            	    // InternalModness.g:1183:5: (lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup )
            	    // InternalModness.g:1184:6: lv_datasetPrivilegedGroup_27_0= ruleDatasetSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupDatasetSensitiveGroupParserRuleCall_22_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_datasetPrivilegedGroup_27_0=ruleDatasetSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetPrivilegedGroup",
            	    							lv_datasetPrivilegedGroup_27_0,
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

            otherlv_28=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_28, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketKeyword_23());
            		
            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketKeyword_24());
            		

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
    // InternalModness.g:1214:1: entryRuleSensitiveVariableValue returns [EObject current=null] : iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF ;
    public final EObject entryRuleSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveVariableValue = null;


        try {
            // InternalModness.g:1214:63: (iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF )
            // InternalModness.g:1215:2: iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF
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
    // InternalModness.g:1221:1: ruleSensitiveVariableValue returns [EObject current=null] : (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1227:2: ( (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalModness.g:1228:2: (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalModness.g:1228:2: (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalModness.g:1229:3: otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveVariableValueAccess().getSensitiveVariableValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSensitiveVariableValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitiveVariableValueAccess().getValueKeyword_2());
            		
            // InternalModness.g:1241:3: ( (lv_value_3_0= ruleEString ) )
            // InternalModness.g:1242:4: (lv_value_3_0= ruleEString )
            {
            // InternalModness.g:1242:4: (lv_value_3_0= ruleEString )
            // InternalModness.g:1243:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableValueAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensitiveVariableValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveVariableValueAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalModness.g:1268:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalModness.g:1268:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalModness.g:1269:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalModness.g:1275:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'toleranceValue' ( (lv_toleranceValue_4_0= ruleEFloat ) ) otherlv_5= 'operator' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= 'function' ( (lv_function_8_0= ruleFunction ) ) otherlv_9= '}' ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_toleranceValue_4_0 = null;

        EObject lv_operator_6_0 = null;

        EObject lv_function_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1281:2: ( (otherlv_0= 'Metric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'toleranceValue' ( (lv_toleranceValue_4_0= ruleEFloat ) ) otherlv_5= 'operator' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= 'function' ( (lv_function_8_0= ruleFunction ) ) otherlv_9= '}' ) )
            // InternalModness.g:1282:2: (otherlv_0= 'Metric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'toleranceValue' ( (lv_toleranceValue_4_0= ruleEFloat ) ) otherlv_5= 'operator' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= 'function' ( (lv_function_8_0= ruleFunction ) ) otherlv_9= '}' )
            {
            // InternalModness.g:1282:2: (otherlv_0= 'Metric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'toleranceValue' ( (lv_toleranceValue_4_0= ruleEFloat ) ) otherlv_5= 'operator' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= 'function' ( (lv_function_8_0= ruleFunction ) ) otherlv_9= '}' )
            // InternalModness.g:1283:3: otherlv_0= 'Metric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'toleranceValue' ( (lv_toleranceValue_4_0= ruleEFloat ) ) otherlv_5= 'operator' ( (lv_operator_6_0= ruleEqualityOperator ) ) otherlv_7= 'function' ( (lv_function_8_0= ruleFunction ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            // InternalModness.g:1287:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:1288:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:1288:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:1289:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getMetricAccess().getToleranceValueKeyword_3());
            		
            // InternalModness.g:1314:3: ( (lv_toleranceValue_4_0= ruleEFloat ) )
            // InternalModness.g:1315:4: (lv_toleranceValue_4_0= ruleEFloat )
            {
            // InternalModness.g:1315:4: (lv_toleranceValue_4_0= ruleEFloat )
            // InternalModness.g:1316:5: lv_toleranceValue_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getToleranceValueEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_toleranceValue_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"toleranceValue",
            						lv_toleranceValue_4_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getMetricAccess().getOperatorKeyword_5());
            		
            // InternalModness.g:1337:3: ( (lv_operator_6_0= ruleEqualityOperator ) )
            // InternalModness.g:1338:4: (lv_operator_6_0= ruleEqualityOperator )
            {
            // InternalModness.g:1338:4: (lv_operator_6_0= ruleEqualityOperator )
            // InternalModness.g:1339:5: lv_operator_6_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getOperatorEqualityOperatorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_37);
            lv_operator_6_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_6_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_7, grammarAccess.getMetricAccess().getFunctionKeyword_7());
            		
            // InternalModness.g:1360:3: ( (lv_function_8_0= ruleFunction ) )
            // InternalModness.g:1361:4: (lv_function_8_0= ruleFunction )
            {
            // InternalModness.g:1361:4: (lv_function_8_0= ruleFunction )
            // InternalModness.g:1362:5: lv_function_8_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getFunctionFunctionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_function_8_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_8_0,
            						"org.xtext.example.modness.Modness.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMetricAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalModness.g:1387:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalModness.g:1387:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalModness.g:1388:2: iv_ruleDataset= ruleDataset EOF
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
    // InternalModness.g:1394:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) ) )? (otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) ) )? otherlv_7= 'filePath' ( (lv_filePath_8_0= ruleEString ) ) (otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}' )? otherlv_15= 'positiveOutcome' ( (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome ) ) otherlv_17= 'datasetSentiveVariable' otherlv_18= '{' ( (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable ) ) (otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_groundTruthLabelName_4_0 = null;

        AntlrDatatypeRuleToken lv_predictedLabelName_6_0 = null;

        AntlrDatatypeRuleToken lv_filePath_8_0 = null;

        EObject lv_otherVariable_11_0 = null;

        EObject lv_otherVariable_13_0 = null;

        EObject lv_positiveOutcome_16_0 = null;

        EObject lv_datasetSentiveVariable_19_0 = null;

        EObject lv_datasetSentiveVariable_21_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1400:2: ( (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) ) )? (otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) ) )? otherlv_7= 'filePath' ( (lv_filePath_8_0= ruleEString ) ) (otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}' )? otherlv_15= 'positiveOutcome' ( (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome ) ) otherlv_17= 'datasetSentiveVariable' otherlv_18= '{' ( (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable ) ) (otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalModness.g:1401:2: (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) ) )? (otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) ) )? otherlv_7= 'filePath' ( (lv_filePath_8_0= ruleEString ) ) (otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}' )? otherlv_15= 'positiveOutcome' ( (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome ) ) otherlv_17= 'datasetSentiveVariable' otherlv_18= '{' ( (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable ) ) (otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalModness.g:1401:2: (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) ) )? (otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) ) )? otherlv_7= 'filePath' ( (lv_filePath_8_0= ruleEString ) ) (otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}' )? otherlv_15= 'positiveOutcome' ( (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome ) ) otherlv_17= 'datasetSentiveVariable' otherlv_18= '{' ( (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable ) ) (otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalModness.g:1402:3: otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) ) )? (otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) ) )? otherlv_7= 'filePath' ( (lv_filePath_8_0= ruleEString ) ) (otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}' )? otherlv_15= 'positiveOutcome' ( (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome ) ) otherlv_17= 'datasetSentiveVariable' otherlv_18= '{' ( (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable ) ) (otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDatasetKeyword_0());
            		
            // InternalModness.g:1406:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:1407:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:1407:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:1408:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModness.g:1429:3: (otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModness.g:1430:4: otherlv_3= 'groundTruthLabelName' ( (lv_groundTruthLabelName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDatasetAccess().getGroundTruthLabelNameKeyword_3_0());
                    			
                    // InternalModness.g:1434:4: ( (lv_groundTruthLabelName_4_0= ruleEString ) )
                    // InternalModness.g:1435:5: (lv_groundTruthLabelName_4_0= ruleEString )
                    {
                    // InternalModness.g:1435:5: (lv_groundTruthLabelName_4_0= ruleEString )
                    // InternalModness.g:1436:6: lv_groundTruthLabelName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getGroundTruthLabelNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_groundTruthLabelName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetRule());
                    						}
                    						set(
                    							current,
                    							"groundTruthLabelName",
                    							lv_groundTruthLabelName_4_0,
                    							"org.xtext.example.modness.Modness.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:1454:3: (otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModness.g:1455:4: otherlv_5= 'predictedLabelName' ( (lv_predictedLabelName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDatasetAccess().getPredictedLabelNameKeyword_4_0());
                    			
                    // InternalModness.g:1459:4: ( (lv_predictedLabelName_6_0= ruleEString ) )
                    // InternalModness.g:1460:5: (lv_predictedLabelName_6_0= ruleEString )
                    {
                    // InternalModness.g:1460:5: (lv_predictedLabelName_6_0= ruleEString )
                    // InternalModness.g:1461:6: lv_predictedLabelName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getPredictedLabelNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_predictedLabelName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetRule());
                    						}
                    						set(
                    							current,
                    							"predictedLabelName",
                    							lv_predictedLabelName_6_0,
                    							"org.xtext.example.modness.Modness.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetAccess().getFilePathKeyword_5());
            		
            // InternalModness.g:1483:3: ( (lv_filePath_8_0= ruleEString ) )
            // InternalModness.g:1484:4: (lv_filePath_8_0= ruleEString )
            {
            // InternalModness.g:1484:4: (lv_filePath_8_0= ruleEString )
            // InternalModness.g:1485:5: lv_filePath_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getFilePathEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_42);
            lv_filePath_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"filePath",
            						lv_filePath_8_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1502:3: (otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModness.g:1503:4: otherlv_9= 'otherVariable' otherlv_10= '{' ( (lv_otherVariable_11_0= ruleOtherVariable ) ) (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getDatasetAccess().getOtherVariableKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalModness.g:1511:4: ( (lv_otherVariable_11_0= ruleOtherVariable ) )
                    // InternalModness.g:1512:5: (lv_otherVariable_11_0= ruleOtherVariable )
                    {
                    // InternalModness.g:1512:5: (lv_otherVariable_11_0= ruleOtherVariable )
                    // InternalModness.g:1513:6: lv_otherVariable_11_0= ruleOtherVariable
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getOtherVariableOtherVariableParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_otherVariable_11_0=ruleOtherVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetRule());
                    						}
                    						add(
                    							current,
                    							"otherVariable",
                    							lv_otherVariable_11_0,
                    							"org.xtext.example.modness.Modness.OtherVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModness.g:1530:4: (otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalModness.g:1531:5: otherlv_12= ',' ( (lv_otherVariable_13_0= ruleOtherVariable ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_43); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDatasetAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalModness.g:1535:5: ( (lv_otherVariable_13_0= ruleOtherVariable ) )
                    	    // InternalModness.g:1536:6: (lv_otherVariable_13_0= ruleOtherVariable )
                    	    {
                    	    // InternalModness.g:1536:6: (lv_otherVariable_13_0= ruleOtherVariable )
                    	    // InternalModness.g:1537:7: lv_otherVariable_13_0= ruleOtherVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getDatasetAccess().getOtherVariableOtherVariableParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_otherVariable_13_0=ruleOtherVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"otherVariable",
                    	    								lv_otherVariable_13_0,
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

                    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_44); 

            			newLeafNode(otherlv_15, grammarAccess.getDatasetAccess().getPositiveOutcomeKeyword_8());
            		
            // InternalModness.g:1564:3: ( (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome ) )
            // InternalModness.g:1565:4: (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome )
            {
            // InternalModness.g:1565:4: (lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome )
            // InternalModness.g:1566:5: lv_positiveOutcome_16_0= ruleDatasetPositiveOutcome
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getPositiveOutcomeDatasetPositiveOutcomeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_45);
            lv_positiveOutcome_16_0=ruleDatasetPositiveOutcome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"positiveOutcome",
            						lv_positiveOutcome_16_0,
            						"org.xtext.example.modness.Modness.DatasetPositiveOutcome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getDatasetAccess().getDatasetSentiveVariableKeyword_10());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_18, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalModness.g:1591:3: ( (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable ) )
            // InternalModness.g:1592:4: (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable )
            {
            // InternalModness.g:1592:4: (lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable )
            // InternalModness.g:1593:5: lv_datasetSentiveVariable_19_0= ruleDatasetSensitiveVariable
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getDatasetSentiveVariableDatasetSensitiveVariableParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_datasetSentiveVariable_19_0=ruleDatasetSensitiveVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					add(
            						current,
            						"datasetSentiveVariable",
            						lv_datasetSentiveVariable_19_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1610:3: (otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalModness.g:1611:4: otherlv_20= ',' ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) )
            	    {
            	    otherlv_20=(Token)match(input,15,FOLLOW_46); 

            	    				newLeafNode(otherlv_20, grammarAccess.getDatasetAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalModness.g:1615:4: ( (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable ) )
            	    // InternalModness.g:1616:5: (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable )
            	    {
            	    // InternalModness.g:1616:5: (lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable )
            	    // InternalModness.g:1617:6: lv_datasetSentiveVariable_21_0= ruleDatasetSensitiveVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetAccess().getDatasetSentiveVariableDatasetSensitiveVariableParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_datasetSentiveVariable_21_0=ruleDatasetSensitiveVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatasetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetSentiveVariable",
            	    							lv_datasetSentiveVariable_21_0,
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

            otherlv_22=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_22, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_23=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalModness.g:1647:1: entryRuleDatasetSensitiveGroup returns [EObject current=null] : iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF ;
    public final EObject entryRuleDatasetSensitiveGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveGroup = null;


        try {
            // InternalModness.g:1647:62: (iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF )
            // InternalModness.g:1648:2: iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF
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
    // InternalModness.g:1654:1: ruleDatasetSensitiveGroup returns [EObject current=null] : (otherlv_0= 'DatasetSensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariables' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'mappingGroup' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleDatasetSensitiveGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1660:2: ( (otherlv_0= 'DatasetSensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariables' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'mappingGroup' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalModness.g:1661:2: (otherlv_0= 'DatasetSensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariables' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'mappingGroup' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalModness.g:1661:2: (otherlv_0= 'DatasetSensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariables' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'mappingGroup' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalModness.g:1662:3: otherlv_0= 'DatasetSensitiveGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensitiveVariables' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'mappingGroup' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveGroupAccess().getDatasetSensitiveGroupKeyword_0());
            		
            // InternalModness.g:1666:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:1667:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:1667:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:1668:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSensitiveGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveGroupAccess().getLeftParenthesisKeyword_4());
            		
            // InternalModness.g:1697:3: ( ( ruleEString ) )
            // InternalModness.g:1698:4: ( ruleEString )
            {
            // InternalModness.g:1698:4: ( ruleEString )
            // InternalModness.g:1699:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesDatasetSensitiveVariableValueCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1713:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalModness.g:1714:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDatasetSensitiveGroupAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalModness.g:1718:4: ( ( ruleEString ) )
            	    // InternalModness.g:1719:5: ( ruleEString )
            	    {
            	    // InternalModness.g:1719:5: ( ruleEString )
            	    // InternalModness.g:1720:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesDatasetSensitiveVariableValueCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_8=(Token)match(input,29,FOLLOW_47); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveGroupAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getDatasetSensitiveGroupAccess().getMappingGroupKeyword_8());
            		
            // InternalModness.g:1743:3: ( ( ruleEString ) )
            // InternalModness.g:1744:4: ( ruleEString )
            {
            // InternalModness.g:1744:4: ( ruleEString )
            // InternalModness.g:1745:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getMappingGroupSensitiveGroupCrossReference_9_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDatasetSensitiveGroupAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalModness.g:1767:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalModness.g:1767:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalModness.g:1768:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalModness.g:1774:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalModness.g:1780:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalModness.g:1781:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalModness.g:1781:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalModness.g:1782:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalModness.g:1782:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModness.g:1783:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModness.g:1789:3: (this_INT_1= RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModness.g:1790:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,50,FOLLOW_50); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_51); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalModness.g:1810:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=51 && LA27_0<=52)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModness.g:1811:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalModness.g:1811:4: (kw= 'E' | kw= 'e' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==51) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==52) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalModness.g:1812:5: kw= 'E'
                            {
                            kw=(Token)match(input,51,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalModness.g:1818:5: kw= 'e'
                            {
                            kw=(Token)match(input,52,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalModness.g:1824:4: (kw= '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==49) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalModness.g:1825:5: kw= '-'
                            {
                            kw=(Token)match(input,49,FOLLOW_50); 

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
    // InternalModness.g:1843:1: entryRuleSingleOperator returns [EObject current=null] : iv_ruleSingleOperator= ruleSingleOperator EOF ;
    public final EObject entryRuleSingleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleOperator = null;


        try {
            // InternalModness.g:1843:55: (iv_ruleSingleOperator= ruleSingleOperator EOF )
            // InternalModness.g:1844:2: iv_ruleSingleOperator= ruleSingleOperator EOF
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
    // InternalModness.g:1850:1: ruleSingleOperator returns [EObject current=null] : (otherlv_0= 'SingleOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleSingleOperatorParameter ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= '}' ) ;
    public final EObject ruleSingleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1856:2: ( (otherlv_0= 'SingleOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleSingleOperatorParameter ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= '}' ) )
            // InternalModness.g:1857:2: (otherlv_0= 'SingleOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleSingleOperatorParameter ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= '}' )
            {
            // InternalModness.g:1857:2: (otherlv_0= 'SingleOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleSingleOperatorParameter ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= '}' )
            // InternalModness.g:1858:3: otherlv_0= 'SingleOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleSingleOperatorParameter ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleOperatorAccess().getSingleOperatorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleOperatorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleOperatorAccess().getOperatorKeyword_2());
            		
            // InternalModness.g:1870:3: ( (lv_operator_3_0= ruleSingleOperatorParameter ) )
            // InternalModness.g:1871:4: (lv_operator_3_0= ruleSingleOperatorParameter )
            {
            // InternalModness.g:1871:4: (lv_operator_3_0= ruleSingleOperatorParameter )
            // InternalModness.g:1872:5: lv_operator_3_0= ruleSingleOperatorParameter
            {

            					newCompositeNode(grammarAccess.getSingleOperatorAccess().getOperatorSingleOperatorParameterEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_operator_3_0=ruleSingleOperatorParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleOperatorRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.xtext.example.modness.Modness.SingleOperatorParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getSingleOperatorAccess().getValueKeyword_4());
            		
            // InternalModness.g:1893:3: ( (lv_value_5_0= ruleEFloat ) )
            // InternalModness.g:1894:4: (lv_value_5_0= ruleEFloat )
            {
            // InternalModness.g:1894:4: (lv_value_5_0= ruleEFloat )
            // InternalModness.g:1895:5: lv_value_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getSingleOperatorAccess().getValueEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSingleOperatorAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalModness.g:1920:1: entryRuleRangeOperator returns [EObject current=null] : iv_ruleRangeOperator= ruleRangeOperator EOF ;
    public final EObject entryRuleRangeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeOperator = null;


        try {
            // InternalModness.g:1920:54: (iv_ruleRangeOperator= ruleRangeOperator EOF )
            // InternalModness.g:1921:2: iv_ruleRangeOperator= ruleRangeOperator EOF
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
    // InternalModness.g:1927:1: ruleRangeOperator returns [EObject current=null] : (otherlv_0= 'RangeOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleRangeOperatorParameter ) ) otherlv_4= 'lowerValue' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= 'greaterValue' ( (lv_greaterValue_7_0= ruleEFloat ) ) otherlv_8= '}' ) ;
    public final EObject ruleRangeOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_lowerValue_5_0 = null;

        AntlrDatatypeRuleToken lv_greaterValue_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1933:2: ( (otherlv_0= 'RangeOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleRangeOperatorParameter ) ) otherlv_4= 'lowerValue' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= 'greaterValue' ( (lv_greaterValue_7_0= ruleEFloat ) ) otherlv_8= '}' ) )
            // InternalModness.g:1934:2: (otherlv_0= 'RangeOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleRangeOperatorParameter ) ) otherlv_4= 'lowerValue' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= 'greaterValue' ( (lv_greaterValue_7_0= ruleEFloat ) ) otherlv_8= '}' )
            {
            // InternalModness.g:1934:2: (otherlv_0= 'RangeOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleRangeOperatorParameter ) ) otherlv_4= 'lowerValue' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= 'greaterValue' ( (lv_greaterValue_7_0= ruleEFloat ) ) otherlv_8= '}' )
            // InternalModness.g:1935:3: otherlv_0= 'RangeOperator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleRangeOperatorParameter ) ) otherlv_4= 'lowerValue' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= 'greaterValue' ( (lv_greaterValue_7_0= ruleEFloat ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeOperatorAccess().getRangeOperatorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeOperatorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeOperatorAccess().getOperatorKeyword_2());
            		
            // InternalModness.g:1947:3: ( (lv_operator_3_0= ruleRangeOperatorParameter ) )
            // InternalModness.g:1948:4: (lv_operator_3_0= ruleRangeOperatorParameter )
            {
            // InternalModness.g:1948:4: (lv_operator_3_0= ruleRangeOperatorParameter )
            // InternalModness.g:1949:5: lv_operator_3_0= ruleRangeOperatorParameter
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getOperatorRangeOperatorParameterEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
            lv_operator_3_0=ruleRangeOperatorParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeOperatorRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.xtext.example.modness.Modness.RangeOperatorParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeOperatorAccess().getLowerValueKeyword_4());
            		
            // InternalModness.g:1970:3: ( (lv_lowerValue_5_0= ruleEFloat ) )
            // InternalModness.g:1971:4: (lv_lowerValue_5_0= ruleEFloat )
            {
            // InternalModness.g:1971:4: (lv_lowerValue_5_0= ruleEFloat )
            // InternalModness.g:1972:5: lv_lowerValue_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getLowerValueEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_6=(Token)match(input,56,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getRangeOperatorAccess().getGreaterValueKeyword_6());
            		
            // InternalModness.g:1993:3: ( (lv_greaterValue_7_0= ruleEFloat ) )
            // InternalModness.g:1994:4: (lv_greaterValue_7_0= ruleEFloat )
            {
            // InternalModness.g:1994:4: (lv_greaterValue_7_0= ruleEFloat )
            // InternalModness.g:1995:5: lv_greaterValue_7_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getGreaterValueEFloatParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_greaterValue_7_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeOperatorRule());
            					}
            					set(
            						current,
            						"greaterValue",
            						lv_greaterValue_7_0,
            						"org.xtext.example.modness.Modness.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRangeOperatorAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalModness.g:2020:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalModness.g:2020:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalModness.g:2021:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalModness.g:2027:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) ;
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
            // InternalModness.g:2033:2: ( (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) )
            // InternalModness.g:2034:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            {
            // InternalModness.g:2034:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            // InternalModness.g:2035:3: otherlv_0= 'Operation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'equalityOperator' ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) ) otherlv_5= 'leftSide' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalModness.g:2039:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2040:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2040:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2041:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,58,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getEqualityOperatorKeyword_3());
            		
            // InternalModness.g:2066:3: ( (lv_equalityOperator_4_0= ruleArithmeticOperator ) )
            // InternalModness.g:2067:4: (lv_equalityOperator_4_0= ruleArithmeticOperator )
            {
            // InternalModness.g:2067:4: (lv_equalityOperator_4_0= ruleArithmeticOperator )
            // InternalModness.g:2068:5: lv_equalityOperator_4_0= ruleArithmeticOperator
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getEqualityOperatorArithmeticOperatorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_5=(Token)match(input,59,FOLLOW_60); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftSideKeyword_5());
            		
            // InternalModness.g:2089:3: ( (lv_leftSide_6_0= ruleOperatorComponent ) )
            // InternalModness.g:2090:4: (lv_leftSide_6_0= ruleOperatorComponent )
            {
            // InternalModness.g:2090:4: (lv_leftSide_6_0= ruleOperatorComponent )
            // InternalModness.g:2091:5: lv_leftSide_6_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getLeftSideOperatorComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_7=(Token)match(input,60,FOLLOW_60); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightSideKeyword_7());
            		
            // InternalModness.g:2112:3: ( (lv_rightSide_8_0= ruleOperatorComponent ) )
            // InternalModness.g:2113:4: (lv_rightSide_8_0= ruleOperatorComponent )
            {
            // InternalModness.g:2113:4: (lv_rightSide_8_0= ruleOperatorComponent )
            // InternalModness.g:2114:5: lv_rightSide_8_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getRightSideOperatorComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2139:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // InternalModness.g:2139:52: (iv_ruleProbability= ruleProbability EOF )
            // InternalModness.g:2140:2: iv_ruleProbability= ruleProbability EOF
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
    // InternalModness.g:2146:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) ;
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
            // InternalModness.g:2152:2: ( (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) )
            // InternalModness.g:2153:2: (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            {
            // InternalModness.g:2153:2: (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            // InternalModness.g:2154:3: otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getProbabilityKeyword_0());
            		
            // InternalModness.g:2158:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2159:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2159:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2160:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getProbabilityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getProbabilityAccess().getObjectKeyword_3());
            		
            // InternalModness.g:2185:3: ( (lv_object_4_0= ruleLogicalCondition ) )
            // InternalModness.g:2186:4: (lv_object_4_0= ruleLogicalCondition )
            {
            // InternalModness.g:2186:4: (lv_object_4_0= ruleLogicalCondition )
            // InternalModness.g:2187:5: lv_object_4_0= ruleLogicalCondition
            {

            					newCompositeNode(grammarAccess.getProbabilityAccess().getObjectLogicalConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_64);
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

            // InternalModness.g:2204:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModness.g:2205:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_63); 

                    				newLeafNode(otherlv_5, grammarAccess.getProbabilityAccess().getConditionKeyword_5_0());
                    			
                    // InternalModness.g:2209:4: ( (lv_condition_6_0= ruleLogicalCondition ) )
                    // InternalModness.g:2210:5: (lv_condition_6_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2210:5: (lv_condition_6_0= ruleLogicalCondition )
                    // InternalModness.g:2211:6: lv_condition_6_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getProbabilityAccess().getConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2237:1: entryRuleExpectedValue returns [EObject current=null] : iv_ruleExpectedValue= ruleExpectedValue EOF ;
    public final EObject entryRuleExpectedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectedValue = null;


        try {
            // InternalModness.g:2237:54: (iv_ruleExpectedValue= ruleExpectedValue EOF )
            // InternalModness.g:2238:2: iv_ruleExpectedValue= ruleExpectedValue EOF
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
    // InternalModness.g:2244:1: ruleExpectedValue returns [EObject current=null] : (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) ;
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
            // InternalModness.g:2250:2: ( (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) )
            // InternalModness.g:2251:2: (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            {
            // InternalModness.g:2251:2: (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            // InternalModness.g:2252:3: otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpectedValueAccess().getExpectedValueKeyword_0());
            		
            // InternalModness.g:2256:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2257:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2257:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2258:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getExpectedValueAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getExpectedValueAccess().getColumnNameKeyword_3());
            		
            // InternalModness.g:2283:3: ( (lv_columnName_4_0= ruleEString ) )
            // InternalModness.g:2284:4: (lv_columnName_4_0= ruleEString )
            {
            // InternalModness.g:2284:4: (lv_columnName_4_0= ruleEString )
            // InternalModness.g:2285:5: lv_columnName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExpectedValueAccess().getColumnNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_64);
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

            // InternalModness.g:2302:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==63) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModness.g:2303:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_63); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpectedValueAccess().getConditionKeyword_5_0());
                    			
                    // InternalModness.g:2307:4: ( (lv_condition_6_0= ruleLogicalCondition ) )
                    // InternalModness.g:2308:5: (lv_condition_6_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2308:5: (lv_condition_6_0= ruleLogicalCondition )
                    // InternalModness.g:2309:6: lv_condition_6_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getExpectedValueAccess().getConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2335:1: entryRuleGroupSize returns [EObject current=null] : iv_ruleGroupSize= ruleGroupSize EOF ;
    public final EObject entryRuleGroupSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSize = null;


        try {
            // InternalModness.g:2335:50: (iv_ruleGroupSize= ruleGroupSize EOF )
            // InternalModness.g:2336:2: iv_ruleGroupSize= ruleGroupSize EOF
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
    // InternalModness.g:2342:1: ruleGroupSize returns [EObject current=null] : ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' ) ;
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
            // InternalModness.g:2348:2: ( ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' ) )
            // InternalModness.g:2349:2: ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' )
            {
            // InternalModness.g:2349:2: ( () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}' )
            // InternalModness.g:2350:3: () otherlv_1= 'GroupSize' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' ( ( ruleEString ) ) )? (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )? otherlv_8= '}'
            {
            // InternalModness.g:2350:3: ()
            // InternalModness.g:2351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupSizeAccess().getGroupSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupSizeAccess().getGroupSizeKeyword_1());
            		
            // InternalModness.g:2361:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2362:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2362:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2363:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupSizeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:2384:3: (otherlv_4= 'variable' ( ( ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==67) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalModness.g:2385:4: otherlv_4= 'variable' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGroupSizeAccess().getVariableKeyword_4_0());
                    			
                    // InternalModness.g:2389:4: ( ( ruleEString ) )
                    // InternalModness.g:2390:5: ( ruleEString )
                    {
                    // InternalModness.g:2390:5: ( ruleEString )
                    // InternalModness.g:2391:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupSizeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGroupSizeAccess().getVariableVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2406:3: (otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==68) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalModness.g:2407:4: otherlv_6= 'groupCondition' ( (lv_groupCondition_7_0= ruleLogicalCondition ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_63); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupSizeAccess().getGroupConditionKeyword_5_0());
                    			
                    // InternalModness.g:2411:4: ( (lv_groupCondition_7_0= ruleLogicalCondition ) )
                    // InternalModness.g:2412:5: (lv_groupCondition_7_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2412:5: (lv_groupCondition_7_0= ruleLogicalCondition )
                    // InternalModness.g:2413:6: lv_groupCondition_7_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getGroupSizeAccess().getGroupConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2439:1: entryRuleDatasetSize returns [EObject current=null] : iv_ruleDatasetSize= ruleDatasetSize EOF ;
    public final EObject entryRuleDatasetSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSize = null;


        try {
            // InternalModness.g:2439:52: (iv_ruleDatasetSize= ruleDatasetSize EOF )
            // InternalModness.g:2440:2: iv_ruleDatasetSize= ruleDatasetSize EOF
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
    // InternalModness.g:2446:1: ruleDatasetSize returns [EObject current=null] : ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDatasetSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2452:2: ( ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalModness.g:2453:2: ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalModness.g:2453:2: ( () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) ) )
            // InternalModness.g:2454:3: () otherlv_1= 'DatasetSize' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalModness.g:2454:3: ()
            // InternalModness.g:2455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatasetSizeAccess().getDatasetSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSizeAccess().getDatasetSizeKeyword_1());
            		
            // InternalModness.g:2465:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2466:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2466:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2467:5: lv_name_2_0= ruleEString
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
    // InternalModness.g:2488:1: entryRuleLogaritm returns [EObject current=null] : iv_ruleLogaritm= ruleLogaritm EOF ;
    public final EObject entryRuleLogaritm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogaritm = null;


        try {
            // InternalModness.g:2488:49: (iv_ruleLogaritm= ruleLogaritm EOF )
            // InternalModness.g:2489:2: iv_ruleLogaritm= ruleLogaritm EOF
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
    // InternalModness.g:2495:1: ruleLogaritm returns [EObject current=null] : (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' ) ;
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
            // InternalModness.g:2501:2: ( (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' ) )
            // InternalModness.g:2502:2: (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' )
            {
            // InternalModness.g:2502:2: (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' )
            // InternalModness.g:2503:3: otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogaritmAccess().getLogaritmKeyword_0());
            		
            // InternalModness.g:2507:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2508:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2508:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2509:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getLogaritmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getLogaritmAccess().getOperatorcomponentKeyword_3());
            		
            // InternalModness.g:2534:3: ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) )
            // InternalModness.g:2535:4: (lv_operatorcomponent_4_0= ruleOperatorComponent )
            {
            // InternalModness.g:2535:4: (lv_operatorcomponent_4_0= ruleOperatorComponent )
            // InternalModness.g:2536:5: lv_operatorcomponent_4_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getLogaritmAccess().getOperatorcomponentOperatorComponentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2561:1: entryRuleSummation returns [EObject current=null] : iv_ruleSummation= ruleSummation EOF ;
    public final EObject entryRuleSummation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummation = null;


        try {
            // InternalModness.g:2561:50: (iv_ruleSummation= ruleSummation EOF )
            // InternalModness.g:2562:2: iv_ruleSummation= ruleSummation EOF
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
    // InternalModness.g:2568:1: ruleSummation returns [EObject current=null] : (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) ;
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
            // InternalModness.g:2574:2: ( (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) )
            // InternalModness.g:2575:2: (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            {
            // InternalModness.g:2575:2: (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            // InternalModness.g:2576:3: otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSummationAccess().getSummationKeyword_0());
            		
            // InternalModness.g:2580:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2581:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2581:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2582:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getSummationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,73,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getSummationAccess().getStartRangeKeyword_3());
            		
            // InternalModness.g:2607:3: ( (lv_startRange_4_0= ruleOperatorComponent ) )
            // InternalModness.g:2608:4: (lv_startRange_4_0= ruleOperatorComponent )
            {
            // InternalModness.g:2608:4: (lv_startRange_4_0= ruleOperatorComponent )
            // InternalModness.g:2609:5: lv_startRange_4_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getStartRangeOperatorComponentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_70);
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

            otherlv_5=(Token)match(input,74,FOLLOW_60); 

            			newLeafNode(otherlv_5, grammarAccess.getSummationAccess().getEndRangeKeyword_5());
            		
            // InternalModness.g:2630:3: ( (lv_endRange_6_0= ruleOperatorComponent ) )
            // InternalModness.g:2631:4: (lv_endRange_6_0= ruleOperatorComponent )
            {
            // InternalModness.g:2631:4: (lv_endRange_6_0= ruleOperatorComponent )
            // InternalModness.g:2632:5: lv_endRange_6_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getEndRangeOperatorComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_71);
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

            otherlv_7=(Token)match(input,75,FOLLOW_60); 

            			newLeafNode(otherlv_7, grammarAccess.getSummationAccess().getBodyKeyword_7());
            		
            // InternalModness.g:2653:3: ( (lv_body_8_0= ruleOperatorComponent ) )
            // InternalModness.g:2654:4: (lv_body_8_0= ruleOperatorComponent )
            {
            // InternalModness.g:2654:4: (lv_body_8_0= ruleOperatorComponent )
            // InternalModness.g:2655:5: lv_body_8_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getBodyOperatorComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2680:1: entryRuleExistingGroupFairnessMetric returns [EObject current=null] : iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF ;
    public final EObject entryRuleExistingGroupFairnessMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingGroupFairnessMetric = null;


        try {
            // InternalModness.g:2680:68: (iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF )
            // InternalModness.g:2681:2: iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF
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
    // InternalModness.g:2687:1: ruleExistingGroupFairnessMetric returns [EObject current=null] : (otherlv_0= 'ExistingGroupFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleGroupFairnessMetric ) ) otherlv_5= '}' ) ;
    public final EObject ruleExistingGroupFairnessMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_metric_4_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2693:2: ( (otherlv_0= 'ExistingGroupFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleGroupFairnessMetric ) ) otherlv_5= '}' ) )
            // InternalModness.g:2694:2: (otherlv_0= 'ExistingGroupFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleGroupFairnessMetric ) ) otherlv_5= '}' )
            {
            // InternalModness.g:2694:2: (otherlv_0= 'ExistingGroupFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleGroupFairnessMetric ) ) otherlv_5= '}' )
            // InternalModness.g:2695:3: otherlv_0= 'ExistingGroupFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleGroupFairnessMetric ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExistingGroupFairnessMetricAccess().getExistingGroupFairnessMetricKeyword_0());
            		
            // InternalModness.g:2699:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2700:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2700:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2701:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExistingGroupFairnessMetricAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistingGroupFairnessMetricRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getExistingGroupFairnessMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getExistingGroupFairnessMetricAccess().getMetricKeyword_3());
            		
            // InternalModness.g:2726:3: ( (lv_metric_4_0= ruleGroupFairnessMetric ) )
            // InternalModness.g:2727:4: (lv_metric_4_0= ruleGroupFairnessMetric )
            {
            // InternalModness.g:2727:4: (lv_metric_4_0= ruleGroupFairnessMetric )
            // InternalModness.g:2728:5: lv_metric_4_0= ruleGroupFairnessMetric
            {

            					newCompositeNode(grammarAccess.getExistingGroupFairnessMetricAccess().getMetricGroupFairnessMetricEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_metric_4_0=ruleGroupFairnessMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistingGroupFairnessMetricRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_4_0,
            						"org.xtext.example.modness.Modness.GroupFairnessMetric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExistingGroupFairnessMetricAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalModness.g:2753:1: entryRuleExistingIndividualFairnessMetric returns [EObject current=null] : iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF ;
    public final EObject entryRuleExistingIndividualFairnessMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingIndividualFairnessMetric = null;


        try {
            // InternalModness.g:2753:73: (iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF )
            // InternalModness.g:2754:2: iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF
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
    // InternalModness.g:2760:1: ruleExistingIndividualFairnessMetric returns [EObject current=null] : (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= '}' ) ;
    public final EObject ruleExistingIndividualFairnessMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_metric_4_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2766:2: ( (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= '}' ) )
            // InternalModness.g:2767:2: (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= '}' )
            {
            // InternalModness.g:2767:2: (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= '}' )
            // InternalModness.g:2768:3: otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExistingIndividualFairnessMetricAccess().getExistingIndividualFairnessMetricKeyword_0());
            		
            // InternalModness.g:2772:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2773:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2773:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2774:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getExistingIndividualFairnessMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_73); 

            			newLeafNode(otherlv_3, grammarAccess.getExistingIndividualFairnessMetricAccess().getMetricKeyword_3());
            		
            // InternalModness.g:2799:3: ( (lv_metric_4_0= ruleIndividualFairnessMetric ) )
            // InternalModness.g:2800:4: (lv_metric_4_0= ruleIndividualFairnessMetric )
            {
            // InternalModness.g:2800:4: (lv_metric_4_0= ruleIndividualFairnessMetric )
            // InternalModness.g:2801:5: lv_metric_4_0= ruleIndividualFairnessMetric
            {

            					newCompositeNode(grammarAccess.getExistingIndividualFairnessMetricAccess().getMetricIndividualFairnessMetricEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExistingIndividualFairnessMetricAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalModness.g:2826:1: entryRuleOperatorComponent returns [EObject current=null] : iv_ruleOperatorComponent= ruleOperatorComponent EOF ;
    public final EObject entryRuleOperatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorComponent = null;


        try {
            // InternalModness.g:2826:58: (iv_ruleOperatorComponent= ruleOperatorComponent EOF )
            // InternalModness.g:2827:2: iv_ruleOperatorComponent= ruleOperatorComponent EOF
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
    // InternalModness.g:2833:1: ruleOperatorComponent returns [EObject current=null] : ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' ) ;
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
            // InternalModness.g:2839:2: ( ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' ) )
            // InternalModness.g:2840:2: ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' )
            {
            // InternalModness.g:2840:2: ( () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}' )
            // InternalModness.g:2841:3: () otherlv_1= 'OperatorComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )? (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )? otherlv_8= '}'
            {
            // InternalModness.g:2841:3: ()
            // InternalModness.g:2842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperatorComponentAccess().getOperatorComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperatorComponentAccess().getOperatorComponentKeyword_1());
            		
            // InternalModness.g:2852:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:2853:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:2853:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:2854:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getOperatorComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:2875:3: (otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModness.g:2876:4: otherlv_4= 'function' ( (lv_function_5_0= ruleFunction ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperatorComponentAccess().getFunctionKeyword_4_0());
                    			
                    // InternalModness.g:2880:4: ( (lv_function_5_0= ruleFunction ) )
                    // InternalModness.g:2881:5: (lv_function_5_0= ruleFunction )
                    {
                    // InternalModness.g:2881:5: (lv_function_5_0= ruleFunction )
                    // InternalModness.g:2882:6: lv_function_5_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getOperatorComponentAccess().getFunctionFunctionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_75);
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

            // InternalModness.g:2900:3: (otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModness.g:2901:4: otherlv_6= 'operationvalue' ( (lv_operationvalue_7_0= ruleOperationValue ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_76); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperatorComponentAccess().getOperationvalueKeyword_5_0());
                    			
                    // InternalModness.g:2905:4: ( (lv_operationvalue_7_0= ruleOperationValue ) )
                    // InternalModness.g:2906:5: (lv_operationvalue_7_0= ruleOperationValue )
                    {
                    // InternalModness.g:2906:5: (lv_operationvalue_7_0= ruleOperationValue )
                    // InternalModness.g:2907:6: lv_operationvalue_7_0= ruleOperationValue
                    {

                    						newCompositeNode(grammarAccess.getOperatorComponentAccess().getOperationvalueOperationValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2933:1: entryRuleOperationValue returns [EObject current=null] : iv_ruleOperationValue= ruleOperationValue EOF ;
    public final EObject entryRuleOperationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationValue = null;


        try {
            // InternalModness.g:2933:55: (iv_ruleOperationValue= ruleOperationValue EOF )
            // InternalModness.g:2934:2: iv_ruleOperationValue= ruleOperationValue EOF
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
    // InternalModness.g:2940:1: ruleOperationValue returns [EObject current=null] : (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) ;
    public final EObject ruleOperationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2946:2: ( (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) )
            // InternalModness.g:2947:2: (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            {
            // InternalModness.g:2947:2: (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            // InternalModness.g:2948:3: otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationValueAccess().getOperationValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationValueAccess().getValueKeyword_2());
            		
            // InternalModness.g:2960:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalModness.g:2961:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalModness.g:2961:4: (lv_value_3_0= ruleEFloat )
            // InternalModness.g:2962:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getOperationValueAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:2987:1: entryRuleLogicalCondition returns [EObject current=null] : iv_ruleLogicalCondition= ruleLogicalCondition EOF ;
    public final EObject entryRuleLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCondition = null;


        try {
            // InternalModness.g:2987:57: (iv_ruleLogicalCondition= ruleLogicalCondition EOF )
            // InternalModness.g:2988:2: iv_ruleLogicalCondition= ruleLogicalCondition EOF
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
    // InternalModness.g:2994:1: ruleLogicalCondition returns [EObject current=null] : ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' ) ;
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
            // InternalModness.g:3000:2: ( ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' ) )
            // InternalModness.g:3001:2: ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' )
            {
            // InternalModness.g:3001:2: ( () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}' )
            // InternalModness.g:3002:3: () otherlv_1= 'LogicalCondition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( ( ruleEString ) ) )? (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )? (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )? otherlv_10= '}'
            {
            // InternalModness.g:3002:3: ()
            // InternalModness.g:3003:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicalConditionAccess().getLogicalConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicalConditionAccess().getLogicalConditionKeyword_1());
            		
            // InternalModness.g:3013:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3014:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3014:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3015:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalConditionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:3036:3: (otherlv_4= 'value' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModness.g:3037:4: otherlv_4= 'value' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalConditionAccess().getValueKeyword_4_0());
                    			
                    // InternalModness.g:3041:4: ( ( ruleEString ) )
                    // InternalModness.g:3042:5: ( ruleEString )
                    {
                    // InternalModness.g:3042:5: ( ruleEString )
                    // InternalModness.g:3043:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getValueVariableValueCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:3058:3: (otherlv_6= 'sensitivegroup' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==82) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalModness.g:3059:4: otherlv_6= 'sensitivegroup' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalConditionAccess().getSensitivegroupKeyword_5_0());
                    			
                    // InternalModness.g:3063:4: ( ( ruleEString ) )
                    // InternalModness.g:3064:5: ( ruleEString )
                    {
                    // InternalModness.g:3064:5: ( ruleEString )
                    // InternalModness.g:3065:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getSensitivegroupDatasetSensitiveGroupCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:3080:3: (otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==83) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModness.g:3081:4: otherlv_8= 'sublogicalcondition' ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_80); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalConditionAccess().getSublogicalconditionKeyword_6_0());
                    			
                    // InternalModness.g:3085:4: ( (lv_sublogicalcondition_9_0= ruleSubLogicalCondition ) )
                    // InternalModness.g:3086:5: (lv_sublogicalcondition_9_0= ruleSubLogicalCondition )
                    {
                    // InternalModness.g:3086:5: (lv_sublogicalcondition_9_0= ruleSubLogicalCondition )
                    // InternalModness.g:3087:6: lv_sublogicalcondition_9_0= ruleSubLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getSublogicalconditionSubLogicalConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:3113:1: entryRuleSubLogicalCondition returns [EObject current=null] : iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF ;
    public final EObject entryRuleSubLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubLogicalCondition = null;


        try {
            // InternalModness.g:3113:60: (iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF )
            // InternalModness.g:3114:2: iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF
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
    // InternalModness.g:3120:1: ruleSubLogicalCondition returns [EObject current=null] : (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' ) ;
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
            // InternalModness.g:3126:2: ( (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' ) )
            // InternalModness.g:3127:2: (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' )
            {
            // InternalModness.g:3127:2: (otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}' )
            // InternalModness.g:3128:3: otherlv_0= 'SubLogicalCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'logicalOperator' ( (lv_logicalOperator_4_0= ruleLogicalOperator ) ) otherlv_5= 'logicalcondition' ( (lv_logicalcondition_6_0= ruleLogicalCondition ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubLogicalConditionAccess().getSubLogicalConditionKeyword_0());
            		
            // InternalModness.g:3132:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:3133:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:3133:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:3134:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getSubLogicalConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,85,FOLLOW_82); 

            			newLeafNode(otherlv_3, grammarAccess.getSubLogicalConditionAccess().getLogicalOperatorKeyword_3());
            		
            // InternalModness.g:3159:3: ( (lv_logicalOperator_4_0= ruleLogicalOperator ) )
            // InternalModness.g:3160:4: (lv_logicalOperator_4_0= ruleLogicalOperator )
            {
            // InternalModness.g:3160:4: (lv_logicalOperator_4_0= ruleLogicalOperator )
            // InternalModness.g:3161:5: lv_logicalOperator_4_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getLogicalOperatorLogicalOperatorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_83);
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

            otherlv_5=(Token)match(input,86,FOLLOW_63); 

            			newLeafNode(otherlv_5, grammarAccess.getSubLogicalConditionAccess().getLogicalconditionKeyword_5());
            		
            // InternalModness.g:3182:3: ( (lv_logicalcondition_6_0= ruleLogicalCondition ) )
            // InternalModness.g:3183:4: (lv_logicalcondition_6_0= ruleLogicalCondition )
            {
            // InternalModness.g:3183:4: (lv_logicalcondition_6_0= ruleLogicalCondition )
            // InternalModness.g:3184:5: lv_logicalcondition_6_0= ruleLogicalCondition
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getLogicalconditionLogicalConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:3209:1: entryRuleVariableValue_Impl returns [EObject current=null] : iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF ;
    public final EObject entryRuleVariableValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue_Impl = null;


        try {
            // InternalModness.g:3209:59: (iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF )
            // InternalModness.g:3210:2: iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF
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
    // InternalModness.g:3216:1: ruleVariableValue_Impl returns [EObject current=null] : ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' ) ;
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
            // InternalModness.g:3222:2: ( ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' ) )
            // InternalModness.g:3223:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' )
            {
            // InternalModness.g:3223:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}' )
            // InternalModness.g:3224:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'VariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'operator' ( (lv_operator_5_0= ruleEqualityOperator ) ) otherlv_6= '}'
            {
            // InternalModness.g:3224:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==87) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModness.g:3225:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3225:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3226:5: lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_0_0=(Token)match(input,87,FOLLOW_84); 

                    					newLeafNode(lv_relativeToDatasetSize_0_0, grammarAccess.getVariableValue_ImplAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableValue_ImplRule());
                    					}
                    					setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_0_0 != null, "relativeToDatasetSize");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableValue_ImplAccess().getVariableValueKeyword_1());
            		
            // InternalModness.g:3242:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3243:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3243:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3244:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableValue_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableValue_ImplAccess().getOperatorKeyword_4());
            		
            // InternalModness.g:3269:3: ( (lv_operator_5_0= ruleEqualityOperator ) )
            // InternalModness.g:3270:4: (lv_operator_5_0= ruleEqualityOperator )
            {
            // InternalModness.g:3270:4: (lv_operator_5_0= ruleEqualityOperator )
            // InternalModness.g:3271:5: lv_operator_5_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getVariableValue_ImplAccess().getOperatorEqualityOperatorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:3296:1: entryRuleDatasetPositiveOutcome returns [EObject current=null] : iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF ;
    public final EObject entryRuleDatasetPositiveOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetPositiveOutcome = null;


        try {
            // InternalModness.g:3296:63: (iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF )
            // InternalModness.g:3297:2: iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF
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
    // InternalModness.g:3303:1: ruleDatasetPositiveOutcome returns [EObject current=null] : ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetPositiveOutcome' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingPositiveOutcome' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' ) ;
    public final EObject ruleDatasetPositiveOutcome() throws RecognitionException {
        EObject current = null;

        Token lv_relativeToDatasetSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operator_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3309:2: ( ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetPositiveOutcome' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingPositiveOutcome' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' ) )
            // InternalModness.g:3310:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetPositiveOutcome' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingPositiveOutcome' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' )
            {
            // InternalModness.g:3310:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetPositiveOutcome' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingPositiveOutcome' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' )
            // InternalModness.g:3311:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetPositiveOutcome' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingPositiveOutcome' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}'
            {
            // InternalModness.g:3311:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==87) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModness.g:3312:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3312:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3313:5: lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_0_0=(Token)match(input,87,FOLLOW_85); 

                    					newLeafNode(lv_relativeToDatasetSize_0_0, grammarAccess.getDatasetPositiveOutcomeAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatasetPositiveOutcomeRule());
                    					}
                    					setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_0_0 != null, "relativeToDatasetSize");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetPositiveOutcomeAccess().getDatasetPositiveOutcomeKeyword_1());
            		
            // InternalModness.g:3329:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3330:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3330:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3331:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_86); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetPositiveOutcomeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetPositiveOutcomeAccess().getMappingPositiveOutcomeKeyword_4());
            		
            // InternalModness.g:3356:3: ( ( ruleEString ) )
            // InternalModness.g:3357:4: ( ruleEString )
            {
            // InternalModness.g:3357:4: ( ruleEString )
            // InternalModness.g:3358:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getMappingPositiveOutcomePositiveOutcomeCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasetPositiveOutcomeAccess().getOperatorKeyword_6());
            		
            // InternalModness.g:3376:3: ( (lv_operator_7_0= ruleEqualityOperator ) )
            // InternalModness.g:3377:4: (lv_operator_7_0= ruleEqualityOperator )
            {
            // InternalModness.g:3377:4: (lv_operator_7_0= ruleEqualityOperator )
            // InternalModness.g:3378:5: lv_operator_7_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getOperatorEqualityOperatorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_operator_7_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_7_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetPositiveOutcomeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalModness.g:3403:1: entryRuleDatasetSensitiveVariableValue returns [EObject current=null] : iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF ;
    public final EObject entryRuleDatasetSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveVariableValue = null;


        try {
            // InternalModness.g:3403:70: (iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF )
            // InternalModness.g:3404:2: iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF
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
    // InternalModness.g:3410:1: ruleDatasetSensitiveVariableValue returns [EObject current=null] : ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetSensitiveVariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingValue' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' ) ;
    public final EObject ruleDatasetSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        Token lv_relativeToDatasetSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operator_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3416:2: ( ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetSensitiveVariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingValue' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' ) )
            // InternalModness.g:3417:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetSensitiveVariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingValue' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' )
            {
            // InternalModness.g:3417:2: ( ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetSensitiveVariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingValue' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}' )
            // InternalModness.g:3418:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )? otherlv_1= 'DatasetSensitiveVariableValue' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'mappingValue' ( ( ruleEString ) ) otherlv_6= 'operator' ( (lv_operator_7_0= ruleEqualityOperator ) ) otherlv_8= '}'
            {
            // InternalModness.g:3418:3: ( (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==87) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModness.g:3419:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3419:4: (lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3420:5: lv_relativeToDatasetSize_0_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_0_0=(Token)match(input,87,FOLLOW_87); 

                    					newLeafNode(lv_relativeToDatasetSize_0_0, grammarAccess.getDatasetSensitiveVariableValueAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatasetSensitiveVariableValueRule());
                    					}
                    					setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_0_0 != null, "relativeToDatasetSize");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveVariableValueAccess().getDatasetSensitiveVariableValueKeyword_1());
            		
            // InternalModness.g:3436:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3437:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3437:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3438:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetSensitiveVariableValueAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveVariableValueAccess().getMappingValueKeyword_4());
            		
            // InternalModness.g:3463:3: ( ( ruleEString ) )
            // InternalModness.g:3464:4: ( ruleEString )
            {
            // InternalModness.g:3464:4: ( ruleEString )
            // InternalModness.g:3465:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getMappingValueSensitiveVariableValueCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasetSensitiveVariableValueAccess().getOperatorKeyword_6());
            		
            // InternalModness.g:3483:3: ( (lv_operator_7_0= ruleEqualityOperator ) )
            // InternalModness.g:3484:4: (lv_operator_7_0= ruleEqualityOperator )
            {
            // InternalModness.g:3484:4: (lv_operator_7_0= ruleEqualityOperator )
            // InternalModness.g:3485:5: lv_operator_7_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getOperatorEqualityOperatorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_operator_7_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_7_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveVariableValueAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalModness.g:3510:1: entryRuleOtherVariable returns [EObject current=null] : iv_ruleOtherVariable= ruleOtherVariable EOF ;
    public final EObject entryRuleOtherVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherVariable = null;


        try {
            // InternalModness.g:3510:54: (iv_ruleOtherVariable= ruleOtherVariable EOF )
            // InternalModness.g:3511:2: iv_ruleOtherVariable= ruleOtherVariable EOF
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
    // InternalModness.g:3517:1: ruleOtherVariable returns [EObject current=null] : ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalModness.g:3523:2: ( ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalModness.g:3524:2: ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalModness.g:3524:2: ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalModness.g:3525:3: () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalModness.g:3525:3: ()
            // InternalModness.g:3526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOtherVariableAccess().getOtherVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherVariableAccess().getOtherVariableKeyword_1());
            		
            // InternalModness.g:3536:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3537:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3537:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3538:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:3559:3: (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==94) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalModness.g:3560:4: otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOtherVariableAccess().getOthervariablevalueKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_90); 

                    				newLeafNode(otherlv_5, grammarAccess.getOtherVariableAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalModness.g:3568:4: ( (lv_othervariablevalue_6_0= ruleVariableValue ) )
                    // InternalModness.g:3569:5: (lv_othervariablevalue_6_0= ruleVariableValue )
                    {
                    // InternalModness.g:3569:5: (lv_othervariablevalue_6_0= ruleVariableValue )
                    // InternalModness.g:3570:6: lv_othervariablevalue_6_0= ruleVariableValue
                    {

                    						newCompositeNode(grammarAccess.getOtherVariableAccess().getOthervariablevalueVariableValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalModness.g:3587:4: (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==15) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalModness.g:3588:5: otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_90); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOtherVariableAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalModness.g:3592:5: ( (lv_othervariablevalue_8_0= ruleVariableValue ) )
                    	    // InternalModness.g:3593:6: (lv_othervariablevalue_8_0= ruleVariableValue )
                    	    {
                    	    // InternalModness.g:3593:6: (lv_othervariablevalue_8_0= ruleVariableValue )
                    	    // InternalModness.g:3594:7: lv_othervariablevalue_8_0= ruleVariableValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherVariableAccess().getOthervariablevalueVariableValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_9=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getOtherVariableAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

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
    // InternalModness.g:3625:1: entryRuleDatasetSensitiveVariable returns [EObject current=null] : iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF ;
    public final EObject entryRuleDatasetSensitiveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveVariable = null;


        try {
            // InternalModness.g:3625:65: (iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF )
            // InternalModness.g:3626:2: iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF
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
    // InternalModness.g:3632:1: ruleDatasetSensitiveVariable returns [EObject current=null] : (otherlv_0= 'DatasetSensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mappingSensitiveVariable' ( ( ruleEString ) ) otherlv_5= 'datasetsensitivevariablevalue' otherlv_6= '{' ( (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleDatasetSensitiveVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_datasetsensitivevariablevalue_7_0 = null;

        EObject lv_datasetsensitivevariablevalue_9_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3638:2: ( (otherlv_0= 'DatasetSensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mappingSensitiveVariable' ( ( ruleEString ) ) otherlv_5= 'datasetsensitivevariablevalue' otherlv_6= '{' ( (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalModness.g:3639:2: (otherlv_0= 'DatasetSensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mappingSensitiveVariable' ( ( ruleEString ) ) otherlv_5= 'datasetsensitivevariablevalue' otherlv_6= '{' ( (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalModness.g:3639:2: (otherlv_0= 'DatasetSensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mappingSensitiveVariable' ( ( ruleEString ) ) otherlv_5= 'datasetsensitivevariablevalue' otherlv_6= '{' ( (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalModness.g:3640:3: otherlv_0= 'DatasetSensitiveVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mappingSensitiveVariable' ( ( ruleEString ) ) otherlv_5= 'datasetsensitivevariablevalue' otherlv_6= '{' ( (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveVariableAccess().getDatasetSensitiveVariableKeyword_0());
            		
            // InternalModness.g:3644:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:3645:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:3645:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:3646:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_91); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSensitiveVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetSensitiveVariableAccess().getMappingSensitiveVariableKeyword_3());
            		
            // InternalModness.g:3671:3: ( ( ruleEString ) )
            // InternalModness.g:3672:4: ( ruleEString )
            {
            // InternalModness.g:3672:4: ( ruleEString )
            // InternalModness.g:3673:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getMappingSensitiveVariableSensitiveVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_92);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,97,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_90); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasetSensitiveVariableAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalModness.g:3695:3: ( (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue ) )
            // InternalModness.g:3696:4: (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue )
            {
            // InternalModness.g:3696:4: (lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue )
            // InternalModness.g:3697:5: lv_datasetsensitivevariablevalue_7_0= ruleDatasetSensitiveVariableValue
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueDatasetSensitiveVariableValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_datasetsensitivevariablevalue_7_0=ruleDatasetSensitiveVariableValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            					add(
            						current,
            						"datasetsensitivevariablevalue",
            						lv_datasetsensitivevariablevalue_7_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveVariableValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:3714:3: (otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==15) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModness.g:3715:4: otherlv_8= ',' ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_90); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveVariableAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalModness.g:3719:4: ( (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue ) )
            	    // InternalModness.g:3720:5: (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue )
            	    {
            	    // InternalModness.g:3720:5: (lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue )
            	    // InternalModness.g:3721:6: lv_datasetsensitivevariablevalue_9_0= ruleDatasetSensitiveVariableValue
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueDatasetSensitiveVariableValueParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_datasetsensitivevariablevalue_9_0=ruleDatasetSensitiveVariableValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatasetSensitiveVariableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetsensitivevariablevalue",
            	    							lv_datasetsensitivevariablevalue_9_0,
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

            otherlv_10=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getDatasetSensitiveVariableAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDatasetSensitiveVariableAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalModness.g:3751:1: ruleBiasSource returns [Enumerator current=null] : ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) ) ;
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
            // InternalModness.g:3757:2: ( ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) ) )
            // InternalModness.g:3758:2: ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) )
            {
            // InternalModness.g:3758:2: ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) )
            int alt43=12;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt43=1;
                }
                break;
            case 99:
                {
                alt43=2;
                }
                break;
            case 100:
                {
                alt43=3;
                }
                break;
            case 101:
                {
                alt43=4;
                }
                break;
            case 102:
                {
                alt43=5;
                }
                break;
            case 103:
                {
                alt43=6;
                }
                break;
            case 104:
                {
                alt43=7;
                }
                break;
            case 105:
                {
                alt43=8;
                }
                break;
            case 106:
                {
                alt43=9;
                }
                break;
            case 107:
                {
                alt43=10;
                }
                break;
            case 108:
                {
                alt43=11;
                }
                break;
            case 109:
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
                    // InternalModness.g:3759:3: (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' )
                    {
                    // InternalModness.g:3759:3: (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' )
                    // InternalModness.g:3760:4: enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_ALGORITHM_BEHAVIOUREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBiasSourceAccess().getWRONG_ALGORITHM_BEHAVIOUREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3767:3: (enumLiteral_1= 'HUMAN_DISCRIMINATION' )
                    {
                    // InternalModness.g:3767:3: (enumLiteral_1= 'HUMAN_DISCRIMINATION' )
                    // InternalModness.g:3768:4: enumLiteral_1= 'HUMAN_DISCRIMINATION'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getHUMAN_DISCRIMINATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBiasSourceAccess().getHUMAN_DISCRIMINATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3775:3: (enumLiteral_2= 'WRONG_MEASUREMENT' )
                    {
                    // InternalModness.g:3775:3: (enumLiteral_2= 'WRONG_MEASUREMENT' )
                    // InternalModness.g:3776:4: enumLiteral_2= 'WRONG_MEASUREMENT'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_MEASUREMENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBiasSourceAccess().getWRONG_MEASUREMENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3783:3: (enumLiteral_3= 'OMITTED_VARIABLE' )
                    {
                    // InternalModness.g:3783:3: (enumLiteral_3= 'OMITTED_VARIABLE' )
                    // InternalModness.g:3784:4: enumLiteral_3= 'OMITTED_VARIABLE'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getOMITTED_VARIABLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBiasSourceAccess().getOMITTED_VARIABLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3791:3: (enumLiteral_4= 'WRONG_SAMPLING' )
                    {
                    // InternalModness.g:3791:3: (enumLiteral_4= 'WRONG_SAMPLING' )
                    // InternalModness.g:3792:4: enumLiteral_4= 'WRONG_SAMPLING'
                    {
                    enumLiteral_4=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SAMPLINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBiasSourceAccess().getWRONG_SAMPLINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3799:3: (enumLiteral_5= 'WRONG_AGGREGATION' )
                    {
                    // InternalModness.g:3799:3: (enumLiteral_5= 'WRONG_AGGREGATION' )
                    // InternalModness.g:3800:4: enumLiteral_5= 'WRONG_AGGREGATION'
                    {
                    enumLiteral_5=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_AGGREGATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBiasSourceAccess().getWRONG_AGGREGATIONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModness.g:3807:3: (enumLiteral_6= 'WRONG_LINKING' )
                    {
                    // InternalModness.g:3807:3: (enumLiteral_6= 'WRONG_LINKING' )
                    // InternalModness.g:3808:4: enumLiteral_6= 'WRONG_LINKING'
                    {
                    enumLiteral_6=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_LINKINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBiasSourceAccess().getWRONG_LINKINGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModness.g:3815:3: (enumLiteral_7= 'WRONG_PRESENTATION' )
                    {
                    // InternalModness.g:3815:3: (enumLiteral_7= 'WRONG_PRESENTATION' )
                    // InternalModness.g:3816:4: enumLiteral_7= 'WRONG_PRESENTATION'
                    {
                    enumLiteral_7=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_PRESENTATIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBiasSourceAccess().getWRONG_PRESENTATIONEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalModness.g:3823:3: (enumLiteral_8= 'RESULT_RANKING' )
                    {
                    // InternalModness.g:3823:3: (enumLiteral_8= 'RESULT_RANKING' )
                    // InternalModness.g:3824:4: enumLiteral_8= 'RESULT_RANKING'
                    {
                    enumLiteral_8=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getRESULT_RANKINGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBiasSourceAccess().getRESULT_RANKINGEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalModness.g:3831:3: (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' )
                    {
                    // InternalModness.g:3831:3: (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' )
                    // InternalModness.g:3832:4: enumLiteral_9= 'WRONG_SYSTEM_EVALUATION'
                    {
                    enumLiteral_9=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_EVALUATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_EVALUATIONEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalModness.g:3839:3: (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' )
                    {
                    // InternalModness.g:3839:3: (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' )
                    // InternalModness.g:3840:4: enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION'
                    {
                    enumLiteral_10=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_TARGET_POPULATIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_TARGET_POPULATIONEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalModness.g:3847:3: (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' )
                    {
                    // InternalModness.g:3847:3: (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' )
                    // InternalModness.g:3848:4: enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION'
                    {
                    enumLiteral_11=(Token)match(input,109,FOLLOW_2); 

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
    // InternalModness.g:3858:1: ruleSingleOperatorParameter returns [Enumerator current=null] : ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) ) ;
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
            // InternalModness.g:3864:2: ( ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) ) )
            // InternalModness.g:3865:2: ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) )
            {
            // InternalModness.g:3865:2: ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt44=1;
                }
                break;
            case 111:
                {
                alt44=2;
                }
                break;
            case 112:
                {
                alt44=3;
                }
                break;
            case 113:
                {
                alt44=4;
                }
                break;
            case 114:
                {
                alt44=5;
                }
                break;
            case 115:
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
                    // InternalModness.g:3866:3: (enumLiteral_0= 'EQUAL' )
                    {
                    // InternalModness.g:3866:3: (enumLiteral_0= 'EQUAL' )
                    // InternalModness.g:3867:4: enumLiteral_0= 'EQUAL'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingleOperatorParameterAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3874:3: (enumLiteral_1= 'GREATER' )
                    {
                    // InternalModness.g:3874:3: (enumLiteral_1= 'GREATER' )
                    // InternalModness.g:3875:4: enumLiteral_1= 'GREATER'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingleOperatorParameterAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3882:3: (enumLiteral_2= 'MINOR' )
                    {
                    // InternalModness.g:3882:3: (enumLiteral_2= 'MINOR' )
                    // InternalModness.g:3883:4: enumLiteral_2= 'MINOR'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getMINOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingleOperatorParameterAccess().getMINOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3890:3: (enumLiteral_3= 'GREATER_EQUAL' )
                    {
                    // InternalModness.g:3890:3: (enumLiteral_3= 'GREATER_EQUAL' )
                    // InternalModness.g:3891:4: enumLiteral_3= 'GREATER_EQUAL'
                    {
                    enumLiteral_3=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getGREATER_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSingleOperatorParameterAccess().getGREATER_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3898:3: (enumLiteral_4= 'MINOR_EQUAL' )
                    {
                    // InternalModness.g:3898:3: (enumLiteral_4= 'MINOR_EQUAL' )
                    // InternalModness.g:3899:4: enumLiteral_4= 'MINOR_EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getMINOR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSingleOperatorParameterAccess().getMINOR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3906:3: (enumLiteral_5= 'NOT_EQUAL' )
                    {
                    // InternalModness.g:3906:3: (enumLiteral_5= 'NOT_EQUAL' )
                    // InternalModness.g:3907:4: enumLiteral_5= 'NOT_EQUAL'
                    {
                    enumLiteral_5=(Token)match(input,115,FOLLOW_2); 

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
    // InternalModness.g:3917:1: ruleRangeOperatorParameter returns [Enumerator current=null] : ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) ) ;
    public final Enumerator ruleRangeOperatorParameter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModness.g:3923:2: ( ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) ) )
            // InternalModness.g:3924:2: ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) )
            {
            // InternalModness.g:3924:2: ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt45=1;
                }
                break;
            case 117:
                {
                alt45=2;
                }
                break;
            case 118:
                {
                alt45=3;
                }
                break;
            case 119:
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
                    // InternalModness.g:3925:3: (enumLiteral_0= 'IN_INCLUDED' )
                    {
                    // InternalModness.g:3925:3: (enumLiteral_0= 'IN_INCLUDED' )
                    // InternalModness.g:3926:4: enumLiteral_0= 'IN_INCLUDED'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_INCLUDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRangeOperatorParameterAccess().getIN_INCLUDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3933:3: (enumLiteral_1= 'IN_EXCLUDED' )
                    {
                    // InternalModness.g:3933:3: (enumLiteral_1= 'IN_EXCLUDED' )
                    // InternalModness.g:3934:4: enumLiteral_1= 'IN_EXCLUDED'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_EXCLUDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRangeOperatorParameterAccess().getIN_EXCLUDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3941:3: (enumLiteral_2= 'IN_LOWER_INCLUDED' )
                    {
                    // InternalModness.g:3941:3: (enumLiteral_2= 'IN_LOWER_INCLUDED' )
                    // InternalModness.g:3942:4: enumLiteral_2= 'IN_LOWER_INCLUDED'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_LOWER_INCLUDEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRangeOperatorParameterAccess().getIN_LOWER_INCLUDEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3949:3: (enumLiteral_3= 'IN_GREATER_INCLUDED' )
                    {
                    // InternalModness.g:3949:3: (enumLiteral_3= 'IN_GREATER_INCLUDED' )
                    // InternalModness.g:3950:4: enumLiteral_3= 'IN_GREATER_INCLUDED'
                    {
                    enumLiteral_3=(Token)match(input,119,FOLLOW_2); 

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
    // InternalModness.g:3960:1: ruleArithmeticOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModness.g:3966:2: ( ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) ) )
            // InternalModness.g:3967:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) )
            {
            // InternalModness.g:3967:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt46=1;
                }
                break;
            case 121:
                {
                alt46=2;
                }
                break;
            case 122:
                {
                alt46=3;
                }
                break;
            case 123:
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
                    // InternalModness.g:3968:3: (enumLiteral_0= 'SUM' )
                    {
                    // InternalModness.g:3968:3: (enumLiteral_0= 'SUM' )
                    // InternalModness.g:3969:4: enumLiteral_0= 'SUM'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getSUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperatorAccess().getSUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3976:3: (enumLiteral_1= 'DIFFERENCE' )
                    {
                    // InternalModness.g:3976:3: (enumLiteral_1= 'DIFFERENCE' )
                    // InternalModness.g:3977:4: enumLiteral_1= 'DIFFERENCE'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getDIFFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperatorAccess().getDIFFERENCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3984:3: (enumLiteral_2= 'MULTIPLICATION' )
                    {
                    // InternalModness.g:3984:3: (enumLiteral_2= 'MULTIPLICATION' )
                    // InternalModness.g:3985:4: enumLiteral_2= 'MULTIPLICATION'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3992:3: (enumLiteral_3= 'RATIO' )
                    {
                    // InternalModness.g:3992:3: (enumLiteral_3= 'RATIO' )
                    // InternalModness.g:3993:4: enumLiteral_3= 'RATIO'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_2); 

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
    // InternalModness.g:4003:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalModness.g:4009:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalModness.g:4010:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalModness.g:4010:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==124) ) {
                alt47=1;
            }
            else if ( (LA47_0==125) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalModness.g:4011:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalModness.g:4011:3: (enumLiteral_0= 'AND' )
                    // InternalModness.g:4012:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:4019:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalModness.g:4019:3: (enumLiteral_1= 'OR' )
                    // InternalModness.g:4020:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

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
    // InternalModness.g:4030:1: ruleGroupFairnessMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) ) ;
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
            // InternalModness.g:4036:2: ( ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) ) )
            // InternalModness.g:4037:2: ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) )
            {
            // InternalModness.g:4037:2: ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt48=1;
                }
                break;
            case 127:
                {
                alt48=2;
                }
                break;
            case 128:
                {
                alt48=3;
                }
                break;
            case 129:
                {
                alt48=4;
                }
                break;
            case 130:
                {
                alt48=5;
                }
                break;
            case 131:
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
                    // InternalModness.g:4038:3: (enumLiteral_0= 'STATISTICAL_PARITY' )
                    {
                    // InternalModness.g:4038:3: (enumLiteral_0= 'STATISTICAL_PARITY' )
                    // InternalModness.g:4039:4: enumLiteral_0= 'STATISTICAL_PARITY'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getSTATISTICAL_PARITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGroupFairnessMetricAccess().getSTATISTICAL_PARITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:4046:3: (enumLiteral_1= 'DISPARATE_IMPACT' )
                    {
                    // InternalModness.g:4046:3: (enumLiteral_1= 'DISPARATE_IMPACT' )
                    // InternalModness.g:4047:4: enumLiteral_1= 'DISPARATE_IMPACT'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getDISPARATE_IMPACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGroupFairnessMetricAccess().getDISPARATE_IMPACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:4054:3: (enumLiteral_2= 'EQUALIZED_ODDS' )
                    {
                    // InternalModness.g:4054:3: (enumLiteral_2= 'EQUALIZED_ODDS' )
                    // InternalModness.g:4055:4: enumLiteral_2= 'EQUALIZED_ODDS'
                    {
                    enumLiteral_2=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getEQUALIZED_ODDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGroupFairnessMetricAccess().getEQUALIZED_ODDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:4062:3: (enumLiteral_3= 'EQUAL_ACCURACY' )
                    {
                    // InternalModness.g:4062:3: (enumLiteral_3= 'EQUAL_ACCURACY' )
                    // InternalModness.g:4063:4: enumLiteral_3= 'EQUAL_ACCURACY'
                    {
                    enumLiteral_3=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getEQUAL_ACCURACYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGroupFairnessMetricAccess().getEQUAL_ACCURACYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:4070:3: (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' )
                    {
                    // InternalModness.g:4070:3: (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' )
                    // InternalModness.g:4071:4: enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE'
                    {
                    enumLiteral_4=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getFALSE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getGroupFairnessMetricAccess().getFALSE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:4078:3: (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' )
                    {
                    // InternalModness.g:4078:3: (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' )
                    // InternalModness.g:4079:4: enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE'
                    {
                    enumLiteral_5=(Token)match(input,131,FOLLOW_2); 

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
    // InternalModness.g:4089:1: ruleIndividualFairnessMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) ) ;
    public final Enumerator ruleIndividualFairnessMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalModness.g:4095:2: ( ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) ) )
            // InternalModness.g:4096:2: ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) )
            {
            // InternalModness.g:4096:2: ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt49=1;
                }
                break;
            case 133:
                {
                alt49=2;
                }
                break;
            case 134:
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
                    // InternalModness.g:4097:3: (enumLiteral_0= 'MANHATTAN_DISTANCE' )
                    {
                    // InternalModness.g:4097:3: (enumLiteral_0= 'MANHATTAN_DISTANCE' )
                    // InternalModness.g:4098:4: enumLiteral_0= 'MANHATTAN_DISTANCE'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getMANHATTAN_DISTANCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIndividualFairnessMetricAccess().getMANHATTAN_DISTANCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:4105:3: (enumLiteral_1= 'EUCLIDEAN_DISTANCE' )
                    {
                    // InternalModness.g:4105:3: (enumLiteral_1= 'EUCLIDEAN_DISTANCE' )
                    // InternalModness.g:4106:4: enumLiteral_1= 'EUCLIDEAN_DISTANCE'
                    {
                    enumLiteral_1=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIndividualFairnessMetricAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:4113:3: (enumLiteral_2= 'MAHALANOBIS_DISTANCE' )
                    {
                    // InternalModness.g:4113:3: (enumLiteral_2= 'MAHALANOBIS_DISTANCE' )
                    // InternalModness.g:4114:4: enumLiteral_2= 'MAHALANOBIS_DISTANCE'
                    {
                    enumLiteral_2=(Token)match(input,134,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00003FFC00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2200000000000000L,0x0000000000003165L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x000FC00000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000010000010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000002010000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000010000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000010000L,0x0000000000080000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000010000L,0x0000000040000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x000000000B800000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GroupBias'", "'{'", "'highLevelDefinition:'", "'domain:'", "';'", "'source:'", "','", "'sensitiveVariables:'", "'};'", "'positiveOutcome:'", "'unprivilegedGroup:'", "'privilegedGroup:'", "'analysis:'", "'}'", "'SensitiveVariable{'", "'name:'", "'values:'", "'SensitiveGroup'", "'sensitiveValue:'", "'GroupAnalysis'", "'scope:'", "'dataset:'", "'datasetUnprivilegedGroup:'", "'datasetPrivilegedGroup:'", "'metric:'", "'Metric'", "'toleranceValue:'", "'function:'", "'optimalValue:'", "'Dataset'", "'groundTruthLabelName:'", "'predictedLabelName:'", "'filePath:'", "'otherVariable:'", "'datasetSentiveVariable:'", "'id:'", "'mappingGroup:'", "'('", "');'", "'-'", "'.'", "'E'", "'e'", "'operator:'", "'value:'", "'lowerValue:'", "'greaterValue:'", "'Operation'", "'arithmeticOperator:'", "'leftSide:'", "'rightSide:'", "'Probability'", "'object'", "'condition'", "'ExpectedValue'", "'columnName'", "'GroupSize'", "'variable:'", "'groupCondition:'", "'DatasetSize'", "'Logaritm'", "'operatorcomponent'", "'Summation'", "'startRange'", "'endRange'", "'body'", "'ExistingGroupFairnessMetric'", "'ExistingIndividualFairnessMetric'", "'operationValue:'", "'OperationValue'", "'sensitiveGroup:'", "'relativeToDatasetSize'", "'mappingOutcome:'", "'SensitiveVariableValue'", "'mappingValue:'", "'OtherVariable'", "'othervariablevalue'", "'DatasetSensitiveVariable'", "'mappingSensitiveVariable:'", "'WRONG_ALGORITHM_BEHAVIOUR'", "'HUMAN_DISCRIMINATION'", "'WRONG_MEASUREMENT'", "'OMITTED_VARIABLE'", "'WRONG_SAMPLING'", "'WRONG_AGGREGATION'", "'WRONG_LINKING'", "'WRONG_PRESENTATION'", "'RESULT_RANKING'", "'WRONG_SYSTEM_EVALUATION'", "'WRONG_SYSTEM_TARGET_POPULATION'", "'CHANGE_IN_TARGET_POPULATION'", "'EQUAL'", "'GREATER'", "'MINOR'", "'GREATER_EQUAL'", "'MINOR_EQUAL'", "'NOT_EQUAL'", "'IN_INCLUDED'", "'IN_EXCLUDED'", "'IN_LOWER_INCLUDED'", "'IN_GREATER_INCLUDED'", "'SUM'", "'DIFFERENCE'", "'MULTIPLICATION'", "'RATIO'", "'AND'", "'OR'", "'STATISTICAL_PARITY'", "'DISPARATE_IMPACT'", "'EQUALIZED_ODDS'", "'EQUAL_ACCURACY'", "'FALSE_POSITIVE_DIFFERENCE'", "'TRUE_POSITIVE_DIFFERENCE'", "'MANHATTAN_DISTANCE'", "'EUCLIDEAN_DISTANCE'", "'MAHALANOBIS_DISTANCE'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
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
    // InternalModness.g:72:1: ruleGroupBias returns [EObject current=null] : (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'highLevelDefinition:' otherlv_4= '{' otherlv_5= 'domain:' ( (lv_domain_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'source:' ( (lv_source_9_0= ruleBiasSource ) ) (otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) ) )* otherlv_12= ';' otherlv_13= 'sensitiveVariables:' otherlv_14= '{' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) (otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) ) )* otherlv_18= '};' otherlv_19= 'positiveOutcome:' ( (lv_positiveOutcome_20_0= rulePositiveOutcome ) ) otherlv_21= ';' otherlv_22= 'unprivilegedGroup:' otherlv_23= '{' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) (otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) ) )* otherlv_27= '};' otherlv_28= 'privilegedGroup:' otherlv_29= '{' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) (otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) ) )* otherlv_33= '};' otherlv_34= '};' otherlv_35= 'analysis:' otherlv_36= '{' ( (lv_analysis_37_0= ruleGroupAnalysis ) ) (otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) ) )* otherlv_40= '};' otherlv_41= '}' ) ;
    public final EObject ruleGroupBias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_domain_6_0 = null;

        Enumerator lv_source_9_0 = null;

        Enumerator lv_source_11_0 = null;

        EObject lv_sensitiveVariables_15_0 = null;

        EObject lv_sensitiveVariables_17_0 = null;

        EObject lv_positiveOutcome_20_0 = null;

        EObject lv_unprivilegedGroup_24_0 = null;

        EObject lv_unprivilegedGroup_26_0 = null;

        EObject lv_privilegedGroup_30_0 = null;

        EObject lv_privilegedGroup_32_0 = null;

        EObject lv_analysis_37_0 = null;

        EObject lv_analysis_39_0 = null;



        	enterRule();

        try {
            // InternalModness.g:78:2: ( (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'highLevelDefinition:' otherlv_4= '{' otherlv_5= 'domain:' ( (lv_domain_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'source:' ( (lv_source_9_0= ruleBiasSource ) ) (otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) ) )* otherlv_12= ';' otherlv_13= 'sensitiveVariables:' otherlv_14= '{' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) (otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) ) )* otherlv_18= '};' otherlv_19= 'positiveOutcome:' ( (lv_positiveOutcome_20_0= rulePositiveOutcome ) ) otherlv_21= ';' otherlv_22= 'unprivilegedGroup:' otherlv_23= '{' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) (otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) ) )* otherlv_27= '};' otherlv_28= 'privilegedGroup:' otherlv_29= '{' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) (otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) ) )* otherlv_33= '};' otherlv_34= '};' otherlv_35= 'analysis:' otherlv_36= '{' ( (lv_analysis_37_0= ruleGroupAnalysis ) ) (otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) ) )* otherlv_40= '};' otherlv_41= '}' ) )
            // InternalModness.g:79:2: (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'highLevelDefinition:' otherlv_4= '{' otherlv_5= 'domain:' ( (lv_domain_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'source:' ( (lv_source_9_0= ruleBiasSource ) ) (otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) ) )* otherlv_12= ';' otherlv_13= 'sensitiveVariables:' otherlv_14= '{' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) (otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) ) )* otherlv_18= '};' otherlv_19= 'positiveOutcome:' ( (lv_positiveOutcome_20_0= rulePositiveOutcome ) ) otherlv_21= ';' otherlv_22= 'unprivilegedGroup:' otherlv_23= '{' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) (otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) ) )* otherlv_27= '};' otherlv_28= 'privilegedGroup:' otherlv_29= '{' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) (otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) ) )* otherlv_33= '};' otherlv_34= '};' otherlv_35= 'analysis:' otherlv_36= '{' ( (lv_analysis_37_0= ruleGroupAnalysis ) ) (otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) ) )* otherlv_40= '};' otherlv_41= '}' )
            {
            // InternalModness.g:79:2: (otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'highLevelDefinition:' otherlv_4= '{' otherlv_5= 'domain:' ( (lv_domain_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'source:' ( (lv_source_9_0= ruleBiasSource ) ) (otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) ) )* otherlv_12= ';' otherlv_13= 'sensitiveVariables:' otherlv_14= '{' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) (otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) ) )* otherlv_18= '};' otherlv_19= 'positiveOutcome:' ( (lv_positiveOutcome_20_0= rulePositiveOutcome ) ) otherlv_21= ';' otherlv_22= 'unprivilegedGroup:' otherlv_23= '{' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) (otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) ) )* otherlv_27= '};' otherlv_28= 'privilegedGroup:' otherlv_29= '{' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) (otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) ) )* otherlv_33= '};' otherlv_34= '};' otherlv_35= 'analysis:' otherlv_36= '{' ( (lv_analysis_37_0= ruleGroupAnalysis ) ) (otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) ) )* otherlv_40= '};' otherlv_41= '}' )
            // InternalModness.g:80:3: otherlv_0= 'GroupBias' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'highLevelDefinition:' otherlv_4= '{' otherlv_5= 'domain:' ( (lv_domain_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'source:' ( (lv_source_9_0= ruleBiasSource ) ) (otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) ) )* otherlv_12= ';' otherlv_13= 'sensitiveVariables:' otherlv_14= '{' ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) ) (otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) ) )* otherlv_18= '};' otherlv_19= 'positiveOutcome:' ( (lv_positiveOutcome_20_0= rulePositiveOutcome ) ) otherlv_21= ';' otherlv_22= 'unprivilegedGroup:' otherlv_23= '{' ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) ) (otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) ) )* otherlv_27= '};' otherlv_28= 'privilegedGroup:' otherlv_29= '{' ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) ) (otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) ) )* otherlv_33= '};' otherlv_34= '};' otherlv_35= 'analysis:' otherlv_36= '{' ( (lv_analysis_37_0= ruleGroupAnalysis ) ) (otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) ) )* otherlv_40= '};' otherlv_41= '}'
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupBiasAccess().getHighLevelDefinitionKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupBiasAccess().getDomainKeyword_5());
            		
            // InternalModness.g:119:3: ( (lv_domain_6_0= ruleEString ) )
            // InternalModness.g:120:4: (lv_domain_6_0= ruleEString )
            {
            // InternalModness.g:120:4: (lv_domain_6_0= ruleEString )
            // InternalModness.g:121:5: lv_domain_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getDomainEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_domain_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_6_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupBiasAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupBiasAccess().getSourceKeyword_8());
            		
            // InternalModness.g:146:3: ( (lv_source_9_0= ruleBiasSource ) )
            // InternalModness.g:147:4: (lv_source_9_0= ruleBiasSource )
            {
            // InternalModness.g:147:4: (lv_source_9_0= ruleBiasSource )
            // InternalModness.g:148:5: lv_source_9_0= ruleBiasSource
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getSourceBiasSourceEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalModness.g:165:3: (otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModness.g:166:4: otherlv_10= ',' ( (lv_source_11_0= ruleBiasSource ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getGroupBiasAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalModness.g:170:4: ( (lv_source_11_0= ruleBiasSource ) )
            	    // InternalModness.g:171:5: (lv_source_11_0= ruleBiasSource )
            	    {
            	    // InternalModness.g:171:5: (lv_source_11_0= ruleBiasSource )
            	    // InternalModness.g:172:6: lv_source_11_0= ruleBiasSource
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getSourceBiasSourceEnumRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_source_11_0=ruleBiasSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"source",
            	    							lv_source_11_0,
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

            otherlv_12=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupBiasAccess().getSemicolonKeyword_11());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getGroupBiasAccess().getSensitiveVariablesKeyword_12());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalModness.g:202:3: ( (lv_sensitiveVariables_15_0= ruleSensitiveVariable ) )
            // InternalModness.g:203:4: (lv_sensitiveVariables_15_0= ruleSensitiveVariable )
            {
            // InternalModness.g:203:4: (lv_sensitiveVariables_15_0= ruleSensitiveVariable )
            // InternalModness.g:204:5: lv_sensitiveVariables_15_0= ruleSensitiveVariable
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getSensitiveVariablesSensitiveVariableParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalModness.g:221:3: (otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModness.g:222:4: otherlv_16= ',' ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) )
            	    {
            	    otherlv_16=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_16, grammarAccess.getGroupBiasAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalModness.g:226:4: ( (lv_sensitiveVariables_17_0= ruleSensitiveVariable ) )
            	    // InternalModness.g:227:5: (lv_sensitiveVariables_17_0= ruleSensitiveVariable )
            	    {
            	    // InternalModness.g:227:5: (lv_sensitiveVariables_17_0= ruleSensitiveVariable )
            	    // InternalModness.g:228:6: lv_sensitiveVariables_17_0= ruleSensitiveVariable
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getSensitiveVariablesSensitiveVariableParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_sensitiveVariables_17_0=ruleSensitiveVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensitiveVariables",
            	    							lv_sensitiveVariables_17_0,
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

            otherlv_18=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_16());
            		
            otherlv_19=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getGroupBiasAccess().getPositiveOutcomeKeyword_17());
            		
            // InternalModness.g:254:3: ( (lv_positiveOutcome_20_0= rulePositiveOutcome ) )
            // InternalModness.g:255:4: (lv_positiveOutcome_20_0= rulePositiveOutcome )
            {
            // InternalModness.g:255:4: (lv_positiveOutcome_20_0= rulePositiveOutcome )
            // InternalModness.g:256:5: lv_positiveOutcome_20_0= rulePositiveOutcome
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getPositiveOutcomePositiveOutcomeParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_7);
            lv_positiveOutcome_20_0=rulePositiveOutcome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					set(
            						current,
            						"positiveOutcome",
            						lv_positiveOutcome_20_0,
            						"org.xtext.example.modness.Modness.PositiveOutcome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_21, grammarAccess.getGroupBiasAccess().getSemicolonKeyword_19());
            		
            otherlv_22=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getGroupBiasAccess().getUnprivilegedGroupKeyword_20());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_23, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_21());
            		
            // InternalModness.g:285:3: ( (lv_unprivilegedGroup_24_0= ruleSensitiveGroup ) )
            // InternalModness.g:286:4: (lv_unprivilegedGroup_24_0= ruleSensitiveGroup )
            {
            // InternalModness.g:286:4: (lv_unprivilegedGroup_24_0= ruleSensitiveGroup )
            // InternalModness.g:287:5: lv_unprivilegedGroup_24_0= ruleSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getUnprivilegedGroupSensitiveGroupParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalModness.g:304:3: (otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModness.g:305:4: otherlv_25= ',' ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) )
            	    {
            	    otherlv_25=(Token)match(input,17,FOLLOW_16); 

            	    				newLeafNode(otherlv_25, grammarAccess.getGroupBiasAccess().getCommaKeyword_23_0());
            	    			
            	    // InternalModness.g:309:4: ( (lv_unprivilegedGroup_26_0= ruleSensitiveGroup ) )
            	    // InternalModness.g:310:5: (lv_unprivilegedGroup_26_0= ruleSensitiveGroup )
            	    {
            	    // InternalModness.g:310:5: (lv_unprivilegedGroup_26_0= ruleSensitiveGroup )
            	    // InternalModness.g:311:6: lv_unprivilegedGroup_26_0= ruleSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getUnprivilegedGroupSensitiveGroupParserRuleCall_23_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_unprivilegedGroup_26_0=ruleSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"unprivilegedGroup",
            	    							lv_unprivilegedGroup_26_0,
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

            otherlv_27=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_27, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_24());
            		
            otherlv_28=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getGroupBiasAccess().getPrivilegedGroupKeyword_25());
            		
            otherlv_29=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_29, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_26());
            		
            // InternalModness.g:341:3: ( (lv_privilegedGroup_30_0= ruleSensitiveGroup ) )
            // InternalModness.g:342:4: (lv_privilegedGroup_30_0= ruleSensitiveGroup )
            {
            // InternalModness.g:342:4: (lv_privilegedGroup_30_0= ruleSensitiveGroup )
            // InternalModness.g:343:5: lv_privilegedGroup_30_0= ruleSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getPrivilegedGroupSensitiveGroupParserRuleCall_27_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalModness.g:360:3: (otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalModness.g:361:4: otherlv_31= ',' ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) )
            	    {
            	    otherlv_31=(Token)match(input,17,FOLLOW_16); 

            	    				newLeafNode(otherlv_31, grammarAccess.getGroupBiasAccess().getCommaKeyword_28_0());
            	    			
            	    // InternalModness.g:365:4: ( (lv_privilegedGroup_32_0= ruleSensitiveGroup ) )
            	    // InternalModness.g:366:5: (lv_privilegedGroup_32_0= ruleSensitiveGroup )
            	    {
            	    // InternalModness.g:366:5: (lv_privilegedGroup_32_0= ruleSensitiveGroup )
            	    // InternalModness.g:367:6: lv_privilegedGroup_32_0= ruleSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getPrivilegedGroupSensitiveGroupParserRuleCall_28_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_privilegedGroup_32_0=ruleSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"privilegedGroup",
            	    							lv_privilegedGroup_32_0,
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

            otherlv_33=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_33, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_29());
            		
            otherlv_34=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_34, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_30());
            		
            otherlv_35=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_35, grammarAccess.getGroupBiasAccess().getAnalysisKeyword_31());
            		
            otherlv_36=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_36, grammarAccess.getGroupBiasAccess().getLeftCurlyBracketKeyword_32());
            		
            // InternalModness.g:401:3: ( (lv_analysis_37_0= ruleGroupAnalysis ) )
            // InternalModness.g:402:4: (lv_analysis_37_0= ruleGroupAnalysis )
            {
            // InternalModness.g:402:4: (lv_analysis_37_0= ruleGroupAnalysis )
            // InternalModness.g:403:5: lv_analysis_37_0= ruleGroupAnalysis
            {

            					newCompositeNode(grammarAccess.getGroupBiasAccess().getAnalysisGroupAnalysisParserRuleCall_33_0());
            				
            pushFollow(FOLLOW_13);
            lv_analysis_37_0=ruleGroupAnalysis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            					}
            					add(
            						current,
            						"analysis",
            						lv_analysis_37_0,
            						"org.xtext.example.modness.Modness.GroupAnalysis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:420:3: (otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalModness.g:421:4: otherlv_38= ',' ( (lv_analysis_39_0= ruleGroupAnalysis ) )
            	    {
            	    otherlv_38=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_38, grammarAccess.getGroupBiasAccess().getCommaKeyword_34_0());
            	    			
            	    // InternalModness.g:425:4: ( (lv_analysis_39_0= ruleGroupAnalysis ) )
            	    // InternalModness.g:426:5: (lv_analysis_39_0= ruleGroupAnalysis )
            	    {
            	    // InternalModness.g:426:5: (lv_analysis_39_0= ruleGroupAnalysis )
            	    // InternalModness.g:427:6: lv_analysis_39_0= ruleGroupAnalysis
            	    {

            	    						newCompositeNode(grammarAccess.getGroupBiasAccess().getAnalysisGroupAnalysisParserRuleCall_34_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_analysis_39_0=ruleGroupAnalysis();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupBiasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"analysis",
            	    							lv_analysis_39_0,
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

            otherlv_40=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_40, grammarAccess.getGroupBiasAccess().getRightCurlyBracketSemicolonKeyword_35());
            		
            otherlv_41=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getGroupBiasAccess().getRightCurlyBracketKeyword_36());
            		

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
    // InternalModness.g:457:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // InternalModness.g:457:57: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalModness.g:458:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalModness.g:464:1: ruleEqualityOperator returns [EObject current=null] : (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject this_SingleOperator_0 = null;

        EObject this_RangeOperator_1 = null;



        	enterRule();

        try {
            // InternalModness.g:470:2: ( (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator ) )
            // InternalModness.g:471:2: (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator )
            {
            // InternalModness.g:471:2: (this_SingleOperator_0= ruleSingleOperator | this_RangeOperator_1= ruleRangeOperator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==54) ) {
                    int LA6_2 = input.LA(3);

                    if ( ((LA6_2>=108 && LA6_2<=111)) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_2>=102 && LA6_2<=107)) ) {
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
                    // InternalModness.g:472:3: this_SingleOperator_0= ruleSingleOperator
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
                    // InternalModness.g:481:3: this_RangeOperator_1= ruleRangeOperator
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
    // InternalModness.g:493:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalModness.g:493:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalModness.g:494:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalModness.g:500:1: ruleFunction returns [EObject current=null] : (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric ) ;
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
            // InternalModness.g:506:2: ( (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric ) )
            // InternalModness.g:507:2: (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric )
            {
            // InternalModness.g:507:2: (this_Operation_0= ruleOperation | this_Probability_1= ruleProbability | this_ExpectedValue_2= ruleExpectedValue | this_GroupSize_3= ruleGroupSize | this_DatasetSize_4= ruleDatasetSize | this_Logaritm_5= ruleLogaritm | this_Summation_6= ruleSummation | this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric | this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt7=1;
                }
                break;
            case 62:
                {
                alt7=2;
                }
                break;
            case 65:
                {
                alt7=3;
                }
                break;
            case 67:
                {
                alt7=4;
                }
                break;
            case 70:
                {
                alt7=5;
                }
                break;
            case 71:
                {
                alt7=6;
                }
                break;
            case 73:
                {
                alt7=7;
                }
                break;
            case 77:
                {
                alt7=8;
                }
                break;
            case 78:
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
                    // InternalModness.g:508:3: this_Operation_0= ruleOperation
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
                    // InternalModness.g:517:3: this_Probability_1= ruleProbability
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
                    // InternalModness.g:526:3: this_ExpectedValue_2= ruleExpectedValue
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
                    // InternalModness.g:535:3: this_GroupSize_3= ruleGroupSize
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
                    // InternalModness.g:544:3: this_DatasetSize_4= ruleDatasetSize
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
                    // InternalModness.g:553:3: this_Logaritm_5= ruleLogaritm
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
                    // InternalModness.g:562:3: this_Summation_6= ruleSummation
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
                    // InternalModness.g:571:3: this_ExistingGroupFairnessMetric_7= ruleExistingGroupFairnessMetric
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
                    // InternalModness.g:580:3: this_ExistingIndividualFairnessMetric_8= ruleExistingIndividualFairnessMetric
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
    // InternalModness.g:592:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // InternalModness.g:592:54: (iv_ruleVariableValue= ruleVariableValue EOF )
            // InternalModness.g:593:2: iv_ruleVariableValue= ruleVariableValue EOF
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
    // InternalModness.g:599:1: ruleVariableValue returns [EObject current=null] : (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject this_VariableValue_Impl_0 = null;

        EObject this_DatasetPositiveOutcome_1 = null;

        EObject this_DatasetSensitiveVariableValue_2 = null;



        	enterRule();

        try {
            // InternalModness.g:605:2: ( (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue ) )
            // InternalModness.g:606:2: (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue )
            {
            // InternalModness.g:606:2: (this_VariableValue_Impl_0= ruleVariableValue_Impl | this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome | this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==54) ) {
                    alt8=1;
                }
                else if ( (LA8_1==46) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==84) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalModness.g:607:3: this_VariableValue_Impl_0= ruleVariableValue_Impl
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
                    // InternalModness.g:616:3: this_DatasetPositiveOutcome_1= ruleDatasetPositiveOutcome
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
                    // InternalModness.g:625:3: this_DatasetSensitiveVariableValue_2= ruleDatasetSensitiveVariableValue
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
    // InternalModness.g:637:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModness.g:637:47: (iv_ruleEString= ruleEString EOF )
            // InternalModness.g:638:2: iv_ruleEString= ruleEString EOF
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
    // InternalModness.g:644:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModness.g:650:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModness.g:651:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModness.g:651:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalModness.g:652:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModness.g:660:3: this_ID_1= RULE_ID
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
    // InternalModness.g:671:1: entryRuleSensitiveVariable returns [EObject current=null] : iv_ruleSensitiveVariable= ruleSensitiveVariable EOF ;
    public final EObject entryRuleSensitiveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveVariable = null;


        try {
            // InternalModness.g:671:58: (iv_ruleSensitiveVariable= ruleSensitiveVariable EOF )
            // InternalModness.g:672:2: iv_ruleSensitiveVariable= ruleSensitiveVariable EOF
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
    // InternalModness.g:678:1: ruleSensitiveVariable returns [EObject current=null] : (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' ) ;
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
            // InternalModness.g:684:2: ( (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' ) )
            // InternalModness.g:685:2: (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' )
            {
            // InternalModness.g:685:2: (otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}' )
            // InternalModness.g:686:3: otherlv_0= 'SensitiveVariable{' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'values:' ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) ) (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )* otherlv_8= ';' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveVariableAccess().getSensitiveVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensitiveVariableAccess().getNameKeyword_1());
            		
            // InternalModness.g:694:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:695:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:695:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:696:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getSensitiveVariableAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveVariableAccess().getValuesKeyword_4());
            		
            // InternalModness.g:721:3: ( (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue ) )
            // InternalModness.g:722:4: (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue )
            {
            // InternalModness.g:722:4: (lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue )
            // InternalModness.g:723:5: lv_sensitiveVariableValue_5_0= ruleSensitiveVariableValue
            {

            					newCompositeNode(grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueSensitiveVariableValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalModness.g:740:3: (otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModness.g:741:4: otherlv_6= ',' ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSensitiveVariableAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalModness.g:745:4: ( (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue ) )
            	    // InternalModness.g:746:5: (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue )
            	    {
            	    // InternalModness.g:746:5: (lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue )
            	    // InternalModness.g:747:6: lv_sensitiveVariableValue_7_0= ruleSensitiveVariableValue
            	    {

            	    						newCompositeNode(grammarAccess.getSensitiveVariableAccess().getSensitiveVariableValueSensitiveVariableValueParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            otherlv_8=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getSensitiveVariableAccess().getSemicolonKeyword_7());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:777:1: entryRulePositiveOutcome returns [EObject current=null] : iv_rulePositiveOutcome= rulePositiveOutcome EOF ;
    public final EObject entryRulePositiveOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveOutcome = null;


        try {
            // InternalModness.g:777:56: (iv_rulePositiveOutcome= rulePositiveOutcome EOF )
            // InternalModness.g:778:2: iv_rulePositiveOutcome= rulePositiveOutcome EOF
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
    // InternalModness.g:784:1: rulePositiveOutcome returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject rulePositiveOutcome() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalModness.g:790:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalModness.g:791:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalModness.g:791:2: ( (lv_name_0_0= ruleEString ) )
            // InternalModness.g:792:3: (lv_name_0_0= ruleEString )
            {
            // InternalModness.g:792:3: (lv_name_0_0= ruleEString )
            // InternalModness.g:793:4: lv_name_0_0= ruleEString
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
    // InternalModness.g:813:1: entryRuleSensitiveGroup returns [EObject current=null] : iv_ruleSensitiveGroup= ruleSensitiveGroup EOF ;
    public final EObject entryRuleSensitiveGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveGroup = null;


        try {
            // InternalModness.g:813:55: (iv_ruleSensitiveGroup= ruleSensitiveGroup EOF )
            // InternalModness.g:814:2: iv_ruleSensitiveGroup= ruleSensitiveGroup EOF
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
    // InternalModness.g:820:1: ruleSensitiveGroup returns [EObject current=null] : (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' ) ;
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
            // InternalModness.g:826:2: ( (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' ) )
            // InternalModness.g:827:2: (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' )
            {
            // InternalModness.g:827:2: (otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};' )
            // InternalModness.g:828:3: otherlv_0= 'SensitiveGroup' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'sensitiveValue:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ';' otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensitiveGroupAccess().getSensitiveGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSensitiveGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSensitiveGroupAccess().getNameKeyword_2());
            		
            // InternalModness.g:840:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:841:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:841:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:842:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensitiveGroupAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getSensitiveGroupAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSensitiveGroupAccess().getSensitiveValueKeyword_5());
            		
            // InternalModness.g:867:3: ( ( ruleEString ) )
            // InternalModness.g:868:4: ( ruleEString )
            {
            // InternalModness.g:868:4: ( ruleEString )
            // InternalModness.g:869:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensitiveGroupAccess().getSensitiveValueSensitiveVariableValueCrossReference_6_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:883:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModness.g:884:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSensitiveGroupAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalModness.g:888:4: ( ( ruleEString ) )
            	    // InternalModness.g:889:5: ( ruleEString )
            	    {
            	    // InternalModness.g:889:5: ( ruleEString )
            	    // InternalModness.g:890:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensitiveGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSensitiveGroupAccess().getSensitiveValueSensitiveVariableValueCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            otherlv_9=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getSensitiveGroupAccess().getSemicolonKeyword_8());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:917:1: entryRuleGroupAnalysis returns [EObject current=null] : iv_ruleGroupAnalysis= ruleGroupAnalysis EOF ;
    public final EObject entryRuleGroupAnalysis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupAnalysis = null;


        try {
            // InternalModness.g:917:54: (iv_ruleGroupAnalysis= ruleGroupAnalysis EOF )
            // InternalModness.g:918:2: iv_ruleGroupAnalysis= ruleGroupAnalysis EOF
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
    // InternalModness.g:924:1: ruleGroupAnalysis returns [EObject current=null] : (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'dataset:' otherlv_6= '{' ( (lv_dataset_7_0= ruleDataset ) ) (otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) ) )* otherlv_10= '};' otherlv_11= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup ) ) (otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) ) )* otherlv_15= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup ) ) (otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) )* otherlv_19= 'metric:' otherlv_20= '{' ( (lv_metric_21_0= ruleMetric ) ) (otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) ) )* otherlv_24= '};' otherlv_25= '};' ) ;
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
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_scope_3_0 = null;

        EObject lv_dataset_7_0 = null;

        EObject lv_dataset_9_0 = null;

        EObject lv_datasetUnprivilegedGroup_12_0 = null;

        EObject lv_datasetUnprivilegedGroup_14_0 = null;

        EObject lv_datasetPrivilegedGroup_16_0 = null;

        EObject lv_datasetPrivilegedGroup_18_0 = null;

        EObject lv_metric_21_0 = null;

        EObject lv_metric_23_0 = null;



        	enterRule();

        try {
            // InternalModness.g:930:2: ( (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'dataset:' otherlv_6= '{' ( (lv_dataset_7_0= ruleDataset ) ) (otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) ) )* otherlv_10= '};' otherlv_11= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup ) ) (otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) ) )* otherlv_15= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup ) ) (otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) )* otherlv_19= 'metric:' otherlv_20= '{' ( (lv_metric_21_0= ruleMetric ) ) (otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) ) )* otherlv_24= '};' otherlv_25= '};' ) )
            // InternalModness.g:931:2: (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'dataset:' otherlv_6= '{' ( (lv_dataset_7_0= ruleDataset ) ) (otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) ) )* otherlv_10= '};' otherlv_11= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup ) ) (otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) ) )* otherlv_15= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup ) ) (otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) )* otherlv_19= 'metric:' otherlv_20= '{' ( (lv_metric_21_0= ruleMetric ) ) (otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) ) )* otherlv_24= '};' otherlv_25= '};' )
            {
            // InternalModness.g:931:2: (otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'dataset:' otherlv_6= '{' ( (lv_dataset_7_0= ruleDataset ) ) (otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) ) )* otherlv_10= '};' otherlv_11= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup ) ) (otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) ) )* otherlv_15= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup ) ) (otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) )* otherlv_19= 'metric:' otherlv_20= '{' ( (lv_metric_21_0= ruleMetric ) ) (otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) ) )* otherlv_24= '};' otherlv_25= '};' )
            // InternalModness.g:932:3: otherlv_0= 'GroupAnalysis' otherlv_1= '{' (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )? otherlv_4= ';' otherlv_5= 'dataset:' otherlv_6= '{' ( (lv_dataset_7_0= ruleDataset ) ) (otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) ) )* otherlv_10= '};' otherlv_11= 'datasetUnprivilegedGroup:' ( (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup ) ) (otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) ) )* otherlv_15= 'datasetPrivilegedGroup:' ( (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup ) ) (otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) )* otherlv_19= 'metric:' otherlv_20= '{' ( (lv_metric_21_0= ruleMetric ) ) (otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) ) )* otherlv_24= '};' otherlv_25= '};'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAnalysisAccess().getGroupAnalysisKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalModness.g:940:3: (otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModness.g:941:4: otherlv_2= 'scope:' ( (lv_scope_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGroupAnalysisAccess().getScopeKeyword_2_0());
                    			
                    // InternalModness.g:945:4: ( (lv_scope_3_0= ruleEString ) )
                    // InternalModness.g:946:5: (lv_scope_3_0= ruleEString )
                    {
                    // InternalModness.g:946:5: (lv_scope_3_0= ruleEString )
                    // InternalModness.g:947:6: lv_scope_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getScopeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAnalysisAccess().getSemicolonKeyword_3());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAnalysisAccess().getDatasetKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalModness.g:977:3: ( (lv_dataset_7_0= ruleDataset ) )
            // InternalModness.g:978:4: (lv_dataset_7_0= ruleDataset )
            {
            // InternalModness.g:978:4: (lv_dataset_7_0= ruleDataset )
            // InternalModness.g:979:5: lv_dataset_7_0= ruleDataset
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetDatasetParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_dataset_7_0=ruleDataset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"dataset",
            						lv_dataset_7_0,
            						"org.xtext.example.modness.Modness.Dataset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:996:3: (otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModness.g:997:4: otherlv_8= ',' ( (lv_dataset_9_0= ruleDataset ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalModness.g:1001:4: ( (lv_dataset_9_0= ruleDataset ) )
            	    // InternalModness.g:1002:5: (lv_dataset_9_0= ruleDataset )
            	    {
            	    // InternalModness.g:1002:5: (lv_dataset_9_0= ruleDataset )
            	    // InternalModness.g:1003:6: lv_dataset_9_0= ruleDataset
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetDatasetParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_dataset_9_0=ruleDataset();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataset",
            	    							lv_dataset_9_0,
            	    							"org.xtext.example.modness.Modness.Dataset");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketSemicolonKeyword_8());
            		
            otherlv_11=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupKeyword_9());
            		
            // InternalModness.g:1029:3: ( (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup ) )
            // InternalModness.g:1030:4: (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup )
            {
            // InternalModness.g:1030:4: (lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup )
            // InternalModness.g:1031:5: lv_datasetUnprivilegedGroup_12_0= ruleDatasetSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupDatasetSensitiveGroupParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_29);
            lv_datasetUnprivilegedGroup_12_0=ruleDatasetSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"datasetUnprivilegedGroup",
            						lv_datasetUnprivilegedGroup_12_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1048:3: (otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalModness.g:1049:4: otherlv_13= ',' ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) )
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_13, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalModness.g:1053:4: ( (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup ) )
            	    // InternalModness.g:1054:5: (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup )
            	    {
            	    // InternalModness.g:1054:5: (lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup )
            	    // InternalModness.g:1055:6: lv_datasetUnprivilegedGroup_14_0= ruleDatasetSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetUnprivilegedGroupDatasetSensitiveGroupParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_datasetUnprivilegedGroup_14_0=ruleDatasetSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetUnprivilegedGroup",
            	    							lv_datasetUnprivilegedGroup_14_0,
            	    							"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_15=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupKeyword_12());
            		
            // InternalModness.g:1077:3: ( (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup ) )
            // InternalModness.g:1078:4: (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup )
            {
            // InternalModness.g:1078:4: (lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup )
            // InternalModness.g:1079:5: lv_datasetPrivilegedGroup_16_0= ruleDatasetSensitiveGroup
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupDatasetSensitiveGroupParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_30);
            lv_datasetPrivilegedGroup_16_0=ruleDatasetSensitiveGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"datasetPrivilegedGroup",
            						lv_datasetPrivilegedGroup_16_0,
            						"org.xtext.example.modness.Modness.DatasetSensitiveGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1096:3: (otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalModness.g:1097:4: otherlv_17= ',' ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) )
            	    {
            	    otherlv_17=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_17, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalModness.g:1101:4: ( (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup ) )
            	    // InternalModness.g:1102:5: (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup )
            	    {
            	    // InternalModness.g:1102:5: (lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup )
            	    // InternalModness.g:1103:6: lv_datasetPrivilegedGroup_18_0= ruleDatasetSensitiveGroup
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getDatasetPrivilegedGroupDatasetSensitiveGroupParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_datasetPrivilegedGroup_18_0=ruleDatasetSensitiveGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"datasetPrivilegedGroup",
            	    							lv_datasetPrivilegedGroup_18_0,
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

            otherlv_19=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getGroupAnalysisAccess().getMetricKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_20, grammarAccess.getGroupAnalysisAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalModness.g:1129:3: ( (lv_metric_21_0= ruleMetric ) )
            // InternalModness.g:1130:4: (lv_metric_21_0= ruleMetric )
            {
            // InternalModness.g:1130:4: (lv_metric_21_0= ruleMetric )
            // InternalModness.g:1131:5: lv_metric_21_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getGroupAnalysisAccess().getMetricMetricParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_13);
            lv_metric_21_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            					}
            					add(
            						current,
            						"metric",
            						lv_metric_21_0,
            						"org.xtext.example.modness.Modness.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1148:3: (otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalModness.g:1149:4: otherlv_22= ',' ( (lv_metric_23_0= ruleMetric ) )
            	    {
            	    otherlv_22=(Token)match(input,17,FOLLOW_31); 

            	    				newLeafNode(otherlv_22, grammarAccess.getGroupAnalysisAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalModness.g:1153:4: ( (lv_metric_23_0= ruleMetric ) )
            	    // InternalModness.g:1154:5: (lv_metric_23_0= ruleMetric )
            	    {
            	    // InternalModness.g:1154:5: (lv_metric_23_0= ruleMetric )
            	    // InternalModness.g:1155:6: lv_metric_23_0= ruleMetric
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAnalysisAccess().getMetricMetricParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_metric_23_0=ruleMetric();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupAnalysisRule());
            	    						}
            	    						add(
            	    							current,
            	    							"metric",
            	    							lv_metric_23_0,
            	    							"org.xtext.example.modness.Modness.Metric");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_24=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_24, grammarAccess.getGroupAnalysisAccess().getRightCurlyBracketSemicolonKeyword_19());
            		
            otherlv_25=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:1185:1: entryRuleSensitiveVariableValue returns [EObject current=null] : iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF ;
    public final EObject entryRuleSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensitiveVariableValue = null;


        try {
            // InternalModness.g:1185:63: (iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF )
            // InternalModness.g:1186:2: iv_ruleSensitiveVariableValue= ruleSensitiveVariableValue EOF
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
    // InternalModness.g:1192:1: ruleSensitiveVariableValue returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1198:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalModness.g:1199:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalModness.g:1199:2: ( (lv_name_0_0= ruleEString ) )
            // InternalModness.g:1200:3: (lv_name_0_0= ruleEString )
            {
            // InternalModness.g:1200:3: (lv_name_0_0= ruleEString )
            // InternalModness.g:1201:4: lv_name_0_0= ruleEString
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
    // InternalModness.g:1221:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalModness.g:1221:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalModness.g:1222:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalModness.g:1228:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'function:' ( (lv_function_9_0= ruleFunction ) ) otherlv_10= 'optimalValue:' ( (lv_operator_11_0= ruleEqualityOperator ) ) otherlv_12= '};' ) ;
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

        EObject lv_function_9_0 = null;

        EObject lv_operator_11_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1234:2: ( (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'function:' ( (lv_function_9_0= ruleFunction ) ) otherlv_10= 'optimalValue:' ( (lv_operator_11_0= ruleEqualityOperator ) ) otherlv_12= '};' ) )
            // InternalModness.g:1235:2: (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'function:' ( (lv_function_9_0= ruleFunction ) ) otherlv_10= 'optimalValue:' ( (lv_operator_11_0= ruleEqualityOperator ) ) otherlv_12= '};' )
            {
            // InternalModness.g:1235:2: (otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'function:' ( (lv_function_9_0= ruleFunction ) ) otherlv_10= 'optimalValue:' ( (lv_operator_11_0= ruleEqualityOperator ) ) otherlv_12= '};' )
            // InternalModness.g:1236:3: otherlv_0= 'Metric' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'toleranceValue:' ( (lv_toleranceValue_6_0= ruleEFloat ) ) otherlv_7= ';' otherlv_8= 'function:' ( (lv_function_9_0= ruleFunction ) ) otherlv_10= 'optimalValue:' ( (lv_operator_11_0= ruleEqualityOperator ) ) otherlv_12= '};'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMetricAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getNameKeyword_2());
            		
            // InternalModness.g:1248:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:1249:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:1249:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:1250:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getMetricAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getMetricAccess().getToleranceValueKeyword_5());
            		
            // InternalModness.g:1275:3: ( (lv_toleranceValue_6_0= ruleEFloat ) )
            // InternalModness.g:1276:4: (lv_toleranceValue_6_0= ruleEFloat )
            {
            // InternalModness.g:1276:4: (lv_toleranceValue_6_0= ruleEFloat )
            // InternalModness.g:1277:5: lv_toleranceValue_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getToleranceValueEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_7=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getMetricAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getMetricAccess().getFunctionKeyword_8());
            		
            // InternalModness.g:1302:3: ( (lv_function_9_0= ruleFunction ) )
            // InternalModness.g:1303:4: (lv_function_9_0= ruleFunction )
            {
            // InternalModness.g:1303:4: (lv_function_9_0= ruleFunction )
            // InternalModness.g:1304:5: lv_function_9_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getFunctionFunctionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_36);
            lv_function_9_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_9_0,
            						"org.xtext.example.modness.Modness.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getMetricAccess().getOptimalValueKeyword_10());
            		
            // InternalModness.g:1325:3: ( (lv_operator_11_0= ruleEqualityOperator ) )
            // InternalModness.g:1326:4: (lv_operator_11_0= ruleEqualityOperator )
            {
            // InternalModness.g:1326:4: (lv_operator_11_0= ruleEqualityOperator )
            // InternalModness.g:1327:5: lv_operator_11_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getOperatorEqualityOperatorParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_18);
            lv_operator_11_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_11_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:1352:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalModness.g:1352:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalModness.g:1353:2: iv_ruleDataset= ruleDataset EOF
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
    // InternalModness.g:1359:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' ) ;
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
            // InternalModness.g:1365:2: ( (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' ) )
            // InternalModness.g:1366:2: (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' )
            {
            // InternalModness.g:1366:2: (otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}' )
            // InternalModness.g:1367:3: otherlv_0= 'Dataset' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )? (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )? otherlv_11= 'filePath:' ( (lv_filePath_12_0= ruleEString ) ) otherlv_13= ';' (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )? otherlv_20= 'positiveOutcome:' ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) ) otherlv_22= 'datasetSentiveVariable:' otherlv_23= '{' ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) ) (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )* otherlv_27= '};' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDatasetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetAccess().getNameKeyword_2());
            		
            // InternalModness.g:1379:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:1380:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:1380:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:1381:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetAccess().getSemicolonKeyword_4());
            		
            // InternalModness.g:1402:3: (otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModness.g:1403:4: otherlv_5= 'groundTruthLabelName:' ( (lv_groundTruthLabelName_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDatasetAccess().getGroundTruthLabelNameKeyword_5_0());
                    			
                    // InternalModness.g:1407:4: ( (lv_groundTruthLabelName_6_0= ruleEString ) )
                    // InternalModness.g:1408:5: (lv_groundTruthLabelName_6_0= ruleEString )
                    {
                    // InternalModness.g:1408:5: (lv_groundTruthLabelName_6_0= ruleEString )
                    // InternalModness.g:1409:6: lv_groundTruthLabelName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getGroundTruthLabelNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getDatasetAccess().getSemicolonKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalModness.g:1431:3: (otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModness.g:1432:4: otherlv_8= 'predictedLabelName:' ( (lv_predictedLabelName_9_0= ruleEString ) ) otherlv_10= ';'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDatasetAccess().getPredictedLabelNameKeyword_6_0());
                    			
                    // InternalModness.g:1436:4: ( (lv_predictedLabelName_9_0= ruleEString ) )
                    // InternalModness.g:1437:5: (lv_predictedLabelName_9_0= ruleEString )
                    {
                    // InternalModness.g:1437:5: (lv_predictedLabelName_9_0= ruleEString )
                    // InternalModness.g:1438:6: lv_predictedLabelName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getPredictedLabelNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    otherlv_10=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getDatasetAccess().getSemicolonKeyword_6_2());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getDatasetAccess().getFilePathKeyword_7());
            		
            // InternalModness.g:1464:3: ( (lv_filePath_12_0= ruleEString ) )
            // InternalModness.g:1465:4: (lv_filePath_12_0= ruleEString )
            {
            // InternalModness.g:1465:4: (lv_filePath_12_0= ruleEString )
            // InternalModness.g:1466:5: lv_filePath_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getFilePathEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_13=(Token)match(input,15,FOLLOW_40); 

            			newLeafNode(otherlv_13, grammarAccess.getDatasetAccess().getSemicolonKeyword_9());
            		
            // InternalModness.g:1487:3: (otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModness.g:1488:4: otherlv_14= 'otherVariable:' otherlv_15= '{' ( (lv_otherVariable_16_0= ruleOtherVariable ) ) (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )* otherlv_19= '};'
                    {
                    otherlv_14=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getDatasetAccess().getOtherVariableKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalModness.g:1496:4: ( (lv_otherVariable_16_0= ruleOtherVariable ) )
                    // InternalModness.g:1497:5: (lv_otherVariable_16_0= ruleOtherVariable )
                    {
                    // InternalModness.g:1497:5: (lv_otherVariable_16_0= ruleOtherVariable )
                    // InternalModness.g:1498:6: lv_otherVariable_16_0= ruleOtherVariable
                    {

                    						newCompositeNode(grammarAccess.getDatasetAccess().getOtherVariableOtherVariableParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalModness.g:1515:4: (otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalModness.g:1516:5: otherlv_17= ',' ( (lv_otherVariable_18_0= ruleOtherVariable ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_41); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getDatasetAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalModness.g:1520:5: ( (lv_otherVariable_18_0= ruleOtherVariable ) )
                    	    // InternalModness.g:1521:6: (lv_otherVariable_18_0= ruleOtherVariable )
                    	    {
                    	    // InternalModness.g:1521:6: (lv_otherVariable_18_0= ruleOtherVariable )
                    	    // InternalModness.g:1522:7: lv_otherVariable_18_0= ruleOtherVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getDatasetAccess().getOtherVariableOtherVariableParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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

                    otherlv_19=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getDatasetAccess().getRightCurlyBracketSemicolonKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getDatasetAccess().getPositiveOutcomeKeyword_11());
            		
            // InternalModness.g:1549:3: ( (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome ) )
            // InternalModness.g:1550:4: (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome )
            {
            // InternalModness.g:1550:4: (lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome )
            // InternalModness.g:1551:5: lv_positiveOutcome_21_0= ruleDatasetPositiveOutcome
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

            otherlv_22=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getDatasetAccess().getDatasetSentiveVariableKeyword_13());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_23, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalModness.g:1576:3: ( (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable ) )
            // InternalModness.g:1577:4: (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable )
            {
            // InternalModness.g:1577:4: (lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable )
            // InternalModness.g:1578:5: lv_datasetSentiveVariable_24_0= ruleDatasetSensitiveVariable
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getDatasetSentiveVariableDatasetSensitiveVariableParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalModness.g:1595:3: (otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalModness.g:1596:4: otherlv_25= ',' ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) )
            	    {
            	    otherlv_25=(Token)match(input,17,FOLLOW_43); 

            	    				newLeafNode(otherlv_25, grammarAccess.getDatasetAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalModness.g:1600:4: ( (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable ) )
            	    // InternalModness.g:1601:5: (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable )
            	    {
            	    // InternalModness.g:1601:5: (lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable )
            	    // InternalModness.g:1602:6: lv_datasetSentiveVariable_26_0= ruleDatasetSensitiveVariable
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetAccess().getDatasetSentiveVariableDatasetSensitiveVariableParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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

            otherlv_27=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_27, grammarAccess.getDatasetAccess().getRightCurlyBracketSemicolonKeyword_17());
            		
            otherlv_28=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:1632:1: entryRuleDatasetSensitiveGroup returns [EObject current=null] : iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF ;
    public final EObject entryRuleDatasetSensitiveGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveGroup = null;


        try {
            // InternalModness.g:1632:62: (iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF )
            // InternalModness.g:1633:2: iv_ruleDatasetSensitiveGroup= ruleDatasetSensitiveGroup EOF
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
    // InternalModness.g:1639:1: ruleDatasetSensitiveGroup returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingGroup:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'sensitiveVariables:' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ');' otherlv_13= '};' ) ;
    public final EObject ruleDatasetSensitiveGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModness.g:1645:2: ( (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingGroup:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'sensitiveVariables:' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ');' otherlv_13= '};' ) )
            // InternalModness.g:1646:2: (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingGroup:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'sensitiveVariables:' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ');' otherlv_13= '};' )
            {
            // InternalModness.g:1646:2: (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingGroup:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'sensitiveVariables:' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ');' otherlv_13= '};' )
            // InternalModness.g:1647:3: otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingGroup:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'sensitiveVariables:' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ');' otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveGroupAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveGroupAccess().getIdKeyword_1());
            		
            // InternalModness.g:1655:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:1656:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:1656:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:1657:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.modness.Modness.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetSensitiveGroupAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveGroupAccess().getMappingGroupKeyword_4());
            		
            // InternalModness.g:1682:3: ( ( ruleEString ) )
            // InternalModness.g:1683:4: ( ruleEString )
            {
            // InternalModness.g:1683:4: ( ruleEString )
            // InternalModness.g:1684:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getMappingGroupSensitiveGroupCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasetSensitiveGroupAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_46); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesKeyword_7());
            		
            otherlv_8=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveGroupAccess().getLeftParenthesisKeyword_8());
            		
            // InternalModness.g:1710:3: ( ( ruleEString ) )
            // InternalModness.g:1711:4: ( ruleEString )
            {
            // InternalModness.g:1711:4: ( ruleEString )
            // InternalModness.g:1712:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesDatasetSensitiveVariableValueCrossReference_9_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:1726:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalModness.g:1727:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getDatasetSensitiveGroupAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalModness.g:1731:4: ( ( ruleEString ) )
            	    // InternalModness.g:1732:5: ( ruleEString )
            	    {
            	    // InternalModness.g:1732:5: ( ruleEString )
            	    // InternalModness.g:1733:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDatasetSensitiveGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDatasetSensitiveGroupAccess().getSensitiveVariablesDatasetSensitiveVariableValueCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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

            otherlv_12=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getDatasetSensitiveGroupAccess().getRightParenthesisSemicolonKeyword_11());
            		
            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDatasetSensitiveGroupAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // InternalModness.g:1760:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalModness.g:1760:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalModness.g:1761:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalModness.g:1767:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalModness.g:1773:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalModness.g:1774:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalModness.g:1774:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalModness.g:1775:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalModness.g:1775:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModness.g:1776:4: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalModness.g:1782:3: (this_INT_1= RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModness.g:1783:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,51,FOLLOW_50); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_51); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalModness.g:1803:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=52 && LA27_0<=53)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModness.g:1804:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalModness.g:1804:4: (kw= 'E' | kw= 'e' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==52) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==53) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalModness.g:1805:5: kw= 'E'
                            {
                            kw=(Token)match(input,52,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalModness.g:1811:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalModness.g:1817:4: (kw= '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==50) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalModness.g:1818:5: kw= '-'
                            {
                            kw=(Token)match(input,50,FOLLOW_50); 

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
    // InternalModness.g:1836:1: entryRuleSingleOperator returns [EObject current=null] : iv_ruleSingleOperator= ruleSingleOperator EOF ;
    public final EObject entryRuleSingleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleOperator = null;


        try {
            // InternalModness.g:1836:55: (iv_ruleSingleOperator= ruleSingleOperator EOF )
            // InternalModness.g:1837:2: iv_ruleSingleOperator= ruleSingleOperator EOF
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
    // InternalModness.g:1843:1: ruleSingleOperator returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' ) ;
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
            // InternalModness.g:1849:2: ( (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' ) )
            // InternalModness.g:1850:2: (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' )
            {
            // InternalModness.g:1850:2: (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};' )
            // InternalModness.g:1851:3: otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleSingleOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'value:' ( (lv_value_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleOperatorAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,54,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleOperatorAccess().getOperatorKeyword_1());
            		
            // InternalModness.g:1859:3: ( (lv_operator_2_0= ruleSingleOperatorParameter ) )
            // InternalModness.g:1860:4: (lv_operator_2_0= ruleSingleOperatorParameter )
            {
            // InternalModness.g:1860:4: (lv_operator_2_0= ruleSingleOperatorParameter )
            // InternalModness.g:1861:5: lv_operator_2_0= ruleSingleOperatorParameter
            {

            					newCompositeNode(grammarAccess.getSingleOperatorAccess().getOperatorSingleOperatorParameterEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleOperatorAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,55,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getSingleOperatorAccess().getValueKeyword_4());
            		
            // InternalModness.g:1886:3: ( (lv_value_5_0= ruleEFloat ) )
            // InternalModness.g:1887:4: (lv_value_5_0= ruleEFloat )
            {
            // InternalModness.g:1887:4: (lv_value_5_0= ruleEFloat )
            // InternalModness.g:1888:5: lv_value_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getSingleOperatorAccess().getValueEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getSingleOperatorAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:1917:1: entryRuleRangeOperator returns [EObject current=null] : iv_ruleRangeOperator= ruleRangeOperator EOF ;
    public final EObject entryRuleRangeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeOperator = null;


        try {
            // InternalModness.g:1917:54: (iv_ruleRangeOperator= ruleRangeOperator EOF )
            // InternalModness.g:1918:2: iv_ruleRangeOperator= ruleRangeOperator EOF
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
    // InternalModness.g:1924:1: ruleRangeOperator returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' ) ;
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
            // InternalModness.g:1930:2: ( (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' ) )
            // InternalModness.g:1931:2: (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' )
            {
            // InternalModness.g:1931:2: (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};' )
            // InternalModness.g:1932:3: otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleRangeOperatorParameter ) ) otherlv_3= ';' otherlv_4= 'lowerValue:' ( (lv_lowerValue_5_0= ruleEFloat ) ) otherlv_6= ';' otherlv_7= 'greaterValue:' ( (lv_greaterValue_8_0= ruleEFloat ) ) otherlv_9= ';' otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeOperatorAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,54,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeOperatorAccess().getOperatorKeyword_1());
            		
            // InternalModness.g:1940:3: ( (lv_operator_2_0= ruleRangeOperatorParameter ) )
            // InternalModness.g:1941:4: (lv_operator_2_0= ruleRangeOperatorParameter )
            {
            // InternalModness.g:1941:4: (lv_operator_2_0= ruleRangeOperatorParameter )
            // InternalModness.g:1942:5: lv_operator_2_0= ruleRangeOperatorParameter
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getOperatorRangeOperatorParameterEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getRangeOperatorAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,56,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeOperatorAccess().getLowerValueKeyword_4());
            		
            // InternalModness.g:1967:3: ( (lv_lowerValue_5_0= ruleEFloat ) )
            // InternalModness.g:1968:4: (lv_lowerValue_5_0= ruleEFloat )
            {
            // InternalModness.g:1968:4: (lv_lowerValue_5_0= ruleEFloat )
            // InternalModness.g:1969:5: lv_lowerValue_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getLowerValueEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,15,FOLLOW_58); 

            			newLeafNode(otherlv_6, grammarAccess.getRangeOperatorAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,57,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getRangeOperatorAccess().getGreaterValueKeyword_7());
            		
            // InternalModness.g:1994:3: ( (lv_greaterValue_8_0= ruleEFloat ) )
            // InternalModness.g:1995:4: (lv_greaterValue_8_0= ruleEFloat )
            {
            // InternalModness.g:1995:4: (lv_greaterValue_8_0= ruleEFloat )
            // InternalModness.g:1996:5: lv_greaterValue_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRangeOperatorAccess().getGreaterValueEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_9=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getRangeOperatorAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:2025:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalModness.g:2025:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalModness.g:2026:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalModness.g:2032:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' otherlv_1= '{' otherlv_2= 'arithmeticOperator:' ( (lv_equalityOperator_3_0= ruleArithmeticOperator ) ) otherlv_4= ';' otherlv_5= 'leftSide:' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide:' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_equalityOperator_3_0 = null;

        EObject lv_leftSide_6_0 = null;

        EObject lv_rightSide_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2038:2: ( (otherlv_0= 'Operation' otherlv_1= '{' otherlv_2= 'arithmeticOperator:' ( (lv_equalityOperator_3_0= ruleArithmeticOperator ) ) otherlv_4= ';' otherlv_5= 'leftSide:' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide:' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) )
            // InternalModness.g:2039:2: (otherlv_0= 'Operation' otherlv_1= '{' otherlv_2= 'arithmeticOperator:' ( (lv_equalityOperator_3_0= ruleArithmeticOperator ) ) otherlv_4= ';' otherlv_5= 'leftSide:' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide:' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            {
            // InternalModness.g:2039:2: (otherlv_0= 'Operation' otherlv_1= '{' otherlv_2= 'arithmeticOperator:' ( (lv_equalityOperator_3_0= ruleArithmeticOperator ) ) otherlv_4= ';' otherlv_5= 'leftSide:' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide:' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            // InternalModness.g:2040:3: otherlv_0= 'Operation' otherlv_1= '{' otherlv_2= 'arithmeticOperator:' ( (lv_equalityOperator_3_0= ruleArithmeticOperator ) ) otherlv_4= ';' otherlv_5= 'leftSide:' ( (lv_leftSide_6_0= ruleOperatorComponent ) ) otherlv_7= 'rightSide:' ( (lv_rightSide_8_0= ruleOperatorComponent ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getArithmeticOperatorKeyword_2());
            		
            // InternalModness.g:2052:3: ( (lv_equalityOperator_3_0= ruleArithmeticOperator ) )
            // InternalModness.g:2053:4: (lv_equalityOperator_3_0= ruleArithmeticOperator )
            {
            // InternalModness.g:2053:4: (lv_equalityOperator_3_0= ruleArithmeticOperator )
            // InternalModness.g:2054:5: lv_equalityOperator_3_0= ruleArithmeticOperator
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getEqualityOperatorArithmeticOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_equalityOperator_3_0=ruleArithmeticOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"equalityOperator",
            						lv_equalityOperator_3_0,
            						"org.xtext.example.modness.Modness.ArithmeticOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftSideKeyword_5());
            		
            // InternalModness.g:2079:3: ( (lv_leftSide_6_0= ruleOperatorComponent ) )
            // InternalModness.g:2080:4: (lv_leftSide_6_0= ruleOperatorComponent )
            {
            // InternalModness.g:2080:4: (lv_leftSide_6_0= ruleOperatorComponent )
            // InternalModness.g:2081:5: lv_leftSide_6_0= ruleOperatorComponent
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

            otherlv_7=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightSideKeyword_7());
            		
            // InternalModness.g:2102:3: ( (lv_rightSide_8_0= ruleOperatorComponent ) )
            // InternalModness.g:2103:4: (lv_rightSide_8_0= ruleOperatorComponent )
            {
            // InternalModness.g:2103:4: (lv_rightSide_8_0= ruleOperatorComponent )
            // InternalModness.g:2104:5: lv_rightSide_8_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getRightSideOperatorComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:2129:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // InternalModness.g:2129:52: (iv_ruleProbability= ruleProbability EOF )
            // InternalModness.g:2130:2: iv_ruleProbability= ruleProbability EOF
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
    // InternalModness.g:2136:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) ;
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
            // InternalModness.g:2142:2: ( (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) )
            // InternalModness.g:2143:2: (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            {
            // InternalModness.g:2143:2: (otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            // InternalModness.g:2144:3: otherlv_0= 'Probability' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'object' ( (lv_object_4_0= ruleLogicalCondition ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getProbabilityKeyword_0());
            		
            // InternalModness.g:2148:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2149:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2149:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2150:5: lv_name_1_0= ruleEString
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
            		
            otherlv_3=(Token)match(input,63,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getProbabilityAccess().getObjectKeyword_3());
            		
            // InternalModness.g:2175:3: ( (lv_object_4_0= ruleLogicalCondition ) )
            // InternalModness.g:2176:4: (lv_object_4_0= ruleLogicalCondition )
            {
            // InternalModness.g:2176:4: (lv_object_4_0= ruleLogicalCondition )
            // InternalModness.g:2177:5: lv_object_4_0= ruleLogicalCondition
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

            // InternalModness.g:2194:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModness.g:2195:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_66); 

                    				newLeafNode(otherlv_5, grammarAccess.getProbabilityAccess().getConditionKeyword_5_0());
                    			
                    // InternalModness.g:2199:4: ( (lv_condition_6_0= ruleLogicalCondition ) )
                    // InternalModness.g:2200:5: (lv_condition_6_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2200:5: (lv_condition_6_0= ruleLogicalCondition )
                    // InternalModness.g:2201:6: lv_condition_6_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getProbabilityAccess().getConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:2227:1: entryRuleExpectedValue returns [EObject current=null] : iv_ruleExpectedValue= ruleExpectedValue EOF ;
    public final EObject entryRuleExpectedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectedValue = null;


        try {
            // InternalModness.g:2227:54: (iv_ruleExpectedValue= ruleExpectedValue EOF )
            // InternalModness.g:2228:2: iv_ruleExpectedValue= ruleExpectedValue EOF
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
    // InternalModness.g:2234:1: ruleExpectedValue returns [EObject current=null] : (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) ;
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
            // InternalModness.g:2240:2: ( (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' ) )
            // InternalModness.g:2241:2: (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            {
            // InternalModness.g:2241:2: (otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}' )
            // InternalModness.g:2242:3: otherlv_0= 'ExpectedValue' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'columnName' ( (lv_columnName_4_0= ruleEString ) ) (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpectedValueAccess().getExpectedValueKeyword_0());
            		
            // InternalModness.g:2246:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2247:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2247:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2248:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getExpectedValueAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getExpectedValueAccess().getColumnNameKeyword_3());
            		
            // InternalModness.g:2273:3: ( (lv_columnName_4_0= ruleEString ) )
            // InternalModness.g:2274:4: (lv_columnName_4_0= ruleEString )
            {
            // InternalModness.g:2274:4: (lv_columnName_4_0= ruleEString )
            // InternalModness.g:2275:5: lv_columnName_4_0= ruleEString
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

            // InternalModness.g:2292:3: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==64) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModness.g:2293:4: otherlv_5= 'condition' ( (lv_condition_6_0= ruleLogicalCondition ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_66); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpectedValueAccess().getConditionKeyword_5_0());
                    			
                    // InternalModness.g:2297:4: ( (lv_condition_6_0= ruleLogicalCondition ) )
                    // InternalModness.g:2298:5: (lv_condition_6_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2298:5: (lv_condition_6_0= ruleLogicalCondition )
                    // InternalModness.g:2299:6: lv_condition_6_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getExpectedValueAccess().getConditionLogicalConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:2325:1: entryRuleGroupSize returns [EObject current=null] : iv_ruleGroupSize= ruleGroupSize EOF ;
    public final EObject entryRuleGroupSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSize = null;


        try {
            // InternalModness.g:2325:50: (iv_ruleGroupSize= ruleGroupSize EOF )
            // InternalModness.g:2326:2: iv_ruleGroupSize= ruleGroupSize EOF
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
    // InternalModness.g:2332:1: ruleGroupSize returns [EObject current=null] : ( () otherlv_1= 'GroupSize' otherlv_2= '{' (otherlv_3= 'variable:' ( ( ruleEString ) ) )? (otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};' )? otherlv_9= '};' ) ;
    public final EObject ruleGroupSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_groupCondition_7_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2338:2: ( ( () otherlv_1= 'GroupSize' otherlv_2= '{' (otherlv_3= 'variable:' ( ( ruleEString ) ) )? (otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};' )? otherlv_9= '};' ) )
            // InternalModness.g:2339:2: ( () otherlv_1= 'GroupSize' otherlv_2= '{' (otherlv_3= 'variable:' ( ( ruleEString ) ) )? (otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};' )? otherlv_9= '};' )
            {
            // InternalModness.g:2339:2: ( () otherlv_1= 'GroupSize' otherlv_2= '{' (otherlv_3= 'variable:' ( ( ruleEString ) ) )? (otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};' )? otherlv_9= '};' )
            // InternalModness.g:2340:3: () otherlv_1= 'GroupSize' otherlv_2= '{' (otherlv_3= 'variable:' ( ( ruleEString ) ) )? (otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};' )? otherlv_9= '};'
            {
            // InternalModness.g:2340:3: ()
            // InternalModness.g:2341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupSizeAccess().getGroupSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupSizeAccess().getGroupSizeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupSizeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalModness.g:2355:3: (otherlv_3= 'variable:' ( ( ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==68) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalModness.g:2356:4: otherlv_3= 'variable:' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGroupSizeAccess().getVariableKeyword_3_0());
                    			
                    // InternalModness.g:2360:4: ( ( ruleEString ) )
                    // InternalModness.g:2361:5: ( ruleEString )
                    {
                    // InternalModness.g:2361:5: ( ruleEString )
                    // InternalModness.g:2362:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupSizeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGroupSizeAccess().getVariableVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2377:3: (otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==69) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalModness.g:2378:4: otherlv_5= 'groupCondition:' otherlv_6= '{' ( (lv_groupCondition_7_0= ruleLogicalCondition ) ) otherlv_8= '};'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGroupSizeAccess().getGroupConditionKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_70); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupSizeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalModness.g:2386:4: ( (lv_groupCondition_7_0= ruleLogicalCondition ) )
                    // InternalModness.g:2387:5: (lv_groupCondition_7_0= ruleLogicalCondition )
                    {
                    // InternalModness.g:2387:5: (lv_groupCondition_7_0= ruleLogicalCondition )
                    // InternalModness.g:2388:6: lv_groupCondition_7_0= ruleLogicalCondition
                    {

                    						newCompositeNode(grammarAccess.getGroupSizeAccess().getGroupConditionLogicalConditionParserRuleCall_4_2_0());
                    					
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

                    otherlv_8=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getGroupSizeAccess().getRightCurlyBracketSemicolonKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupSizeAccess().getRightCurlyBracketSemicolonKeyword_5());
            		

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
    // InternalModness.g:2418:1: entryRuleDatasetSize returns [EObject current=null] : iv_ruleDatasetSize= ruleDatasetSize EOF ;
    public final EObject entryRuleDatasetSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSize = null;


        try {
            // InternalModness.g:2418:52: (iv_ruleDatasetSize= ruleDatasetSize EOF )
            // InternalModness.g:2419:2: iv_ruleDatasetSize= ruleDatasetSize EOF
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
    // InternalModness.g:2425:1: ruleDatasetSize returns [EObject current=null] : ( () otherlv_1= 'DatasetSize' ) ;
    public final EObject ruleDatasetSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalModness.g:2431:2: ( ( () otherlv_1= 'DatasetSize' ) )
            // InternalModness.g:2432:2: ( () otherlv_1= 'DatasetSize' )
            {
            // InternalModness.g:2432:2: ( () otherlv_1= 'DatasetSize' )
            // InternalModness.g:2433:3: () otherlv_1= 'DatasetSize'
            {
            // InternalModness.g:2433:3: ()
            // InternalModness.g:2434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatasetSizeAccess().getDatasetSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSizeAccess().getDatasetSizeKeyword_1());
            		

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
    // InternalModness.g:2448:1: entryRuleLogaritm returns [EObject current=null] : iv_ruleLogaritm= ruleLogaritm EOF ;
    public final EObject entryRuleLogaritm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogaritm = null;


        try {
            // InternalModness.g:2448:49: (iv_ruleLogaritm= ruleLogaritm EOF )
            // InternalModness.g:2449:2: iv_ruleLogaritm= ruleLogaritm EOF
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
    // InternalModness.g:2455:1: ruleLogaritm returns [EObject current=null] : (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' ) ;
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
            // InternalModness.g:2461:2: ( (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' ) )
            // InternalModness.g:2462:2: (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' )
            {
            // InternalModness.g:2462:2: (otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}' )
            // InternalModness.g:2463:3: otherlv_0= 'Logaritm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operatorcomponent' ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogaritmAccess().getLogaritmKeyword_0());
            		
            // InternalModness.g:2467:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2468:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2468:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2469:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getLogaritmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLogaritmAccess().getOperatorcomponentKeyword_3());
            		
            // InternalModness.g:2494:3: ( (lv_operatorcomponent_4_0= ruleOperatorComponent ) )
            // InternalModness.g:2495:4: (lv_operatorcomponent_4_0= ruleOperatorComponent )
            {
            // InternalModness.g:2495:4: (lv_operatorcomponent_4_0= ruleOperatorComponent )
            // InternalModness.g:2496:5: lv_operatorcomponent_4_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getLogaritmAccess().getOperatorcomponentOperatorComponentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:2521:1: entryRuleSummation returns [EObject current=null] : iv_ruleSummation= ruleSummation EOF ;
    public final EObject entryRuleSummation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummation = null;


        try {
            // InternalModness.g:2521:50: (iv_ruleSummation= ruleSummation EOF )
            // InternalModness.g:2522:2: iv_ruleSummation= ruleSummation EOF
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
    // InternalModness.g:2528:1: ruleSummation returns [EObject current=null] : (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) ;
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
            // InternalModness.g:2534:2: ( (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' ) )
            // InternalModness.g:2535:2: (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            {
            // InternalModness.g:2535:2: (otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}' )
            // InternalModness.g:2536:3: otherlv_0= 'Summation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startRange' ( (lv_startRange_4_0= ruleOperatorComponent ) ) otherlv_5= 'endRange' ( (lv_endRange_6_0= ruleOperatorComponent ) ) otherlv_7= 'body' ( (lv_body_8_0= ruleOperatorComponent ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSummationAccess().getSummationKeyword_0());
            		
            // InternalModness.g:2540:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2541:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2541:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2542:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getSummationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSummationAccess().getStartRangeKeyword_3());
            		
            // InternalModness.g:2567:3: ( (lv_startRange_4_0= ruleOperatorComponent ) )
            // InternalModness.g:2568:4: (lv_startRange_4_0= ruleOperatorComponent )
            {
            // InternalModness.g:2568:4: (lv_startRange_4_0= ruleOperatorComponent )
            // InternalModness.g:2569:5: lv_startRange_4_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getStartRangeOperatorComponentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_73);
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

            otherlv_5=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSummationAccess().getEndRangeKeyword_5());
            		
            // InternalModness.g:2590:3: ( (lv_endRange_6_0= ruleOperatorComponent ) )
            // InternalModness.g:2591:4: (lv_endRange_6_0= ruleOperatorComponent )
            {
            // InternalModness.g:2591:4: (lv_endRange_6_0= ruleOperatorComponent )
            // InternalModness.g:2592:5: lv_endRange_6_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getEndRangeOperatorComponentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_74);
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

            otherlv_7=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSummationAccess().getBodyKeyword_7());
            		
            // InternalModness.g:2613:3: ( (lv_body_8_0= ruleOperatorComponent ) )
            // InternalModness.g:2614:4: (lv_body_8_0= ruleOperatorComponent )
            {
            // InternalModness.g:2614:4: (lv_body_8_0= ruleOperatorComponent )
            // InternalModness.g:2615:5: lv_body_8_0= ruleOperatorComponent
            {

            					newCompositeNode(grammarAccess.getSummationAccess().getBodyOperatorComponentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:2640:1: entryRuleExistingGroupFairnessMetric returns [EObject current=null] : iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF ;
    public final EObject entryRuleExistingGroupFairnessMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingGroupFairnessMetric = null;


        try {
            // InternalModness.g:2640:68: (iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF )
            // InternalModness.g:2641:2: iv_ruleExistingGroupFairnessMetric= ruleExistingGroupFairnessMetric EOF
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
    // InternalModness.g:2647:1: ruleExistingGroupFairnessMetric returns [EObject current=null] : (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' ) ;
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
            // InternalModness.g:2653:2: ( (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' ) )
            // InternalModness.g:2654:2: (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' )
            {
            // InternalModness.g:2654:2: (otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};' )
            // InternalModness.g:2655:3: otherlv_0= 'ExistingGroupFairnessMetric' otherlv_1= '{' otherlv_2= 'metric:' ( (lv_metric_3_0= ruleGroupFairnessMetric ) ) otherlv_4= ';' otherlv_5= '};'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExistingGroupFairnessMetricAccess().getExistingGroupFairnessMetricKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getExistingGroupFairnessMetricAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getExistingGroupFairnessMetricAccess().getMetricKeyword_2());
            		
            // InternalModness.g:2667:3: ( (lv_metric_3_0= ruleGroupFairnessMetric ) )
            // InternalModness.g:2668:4: (lv_metric_3_0= ruleGroupFairnessMetric )
            {
            // InternalModness.g:2668:4: (lv_metric_3_0= ruleGroupFairnessMetric )
            // InternalModness.g:2669:5: lv_metric_3_0= ruleGroupFairnessMetric
            {

            					newCompositeNode(grammarAccess.getExistingGroupFairnessMetricAccess().getMetricGroupFairnessMetricEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getExistingGroupFairnessMetricAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:2698:1: entryRuleExistingIndividualFairnessMetric returns [EObject current=null] : iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF ;
    public final EObject entryRuleExistingIndividualFairnessMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingIndividualFairnessMetric = null;


        try {
            // InternalModness.g:2698:73: (iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF )
            // InternalModness.g:2699:2: iv_ruleExistingIndividualFairnessMetric= ruleExistingIndividualFairnessMetric EOF
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
    // InternalModness.g:2705:1: ruleExistingIndividualFairnessMetric returns [EObject current=null] : (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' ) ;
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
            // InternalModness.g:2711:2: ( (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' ) )
            // InternalModness.g:2712:2: (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' )
            {
            // InternalModness.g:2712:2: (otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};' )
            // InternalModness.g:2713:3: otherlv_0= 'ExistingIndividualFairnessMetric' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleIndividualFairnessMetric ) ) otherlv_5= ';' otherlv_6= '};'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExistingIndividualFairnessMetricAccess().getExistingIndividualFairnessMetricKeyword_0());
            		
            // InternalModness.g:2717:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModness.g:2718:4: (lv_name_1_0= ruleEString )
            {
            // InternalModness.g:2718:4: (lv_name_1_0= ruleEString )
            // InternalModness.g:2719:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getExistingIndividualFairnessMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getExistingIndividualFairnessMetricAccess().getMetricKeyword_3());
            		
            // InternalModness.g:2744:3: ( (lv_metric_4_0= ruleIndividualFairnessMetric ) )
            // InternalModness.g:2745:4: (lv_metric_4_0= ruleIndividualFairnessMetric )
            {
            // InternalModness.g:2745:4: (lv_metric_4_0= ruleIndividualFairnessMetric )
            // InternalModness.g:2746:5: lv_metric_4_0= ruleIndividualFairnessMetric
            {

            					newCompositeNode(grammarAccess.getExistingIndividualFairnessMetricAccess().getMetricIndividualFairnessMetricEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getExistingIndividualFairnessMetricAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalModness.g:2775:1: entryRuleOperatorComponent returns [EObject current=null] : iv_ruleOperatorComponent= ruleOperatorComponent EOF ;
    public final EObject entryRuleOperatorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorComponent = null;


        try {
            // InternalModness.g:2775:58: (iv_ruleOperatorComponent= ruleOperatorComponent EOF )
            // InternalModness.g:2776:2: iv_ruleOperatorComponent= ruleOperatorComponent EOF
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
    // InternalModness.g:2782:1: ruleOperatorComponent returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) ) )? (otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) ) )? otherlv_6= '};' ) ;
    public final EObject ruleOperatorComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_function_3_0 = null;

        EObject lv_operationvalue_5_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2788:2: ( ( () otherlv_1= '{' (otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) ) )? (otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) ) )? otherlv_6= '};' ) )
            // InternalModness.g:2789:2: ( () otherlv_1= '{' (otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) ) )? (otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) ) )? otherlv_6= '};' )
            {
            // InternalModness.g:2789:2: ( () otherlv_1= '{' (otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) ) )? (otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) ) )? otherlv_6= '};' )
            // InternalModness.g:2790:3: () otherlv_1= '{' (otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) ) )? (otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) ) )? otherlv_6= '};'
            {
            // InternalModness.g:2790:3: ()
            // InternalModness.g:2791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperatorComponentAccess().getOperatorComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getOperatorComponentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalModness.g:2801:3: (otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModness.g:2802:4: otherlv_2= 'function:' ( (lv_function_3_0= ruleFunction ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperatorComponentAccess().getFunctionKeyword_2_0());
                    			
                    // InternalModness.g:2806:4: ( (lv_function_3_0= ruleFunction ) )
                    // InternalModness.g:2807:5: (lv_function_3_0= ruleFunction )
                    {
                    // InternalModness.g:2807:5: (lv_function_3_0= ruleFunction )
                    // InternalModness.g:2808:6: lv_function_3_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getOperatorComponentAccess().getFunctionFunctionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_function_3_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorComponentRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_3_0,
                    							"org.xtext.example.modness.Modness.Function");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2826:3: (otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModness.g:2827:4: otherlv_4= 'operationValue:' ( (lv_operationvalue_5_0= ruleOperationValue ) )
                    {
                    otherlv_4=(Token)match(input,79,FOLLOW_80); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperatorComponentAccess().getOperationValueKeyword_3_0());
                    			
                    // InternalModness.g:2831:4: ( (lv_operationvalue_5_0= ruleOperationValue ) )
                    // InternalModness.g:2832:5: (lv_operationvalue_5_0= ruleOperationValue )
                    {
                    // InternalModness.g:2832:5: (lv_operationvalue_5_0= ruleOperationValue )
                    // InternalModness.g:2833:6: lv_operationvalue_5_0= ruleOperationValue
                    {

                    						newCompositeNode(grammarAccess.getOperatorComponentAccess().getOperationvalueOperationValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_operationvalue_5_0=ruleOperationValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorComponentRule());
                    						}
                    						set(
                    							current,
                    							"operationvalue",
                    							lv_operationvalue_5_0,
                    							"org.xtext.example.modness.Modness.OperationValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOperatorComponentAccess().getRightCurlyBracketSemicolonKeyword_4());
            		

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
    // InternalModness.g:2859:1: entryRuleOperationValue returns [EObject current=null] : iv_ruleOperationValue= ruleOperationValue EOF ;
    public final EObject entryRuleOperationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationValue = null;


        try {
            // InternalModness.g:2859:55: (iv_ruleOperationValue= ruleOperationValue EOF )
            // InternalModness.g:2860:2: iv_ruleOperationValue= ruleOperationValue EOF
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
    // InternalModness.g:2866:1: ruleOperationValue returns [EObject current=null] : (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value:' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= ';' otherlv_5= '}' ) ;
    public final EObject ruleOperationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2872:2: ( (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value:' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= ';' otherlv_5= '}' ) )
            // InternalModness.g:2873:2: (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value:' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= ';' otherlv_5= '}' )
            {
            // InternalModness.g:2873:2: (otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value:' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= ';' otherlv_5= '}' )
            // InternalModness.g:2874:3: otherlv_0= 'OperationValue' otherlv_1= '{' otherlv_2= 'value:' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= ';' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationValueAccess().getOperationValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationValueAccess().getValueKeyword_2());
            		
            // InternalModness.g:2886:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalModness.g:2887:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalModness.g:2887:4: (lv_value_3_0= ruleEFloat )
            // InternalModness.g:2888:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getOperationValueAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationValueAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationValueAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalModness.g:2917:1: entryRuleLogicalCondition returns [EObject current=null] : iv_ruleLogicalCondition= ruleLogicalCondition EOF ;
    public final EObject entryRuleLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCondition = null;


        try {
            // InternalModness.g:2917:57: (iv_ruleLogicalCondition= ruleLogicalCondition EOF )
            // InternalModness.g:2918:2: iv_ruleLogicalCondition= ruleLogicalCondition EOF
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
    // InternalModness.g:2924:1: ruleLogicalCondition returns [EObject current=null] : ( () (otherlv_1= 'value:' ( ( ruleEString ) ) )? (otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) ) )? ( (lv_sublogicalcondition_5_0= ruleSubLogicalCondition ) )? ) ;
    public final EObject ruleLogicalCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sublogicalcondition_5_0 = null;



        	enterRule();

        try {
            // InternalModness.g:2930:2: ( ( () (otherlv_1= 'value:' ( ( ruleEString ) ) )? (otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) ) )? ( (lv_sublogicalcondition_5_0= ruleSubLogicalCondition ) )? ) )
            // InternalModness.g:2931:2: ( () (otherlv_1= 'value:' ( ( ruleEString ) ) )? (otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) ) )? ( (lv_sublogicalcondition_5_0= ruleSubLogicalCondition ) )? )
            {
            // InternalModness.g:2931:2: ( () (otherlv_1= 'value:' ( ( ruleEString ) ) )? (otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) ) )? ( (lv_sublogicalcondition_5_0= ruleSubLogicalCondition ) )? )
            // InternalModness.g:2932:3: () (otherlv_1= 'value:' ( ( ruleEString ) ) )? (otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) ) )? ( (lv_sublogicalcondition_5_0= ruleSubLogicalCondition ) )?
            {
            // InternalModness.g:2932:3: ()
            // InternalModness.g:2933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicalConditionAccess().getLogicalConditionAction_0(),
            					current);
            			

            }

            // InternalModness.g:2939:3: (otherlv_1= 'value:' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModness.g:2940:4: otherlv_1= 'value:' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getLogicalConditionAccess().getValueKeyword_1_0());
                    			
                    // InternalModness.g:2944:4: ( ( ruleEString ) )
                    // InternalModness.g:2945:5: ( ruleEString )
                    {
                    // InternalModness.g:2945:5: ( ruleEString )
                    // InternalModness.g:2946:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getValueVariableValueCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2961:3: (otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==81) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalModness.g:2962:4: otherlv_3= 'sensitiveGroup:' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,81,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalConditionAccess().getSensitiveGroupKeyword_2_0());
                    			
                    // InternalModness.g:2966:4: ( ( ruleEString ) )
                    // InternalModness.g:2967:5: ( ruleEString )
                    {
                    // InternalModness.g:2967:5: ( ruleEString )
                    // InternalModness.g:2968:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConditionAccess().getSensitivegroupDatasetSensitiveGroupCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModness.g:2983:3: ( (lv_sublogicalcondition_5_0= ruleSubLogicalCondition ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=116 && LA36_0<=117)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModness.g:2984:4: (lv_sublogicalcondition_5_0= ruleSubLogicalCondition )
                    {
                    // InternalModness.g:2984:4: (lv_sublogicalcondition_5_0= ruleSubLogicalCondition )
                    // InternalModness.g:2985:5: lv_sublogicalcondition_5_0= ruleSubLogicalCondition
                    {

                    					newCompositeNode(grammarAccess.getLogicalConditionAccess().getSublogicalconditionSubLogicalConditionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sublogicalcondition_5_0=ruleSubLogicalCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLogicalConditionRule());
                    					}
                    					set(
                    						current,
                    						"sublogicalcondition",
                    						lv_sublogicalcondition_5_0,
                    						"org.xtext.example.modness.Modness.SubLogicalCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleLogicalCondition"


    // $ANTLR start "entryRuleSubLogicalCondition"
    // InternalModness.g:3006:1: entryRuleSubLogicalCondition returns [EObject current=null] : iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF ;
    public final EObject entryRuleSubLogicalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubLogicalCondition = null;


        try {
            // InternalModness.g:3006:60: (iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF )
            // InternalModness.g:3007:2: iv_ruleSubLogicalCondition= ruleSubLogicalCondition EOF
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
    // InternalModness.g:3013:1: ruleSubLogicalCondition returns [EObject current=null] : ( ( (lv_logicalOperator_0_0= ruleLogicalOperator ) ) ( (lv_logicalcondition_1_0= ruleLogicalCondition ) ) ) ;
    public final EObject ruleSubLogicalCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_logicalOperator_0_0 = null;

        EObject lv_logicalcondition_1_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3019:2: ( ( ( (lv_logicalOperator_0_0= ruleLogicalOperator ) ) ( (lv_logicalcondition_1_0= ruleLogicalCondition ) ) ) )
            // InternalModness.g:3020:2: ( ( (lv_logicalOperator_0_0= ruleLogicalOperator ) ) ( (lv_logicalcondition_1_0= ruleLogicalCondition ) ) )
            {
            // InternalModness.g:3020:2: ( ( (lv_logicalOperator_0_0= ruleLogicalOperator ) ) ( (lv_logicalcondition_1_0= ruleLogicalCondition ) ) )
            // InternalModness.g:3021:3: ( (lv_logicalOperator_0_0= ruleLogicalOperator ) ) ( (lv_logicalcondition_1_0= ruleLogicalCondition ) )
            {
            // InternalModness.g:3021:3: ( (lv_logicalOperator_0_0= ruleLogicalOperator ) )
            // InternalModness.g:3022:4: (lv_logicalOperator_0_0= ruleLogicalOperator )
            {
            // InternalModness.g:3022:4: (lv_logicalOperator_0_0= ruleLogicalOperator )
            // InternalModness.g:3023:5: lv_logicalOperator_0_0= ruleLogicalOperator
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getLogicalOperatorLogicalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_83);
            lv_logicalOperator_0_0=ruleLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubLogicalConditionRule());
            					}
            					set(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_0_0,
            						"org.xtext.example.modness.Modness.LogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:3040:3: ( (lv_logicalcondition_1_0= ruleLogicalCondition ) )
            // InternalModness.g:3041:4: (lv_logicalcondition_1_0= ruleLogicalCondition )
            {
            // InternalModness.g:3041:4: (lv_logicalcondition_1_0= ruleLogicalCondition )
            // InternalModness.g:3042:5: lv_logicalcondition_1_0= ruleLogicalCondition
            {

            					newCompositeNode(grammarAccess.getSubLogicalConditionAccess().getLogicalconditionLogicalConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_logicalcondition_1_0=ruleLogicalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubLogicalConditionRule());
            					}
            					set(
            						current,
            						"logicalcondition",
            						lv_logicalcondition_1_0,
            						"org.xtext.example.modness.Modness.LogicalCondition");
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
    // $ANTLR end "ruleSubLogicalCondition"


    // $ANTLR start "entryRuleVariableValue_Impl"
    // InternalModness.g:3063:1: entryRuleVariableValue_Impl returns [EObject current=null] : iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF ;
    public final EObject entryRuleVariableValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue_Impl = null;


        try {
            // InternalModness.g:3063:59: (iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF )
            // InternalModness.g:3064:2: iv_ruleVariableValue_Impl= ruleVariableValue_Impl EOF
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
    // InternalModness.g:3070:1: ruleVariableValue_Impl returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' ) )? otherlv_4= '}' ) ;
    public final EObject ruleVariableValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_relativeToDatasetSize_3_0=null;
        Token otherlv_4=null;
        EObject lv_operator_2_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3076:2: ( (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' ) )? otherlv_4= '}' ) )
            // InternalModness.g:3077:2: (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' ) )? otherlv_4= '}' )
            {
            // InternalModness.g:3077:2: (otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' ) )? otherlv_4= '}' )
            // InternalModness.g:3078:3: otherlv_0= '{' otherlv_1= 'operator:' ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableValue_ImplAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableValue_ImplAccess().getOperatorKeyword_1());
            		
            // InternalModness.g:3086:3: ( (lv_operator_2_0= ruleEqualityOperator ) )
            // InternalModness.g:3087:4: (lv_operator_2_0= ruleEqualityOperator )
            {
            // InternalModness.g:3087:4: (lv_operator_2_0= ruleEqualityOperator )
            // InternalModness.g:3088:5: lv_operator_2_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getVariableValue_ImplAccess().getOperatorEqualityOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_84);
            lv_operator_2_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableValue_ImplRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:3105:3: ( (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==82) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModness.g:3106:4: (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3106:4: (lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3107:5: lv_relativeToDatasetSize_3_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_3_0=(Token)match(input,82,FOLLOW_21); 

                    					newLeafNode(lv_relativeToDatasetSize_3_0, grammarAccess.getVariableValue_ImplAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableValue_ImplRule());
                    					}
                    					setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_3_0 != null, "relativeToDatasetSize");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableValue_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalModness.g:3127:1: entryRuleDatasetPositiveOutcome returns [EObject current=null] : iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF ;
    public final EObject entryRuleDatasetPositiveOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetPositiveOutcome = null;


        try {
            // InternalModness.g:3127:63: (iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF )
            // InternalModness.g:3128:2: iv_ruleDatasetPositiveOutcome= ruleDatasetPositiveOutcome EOF
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
    // InternalModness.g:3134:1: ruleDatasetPositiveOutcome returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingOutcome:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'value:' ( (lv_operator_8_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';' )? otherlv_11= '};' ) ;
    public final EObject ruleDatasetPositiveOutcome() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_relativeToDatasetSize_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operator_8_0 = null;



        	enterRule();

        try {
            // InternalModness.g:3140:2: ( (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingOutcome:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'value:' ( (lv_operator_8_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';' )? otherlv_11= '};' ) )
            // InternalModness.g:3141:2: (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingOutcome:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'value:' ( (lv_operator_8_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';' )? otherlv_11= '};' )
            {
            // InternalModness.g:3141:2: (otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingOutcome:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'value:' ( (lv_operator_8_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';' )? otherlv_11= '};' )
            // InternalModness.g:3142:3: otherlv_0= '{' otherlv_1= 'id:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'mappingOutcome:' ( ( ruleEString ) ) otherlv_6= ';' otherlv_7= 'value:' ( (lv_operator_8_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';' )? otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetPositiveOutcomeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetPositiveOutcomeAccess().getIdKeyword_1());
            		
            // InternalModness.g:3150:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3151:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3151:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3152:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_85); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetPositiveOutcomeAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetPositiveOutcomeAccess().getMappingOutcomeKeyword_4());
            		
            // InternalModness.g:3177:3: ( ( ruleEString ) )
            // InternalModness.g:3178:4: ( ruleEString )
            {
            // InternalModness.g:3178:4: ( ruleEString )
            // InternalModness.g:3179:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getMappingPositiveOutcomePositiveOutcomeCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_55); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasetPositiveOutcomeAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetPositiveOutcomeAccess().getValueKeyword_7());
            		
            // InternalModness.g:3201:3: ( (lv_operator_8_0= ruleEqualityOperator ) )
            // InternalModness.g:3202:4: (lv_operator_8_0= ruleEqualityOperator )
            {
            // InternalModness.g:3202:4: (lv_operator_8_0= ruleEqualityOperator )
            // InternalModness.g:3203:5: lv_operator_8_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getDatasetPositiveOutcomeAccess().getOperatorEqualityOperatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_86);
            lv_operator_8_0=ruleEqualityOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetPositiveOutcomeRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_8_0,
            						"org.xtext.example.modness.Modness.EqualityOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModness.g:3220:3: ( ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==82) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModness.g:3221:4: ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) ) otherlv_10= ';'
                    {
                    // InternalModness.g:3221:4: ( (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' ) )
                    // InternalModness.g:3222:5: (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3222:5: (lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3223:6: lv_relativeToDatasetSize_9_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_9_0=(Token)match(input,82,FOLLOW_7); 

                    						newLeafNode(lv_relativeToDatasetSize_9_0, grammarAccess.getDatasetPositiveOutcomeAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDatasetPositiveOutcomeRule());
                    						}
                    						setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_9_0 != null, "relativeToDatasetSize");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getDatasetPositiveOutcomeAccess().getSemicolonKeyword_9_1());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDatasetPositiveOutcomeAccess().getRightCurlyBracketSemicolonKeyword_10());
            		

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
    // InternalModness.g:3248:1: entryRuleDatasetSensitiveVariableValue returns [EObject current=null] : iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF ;
    public final EObject entryRuleDatasetSensitiveVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveVariableValue = null;


        try {
            // InternalModness.g:3248:70: (iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF )
            // InternalModness.g:3249:2: iv_ruleDatasetSensitiveVariableValue= ruleDatasetSensitiveVariableValue EOF
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
    // InternalModness.g:3255:1: ruleDatasetSensitiveVariableValue returns [EObject current=null] : (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' ) ;
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
            // InternalModness.g:3261:2: ( (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' ) )
            // InternalModness.g:3262:2: (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' )
            {
            // InternalModness.g:3262:2: (otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}' )
            // InternalModness.g:3263:3: otherlv_0= 'SensitiveVariableValue' otherlv_1= '{' otherlv_2= 'id:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingValue:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'value:' ( (lv_operator_9_0= ruleEqualityOperator ) ) ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveVariableValueAccess().getSensitiveVariableValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveVariableValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSensitiveVariableValueAccess().getIdKeyword_2());
            		
            // InternalModness.g:3275:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:3276:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:3276:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:3277:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_87); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveVariableValueAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSensitiveVariableValueAccess().getMappingValueKeyword_5());
            		
            // InternalModness.g:3302:3: ( ( ruleEString ) )
            // InternalModness.g:3303:4: ( ruleEString )
            {
            // InternalModness.g:3303:4: ( ruleEString )
            // InternalModness.g:3304:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveVariableValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getMappingValueSensitiveVariableValueCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_55); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetSensitiveVariableValueAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveVariableValueAccess().getValueKeyword_8());
            		
            // InternalModness.g:3326:3: ( (lv_operator_9_0= ruleEqualityOperator ) )
            // InternalModness.g:3327:4: (lv_operator_9_0= ruleEqualityOperator )
            {
            // InternalModness.g:3327:4: (lv_operator_9_0= ruleEqualityOperator )
            // InternalModness.g:3328:5: lv_operator_9_0= ruleEqualityOperator
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableValueAccess().getOperatorEqualityOperatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_84);
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

            // InternalModness.g:3345:3: ( ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==82) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModness.g:3346:4: ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) ) otherlv_11= ';'
                    {
                    // InternalModness.g:3346:4: ( (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' ) )
                    // InternalModness.g:3347:5: (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' )
                    {
                    // InternalModness.g:3347:5: (lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize' )
                    // InternalModness.g:3348:6: lv_relativeToDatasetSize_10_0= 'relativeToDatasetSize'
                    {
                    lv_relativeToDatasetSize_10_0=(Token)match(input,82,FOLLOW_7); 

                    						newLeafNode(lv_relativeToDatasetSize_10_0, grammarAccess.getDatasetSensitiveVariableValueAccess().getRelativeToDatasetSizeRelativeToDatasetSizeKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDatasetSensitiveVariableValueRule());
                    						}
                    						setWithLastConsumed(current, "relativeToDatasetSize", lv_relativeToDatasetSize_10_0 != null, "relativeToDatasetSize");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getDatasetSensitiveVariableValueAccess().getSemicolonKeyword_10_1());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:3373:1: entryRuleOtherVariable returns [EObject current=null] : iv_ruleOtherVariable= ruleOtherVariable EOF ;
    public final EObject entryRuleOtherVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherVariable = null;


        try {
            // InternalModness.g:3373:54: (iv_ruleOtherVariable= ruleOtherVariable EOF )
            // InternalModness.g:3374:2: iv_ruleOtherVariable= ruleOtherVariable EOF
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
    // InternalModness.g:3380:1: ruleOtherVariable returns [EObject current=null] : ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalModness.g:3386:2: ( ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalModness.g:3387:2: ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalModness.g:3387:2: ( () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalModness.g:3388:3: () otherlv_1= 'OtherVariable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalModness.g:3388:3: ()
            // InternalModness.g:3389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOtherVariableAccess().getOtherVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherVariableAccess().getOtherVariableKeyword_1());
            		
            // InternalModness.g:3399:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModness.g:3400:4: (lv_name_2_0= ruleEString )
            {
            // InternalModness.g:3400:4: (lv_name_2_0= ruleEString )
            // InternalModness.g:3401:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_88); 

            			newLeafNode(otherlv_3, grammarAccess.getOtherVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModness.g:3422:3: (otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==87) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalModness.g:3423:4: otherlv_4= 'othervariablevalue' otherlv_5= '{' ( (lv_othervariablevalue_6_0= ruleVariableValue ) ) (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getOtherVariableAccess().getOthervariablevalueKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_89); 

                    				newLeafNode(otherlv_5, grammarAccess.getOtherVariableAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalModness.g:3431:4: ( (lv_othervariablevalue_6_0= ruleVariableValue ) )
                    // InternalModness.g:3432:5: (lv_othervariablevalue_6_0= ruleVariableValue )
                    {
                    // InternalModness.g:3432:5: (lv_othervariablevalue_6_0= ruleVariableValue )
                    // InternalModness.g:3433:6: lv_othervariablevalue_6_0= ruleVariableValue
                    {

                    						newCompositeNode(grammarAccess.getOtherVariableAccess().getOthervariablevalueVariableValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_90);
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

                    // InternalModness.g:3450:4: (otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==17) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalModness.g:3451:5: otherlv_7= ',' ( (lv_othervariablevalue_8_0= ruleVariableValue ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_89); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOtherVariableAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalModness.g:3455:5: ( (lv_othervariablevalue_8_0= ruleVariableValue ) )
                    	    // InternalModness.g:3456:6: (lv_othervariablevalue_8_0= ruleVariableValue )
                    	    {
                    	    // InternalModness.g:3456:6: (lv_othervariablevalue_8_0= ruleVariableValue )
                    	    // InternalModness.g:3457:7: lv_othervariablevalue_8_0= ruleVariableValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOtherVariableAccess().getOthervariablevalueVariableValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_90);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getOtherVariableAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:3488:1: entryRuleDatasetSensitiveVariable returns [EObject current=null] : iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF ;
    public final EObject entryRuleDatasetSensitiveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSensitiveVariable = null;


        try {
            // InternalModness.g:3488:65: (iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF )
            // InternalModness.g:3489:2: iv_ruleDatasetSensitiveVariable= ruleDatasetSensitiveVariable EOF
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
    // InternalModness.g:3495:1: ruleDatasetSensitiveVariable returns [EObject current=null] : (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' ) ;
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
            // InternalModness.g:3501:2: ( (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' ) )
            // InternalModness.g:3502:2: (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalModness.g:3502:2: (otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}' )
            // InternalModness.g:3503:3: otherlv_0= 'DatasetSensitiveVariable' otherlv_1= '{' otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ';' otherlv_5= 'mappingSensitiveVariable:' ( ( ruleEString ) ) otherlv_7= ';' otherlv_8= 'values:' otherlv_9= '{' ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) ) (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )* otherlv_13= '}' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSensitiveVariableAccess().getDatasetSensitiveVariableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSensitiveVariableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSensitiveVariableAccess().getNameKeyword_2());
            		
            // InternalModness.g:3515:3: ( (lv_name_3_0= ruleEString ) )
            // InternalModness.g:3516:4: (lv_name_3_0= ruleEString )
            {
            // InternalModness.g:3516:4: (lv_name_3_0= ruleEString )
            // InternalModness.g:3517:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_91); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSensitiveVariableAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSensitiveVariableAccess().getMappingSensitiveVariableKeyword_5());
            		
            // InternalModness.g:3542:3: ( ( ruleEString ) )
            // InternalModness.g:3543:4: ( ruleEString )
            {
            // InternalModness.g:3543:4: ( ruleEString )
            // InternalModness.g:3544:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSensitiveVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getMappingSensitiveVariableSensitiveVariableCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getDatasetSensitiveVariableAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasetSensitiveVariableAccess().getValuesKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_9, grammarAccess.getDatasetSensitiveVariableAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalModness.g:3570:3: ( (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue ) )
            // InternalModness.g:3571:4: (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue )
            {
            // InternalModness.g:3571:4: (lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue )
            // InternalModness.g:3572:5: lv_datasetsensitivevariablevalue_10_0= ruleDatasetSensitiveVariableValue
            {

            					newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueDatasetSensitiveVariableValueParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_90);
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

            // InternalModness.g:3589:3: (otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModness.g:3590:4: otherlv_11= ',' ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) )
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_89); 

            	    				newLeafNode(otherlv_11, grammarAccess.getDatasetSensitiveVariableAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalModness.g:3594:4: ( (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue ) )
            	    // InternalModness.g:3595:5: (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue )
            	    {
            	    // InternalModness.g:3595:5: (lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue )
            	    // InternalModness.g:3596:6: lv_datasetsensitivevariablevalue_12_0= ruleDatasetSensitiveVariableValue
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetSensitiveVariableAccess().getDatasetsensitivevariablevalueDatasetSensitiveVariableValueParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_90);
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

            otherlv_13=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getDatasetSensitiveVariableAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_14=(Token)match(input,24,FOLLOW_2); 

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
    // InternalModness.g:3626:1: ruleBiasSource returns [Enumerator current=null] : ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) ) ;
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
            // InternalModness.g:3632:2: ( ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) ) )
            // InternalModness.g:3633:2: ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) )
            {
            // InternalModness.g:3633:2: ( (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' ) | (enumLiteral_1= 'HUMAN_DISCRIMINATION' ) | (enumLiteral_2= 'WRONG_MEASUREMENT' ) | (enumLiteral_3= 'OMITTED_VARIABLE' ) | (enumLiteral_4= 'WRONG_SAMPLING' ) | (enumLiteral_5= 'WRONG_AGGREGATION' ) | (enumLiteral_6= 'WRONG_LINKING' ) | (enumLiteral_7= 'WRONG_PRESENTATION' ) | (enumLiteral_8= 'RESULT_RANKING' ) | (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' ) | (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' ) | (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' ) )
            int alt43=12;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt43=1;
                }
                break;
            case 91:
                {
                alt43=2;
                }
                break;
            case 92:
                {
                alt43=3;
                }
                break;
            case 93:
                {
                alt43=4;
                }
                break;
            case 94:
                {
                alt43=5;
                }
                break;
            case 95:
                {
                alt43=6;
                }
                break;
            case 96:
                {
                alt43=7;
                }
                break;
            case 97:
                {
                alt43=8;
                }
                break;
            case 98:
                {
                alt43=9;
                }
                break;
            case 99:
                {
                alt43=10;
                }
                break;
            case 100:
                {
                alt43=11;
                }
                break;
            case 101:
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
                    // InternalModness.g:3634:3: (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' )
                    {
                    // InternalModness.g:3634:3: (enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR' )
                    // InternalModness.g:3635:4: enumLiteral_0= 'WRONG_ALGORITHM_BEHAVIOUR'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_ALGORITHM_BEHAVIOUREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBiasSourceAccess().getWRONG_ALGORITHM_BEHAVIOUREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3642:3: (enumLiteral_1= 'HUMAN_DISCRIMINATION' )
                    {
                    // InternalModness.g:3642:3: (enumLiteral_1= 'HUMAN_DISCRIMINATION' )
                    // InternalModness.g:3643:4: enumLiteral_1= 'HUMAN_DISCRIMINATION'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getHUMAN_DISCRIMINATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBiasSourceAccess().getHUMAN_DISCRIMINATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3650:3: (enumLiteral_2= 'WRONG_MEASUREMENT' )
                    {
                    // InternalModness.g:3650:3: (enumLiteral_2= 'WRONG_MEASUREMENT' )
                    // InternalModness.g:3651:4: enumLiteral_2= 'WRONG_MEASUREMENT'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_MEASUREMENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBiasSourceAccess().getWRONG_MEASUREMENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3658:3: (enumLiteral_3= 'OMITTED_VARIABLE' )
                    {
                    // InternalModness.g:3658:3: (enumLiteral_3= 'OMITTED_VARIABLE' )
                    // InternalModness.g:3659:4: enumLiteral_3= 'OMITTED_VARIABLE'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getOMITTED_VARIABLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBiasSourceAccess().getOMITTED_VARIABLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3666:3: (enumLiteral_4= 'WRONG_SAMPLING' )
                    {
                    // InternalModness.g:3666:3: (enumLiteral_4= 'WRONG_SAMPLING' )
                    // InternalModness.g:3667:4: enumLiteral_4= 'WRONG_SAMPLING'
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SAMPLINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBiasSourceAccess().getWRONG_SAMPLINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3674:3: (enumLiteral_5= 'WRONG_AGGREGATION' )
                    {
                    // InternalModness.g:3674:3: (enumLiteral_5= 'WRONG_AGGREGATION' )
                    // InternalModness.g:3675:4: enumLiteral_5= 'WRONG_AGGREGATION'
                    {
                    enumLiteral_5=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_AGGREGATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBiasSourceAccess().getWRONG_AGGREGATIONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalModness.g:3682:3: (enumLiteral_6= 'WRONG_LINKING' )
                    {
                    // InternalModness.g:3682:3: (enumLiteral_6= 'WRONG_LINKING' )
                    // InternalModness.g:3683:4: enumLiteral_6= 'WRONG_LINKING'
                    {
                    enumLiteral_6=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_LINKINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBiasSourceAccess().getWRONG_LINKINGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalModness.g:3690:3: (enumLiteral_7= 'WRONG_PRESENTATION' )
                    {
                    // InternalModness.g:3690:3: (enumLiteral_7= 'WRONG_PRESENTATION' )
                    // InternalModness.g:3691:4: enumLiteral_7= 'WRONG_PRESENTATION'
                    {
                    enumLiteral_7=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_PRESENTATIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBiasSourceAccess().getWRONG_PRESENTATIONEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalModness.g:3698:3: (enumLiteral_8= 'RESULT_RANKING' )
                    {
                    // InternalModness.g:3698:3: (enumLiteral_8= 'RESULT_RANKING' )
                    // InternalModness.g:3699:4: enumLiteral_8= 'RESULT_RANKING'
                    {
                    enumLiteral_8=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getRESULT_RANKINGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBiasSourceAccess().getRESULT_RANKINGEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalModness.g:3706:3: (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' )
                    {
                    // InternalModness.g:3706:3: (enumLiteral_9= 'WRONG_SYSTEM_EVALUATION' )
                    // InternalModness.g:3707:4: enumLiteral_9= 'WRONG_SYSTEM_EVALUATION'
                    {
                    enumLiteral_9=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_EVALUATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_EVALUATIONEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalModness.g:3714:3: (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' )
                    {
                    // InternalModness.g:3714:3: (enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION' )
                    // InternalModness.g:3715:4: enumLiteral_10= 'WRONG_SYSTEM_TARGET_POPULATION'
                    {
                    enumLiteral_10=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_TARGET_POPULATIONEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBiasSourceAccess().getWRONG_SYSTEM_TARGET_POPULATIONEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalModness.g:3722:3: (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' )
                    {
                    // InternalModness.g:3722:3: (enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION' )
                    // InternalModness.g:3723:4: enumLiteral_11= 'CHANGE_IN_TARGET_POPULATION'
                    {
                    enumLiteral_11=(Token)match(input,101,FOLLOW_2); 

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
    // InternalModness.g:3733:1: ruleSingleOperatorParameter returns [Enumerator current=null] : ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) ) ;
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
            // InternalModness.g:3739:2: ( ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) ) )
            // InternalModness.g:3740:2: ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) )
            {
            // InternalModness.g:3740:2: ( (enumLiteral_0= 'EQUAL' ) | (enumLiteral_1= 'GREATER' ) | (enumLiteral_2= 'MINOR' ) | (enumLiteral_3= 'GREATER_EQUAL' ) | (enumLiteral_4= 'MINOR_EQUAL' ) | (enumLiteral_5= 'NOT_EQUAL' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt44=1;
                }
                break;
            case 103:
                {
                alt44=2;
                }
                break;
            case 104:
                {
                alt44=3;
                }
                break;
            case 105:
                {
                alt44=4;
                }
                break;
            case 106:
                {
                alt44=5;
                }
                break;
            case 107:
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
                    // InternalModness.g:3741:3: (enumLiteral_0= 'EQUAL' )
                    {
                    // InternalModness.g:3741:3: (enumLiteral_0= 'EQUAL' )
                    // InternalModness.g:3742:4: enumLiteral_0= 'EQUAL'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSingleOperatorParameterAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3749:3: (enumLiteral_1= 'GREATER' )
                    {
                    // InternalModness.g:3749:3: (enumLiteral_1= 'GREATER' )
                    // InternalModness.g:3750:4: enumLiteral_1= 'GREATER'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSingleOperatorParameterAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3757:3: (enumLiteral_2= 'MINOR' )
                    {
                    // InternalModness.g:3757:3: (enumLiteral_2= 'MINOR' )
                    // InternalModness.g:3758:4: enumLiteral_2= 'MINOR'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getMINOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSingleOperatorParameterAccess().getMINOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3765:3: (enumLiteral_3= 'GREATER_EQUAL' )
                    {
                    // InternalModness.g:3765:3: (enumLiteral_3= 'GREATER_EQUAL' )
                    // InternalModness.g:3766:4: enumLiteral_3= 'GREATER_EQUAL'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getGREATER_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSingleOperatorParameterAccess().getGREATER_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3773:3: (enumLiteral_4= 'MINOR_EQUAL' )
                    {
                    // InternalModness.g:3773:3: (enumLiteral_4= 'MINOR_EQUAL' )
                    // InternalModness.g:3774:4: enumLiteral_4= 'MINOR_EQUAL'
                    {
                    enumLiteral_4=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getSingleOperatorParameterAccess().getMINOR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSingleOperatorParameterAccess().getMINOR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3781:3: (enumLiteral_5= 'NOT_EQUAL' )
                    {
                    // InternalModness.g:3781:3: (enumLiteral_5= 'NOT_EQUAL' )
                    // InternalModness.g:3782:4: enumLiteral_5= 'NOT_EQUAL'
                    {
                    enumLiteral_5=(Token)match(input,107,FOLLOW_2); 

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
    // InternalModness.g:3792:1: ruleRangeOperatorParameter returns [Enumerator current=null] : ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) ) ;
    public final Enumerator ruleRangeOperatorParameter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModness.g:3798:2: ( ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) ) )
            // InternalModness.g:3799:2: ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) )
            {
            // InternalModness.g:3799:2: ( (enumLiteral_0= 'IN_INCLUDED' ) | (enumLiteral_1= 'IN_EXCLUDED' ) | (enumLiteral_2= 'IN_LOWER_INCLUDED' ) | (enumLiteral_3= 'IN_GREATER_INCLUDED' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt45=1;
                }
                break;
            case 109:
                {
                alt45=2;
                }
                break;
            case 110:
                {
                alt45=3;
                }
                break;
            case 111:
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
                    // InternalModness.g:3800:3: (enumLiteral_0= 'IN_INCLUDED' )
                    {
                    // InternalModness.g:3800:3: (enumLiteral_0= 'IN_INCLUDED' )
                    // InternalModness.g:3801:4: enumLiteral_0= 'IN_INCLUDED'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_INCLUDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRangeOperatorParameterAccess().getIN_INCLUDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3808:3: (enumLiteral_1= 'IN_EXCLUDED' )
                    {
                    // InternalModness.g:3808:3: (enumLiteral_1= 'IN_EXCLUDED' )
                    // InternalModness.g:3809:4: enumLiteral_1= 'IN_EXCLUDED'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_EXCLUDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRangeOperatorParameterAccess().getIN_EXCLUDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3816:3: (enumLiteral_2= 'IN_LOWER_INCLUDED' )
                    {
                    // InternalModness.g:3816:3: (enumLiteral_2= 'IN_LOWER_INCLUDED' )
                    // InternalModness.g:3817:4: enumLiteral_2= 'IN_LOWER_INCLUDED'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorParameterAccess().getIN_LOWER_INCLUDEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRangeOperatorParameterAccess().getIN_LOWER_INCLUDEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3824:3: (enumLiteral_3= 'IN_GREATER_INCLUDED' )
                    {
                    // InternalModness.g:3824:3: (enumLiteral_3= 'IN_GREATER_INCLUDED' )
                    // InternalModness.g:3825:4: enumLiteral_3= 'IN_GREATER_INCLUDED'
                    {
                    enumLiteral_3=(Token)match(input,111,FOLLOW_2); 

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
    // InternalModness.g:3835:1: ruleArithmeticOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModness.g:3841:2: ( ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) ) )
            // InternalModness.g:3842:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) )
            {
            // InternalModness.g:3842:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFFERENCE' ) | (enumLiteral_2= 'MULTIPLICATION' ) | (enumLiteral_3= 'RATIO' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt46=1;
                }
                break;
            case 113:
                {
                alt46=2;
                }
                break;
            case 114:
                {
                alt46=3;
                }
                break;
            case 115:
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
                    // InternalModness.g:3843:3: (enumLiteral_0= 'SUM' )
                    {
                    // InternalModness.g:3843:3: (enumLiteral_0= 'SUM' )
                    // InternalModness.g:3844:4: enumLiteral_0= 'SUM'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getSUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperatorAccess().getSUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3851:3: (enumLiteral_1= 'DIFFERENCE' )
                    {
                    // InternalModness.g:3851:3: (enumLiteral_1= 'DIFFERENCE' )
                    // InternalModness.g:3852:4: enumLiteral_1= 'DIFFERENCE'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getDIFFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperatorAccess().getDIFFERENCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3859:3: (enumLiteral_2= 'MULTIPLICATION' )
                    {
                    // InternalModness.g:3859:3: (enumLiteral_2= 'MULTIPLICATION' )
                    // InternalModness.g:3860:4: enumLiteral_2= 'MULTIPLICATION'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3867:3: (enumLiteral_3= 'RATIO' )
                    {
                    // InternalModness.g:3867:3: (enumLiteral_3= 'RATIO' )
                    // InternalModness.g:3868:4: enumLiteral_3= 'RATIO'
                    {
                    enumLiteral_3=(Token)match(input,115,FOLLOW_2); 

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
    // InternalModness.g:3878:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalModness.g:3884:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalModness.g:3885:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalModness.g:3885:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==116) ) {
                alt47=1;
            }
            else if ( (LA47_0==117) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalModness.g:3886:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalModness.g:3886:3: (enumLiteral_0= 'AND' )
                    // InternalModness.g:3887:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3894:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalModness.g:3894:3: (enumLiteral_1= 'OR' )
                    // InternalModness.g:3895:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

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
    // InternalModness.g:3905:1: ruleGroupFairnessMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) ) ;
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
            // InternalModness.g:3911:2: ( ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) ) )
            // InternalModness.g:3912:2: ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) )
            {
            // InternalModness.g:3912:2: ( (enumLiteral_0= 'STATISTICAL_PARITY' ) | (enumLiteral_1= 'DISPARATE_IMPACT' ) | (enumLiteral_2= 'EQUALIZED_ODDS' ) | (enumLiteral_3= 'EQUAL_ACCURACY' ) | (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' ) | (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt48=1;
                }
                break;
            case 119:
                {
                alt48=2;
                }
                break;
            case 120:
                {
                alt48=3;
                }
                break;
            case 121:
                {
                alt48=4;
                }
                break;
            case 122:
                {
                alt48=5;
                }
                break;
            case 123:
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
                    // InternalModness.g:3913:3: (enumLiteral_0= 'STATISTICAL_PARITY' )
                    {
                    // InternalModness.g:3913:3: (enumLiteral_0= 'STATISTICAL_PARITY' )
                    // InternalModness.g:3914:4: enumLiteral_0= 'STATISTICAL_PARITY'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getSTATISTICAL_PARITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGroupFairnessMetricAccess().getSTATISTICAL_PARITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3921:3: (enumLiteral_1= 'DISPARATE_IMPACT' )
                    {
                    // InternalModness.g:3921:3: (enumLiteral_1= 'DISPARATE_IMPACT' )
                    // InternalModness.g:3922:4: enumLiteral_1= 'DISPARATE_IMPACT'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getDISPARATE_IMPACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGroupFairnessMetricAccess().getDISPARATE_IMPACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3929:3: (enumLiteral_2= 'EQUALIZED_ODDS' )
                    {
                    // InternalModness.g:3929:3: (enumLiteral_2= 'EQUALIZED_ODDS' )
                    // InternalModness.g:3930:4: enumLiteral_2= 'EQUALIZED_ODDS'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getEQUALIZED_ODDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGroupFairnessMetricAccess().getEQUALIZED_ODDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModness.g:3937:3: (enumLiteral_3= 'EQUAL_ACCURACY' )
                    {
                    // InternalModness.g:3937:3: (enumLiteral_3= 'EQUAL_ACCURACY' )
                    // InternalModness.g:3938:4: enumLiteral_3= 'EQUAL_ACCURACY'
                    {
                    enumLiteral_3=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getEQUAL_ACCURACYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGroupFairnessMetricAccess().getEQUAL_ACCURACYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalModness.g:3945:3: (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' )
                    {
                    // InternalModness.g:3945:3: (enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE' )
                    // InternalModness.g:3946:4: enumLiteral_4= 'FALSE_POSITIVE_DIFFERENCE'
                    {
                    enumLiteral_4=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getGroupFairnessMetricAccess().getFALSE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getGroupFairnessMetricAccess().getFALSE_POSITIVE_DIFFERENCEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalModness.g:3953:3: (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' )
                    {
                    // InternalModness.g:3953:3: (enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE' )
                    // InternalModness.g:3954:4: enumLiteral_5= 'TRUE_POSITIVE_DIFFERENCE'
                    {
                    enumLiteral_5=(Token)match(input,123,FOLLOW_2); 

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
    // InternalModness.g:3964:1: ruleIndividualFairnessMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) ) ;
    public final Enumerator ruleIndividualFairnessMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalModness.g:3970:2: ( ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) ) )
            // InternalModness.g:3971:2: ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) )
            {
            // InternalModness.g:3971:2: ( (enumLiteral_0= 'MANHATTAN_DISTANCE' ) | (enumLiteral_1= 'EUCLIDEAN_DISTANCE' ) | (enumLiteral_2= 'MAHALANOBIS_DISTANCE' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt49=1;
                }
                break;
            case 125:
                {
                alt49=2;
                }
                break;
            case 126:
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
                    // InternalModness.g:3972:3: (enumLiteral_0= 'MANHATTAN_DISTANCE' )
                    {
                    // InternalModness.g:3972:3: (enumLiteral_0= 'MANHATTAN_DISTANCE' )
                    // InternalModness.g:3973:4: enumLiteral_0= 'MANHATTAN_DISTANCE'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getMANHATTAN_DISTANCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIndividualFairnessMetricAccess().getMANHATTAN_DISTANCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModness.g:3980:3: (enumLiteral_1= 'EUCLIDEAN_DISTANCE' )
                    {
                    // InternalModness.g:3980:3: (enumLiteral_1= 'EUCLIDEAN_DISTANCE' )
                    // InternalModness.g:3981:4: enumLiteral_1= 'EUCLIDEAN_DISTANCE'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getIndividualFairnessMetricAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIndividualFairnessMetricAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModness.g:3988:3: (enumLiteral_2= 'MAHALANOBIS_DISTANCE' )
                    {
                    // InternalModness.g:3988:3: (enumLiteral_2= 'MAHALANOBIS_DISTANCE' )
                    // InternalModness.g:3989:4: enumLiteral_2= 'MAHALANOBIS_DISTANCE'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFC000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000C000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4400000000000000L,0x00000000000062CAL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x00000FC000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x000F000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000001000000L,0x0030000000020001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0080000001000000L,0x0030000000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000030L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0080000000080000L,0x0030000000020000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0FC0000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000004000080000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0030000000020000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0030000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0080000000000000L,0x0030000000020000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000001000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000001000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000001000L,0x0000000000100000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});

}
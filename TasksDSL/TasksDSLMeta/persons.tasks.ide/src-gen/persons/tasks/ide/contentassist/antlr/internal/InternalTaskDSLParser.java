package persons.tasks.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import persons.tasks.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'balance'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'min'", "'hour'", "'day'", "'week'", "'Planning:'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'If'", "'NOT'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'max'", "'mod'", "'^'", "'anonymous'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BOOL_LITERAL=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTaskDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDSL.g"; }


    	private TaskDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePlanning"
    // InternalTaskDSL.g:54:1: entryRulePlanning : rulePlanning EOF ;
    public final void entryRulePlanning() throws RecognitionException {
        try {
            // InternalTaskDSL.g:55:1: ( rulePlanning EOF )
            // InternalTaskDSL.g:56:1: rulePlanning EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlanning();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:63:1: rulePlanning : ( ( rule__Planning__Group__0 ) ) ;
    public final void rulePlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:67:2: ( ( ( rule__Planning__Group__0 ) ) )
            // InternalTaskDSL.g:68:2: ( ( rule__Planning__Group__0 ) )
            {
            // InternalTaskDSL.g:68:2: ( ( rule__Planning__Group__0 ) )
            // InternalTaskDSL.g:69:3: ( rule__Planning__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getGroup()); 
            }
            // InternalTaskDSL.g:70:3: ( rule__Planning__Group__0 )
            // InternalTaskDSL.g:70:4: rule__Planning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:79:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalTaskDSL.g:80:1: ( rulePerson EOF )
            // InternalTaskDSL.g:81:1: rulePerson EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalTaskDSL.g:88:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:92:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalTaskDSL.g:93:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalTaskDSL.g:93:2: ( ( rule__Person__Group__0 ) )
            // InternalTaskDSL.g:94:3: ( rule__Person__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getGroup()); 
            }
            // InternalTaskDSL.g:95:3: ( rule__Person__Group__0 )
            // InternalTaskDSL.g:95:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:104:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:105:1: ( ruleTask EOF )
            // InternalTaskDSL.g:106:1: ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:113:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:117:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:118:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:118:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:119:3: ( rule__Task__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup()); 
            }
            // InternalTaskDSL.g:120:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:120:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:129:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalTaskDSL.g:130:1: ( ruleDuration EOF )
            // InternalTaskDSL.g:131:1: ruleDuration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalTaskDSL.g:138:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:142:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalTaskDSL.g:143:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalTaskDSL.g:143:2: ( ( rule__Duration__Group__0 ) )
            // InternalTaskDSL.g:144:3: ( rule__Duration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getGroup()); 
            }
            // InternalTaskDSL.g:145:3: ( rule__Duration__Group__0 )
            // InternalTaskDSL.g:145:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:154:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:155:1: ( ruleAction EOF )
            // InternalTaskDSL.g:156:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:163:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:167:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:168:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:168:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:169:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:170:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:170:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:179:1: entryRuleLunchAction : ruleLunchAction EOF ;
    public final void entryRuleLunchAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:180:1: ( ruleLunchAction EOF )
            // InternalTaskDSL.g:181:1: ruleLunchAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLunchAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:188:1: ruleLunchAction : ( ( rule__LunchAction__Group__0 ) ) ;
    public final void ruleLunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:192:2: ( ( ( rule__LunchAction__Group__0 ) ) )
            // InternalTaskDSL.g:193:2: ( ( rule__LunchAction__Group__0 ) )
            {
            // InternalTaskDSL.g:193:2: ( ( rule__LunchAction__Group__0 ) )
            // InternalTaskDSL.g:194:3: ( rule__LunchAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:195:3: ( rule__LunchAction__Group__0 )
            // InternalTaskDSL.g:195:4: rule__LunchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:204:1: entryRuleMeetingAction : ruleMeetingAction EOF ;
    public final void entryRuleMeetingAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:205:1: ( ruleMeetingAction EOF )
            // InternalTaskDSL.g:206:1: ruleMeetingAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMeetingAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:213:1: ruleMeetingAction : ( ( rule__MeetingAction__Group__0 ) ) ;
    public final void ruleMeetingAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:217:2: ( ( ( rule__MeetingAction__Group__0 ) ) )
            // InternalTaskDSL.g:218:2: ( ( rule__MeetingAction__Group__0 ) )
            {
            // InternalTaskDSL.g:218:2: ( ( rule__MeetingAction__Group__0 ) )
            // InternalTaskDSL.g:219:3: ( rule__MeetingAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:220:3: ( rule__MeetingAction__Group__0 )
            // InternalTaskDSL.g:220:4: rule__MeetingAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:229:1: entryRulePaperAction : rulePaperAction EOF ;
    public final void entryRulePaperAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:230:1: ( rulePaperAction EOF )
            // InternalTaskDSL.g:231:1: rulePaperAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePaperAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:238:1: rulePaperAction : ( ( rule__PaperAction__Group__0 ) ) ;
    public final void rulePaperAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:242:2: ( ( ( rule__PaperAction__Group__0 ) ) )
            // InternalTaskDSL.g:243:2: ( ( rule__PaperAction__Group__0 ) )
            {
            // InternalTaskDSL.g:243:2: ( ( rule__PaperAction__Group__0 ) )
            // InternalTaskDSL.g:244:3: ( rule__PaperAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:245:3: ( rule__PaperAction__Group__0 )
            // InternalTaskDSL.g:245:4: rule__PaperAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:254:1: entryRulePaymentAction : rulePaymentAction EOF ;
    public final void entryRulePaymentAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:255:1: ( rulePaymentAction EOF )
            // InternalTaskDSL.g:256:1: rulePaymentAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePaymentAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:263:1: rulePaymentAction : ( ( rule__PaymentAction__Group__0 ) ) ;
    public final void rulePaymentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:267:2: ( ( ( rule__PaymentAction__Group__0 ) ) )
            // InternalTaskDSL.g:268:2: ( ( rule__PaymentAction__Group__0 ) )
            {
            // InternalTaskDSL.g:268:2: ( ( rule__PaymentAction__Group__0 ) )
            // InternalTaskDSL.g:269:3: ( rule__PaymentAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:270:3: ( rule__PaymentAction__Group__0 )
            // InternalTaskDSL.g:270:4: rule__PaymentAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalTaskDSL.g:279:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:280:1: ( ruleBooleanExpression EOF )
            // InternalTaskDSL.g:281:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalTaskDSL.g:288:1: ruleBooleanExpression : ( ruleBooleanExpressionLevel1 ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:292:2: ( ( ruleBooleanExpressionLevel1 ) )
            // InternalTaskDSL.g:293:2: ( ruleBooleanExpressionLevel1 )
            {
            // InternalTaskDSL.g:293:2: ( ruleBooleanExpressionLevel1 )
            // InternalTaskDSL.g:294:3: ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalTaskDSL.g:304:1: entryRuleBooleanExpressionLevel1 : ruleBooleanExpressionLevel1 EOF ;
    public final void entryRuleBooleanExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:305:1: ( ruleBooleanExpressionLevel1 EOF )
            // InternalTaskDSL.g:306:1: ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalTaskDSL.g:313:1: ruleBooleanExpressionLevel1 : ( ( rule__BooleanExpressionLevel1__Group__0 ) ) ;
    public final void ruleBooleanExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:317:2: ( ( ( rule__BooleanExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:318:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:318:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:319:3: ( rule__BooleanExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }
            // InternalTaskDSL.g:320:3: ( rule__BooleanExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:320:4: rule__BooleanExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalTaskDSL.g:329:1: entryRuleBooleanExpressionLevel2 : ruleBooleanExpressionLevel2 EOF ;
    public final void entryRuleBooleanExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:330:1: ( ruleBooleanExpressionLevel2 EOF )
            // InternalTaskDSL.g:331:1: ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalTaskDSL.g:338:1: ruleBooleanExpressionLevel2 : ( ( rule__BooleanExpressionLevel2__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:342:2: ( ( ( rule__BooleanExpressionLevel2__Alternatives ) ) )
            // InternalTaskDSL.g:343:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            {
            // InternalTaskDSL.g:343:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            // InternalTaskDSL.g:344:3: ( rule__BooleanExpressionLevel2__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:345:3: ( rule__BooleanExpressionLevel2__Alternatives )
            // InternalTaskDSL.g:345:4: rule__BooleanExpressionLevel2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel2__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalTaskDSL.g:354:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:355:1: ( ruleNotExpression EOF )
            // InternalTaskDSL.g:356:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalTaskDSL.g:363:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:367:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalTaskDSL.g:368:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalTaskDSL.g:368:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalTaskDSL.g:369:3: ( rule__NotExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:370:3: ( rule__NotExpression__Group__0 )
            // InternalTaskDSL.g:370:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalTaskDSL.g:379:1: entryRuleBooleanExpressionLevel3 : ruleBooleanExpressionLevel3 EOF ;
    public final void entryRuleBooleanExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:380:1: ( ruleBooleanExpressionLevel3 EOF )
            // InternalTaskDSL.g:381:1: ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalTaskDSL.g:388:1: ruleBooleanExpressionLevel3 : ( ( rule__BooleanExpressionLevel3__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:392:2: ( ( ( rule__BooleanExpressionLevel3__Alternatives ) ) )
            // InternalTaskDSL.g:393:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            {
            // InternalTaskDSL.g:393:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            // InternalTaskDSL.g:394:3: ( rule__BooleanExpressionLevel3__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:395:3: ( rule__BooleanExpressionLevel3__Alternatives )
            // InternalTaskDSL.g:395:4: rule__BooleanExpressionLevel3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel3__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTaskDSL.g:404:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:405:1: ( ruleComparisonExpression EOF )
            // InternalTaskDSL.g:406:1: ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTaskDSL.g:413:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:417:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalTaskDSL.g:418:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalTaskDSL.g:418:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalTaskDSL.g:419:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:420:3: ( rule__ComparisonExpression__Group__0 )
            // InternalTaskDSL.g:420:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalTaskDSL.g:429:1: entryRuleBooleanExpressionBracket : ruleBooleanExpressionBracket EOF ;
    public final void entryRuleBooleanExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:430:1: ( ruleBooleanExpressionBracket EOF )
            // InternalTaskDSL.g:431:1: ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalTaskDSL.g:438:1: ruleBooleanExpressionBracket : ( ( rule__BooleanExpressionBracket__Group__0 ) ) ;
    public final void ruleBooleanExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:442:2: ( ( ( rule__BooleanExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:443:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:443:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:444:3: ( rule__BooleanExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }
            // InternalTaskDSL.g:445:3: ( rule__BooleanExpressionBracket__Group__0 )
            // InternalTaskDSL.g:445:4: rule__BooleanExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalTaskDSL.g:454:1: entryRuleBooleanExpressionConstant : ruleBooleanExpressionConstant EOF ;
    public final void entryRuleBooleanExpressionConstant() throws RecognitionException {
        try {
            // InternalTaskDSL.g:455:1: ( ruleBooleanExpressionConstant EOF )
            // InternalTaskDSL.g:456:1: ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalTaskDSL.g:463:1: ruleBooleanExpressionConstant : ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) ;
    public final void ruleBooleanExpressionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:467:2: ( ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) )
            // InternalTaskDSL.g:468:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            {
            // InternalTaskDSL.g:468:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            // InternalTaskDSL.g:469:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:470:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            // InternalTaskDSL.g:470:4: rule__BooleanExpressionConstant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:479:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:480:1: ( ruleIntExpression EOF )
            // InternalTaskDSL.g:481:1: ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTaskDSL.g:488:1: ruleIntExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:492:2: ( ( ruleExpressionLevel1 ) )
            // InternalTaskDSL.g:493:2: ( ruleExpressionLevel1 )
            {
            // InternalTaskDSL.g:493:2: ( ruleExpressionLevel1 )
            // InternalTaskDSL.g:494:3: ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:504:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:505:1: ( ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:506:1: ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalTaskDSL.g:513:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:517:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:518:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:518:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:519:3: ( rule__ExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }
            // InternalTaskDSL.g:520:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:520:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:529:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:530:1: ( ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:531:1: ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalTaskDSL.g:538:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:542:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalTaskDSL.g:543:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalTaskDSL.g:543:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalTaskDSL.g:544:3: ( rule__ExpressionLevel2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }
            // InternalTaskDSL.g:545:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalTaskDSL.g:545:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:554:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:555:1: ( ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:556:1: ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalTaskDSL.g:563:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:567:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalTaskDSL.g:568:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalTaskDSL.g:568:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalTaskDSL.g:569:3: ( rule__ExpressionLevel3__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }
            // InternalTaskDSL.g:570:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalTaskDSL.g:570:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:579:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalTaskDSL.g:580:1: ( ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:581:1: ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalTaskDSL.g:588:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Alternatives ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:592:2: ( ( ( rule__ExpressionLevel4__Alternatives ) ) )
            // InternalTaskDSL.g:593:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            {
            // InternalTaskDSL.g:593:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            // InternalTaskDSL.g:594:3: ( rule__ExpressionLevel4__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:595:3: ( rule__ExpressionLevel4__Alternatives )
            // InternalTaskDSL.g:595:4: rule__ExpressionLevel4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:604:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:605:1: ( ruleExpressionMinus EOF )
            // InternalTaskDSL.g:606:1: ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalTaskDSL.g:613:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:617:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalTaskDSL.g:618:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalTaskDSL.g:618:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalTaskDSL.g:619:3: ( rule__ExpressionMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }
            // InternalTaskDSL.g:620:3: ( rule__ExpressionMinus__Group__0 )
            // InternalTaskDSL.g:620:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:629:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:630:1: ( ruleExpressionPlus EOF )
            // InternalTaskDSL.g:631:1: ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalTaskDSL.g:638:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:642:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalTaskDSL.g:643:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalTaskDSL.g:643:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalTaskDSL.g:644:3: ( rule__ExpressionPlus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }
            // InternalTaskDSL.g:645:3: ( rule__ExpressionPlus__Group__0 )
            // InternalTaskDSL.g:645:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:654:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalTaskDSL.g:655:1: ( ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:656:1: ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalTaskDSL.g:663:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Alternatives ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:667:2: ( ( ( rule__ExpressionLevel5__Alternatives ) ) )
            // InternalTaskDSL.g:668:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            {
            // InternalTaskDSL.g:668:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            // InternalTaskDSL.g:669:3: ( rule__ExpressionLevel5__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:670:3: ( rule__ExpressionLevel5__Alternatives )
            // InternalTaskDSL.g:670:4: rule__ExpressionLevel5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:679:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:680:1: ( ruleExpressionBracket EOF )
            // InternalTaskDSL.g:681:1: ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalTaskDSL.g:688:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:692:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:693:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:693:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:694:3: ( rule__ExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }
            // InternalTaskDSL.g:695:3: ( rule__ExpressionBracket__Group__0 )
            // InternalTaskDSL.g:695:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:704:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalTaskDSL.g:705:1: ( ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:706:1: ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalTaskDSL.g:713:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:717:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalTaskDSL.g:718:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalTaskDSL.g:718:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalTaskDSL.g:719:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:720:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalTaskDSL.g:720:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:729:1: entryRuleExpressionBalance : ruleExpressionBalance EOF ;
    public final void entryRuleExpressionBalance() throws RecognitionException {
        try {
            // InternalTaskDSL.g:730:1: ( ruleExpressionBalance EOF )
            // InternalTaskDSL.g:731:1: ruleExpressionBalance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBalance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionBalance"


    // $ANTLR start "ruleExpressionBalance"
    // InternalTaskDSL.g:738:1: ruleExpressionBalance : ( ( rule__ExpressionBalance__ValueAssignment ) ) ;
    public final void ruleExpressionBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:742:2: ( ( ( rule__ExpressionBalance__ValueAssignment ) ) )
            // InternalTaskDSL.g:743:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            {
            // InternalTaskDSL.g:743:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            // InternalTaskDSL.g:744:3: ( rule__ExpressionBalance__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:745:3: ( rule__ExpressionBalance__ValueAssignment )
            // InternalTaskDSL.g:745:4: rule__ExpressionBalance__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBalance__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalTaskDSL.g:754:1: ruleBinaryBooleanOperator : ( ( rule__BinaryBooleanOperator__Alternatives ) ) ;
    public final void ruleBinaryBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:758:1: ( ( ( rule__BinaryBooleanOperator__Alternatives ) ) )
            // InternalTaskDSL.g:759:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            {
            // InternalTaskDSL.g:759:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            // InternalTaskDSL.g:760:3: ( rule__BinaryBooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:761:3: ( rule__BinaryBooleanOperator__Alternatives )
            // InternalTaskDSL.g:761:4: rule__BinaryBooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalTaskDSL.g:770:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:774:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalTaskDSL.g:775:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalTaskDSL.g:775:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalTaskDSL.g:776:3: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:777:3: ( rule__CompareOperator__Alternatives )
            // InternalTaskDSL.g:777:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:786:1: ruleBalance : ( ( 'balance' ) ) ;
    public final void ruleBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:790:1: ( ( ( 'balance' ) ) )
            // InternalTaskDSL.g:791:2: ( ( 'balance' ) )
            {
            // InternalTaskDSL.g:791:2: ( ( 'balance' ) )
            // InternalTaskDSL.g:792:3: ( 'balance' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
            }
            // InternalTaskDSL.g:793:3: ( 'balance' )
            // InternalTaskDSL.g:793:4: 'balance'
            {
            match(input,12,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBalance"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:802:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:806:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalTaskDSL.g:807:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalTaskDSL.g:807:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalTaskDSL.g:808:3: ( rule__TimeUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:809:3: ( rule__TimeUnit__Alternatives )
            // InternalTaskDSL.g:809:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Planning__Alternatives_3"
    // InternalTaskDSL.g:817:1: rule__Planning__Alternatives_3 : ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) );
    public final void rule__Planning__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:821:1: ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:822:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    {
                    // InternalTaskDSL.g:822:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    // InternalTaskDSL.g:823:3: ( rule__Planning__PersonsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    }
                    // InternalTaskDSL.g:824:3: ( rule__Planning__PersonsAssignment_3_0 )
                    // InternalTaskDSL.g:824:4: rule__Planning__PersonsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__PersonsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:828:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    {
                    // InternalTaskDSL.g:828:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    // InternalTaskDSL.g:829:3: ( rule__Planning__TasksAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    }
                    // InternalTaskDSL.g:830:3: ( rule__Planning__TasksAssignment_3_1 )
                    // InternalTaskDSL.g:830:4: rule__Planning__TasksAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__TasksAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Alternatives_3"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalTaskDSL.g:838:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:842:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 34:
            case 36:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:843:2: ( ruleLunchAction )
                    {
                    // InternalTaskDSL.g:843:2: ( ruleLunchAction )
                    // InternalTaskDSL.g:844:3: ruleLunchAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLunchAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:849:2: ( ruleMeetingAction )
                    {
                    // InternalTaskDSL.g:849:2: ( ruleMeetingAction )
                    // InternalTaskDSL.g:850:3: ruleMeetingAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMeetingAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:855:2: ( rulePaperAction )
                    {
                    // InternalTaskDSL.g:855:2: ( rulePaperAction )
                    // InternalTaskDSL.g:856:3: rulePaperAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePaperAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:861:2: ( rulePaymentAction )
                    {
                    // InternalTaskDSL.g:861:2: ( rulePaymentAction )
                    // InternalTaskDSL.g:862:3: rulePaymentAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePaymentAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel2__Alternatives"
    // InternalTaskDSL.g:871:1: rule__BooleanExpressionLevel2__Alternatives : ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) );
    public final void rule__BooleanExpressionLevel2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:875:1: ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT||LA3_0==RULE_BOOL_LITERAL||LA3_0==12||LA3_0==38||(LA3_0>=40 && LA3_0<=41)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:876:2: ( ruleNotExpression )
                    {
                    // InternalTaskDSL.g:876:2: ( ruleNotExpression )
                    // InternalTaskDSL.g:877:3: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:882:2: ( ruleBooleanExpressionLevel3 )
                    {
                    // InternalTaskDSL.g:882:2: ( ruleBooleanExpressionLevel3 )
                    // InternalTaskDSL.g:883:3: ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel2__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel3__Alternatives"
    // InternalTaskDSL.g:892:1: rule__BooleanExpressionLevel3__Alternatives : ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) );
    public final void rule__BooleanExpressionLevel3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:896:1: ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 12:
            case 40:
            case 41:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred6_InternalTaskDSL()) ) {
                    alt4=1;
                }
                else if ( (synpred7_InternalTaskDSL()) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:897:2: ( ( ruleComparisonExpression ) )
                    {
                    // InternalTaskDSL.g:897:2: ( ( ruleComparisonExpression ) )
                    // InternalTaskDSL.g:898:3: ( ruleComparisonExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }
                    // InternalTaskDSL.g:899:3: ( ruleComparisonExpression )
                    // InternalTaskDSL.g:899:4: ruleComparisonExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:903:2: ( ruleBooleanExpressionBracket )
                    {
                    // InternalTaskDSL.g:903:2: ( ruleBooleanExpressionBracket )
                    // InternalTaskDSL.g:904:3: ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:909:2: ( ruleBooleanExpressionConstant )
                    {
                    // InternalTaskDSL.g:909:2: ( ruleBooleanExpressionConstant )
                    // InternalTaskDSL.g:910:3: ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel3__Alternatives"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1"
    // InternalTaskDSL.g:919:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:923:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                alt5=1;
            }
            else if ( (LA5_0==41) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:924:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:924:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalTaskDSL.g:925:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }
                    // InternalTaskDSL.g:926:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalTaskDSL.g:926:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:930:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:930:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalTaskDSL.g:931:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }
                    // InternalTaskDSL.g:932:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalTaskDSL.g:932:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel2__Alternatives_1"
    // InternalTaskDSL.g:940:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:944:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt6=1;
                }
                break;
            case 43:
                {
                alt6=2;
                }
                break;
            case 44:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 45:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:945:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:945:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalTaskDSL.g:946:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }
                    // InternalTaskDSL.g:947:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalTaskDSL.g:947:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:951:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:951:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalTaskDSL.g:952:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }
                    // InternalTaskDSL.g:953:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalTaskDSL.g:953:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:957:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    {
                    // InternalTaskDSL.g:957:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    // InternalTaskDSL.g:958:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }
                    // InternalTaskDSL.g:959:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    // InternalTaskDSL.g:959:4: rule__ExpressionLevel2__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:963:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    {
                    // InternalTaskDSL.g:963:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    // InternalTaskDSL.g:964:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }
                    // InternalTaskDSL.g:965:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    // InternalTaskDSL.g:965:4: rule__ExpressionLevel2__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:969:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    {
                    // InternalTaskDSL.g:969:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    // InternalTaskDSL.g:970:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }
                    // InternalTaskDSL.g:971:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    // InternalTaskDSL.g:971:4: rule__ExpressionLevel2__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel4__Alternatives"
    // InternalTaskDSL.g:979:1: rule__ExpressionLevel4__Alternatives : ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) );
    public final void rule__ExpressionLevel4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:983:1: ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 40:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
            case 12:
            case 38:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:984:2: ( ruleExpressionMinus )
                    {
                    // InternalTaskDSL.g:984:2: ( ruleExpressionMinus )
                    // InternalTaskDSL.g:985:3: ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:990:2: ( ruleExpressionPlus )
                    {
                    // InternalTaskDSL.g:990:2: ( ruleExpressionPlus )
                    // InternalTaskDSL.g:991:3: ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:996:2: ( ruleExpressionLevel5 )
                    {
                    // InternalTaskDSL.g:996:2: ( ruleExpressionLevel5 )
                    // InternalTaskDSL.g:997:3: ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Alternatives"


    // $ANTLR start "rule__ExpressionLevel5__Alternatives"
    // InternalTaskDSL.g:1006:1: rule__ExpressionLevel5__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) );
    public final void rule__ExpressionLevel5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1010:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case 12:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:1011:2: ( ruleExpressionBracket )
                    {
                    // InternalTaskDSL.g:1011:2: ( ruleExpressionBracket )
                    // InternalTaskDSL.g:1012:3: ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1017:2: ( ruleExpressionConstantInt )
                    {
                    // InternalTaskDSL.g:1017:2: ( ruleExpressionConstantInt )
                    // InternalTaskDSL.g:1018:3: ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1023:2: ( ruleExpressionBalance )
                    {
                    // InternalTaskDSL.g:1023:2: ( ruleExpressionBalance )
                    // InternalTaskDSL.g:1024:3: ruleExpressionBalance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBalance();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Alternatives"


    // $ANTLR start "rule__BinaryBooleanOperator__Alternatives"
    // InternalTaskDSL.g:1033:1: rule__BinaryBooleanOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryBooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1037:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:1038:2: ( ( 'AND' ) )
                    {
                    // InternalTaskDSL.g:1038:2: ( ( 'AND' ) )
                    // InternalTaskDSL.g:1039:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1040:3: ( 'AND' )
                    // InternalTaskDSL.g:1040:4: 'AND'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1044:2: ( ( 'OR' ) )
                    {
                    // InternalTaskDSL.g:1044:2: ( ( 'OR' ) )
                    // InternalTaskDSL.g:1045:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1046:3: ( 'OR' )
                    // InternalTaskDSL.g:1046:4: 'OR'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalTaskDSL.g:1054:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1058:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            case 18:
                {
                alt10=4;
                }
                break;
            case 19:
                {
                alt10=5;
                }
                break;
            case 20:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTaskDSL.g:1059:2: ( ( '==' ) )
                    {
                    // InternalTaskDSL.g:1059:2: ( ( '==' ) )
                    // InternalTaskDSL.g:1060:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1061:3: ( '==' )
                    // InternalTaskDSL.g:1061:4: '=='
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1065:2: ( ( '!=' ) )
                    {
                    // InternalTaskDSL.g:1065:2: ( ( '!=' ) )
                    // InternalTaskDSL.g:1066:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1067:3: ( '!=' )
                    // InternalTaskDSL.g:1067:4: '!='
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1071:2: ( ( '>=' ) )
                    {
                    // InternalTaskDSL.g:1071:2: ( ( '>=' ) )
                    // InternalTaskDSL.g:1072:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalTaskDSL.g:1073:3: ( '>=' )
                    // InternalTaskDSL.g:1073:4: '>='
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1077:2: ( ( '>' ) )
                    {
                    // InternalTaskDSL.g:1077:2: ( ( '>' ) )
                    // InternalTaskDSL.g:1078:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }
                    // InternalTaskDSL.g:1079:3: ( '>' )
                    // InternalTaskDSL.g:1079:4: '>'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:1083:2: ( ( '<=' ) )
                    {
                    // InternalTaskDSL.g:1083:2: ( ( '<=' ) )
                    // InternalTaskDSL.g:1084:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalTaskDSL.g:1085:3: ( '<=' )
                    // InternalTaskDSL.g:1085:4: '<='
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDSL.g:1089:2: ( ( '<' ) )
                    {
                    // InternalTaskDSL.g:1089:2: ( ( '<' ) )
                    // InternalTaskDSL.g:1090:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }
                    // InternalTaskDSL.g:1091:3: ( '<' )
                    // InternalTaskDSL.g:1091:4: '<'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalTaskDSL.g:1099:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1103:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:1104:2: ( ( 'min' ) )
                    {
                    // InternalTaskDSL.g:1104:2: ( ( 'min' ) )
                    // InternalTaskDSL.g:1105:3: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1106:3: ( 'min' )
                    // InternalTaskDSL.g:1106:4: 'min'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1110:2: ( ( 'hour' ) )
                    {
                    // InternalTaskDSL.g:1110:2: ( ( 'hour' ) )
                    // InternalTaskDSL.g:1111:3: ( 'hour' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1112:3: ( 'hour' )
                    // InternalTaskDSL.g:1112:4: 'hour'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1116:2: ( ( 'day' ) )
                    {
                    // InternalTaskDSL.g:1116:2: ( ( 'day' ) )
                    // InternalTaskDSL.g:1117:3: ( 'day' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    }
                    // InternalTaskDSL.g:1118:3: ( 'day' )
                    // InternalTaskDSL.g:1118:4: 'day'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1122:2: ( ( 'week' ) )
                    {
                    // InternalTaskDSL.g:1122:2: ( ( 'week' ) )
                    // InternalTaskDSL.g:1123:3: ( 'week' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    }
                    // InternalTaskDSL.g:1124:3: ( 'week' )
                    // InternalTaskDSL.g:1124:4: 'week'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Planning__Group__0"
    // InternalTaskDSL.g:1132:1: rule__Planning__Group__0 : rule__Planning__Group__0__Impl rule__Planning__Group__1 ;
    public final void rule__Planning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1136:1: ( rule__Planning__Group__0__Impl rule__Planning__Group__1 )
            // InternalTaskDSL.g:1137:2: rule__Planning__Group__0__Impl rule__Planning__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Planning__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0"


    // $ANTLR start "rule__Planning__Group__0__Impl"
    // InternalTaskDSL.g:1144:1: rule__Planning__Group__0__Impl : ( 'Planning:' ) ;
    public final void rule__Planning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1148:1: ( ( 'Planning:' ) )
            // InternalTaskDSL.g:1149:1: ( 'Planning:' )
            {
            // InternalTaskDSL.g:1149:1: ( 'Planning:' )
            // InternalTaskDSL.g:1150:2: 'Planning:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0__Impl"


    // $ANTLR start "rule__Planning__Group__1"
    // InternalTaskDSL.g:1159:1: rule__Planning__Group__1 : rule__Planning__Group__1__Impl rule__Planning__Group__2 ;
    public final void rule__Planning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1163:1: ( rule__Planning__Group__1__Impl rule__Planning__Group__2 )
            // InternalTaskDSL.g:1164:2: rule__Planning__Group__1__Impl rule__Planning__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1"


    // $ANTLR start "rule__Planning__Group__1__Impl"
    // InternalTaskDSL.g:1171:1: rule__Planning__Group__1__Impl : ( ( rule__Planning__NameAssignment_1 ) ) ;
    public final void rule__Planning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1175:1: ( ( ( rule__Planning__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1176:1: ( ( rule__Planning__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1176:1: ( ( rule__Planning__NameAssignment_1 ) )
            // InternalTaskDSL.g:1177:2: ( rule__Planning__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1178:2: ( rule__Planning__NameAssignment_1 )
            // InternalTaskDSL.g:1178:3: rule__Planning__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Planning__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1__Impl"


    // $ANTLR start "rule__Planning__Group__2"
    // InternalTaskDSL.g:1186:1: rule__Planning__Group__2 : rule__Planning__Group__2__Impl rule__Planning__Group__3 ;
    public final void rule__Planning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1190:1: ( rule__Planning__Group__2__Impl rule__Planning__Group__3 )
            // InternalTaskDSL.g:1191:2: rule__Planning__Group__2__Impl rule__Planning__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2"


    // $ANTLR start "rule__Planning__Group__2__Impl"
    // InternalTaskDSL.g:1198:1: rule__Planning__Group__2__Impl : ( ( rule__Planning__AnonymousAssignment_2 )? ) ;
    public final void rule__Planning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1202:1: ( ( ( rule__Planning__AnonymousAssignment_2 )? ) )
            // InternalTaskDSL.g:1203:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            {
            // InternalTaskDSL.g:1203:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            // InternalTaskDSL.g:1204:2: ( rule__Planning__AnonymousAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            }
            // InternalTaskDSL.g:1205:2: ( rule__Planning__AnonymousAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:1205:3: rule__Planning__AnonymousAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__AnonymousAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2__Impl"


    // $ANTLR start "rule__Planning__Group__3"
    // InternalTaskDSL.g:1213:1: rule__Planning__Group__3 : rule__Planning__Group__3__Impl ;
    public final void rule__Planning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1217:1: ( rule__Planning__Group__3__Impl )
            // InternalTaskDSL.g:1218:2: rule__Planning__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__3"


    // $ANTLR start "rule__Planning__Group__3__Impl"
    // InternalTaskDSL.g:1224:1: rule__Planning__Group__3__Impl : ( ( rule__Planning__Alternatives_3 )* ) ;
    public final void rule__Planning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1228:1: ( ( ( rule__Planning__Alternatives_3 )* ) )
            // InternalTaskDSL.g:1229:1: ( ( rule__Planning__Alternatives_3 )* )
            {
            // InternalTaskDSL.g:1229:1: ( ( rule__Planning__Alternatives_3 )* )
            // InternalTaskDSL.g:1230:2: ( rule__Planning__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            }
            // InternalTaskDSL.g:1231:2: ( rule__Planning__Alternatives_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTaskDSL.g:1231:3: rule__Planning__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Planning__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalTaskDSL.g:1240:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1244:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalTaskDSL.g:1245:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Person__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalTaskDSL.g:1252:1: rule__Person__Group__0__Impl : ( 'Person:' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1256:1: ( ( 'Person:' ) )
            // InternalTaskDSL.g:1257:1: ( 'Person:' )
            {
            // InternalTaskDSL.g:1257:1: ( 'Person:' )
            // InternalTaskDSL.g:1258:2: 'Person:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalTaskDSL.g:1267:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1271:1: ( rule__Person__Group__1__Impl )
            // InternalTaskDSL.g:1272:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalTaskDSL.g:1278:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1282:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1283:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1283:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalTaskDSL.g:1284:2: ( rule__Person__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1285:2: ( rule__Person__NameAssignment_1 )
            // InternalTaskDSL.g:1285:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:1294:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1298:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:1299:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalTaskDSL.g:1306:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1310:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:1311:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:1311:1: ( 'Task:' )
            // InternalTaskDSL.g:1312:2: 'Task:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTaskDSL.g:1321:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1325:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:1326:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalTaskDSL.g:1333:1: rule__Task__Group__1__Impl : ( ( rule__Task__ActionAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1337:1: ( ( ( rule__Task__ActionAssignment_1 ) ) )
            // InternalTaskDSL.g:1338:1: ( ( rule__Task__ActionAssignment_1 ) )
            {
            // InternalTaskDSL.g:1338:1: ( ( rule__Task__ActionAssignment_1 ) )
            // InternalTaskDSL.g:1339:2: ( rule__Task__ActionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            }
            // InternalTaskDSL.g:1340:2: ( rule__Task__ActionAssignment_1 )
            // InternalTaskDSL.g:1340:3: rule__Task__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTaskDSL.g:1348:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1352:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:1353:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalTaskDSL.g:1360:1: rule__Task__Group__2__Impl : ( 'persons:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1364:1: ( ( 'persons:' ) )
            // InternalTaskDSL.g:1365:1: ( 'persons:' )
            {
            // InternalTaskDSL.g:1365:1: ( 'persons:' )
            // InternalTaskDSL.g:1366:2: 'persons:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalTaskDSL.g:1375:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1379:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalTaskDSL.g:1380:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalTaskDSL.g:1387:1: rule__Task__Group__3__Impl : ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1391:1: ( ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) )
            // InternalTaskDSL.g:1392:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            {
            // InternalTaskDSL.g:1392:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            // InternalTaskDSL.g:1393:2: ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* )
            {
            // InternalTaskDSL.g:1393:2: ( ( rule__Task__PersonsAssignment_3 ) )
            // InternalTaskDSL.g:1394:3: ( rule__Task__PersonsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }
            // InternalTaskDSL.g:1395:3: ( rule__Task__PersonsAssignment_3 )
            // InternalTaskDSL.g:1395:4: rule__Task__PersonsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Task__PersonsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }

            }

            // InternalTaskDSL.g:1398:2: ( ( rule__Task__PersonsAssignment_3 )* )
            // InternalTaskDSL.g:1399:3: ( rule__Task__PersonsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }
            // InternalTaskDSL.g:1400:3: ( rule__Task__PersonsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDSL.g:1400:4: rule__Task__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__PersonsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalTaskDSL.g:1409:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1413:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalTaskDSL.g:1414:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalTaskDSL.g:1421:1: rule__Task__Group__4__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1425:1: ( ( 'priority:' ) )
            // InternalTaskDSL.g:1426:1: ( 'priority:' )
            {
            // InternalTaskDSL.g:1426:1: ( 'priority:' )
            // InternalTaskDSL.g:1427:2: 'priority:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalTaskDSL.g:1436:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1440:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalTaskDSL.g:1441:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalTaskDSL.g:1448:1: rule__Task__Group__5__Impl : ( ( rule__Task__PrioAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1452:1: ( ( ( rule__Task__PrioAssignment_5 ) ) )
            // InternalTaskDSL.g:1453:1: ( ( rule__Task__PrioAssignment_5 ) )
            {
            // InternalTaskDSL.g:1453:1: ( ( rule__Task__PrioAssignment_5 ) )
            // InternalTaskDSL.g:1454:2: ( rule__Task__PrioAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
            }
            // InternalTaskDSL.g:1455:2: ( rule__Task__PrioAssignment_5 )
            // InternalTaskDSL.g:1455:3: rule__Task__PrioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrioAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalTaskDSL.g:1463:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1467:1: ( rule__Task__Group__6__Impl )
            // InternalTaskDSL.g:1468:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalTaskDSL.g:1474:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1478:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalTaskDSL.g:1479:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalTaskDSL.g:1479:1: ( ( rule__Task__Group_6__0 )? )
            // InternalTaskDSL.g:1480:2: ( rule__Task__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup_6()); 
            }
            // InternalTaskDSL.g:1481:2: ( rule__Task__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTaskDSL.g:1481:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalTaskDSL.g:1490:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1494:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalTaskDSL.g:1495:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalTaskDSL.g:1502:1: rule__Task__Group_6__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1506:1: ( ( 'duration:' ) )
            // InternalTaskDSL.g:1507:1: ( 'duration:' )
            {
            // InternalTaskDSL.g:1507:1: ( 'duration:' )
            // InternalTaskDSL.g:1508:2: 'duration:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalTaskDSL.g:1517:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1521:1: ( rule__Task__Group_6__1__Impl )
            // InternalTaskDSL.g:1522:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalTaskDSL.g:1528:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DurationAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1532:1: ( ( ( rule__Task__DurationAssignment_6_1 ) ) )
            // InternalTaskDSL.g:1533:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            {
            // InternalTaskDSL.g:1533:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            // InternalTaskDSL.g:1534:2: ( rule__Task__DurationAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 
            }
            // InternalTaskDSL.g:1535:2: ( rule__Task__DurationAssignment_6_1 )
            // InternalTaskDSL.g:1535:3: rule__Task__DurationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalTaskDSL.g:1544:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1548:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalTaskDSL.g:1549:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Duration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalTaskDSL.g:1556:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__DlAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1560:1: ( ( ( rule__Duration__DlAssignment_0 ) ) )
            // InternalTaskDSL.g:1561:1: ( ( rule__Duration__DlAssignment_0 ) )
            {
            // InternalTaskDSL.g:1561:1: ( ( rule__Duration__DlAssignment_0 ) )
            // InternalTaskDSL.g:1562:2: ( rule__Duration__DlAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            }
            // InternalTaskDSL.g:1563:2: ( rule__Duration__DlAssignment_0 )
            // InternalTaskDSL.g:1563:3: rule__Duration__DlAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__DlAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalTaskDSL.g:1571:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1575:1: ( rule__Duration__Group__1__Impl )
            // InternalTaskDSL.g:1576:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalTaskDSL.g:1582:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__UnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1586:1: ( ( ( rule__Duration__UnitAssignment_1 ) ) )
            // InternalTaskDSL.g:1587:1: ( ( rule__Duration__UnitAssignment_1 ) )
            {
            // InternalTaskDSL.g:1587:1: ( ( rule__Duration__UnitAssignment_1 ) )
            // InternalTaskDSL.g:1588:2: ( rule__Duration__UnitAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            }
            // InternalTaskDSL.g:1589:2: ( rule__Duration__UnitAssignment_1 )
            // InternalTaskDSL.g:1589:3: rule__Duration__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__UnitAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__LunchAction__Group__0"
    // InternalTaskDSL.g:1598:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1602:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalTaskDSL.g:1603:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LunchAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0"


    // $ANTLR start "rule__LunchAction__Group__0__Impl"
    // InternalTaskDSL.g:1610:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1614:1: ( ( 'Lunch' ) )
            // InternalTaskDSL.g:1615:1: ( 'Lunch' )
            {
            // InternalTaskDSL.g:1615:1: ( 'Lunch' )
            // InternalTaskDSL.g:1616:2: 'Lunch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0__Impl"


    // $ANTLR start "rule__LunchAction__Group__1"
    // InternalTaskDSL.g:1625:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1629:1: ( rule__LunchAction__Group__1__Impl )
            // InternalTaskDSL.g:1630:2: rule__LunchAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1"


    // $ANTLR start "rule__LunchAction__Group__1__Impl"
    // InternalTaskDSL.g:1636:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1640:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalTaskDSL.g:1641:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalTaskDSL.g:1641:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalTaskDSL.g:1642:2: ( rule__LunchAction__LocationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            }
            // InternalTaskDSL.g:1643:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalTaskDSL.g:1643:3: rule__LunchAction__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__LocationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1__Impl"


    // $ANTLR start "rule__MeetingAction__Group__0"
    // InternalTaskDSL.g:1652:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1656:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalTaskDSL.g:1657:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MeetingAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0"


    // $ANTLR start "rule__MeetingAction__Group__0__Impl"
    // InternalTaskDSL.g:1664:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1668:1: ( ( 'Meeting' ) )
            // InternalTaskDSL.g:1669:1: ( 'Meeting' )
            {
            // InternalTaskDSL.g:1669:1: ( 'Meeting' )
            // InternalTaskDSL.g:1670:2: 'Meeting'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0__Impl"


    // $ANTLR start "rule__MeetingAction__Group__1"
    // InternalTaskDSL.g:1679:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1683:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalTaskDSL.g:1684:2: rule__MeetingAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1"


    // $ANTLR start "rule__MeetingAction__Group__1__Impl"
    // InternalTaskDSL.g:1690:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1694:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalTaskDSL.g:1695:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalTaskDSL.g:1695:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalTaskDSL.g:1696:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            }
            // InternalTaskDSL.g:1697:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalTaskDSL.g:1697:3: rule__MeetingAction__TopicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__TopicAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1__Impl"


    // $ANTLR start "rule__PaperAction__Group__0"
    // InternalTaskDSL.g:1706:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1710:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalTaskDSL.g:1711:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PaperAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0"


    // $ANTLR start "rule__PaperAction__Group__0__Impl"
    // InternalTaskDSL.g:1718:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1722:1: ( ( 'Report' ) )
            // InternalTaskDSL.g:1723:1: ( 'Report' )
            {
            // InternalTaskDSL.g:1723:1: ( 'Report' )
            // InternalTaskDSL.g:1724:2: 'Report'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0__Impl"


    // $ANTLR start "rule__PaperAction__Group__1"
    // InternalTaskDSL.g:1733:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1737:1: ( rule__PaperAction__Group__1__Impl )
            // InternalTaskDSL.g:1738:2: rule__PaperAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1"


    // $ANTLR start "rule__PaperAction__Group__1__Impl"
    // InternalTaskDSL.g:1744:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1748:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalTaskDSL.g:1749:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalTaskDSL.g:1749:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalTaskDSL.g:1750:2: ( rule__PaperAction__ReportAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            }
            // InternalTaskDSL.g:1751:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalTaskDSL.g:1751:3: rule__PaperAction__ReportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__ReportAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__0"
    // InternalTaskDSL.g:1760:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1764:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalTaskDSL.g:1765:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PaymentAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0"


    // $ANTLR start "rule__PaymentAction__Group__0__Impl"
    // InternalTaskDSL.g:1772:1: rule__PaymentAction__Group__0__Impl : ( ( rule__PaymentAction__Group_0__0 )? ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1776:1: ( ( ( rule__PaymentAction__Group_0__0 )? ) )
            // InternalTaskDSL.g:1777:1: ( ( rule__PaymentAction__Group_0__0 )? )
            {
            // InternalTaskDSL.g:1777:1: ( ( rule__PaymentAction__Group_0__0 )? )
            // InternalTaskDSL.g:1778:2: ( rule__PaymentAction__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getGroup_0()); 
            }
            // InternalTaskDSL.g:1779:2: ( rule__PaymentAction__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDSL.g:1779:3: rule__PaymentAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PaymentAction__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group__1"
    // InternalTaskDSL.g:1787:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1791:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalTaskDSL.g:1792:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PaymentAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1"


    // $ANTLR start "rule__PaymentAction__Group__1__Impl"
    // InternalTaskDSL.g:1799:1: rule__PaymentAction__Group__1__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1803:1: ( ( 'Pay' ) )
            // InternalTaskDSL.g:1804:1: ( 'Pay' )
            {
            // InternalTaskDSL.g:1804:1: ( 'Pay' )
            // InternalTaskDSL.g:1805:2: 'Pay'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getPayKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getPayKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__2"
    // InternalTaskDSL.g:1814:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3 ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1818:1: ( rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3 )
            // InternalTaskDSL.g:1819:2: rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__PaymentAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2"


    // $ANTLR start "rule__PaymentAction__Group__2__Impl"
    // InternalTaskDSL.g:1826:1: rule__PaymentAction__Group__2__Impl : ( ( rule__PaymentAction__AmountAssignment_2 ) ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1830:1: ( ( ( rule__PaymentAction__AmountAssignment_2 ) ) )
            // InternalTaskDSL.g:1831:1: ( ( rule__PaymentAction__AmountAssignment_2 ) )
            {
            // InternalTaskDSL.g:1831:1: ( ( rule__PaymentAction__AmountAssignment_2 ) )
            // InternalTaskDSL.g:1832:2: ( rule__PaymentAction__AmountAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getAmountAssignment_2()); 
            }
            // InternalTaskDSL.g:1833:2: ( rule__PaymentAction__AmountAssignment_2 )
            // InternalTaskDSL.g:1833:3: rule__PaymentAction__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__AmountAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getAmountAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2__Impl"


    // $ANTLR start "rule__PaymentAction__Group__3"
    // InternalTaskDSL.g:1841:1: rule__PaymentAction__Group__3 : rule__PaymentAction__Group__3__Impl ;
    public final void rule__PaymentAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1845:1: ( rule__PaymentAction__Group__3__Impl )
            // InternalTaskDSL.g:1846:2: rule__PaymentAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__3"


    // $ANTLR start "rule__PaymentAction__Group__3__Impl"
    // InternalTaskDSL.g:1852:1: rule__PaymentAction__Group__3__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1856:1: ( ( 'euro' ) )
            // InternalTaskDSL.g:1857:1: ( 'euro' )
            {
            // InternalTaskDSL.g:1857:1: ( 'euro' )
            // InternalTaskDSL.g:1858:2: 'euro'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getEuroKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getEuroKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__3__Impl"


    // $ANTLR start "rule__PaymentAction__Group_0__0"
    // InternalTaskDSL.g:1868:1: rule__PaymentAction__Group_0__0 : rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1 ;
    public final void rule__PaymentAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1872:1: ( rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1 )
            // InternalTaskDSL.g:1873:2: rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__PaymentAction__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__0"


    // $ANTLR start "rule__PaymentAction__Group_0__0__Impl"
    // InternalTaskDSL.g:1880:1: rule__PaymentAction__Group_0__0__Impl : ( 'If' ) ;
    public final void rule__PaymentAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1884:1: ( ( 'If' ) )
            // InternalTaskDSL.g:1885:1: ( 'If' )
            {
            // InternalTaskDSL.g:1885:1: ( 'If' )
            // InternalTaskDSL.g:1886:2: 'If'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getIfKeyword_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getIfKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group_0__1"
    // InternalTaskDSL.g:1895:1: rule__PaymentAction__Group_0__1 : rule__PaymentAction__Group_0__1__Impl ;
    public final void rule__PaymentAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1899:1: ( rule__PaymentAction__Group_0__1__Impl )
            // InternalTaskDSL.g:1900:2: rule__PaymentAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__1"


    // $ANTLR start "rule__PaymentAction__Group_0__1__Impl"
    // InternalTaskDSL.g:1906:1: rule__PaymentAction__Group_0__1__Impl : ( ( rule__PaymentAction__ConditionAssignment_0_1 ) ) ;
    public final void rule__PaymentAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1910:1: ( ( ( rule__PaymentAction__ConditionAssignment_0_1 ) ) )
            // InternalTaskDSL.g:1911:1: ( ( rule__PaymentAction__ConditionAssignment_0_1 ) )
            {
            // InternalTaskDSL.g:1911:1: ( ( rule__PaymentAction__ConditionAssignment_0_1 ) )
            // InternalTaskDSL.g:1912:2: ( rule__PaymentAction__ConditionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1()); 
            }
            // InternalTaskDSL.g:1913:2: ( rule__PaymentAction__ConditionAssignment_0_1 )
            // InternalTaskDSL.g:1913:3: rule__PaymentAction__ConditionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__ConditionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group_0__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0"
    // InternalTaskDSL.g:1922:1: rule__BooleanExpressionLevel1__Group__0 : rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 ;
    public final void rule__BooleanExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1926:1: ( rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:1927:2: rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0__Impl"
    // InternalTaskDSL.g:1934:1: rule__BooleanExpressionLevel1__Group__0__Impl : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1938:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalTaskDSL.g:1939:1: ( ruleBooleanExpressionLevel2 )
            {
            // InternalTaskDSL.g:1939:1: ( ruleBooleanExpressionLevel2 )
            // InternalTaskDSL.g:1940:2: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1"
    // InternalTaskDSL.g:1949:1: rule__BooleanExpressionLevel1__Group__1 : rule__BooleanExpressionLevel1__Group__1__Impl ;
    public final void rule__BooleanExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1953:1: ( rule__BooleanExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:1954:2: rule__BooleanExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1__Impl"
    // InternalTaskDSL.g:1960:1: rule__BooleanExpressionLevel1__Group__1__Impl : ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) ;
    public final void rule__BooleanExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1964:1: ( ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) )
            // InternalTaskDSL.g:1965:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            {
            // InternalTaskDSL.g:1965:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            // InternalTaskDSL.g:1966:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }
            // InternalTaskDSL.g:1967:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=13 && LA17_0<=14)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTaskDSL.g:1967:3: rule__BooleanExpressionLevel1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BooleanExpressionLevel1__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0"
    // InternalTaskDSL.g:1976:1: rule__BooleanExpressionLevel1__Group_1__0 : rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 ;
    public final void rule__BooleanExpressionLevel1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1980:1: ( rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 )
            // InternalTaskDSL.g:1981:2: rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanExpressionLevel1__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0__Impl"
    // InternalTaskDSL.g:1988:1: rule__BooleanExpressionLevel1__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1992:1: ( ( () ) )
            // InternalTaskDSL.g:1993:1: ( () )
            {
            // InternalTaskDSL.g:1993:1: ( () )
            // InternalTaskDSL.g:1994:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }
            // InternalTaskDSL.g:1995:2: ()
            // InternalTaskDSL.g:1995:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1"
    // InternalTaskDSL.g:2003:1: rule__BooleanExpressionLevel1__Group_1__1 : rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 ;
    public final void rule__BooleanExpressionLevel1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2007:1: ( rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 )
            // InternalTaskDSL.g:2008:2: rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__BooleanExpressionLevel1__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1__Impl"
    // InternalTaskDSL.g:2015:1: rule__BooleanExpressionLevel1__Group_1__1__Impl : ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2019:1: ( ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) )
            // InternalTaskDSL.g:2020:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            {
            // InternalTaskDSL.g:2020:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            // InternalTaskDSL.g:2021:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }
            // InternalTaskDSL.g:2022:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            // InternalTaskDSL.g:2022:3: rule__BooleanExpressionLevel1__BopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__BopAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2"
    // InternalTaskDSL.g:2030:1: rule__BooleanExpressionLevel1__Group_1__2 : rule__BooleanExpressionLevel1__Group_1__2__Impl ;
    public final void rule__BooleanExpressionLevel1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2034:1: ( rule__BooleanExpressionLevel1__Group_1__2__Impl )
            // InternalTaskDSL.g:2035:2: rule__BooleanExpressionLevel1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2__Impl"
    // InternalTaskDSL.g:2041:1: rule__BooleanExpressionLevel1__Group_1__2__Impl : ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2045:1: ( ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:2046:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:2046:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:2047:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }
            // InternalTaskDSL.g:2048:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            // InternalTaskDSL.g:2048:3: rule__BooleanExpressionLevel1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalTaskDSL.g:2057:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2061:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalTaskDSL.g:2062:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalTaskDSL.g:2069:1: rule__NotExpression__Group__0__Impl : ( 'NOT' ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2073:1: ( ( 'NOT' ) )
            // InternalTaskDSL.g:2074:1: ( 'NOT' )
            {
            // InternalTaskDSL.g:2074:1: ( 'NOT' )
            // InternalTaskDSL.g:2075:2: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalTaskDSL.g:2084:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2088:1: ( rule__NotExpression__Group__1__Impl )
            // InternalTaskDSL.g:2089:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalTaskDSL.g:2095:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__SubAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2099:1: ( ( ( rule__NotExpression__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:2100:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:2100:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            // InternalTaskDSL.g:2101:2: ( rule__NotExpression__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:2102:2: ( rule__NotExpression__SubAssignment_1 )
            // InternalTaskDSL.g:2102:3: rule__NotExpression__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalTaskDSL.g:2111:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2115:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalTaskDSL.g:2116:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalTaskDSL.g:2123:1: rule__ComparisonExpression__Group__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2127:1: ( ( () ) )
            // InternalTaskDSL.g:2128:1: ( () )
            {
            // InternalTaskDSL.g:2128:1: ( () )
            // InternalTaskDSL.g:2129:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }
            // InternalTaskDSL.g:2130:2: ()
            // InternalTaskDSL.g:2130:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalTaskDSL.g:2138:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2142:1: ( rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 )
            // InternalTaskDSL.g:2143:2: rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalTaskDSL.g:2150:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2154:1: ( ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) )
            // InternalTaskDSL.g:2155:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            {
            // InternalTaskDSL.g:2155:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            // InternalTaskDSL.g:2156:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalTaskDSL.g:2157:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            // InternalTaskDSL.g:2157:3: rule__ComparisonExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__2"
    // InternalTaskDSL.g:2165:1: rule__ComparisonExpression__Group__2 : rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 ;
    public final void rule__ComparisonExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2169:1: ( rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 )
            // InternalTaskDSL.g:2170:2: rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ComparisonExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__2"


    // $ANTLR start "rule__ComparisonExpression__Group__2__Impl"
    // InternalTaskDSL.g:2177:1: rule__ComparisonExpression__Group__2__Impl : ( ( rule__ComparisonExpression__OpAssignment_2 ) ) ;
    public final void rule__ComparisonExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2181:1: ( ( ( rule__ComparisonExpression__OpAssignment_2 ) ) )
            // InternalTaskDSL.g:2182:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            {
            // InternalTaskDSL.g:2182:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            // InternalTaskDSL.g:2183:2: ( rule__ComparisonExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }
            // InternalTaskDSL.g:2184:2: ( rule__ComparisonExpression__OpAssignment_2 )
            // InternalTaskDSL.g:2184:3: rule__ComparisonExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__3"
    // InternalTaskDSL.g:2192:1: rule__ComparisonExpression__Group__3 : rule__ComparisonExpression__Group__3__Impl ;
    public final void rule__ComparisonExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2196:1: ( rule__ComparisonExpression__Group__3__Impl )
            // InternalTaskDSL.g:2197:2: rule__ComparisonExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__3"


    // $ANTLR start "rule__ComparisonExpression__Group__3__Impl"
    // InternalTaskDSL.g:2203:1: rule__ComparisonExpression__Group__3__Impl : ( ( rule__ComparisonExpression__RightAssignment_3 ) ) ;
    public final void rule__ComparisonExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2207:1: ( ( ( rule__ComparisonExpression__RightAssignment_3 ) ) )
            // InternalTaskDSL.g:2208:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            {
            // InternalTaskDSL.g:2208:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            // InternalTaskDSL.g:2209:2: ( rule__ComparisonExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }
            // InternalTaskDSL.g:2210:2: ( rule__ComparisonExpression__RightAssignment_3 )
            // InternalTaskDSL.g:2210:3: rule__ComparisonExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0"
    // InternalTaskDSL.g:2219:1: rule__BooleanExpressionBracket__Group__0 : rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 ;
    public final void rule__BooleanExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2223:1: ( rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 )
            // InternalTaskDSL.g:2224:2: rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BooleanExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0__Impl"
    // InternalTaskDSL.g:2231:1: rule__BooleanExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__BooleanExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2235:1: ( ( '(' ) )
            // InternalTaskDSL.g:2236:1: ( '(' )
            {
            // InternalTaskDSL.g:2236:1: ( '(' )
            // InternalTaskDSL.g:2237:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1"
    // InternalTaskDSL.g:2246:1: rule__BooleanExpressionBracket__Group__1 : rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 ;
    public final void rule__BooleanExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2250:1: ( rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 )
            // InternalTaskDSL.g:2251:2: rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__BooleanExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1__Impl"
    // InternalTaskDSL.g:2258:1: rule__BooleanExpressionBracket__Group__1__Impl : ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__BooleanExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2262:1: ( ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:2263:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:2263:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:2264:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:2265:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:2265:3: rule__BooleanExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2"
    // InternalTaskDSL.g:2273:1: rule__BooleanExpressionBracket__Group__2 : rule__BooleanExpressionBracket__Group__2__Impl ;
    public final void rule__BooleanExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2277:1: ( rule__BooleanExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:2278:2: rule__BooleanExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2__Impl"
    // InternalTaskDSL.g:2284:1: rule__BooleanExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__BooleanExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2288:1: ( ( ')' ) )
            // InternalTaskDSL.g:2289:1: ( ')' )
            {
            // InternalTaskDSL.g:2289:1: ( ')' )
            // InternalTaskDSL.g:2290:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalTaskDSL.g:2300:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2304:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:2305:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0"


    // $ANTLR start "rule__ExpressionLevel1__Group__0__Impl"
    // InternalTaskDSL.g:2312:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2316:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:2317:1: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:2317:1: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:2318:2: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalTaskDSL.g:2327:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2331:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:2332:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1"


    // $ANTLR start "rule__ExpressionLevel1__Group__1__Impl"
    // InternalTaskDSL.g:2338:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2342:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalTaskDSL.g:2343:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:2343:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalTaskDSL.g:2344:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:2345:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=40 && LA18_0<=41)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTaskDSL.g:2345:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalTaskDSL.g:2354:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2358:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalTaskDSL.g:2359:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0__Impl"
    // InternalTaskDSL.g:2366:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2370:1: ( ( () ) )
            // InternalTaskDSL.g:2371:1: ( () )
            {
            // InternalTaskDSL.g:2371:1: ( () )
            // InternalTaskDSL.g:2372:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }
            // InternalTaskDSL.g:2373:2: ()
            // InternalTaskDSL.g:2373:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1"
    // InternalTaskDSL.g:2381:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2385:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalTaskDSL.g:2386:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1__Impl"
    // InternalTaskDSL.g:2393:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2397:1: ( ( '+' ) )
            // InternalTaskDSL.g:2398:1: ( '+' )
            {
            // InternalTaskDSL.g:2398:1: ( '+' )
            // InternalTaskDSL.g:2399:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalTaskDSL.g:2408:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2412:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalTaskDSL.g:2413:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2__Impl"
    // InternalTaskDSL.g:2419:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2423:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:2424:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:2424:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:2425:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }
            // InternalTaskDSL.g:2426:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:2426:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalTaskDSL.g:2435:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2439:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalTaskDSL.g:2440:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0__Impl"
    // InternalTaskDSL.g:2447:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2451:1: ( ( () ) )
            // InternalTaskDSL.g:2452:1: ( () )
            {
            // InternalTaskDSL.g:2452:1: ( () )
            // InternalTaskDSL.g:2453:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }
            // InternalTaskDSL.g:2454:2: ()
            // InternalTaskDSL.g:2454:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1"
    // InternalTaskDSL.g:2462:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2466:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalTaskDSL.g:2467:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1__Impl"
    // InternalTaskDSL.g:2474:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2478:1: ( ( '-' ) )
            // InternalTaskDSL.g:2479:1: ( '-' )
            {
            // InternalTaskDSL.g:2479:1: ( '-' )
            // InternalTaskDSL.g:2480:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalTaskDSL.g:2489:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2493:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalTaskDSL.g:2494:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2__Impl"
    // InternalTaskDSL.g:2500:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2504:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:2505:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:2505:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:2506:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }
            // InternalTaskDSL.g:2507:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:2507:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalTaskDSL.g:2516:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2520:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalTaskDSL.g:2521:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0"


    // $ANTLR start "rule__ExpressionLevel2__Group__0__Impl"
    // InternalTaskDSL.g:2528:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2532:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2533:1: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2533:1: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2534:2: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalTaskDSL.g:2543:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2547:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalTaskDSL.g:2548:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1"


    // $ANTLR start "rule__ExpressionLevel2__Group__1__Impl"
    // InternalTaskDSL.g:2554:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2558:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalTaskDSL.g:2559:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:2559:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalTaskDSL.g:2560:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:2561:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21||(LA19_0>=42 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTaskDSL.g:2561:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalTaskDSL.g:2570:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2574:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalTaskDSL.g:2575:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0__Impl"
    // InternalTaskDSL.g:2582:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2586:1: ( ( () ) )
            // InternalTaskDSL.g:2587:1: ( () )
            {
            // InternalTaskDSL.g:2587:1: ( () )
            // InternalTaskDSL.g:2588:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }
            // InternalTaskDSL.g:2589:2: ()
            // InternalTaskDSL.g:2589:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1"
    // InternalTaskDSL.g:2597:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2601:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalTaskDSL.g:2602:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1__Impl"
    // InternalTaskDSL.g:2609:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2613:1: ( ( '*' ) )
            // InternalTaskDSL.g:2614:1: ( '*' )
            {
            // InternalTaskDSL.g:2614:1: ( '*' )
            // InternalTaskDSL.g:2615:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalTaskDSL.g:2624:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2628:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalTaskDSL.g:2629:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2__Impl"
    // InternalTaskDSL.g:2635:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2639:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:2640:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:2640:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:2641:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }
            // InternalTaskDSL.g:2642:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:2642:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalTaskDSL.g:2651:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2655:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalTaskDSL.g:2656:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0__Impl"
    // InternalTaskDSL.g:2663:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2667:1: ( ( () ) )
            // InternalTaskDSL.g:2668:1: ( () )
            {
            // InternalTaskDSL.g:2668:1: ( () )
            // InternalTaskDSL.g:2669:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }
            // InternalTaskDSL.g:2670:2: ()
            // InternalTaskDSL.g:2670:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1"
    // InternalTaskDSL.g:2678:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2682:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalTaskDSL.g:2683:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1__Impl"
    // InternalTaskDSL.g:2690:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2694:1: ( ( '/' ) )
            // InternalTaskDSL.g:2695:1: ( '/' )
            {
            // InternalTaskDSL.g:2695:1: ( '/' )
            // InternalTaskDSL.g:2696:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalTaskDSL.g:2705:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2709:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalTaskDSL.g:2710:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2__Impl"
    // InternalTaskDSL.g:2716:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2720:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:2721:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:2721:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:2722:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }
            // InternalTaskDSL.g:2723:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:2723:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0"
    // InternalTaskDSL.g:2732:1: rule__ExpressionLevel2__Group_1_2__0 : rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 ;
    public final void rule__ExpressionLevel2__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2736:1: ( rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 )
            // InternalTaskDSL.g:2737:2: rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionLevel2__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0__Impl"
    // InternalTaskDSL.g:2744:1: rule__ExpressionLevel2__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2748:1: ( ( () ) )
            // InternalTaskDSL.g:2749:1: ( () )
            {
            // InternalTaskDSL.g:2749:1: ( () )
            // InternalTaskDSL.g:2750:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }
            // InternalTaskDSL.g:2751:2: ()
            // InternalTaskDSL.g:2751:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1"
    // InternalTaskDSL.g:2759:1: rule__ExpressionLevel2__Group_1_2__1 : rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 ;
    public final void rule__ExpressionLevel2__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2763:1: ( rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 )
            // InternalTaskDSL.g:2764:2: rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1__Impl"
    // InternalTaskDSL.g:2771:1: rule__ExpressionLevel2__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel2__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2775:1: ( ( 'max' ) )
            // InternalTaskDSL.g:2776:1: ( 'max' )
            {
            // InternalTaskDSL.g:2776:1: ( 'max' )
            // InternalTaskDSL.g:2777:2: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2"
    // InternalTaskDSL.g:2786:1: rule__ExpressionLevel2__Group_1_2__2 : rule__ExpressionLevel2__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2790:1: ( rule__ExpressionLevel2__Group_1_2__2__Impl )
            // InternalTaskDSL.g:2791:2: rule__ExpressionLevel2__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2__Impl"
    // InternalTaskDSL.g:2797:1: rule__ExpressionLevel2__Group_1_2__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2801:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) )
            // InternalTaskDSL.g:2802:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            {
            // InternalTaskDSL.g:2802:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            // InternalTaskDSL.g:2803:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }
            // InternalTaskDSL.g:2804:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            // InternalTaskDSL.g:2804:3: rule__ExpressionLevel2__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0"
    // InternalTaskDSL.g:2813:1: rule__ExpressionLevel2__Group_1_3__0 : rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 ;
    public final void rule__ExpressionLevel2__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2817:1: ( rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 )
            // InternalTaskDSL.g:2818:2: rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1
            {
            pushFollow(FOLLOW_29);
            rule__ExpressionLevel2__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0__Impl"
    // InternalTaskDSL.g:2825:1: rule__ExpressionLevel2__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2829:1: ( ( () ) )
            // InternalTaskDSL.g:2830:1: ( () )
            {
            // InternalTaskDSL.g:2830:1: ( () )
            // InternalTaskDSL.g:2831:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }
            // InternalTaskDSL.g:2832:2: ()
            // InternalTaskDSL.g:2832:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1"
    // InternalTaskDSL.g:2840:1: rule__ExpressionLevel2__Group_1_3__1 : rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 ;
    public final void rule__ExpressionLevel2__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2844:1: ( rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 )
            // InternalTaskDSL.g:2845:2: rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1__Impl"
    // InternalTaskDSL.g:2852:1: rule__ExpressionLevel2__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel2__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2856:1: ( ( 'min' ) )
            // InternalTaskDSL.g:2857:1: ( 'min' )
            {
            // InternalTaskDSL.g:2857:1: ( 'min' )
            // InternalTaskDSL.g:2858:2: 'min'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2"
    // InternalTaskDSL.g:2867:1: rule__ExpressionLevel2__Group_1_3__2 : rule__ExpressionLevel2__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2871:1: ( rule__ExpressionLevel2__Group_1_3__2__Impl )
            // InternalTaskDSL.g:2872:2: rule__ExpressionLevel2__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2__Impl"
    // InternalTaskDSL.g:2878:1: rule__ExpressionLevel2__Group_1_3__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2882:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) )
            // InternalTaskDSL.g:2883:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            {
            // InternalTaskDSL.g:2883:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            // InternalTaskDSL.g:2884:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }
            // InternalTaskDSL.g:2885:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            // InternalTaskDSL.g:2885:3: rule__ExpressionLevel2__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0"
    // InternalTaskDSL.g:2894:1: rule__ExpressionLevel2__Group_1_4__0 : rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 ;
    public final void rule__ExpressionLevel2__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2898:1: ( rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 )
            // InternalTaskDSL.g:2899:2: rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0__Impl"
    // InternalTaskDSL.g:2906:1: rule__ExpressionLevel2__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2910:1: ( ( () ) )
            // InternalTaskDSL.g:2911:1: ( () )
            {
            // InternalTaskDSL.g:2911:1: ( () )
            // InternalTaskDSL.g:2912:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }
            // InternalTaskDSL.g:2913:2: ()
            // InternalTaskDSL.g:2913:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1"
    // InternalTaskDSL.g:2921:1: rule__ExpressionLevel2__Group_1_4__1 : rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 ;
    public final void rule__ExpressionLevel2__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2925:1: ( rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 )
            // InternalTaskDSL.g:2926:2: rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1__Impl"
    // InternalTaskDSL.g:2933:1: rule__ExpressionLevel2__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel2__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2937:1: ( ( 'mod' ) )
            // InternalTaskDSL.g:2938:1: ( 'mod' )
            {
            // InternalTaskDSL.g:2938:1: ( 'mod' )
            // InternalTaskDSL.g:2939:2: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2"
    // InternalTaskDSL.g:2948:1: rule__ExpressionLevel2__Group_1_4__2 : rule__ExpressionLevel2__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2952:1: ( rule__ExpressionLevel2__Group_1_4__2__Impl )
            // InternalTaskDSL.g:2953:2: rule__ExpressionLevel2__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2__Impl"
    // InternalTaskDSL.g:2959:1: rule__ExpressionLevel2__Group_1_4__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2963:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) )
            // InternalTaskDSL.g:2964:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            {
            // InternalTaskDSL.g:2964:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            // InternalTaskDSL.g:2965:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }
            // InternalTaskDSL.g:2966:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            // InternalTaskDSL.g:2966:3: rule__ExpressionLevel2__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalTaskDSL.g:2975:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2979:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalTaskDSL.g:2980:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0"


    // $ANTLR start "rule__ExpressionLevel3__Group__0__Impl"
    // InternalTaskDSL.g:2987:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2991:1: ( ( ruleExpressionLevel4 ) )
            // InternalTaskDSL.g:2992:1: ( ruleExpressionLevel4 )
            {
            // InternalTaskDSL.g:2992:1: ( ruleExpressionLevel4 )
            // InternalTaskDSL.g:2993:2: ruleExpressionLevel4
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalTaskDSL.g:3002:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3006:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalTaskDSL.g:3007:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1"


    // $ANTLR start "rule__ExpressionLevel3__Group__1__Impl"
    // InternalTaskDSL.g:3013:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3017:1: ( ( ( rule__ExpressionLevel3__Group_1__0 )? ) )
            // InternalTaskDSL.g:3018:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            {
            // InternalTaskDSL.g:3018:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            // InternalTaskDSL.g:3019:2: ( rule__ExpressionLevel3__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }
            // InternalTaskDSL.g:3020:2: ( rule__ExpressionLevel3__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTaskDSL.g:3020:3: rule__ExpressionLevel3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0"
    // InternalTaskDSL.g:3029:1: rule__ExpressionLevel3__Group_1__0 : rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 ;
    public final void rule__ExpressionLevel3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3033:1: ( rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 )
            // InternalTaskDSL.g:3034:2: rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionLevel3__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0__Impl"
    // InternalTaskDSL.g:3041:1: rule__ExpressionLevel3__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3045:1: ( ( () ) )
            // InternalTaskDSL.g:3046:1: ( () )
            {
            // InternalTaskDSL.g:3046:1: ( () )
            // InternalTaskDSL.g:3047:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }
            // InternalTaskDSL.g:3048:2: ()
            // InternalTaskDSL.g:3048:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1"
    // InternalTaskDSL.g:3056:1: rule__ExpressionLevel3__Group_1__1 : rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 ;
    public final void rule__ExpressionLevel3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3060:1: ( rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 )
            // InternalTaskDSL.g:3061:2: rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel3__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1__Impl"
    // InternalTaskDSL.g:3068:1: rule__ExpressionLevel3__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3072:1: ( ( '^' ) )
            // InternalTaskDSL.g:3073:1: ( '^' )
            {
            // InternalTaskDSL.g:3073:1: ( '^' )
            // InternalTaskDSL.g:3074:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2"
    // InternalTaskDSL.g:3083:1: rule__ExpressionLevel3__Group_1__2 : rule__ExpressionLevel3__Group_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3087:1: ( rule__ExpressionLevel3__Group_1__2__Impl )
            // InternalTaskDSL.g:3088:2: rule__ExpressionLevel3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2__Impl"
    // InternalTaskDSL.g:3094:1: rule__ExpressionLevel3__Group_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3098:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:3099:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:3099:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:3100:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }
            // InternalTaskDSL.g:3101:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            // InternalTaskDSL.g:3101:3: rule__ExpressionLevel3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalTaskDSL.g:3110:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3114:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalTaskDSL.g:3115:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0"


    // $ANTLR start "rule__ExpressionMinus__Group__0__Impl"
    // InternalTaskDSL.g:3122:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3126:1: ( ( '-' ) )
            // InternalTaskDSL.g:3127:1: ( '-' )
            {
            // InternalTaskDSL.g:3127:1: ( '-' )
            // InternalTaskDSL.g:3128:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalTaskDSL.g:3137:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3141:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalTaskDSL.g:3142:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1"


    // $ANTLR start "rule__ExpressionMinus__Group__1__Impl"
    // InternalTaskDSL.g:3148:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3152:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3153:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3153:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalTaskDSL.g:3154:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3155:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalTaskDSL.g:3155:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalTaskDSL.g:3164:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3168:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalTaskDSL.g:3169:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0"


    // $ANTLR start "rule__ExpressionPlus__Group__0__Impl"
    // InternalTaskDSL.g:3176:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3180:1: ( ( '+' ) )
            // InternalTaskDSL.g:3181:1: ( '+' )
            {
            // InternalTaskDSL.g:3181:1: ( '+' )
            // InternalTaskDSL.g:3182:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalTaskDSL.g:3191:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3195:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalTaskDSL.g:3196:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1"


    // $ANTLR start "rule__ExpressionPlus__Group__1__Impl"
    // InternalTaskDSL.g:3202:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3206:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3207:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3207:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalTaskDSL.g:3208:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3209:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalTaskDSL.g:3209:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalTaskDSL.g:3218:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3222:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalTaskDSL.g:3223:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalTaskDSL.g:3230:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3234:1: ( ( '(' ) )
            // InternalTaskDSL.g:3235:1: ( '(' )
            {
            // InternalTaskDSL.g:3235:1: ( '(' )
            // InternalTaskDSL.g:3236:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalTaskDSL.g:3245:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3249:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalTaskDSL.g:3250:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalTaskDSL.g:3257:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3261:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3262:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3262:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:3263:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3264:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:3264:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalTaskDSL.g:3272:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3276:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:3277:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalTaskDSL.g:3283:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3287:1: ( ( ')' ) )
            // InternalTaskDSL.g:3288:1: ( ')' )
            {
            // InternalTaskDSL.g:3288:1: ( ')' )
            // InternalTaskDSL.g:3289:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__Planning__NameAssignment_1"
    // InternalTaskDSL.g:3299:1: rule__Planning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Planning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3303:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3304:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3304:2: ( RULE_ID )
            // InternalTaskDSL.g:3305:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__NameAssignment_1"


    // $ANTLR start "rule__Planning__AnonymousAssignment_2"
    // InternalTaskDSL.g:3314:1: rule__Planning__AnonymousAssignment_2 : ( ( 'anonymous' ) ) ;
    public final void rule__Planning__AnonymousAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3318:1: ( ( ( 'anonymous' ) ) )
            // InternalTaskDSL.g:3319:2: ( ( 'anonymous' ) )
            {
            // InternalTaskDSL.g:3319:2: ( ( 'anonymous' ) )
            // InternalTaskDSL.g:3320:3: ( 'anonymous' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }
            // InternalTaskDSL.g:3321:3: ( 'anonymous' )
            // InternalTaskDSL.g:3322:4: 'anonymous'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__AnonymousAssignment_2"


    // $ANTLR start "rule__Planning__PersonsAssignment_3_0"
    // InternalTaskDSL.g:3333:1: rule__Planning__PersonsAssignment_3_0 : ( rulePerson ) ;
    public final void rule__Planning__PersonsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3337:1: ( ( rulePerson ) )
            // InternalTaskDSL.g:3338:2: ( rulePerson )
            {
            // InternalTaskDSL.g:3338:2: ( rulePerson )
            // InternalTaskDSL.g:3339:3: rulePerson
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__PersonsAssignment_3_0"


    // $ANTLR start "rule__Planning__TasksAssignment_3_1"
    // InternalTaskDSL.g:3348:1: rule__Planning__TasksAssignment_3_1 : ( ruleTask ) ;
    public final void rule__Planning__TasksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3352:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:3353:2: ( ruleTask )
            {
            // InternalTaskDSL.g:3353:2: ( ruleTask )
            // InternalTaskDSL.g:3354:3: ruleTask
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__TasksAssignment_3_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalTaskDSL.g:3363:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3367:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3368:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3368:2: ( RULE_ID )
            // InternalTaskDSL.g:3369:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionAssignment_1"
    // InternalTaskDSL.g:3378:1: rule__Task__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3382:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:3383:2: ( ruleAction )
            {
            // InternalTaskDSL.g:3383:2: ( ruleAction )
            // InternalTaskDSL.g:3384:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_1"


    // $ANTLR start "rule__Task__PersonsAssignment_3"
    // InternalTaskDSL.g:3393:1: rule__Task__PersonsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3397:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:3398:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:3398:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3399:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
            }
            // InternalTaskDSL.g:3400:3: ( RULE_ID )
            // InternalTaskDSL.g:3401:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PersonsAssignment_3"


    // $ANTLR start "rule__Task__PrioAssignment_5"
    // InternalTaskDSL.g:3412:1: rule__Task__PrioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3416:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:3417:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:3417:2: ( RULE_INT )
            // InternalTaskDSL.g:3418:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PrioAssignment_5"


    // $ANTLR start "rule__Task__DurationAssignment_6_1"
    // InternalTaskDSL.g:3427:1: rule__Task__DurationAssignment_6_1 : ( ruleDuration ) ;
    public final void rule__Task__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3431:1: ( ( ruleDuration ) )
            // InternalTaskDSL.g:3432:2: ( ruleDuration )
            {
            // InternalTaskDSL.g:3432:2: ( ruleDuration )
            // InternalTaskDSL.g:3433:3: ruleDuration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationAssignment_6_1"


    // $ANTLR start "rule__Duration__DlAssignment_0"
    // InternalTaskDSL.g:3442:1: rule__Duration__DlAssignment_0 : ( RULE_INT ) ;
    public final void rule__Duration__DlAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3446:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:3447:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:3447:2: ( RULE_INT )
            // InternalTaskDSL.g:3448:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__DlAssignment_0"


    // $ANTLR start "rule__Duration__UnitAssignment_1"
    // InternalTaskDSL.g:3457:1: rule__Duration__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3461:1: ( ( ruleTimeUnit ) )
            // InternalTaskDSL.g:3462:2: ( ruleTimeUnit )
            {
            // InternalTaskDSL.g:3462:2: ( ruleTimeUnit )
            // InternalTaskDSL.g:3463:3: ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__UnitAssignment_1"


    // $ANTLR start "rule__LunchAction__LocationAssignment_1"
    // InternalTaskDSL.g:3472:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3476:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3477:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3477:2: ( RULE_ID )
            // InternalTaskDSL.g:3478:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__LocationAssignment_1"


    // $ANTLR start "rule__MeetingAction__TopicAssignment_1"
    // InternalTaskDSL.g:3487:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3491:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:3492:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:3492:2: ( RULE_STRING )
            // InternalTaskDSL.g:3493:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__TopicAssignment_1"


    // $ANTLR start "rule__PaperAction__ReportAssignment_1"
    // InternalTaskDSL.g:3502:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3506:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:3507:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:3507:2: ( RULE_ID )
            // InternalTaskDSL.g:3508:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__ReportAssignment_1"


    // $ANTLR start "rule__PaymentAction__ConditionAssignment_0_1"
    // InternalTaskDSL.g:3517:1: rule__PaymentAction__ConditionAssignment_0_1 : ( ruleBooleanExpression ) ;
    public final void rule__PaymentAction__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3521:1: ( ( ruleBooleanExpression ) )
            // InternalTaskDSL.g:3522:2: ( ruleBooleanExpression )
            {
            // InternalTaskDSL.g:3522:2: ( ruleBooleanExpression )
            // InternalTaskDSL.g:3523:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__ConditionAssignment_0_1"


    // $ANTLR start "rule__PaymentAction__AmountAssignment_2"
    // InternalTaskDSL.g:3532:1: rule__PaymentAction__AmountAssignment_2 : ( ruleIntExpression ) ;
    public final void rule__PaymentAction__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3536:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:3537:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:3537:2: ( ruleIntExpression )
            // InternalTaskDSL.g:3538:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__AmountAssignment_2"


    // $ANTLR start "rule__BooleanExpressionLevel1__BopAssignment_1_1"
    // InternalTaskDSL.g:3547:1: rule__BooleanExpressionLevel1__BopAssignment_1_1 : ( ruleBinaryBooleanOperator ) ;
    public final void rule__BooleanExpressionLevel1__BopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3551:1: ( ( ruleBinaryBooleanOperator ) )
            // InternalTaskDSL.g:3552:2: ( ruleBinaryBooleanOperator )
            {
            // InternalTaskDSL.g:3552:2: ( ruleBinaryBooleanOperator )
            // InternalTaskDSL.g:3553:3: ruleBinaryBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__BopAssignment_1_1"


    // $ANTLR start "rule__BooleanExpressionLevel1__RightAssignment_1_2"
    // InternalTaskDSL.g:3562:1: rule__BooleanExpressionLevel1__RightAssignment_1_2 : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3566:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalTaskDSL.g:3567:2: ( ruleBooleanExpressionLevel2 )
            {
            // InternalTaskDSL.g:3567:2: ( ruleBooleanExpressionLevel2 )
            // InternalTaskDSL.g:3568:3: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__RightAssignment_1_2"


    // $ANTLR start "rule__NotExpression__SubAssignment_1"
    // InternalTaskDSL.g:3577:1: rule__NotExpression__SubAssignment_1 : ( ruleBooleanExpressionLevel3 ) ;
    public final void rule__NotExpression__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3581:1: ( ( ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:3582:2: ( ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:3582:2: ( ruleBooleanExpressionLevel3 )
            // InternalTaskDSL.g:3583:3: ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__SubAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__LeftAssignment_1"
    // InternalTaskDSL.g:3592:1: rule__ComparisonExpression__LeftAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3596:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:3597:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:3597:2: ( ruleIntExpression )
            // InternalTaskDSL.g:3598:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__LeftAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__OpAssignment_2"
    // InternalTaskDSL.g:3607:1: rule__ComparisonExpression__OpAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__ComparisonExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3611:1: ( ( ruleCompareOperator ) )
            // InternalTaskDSL.g:3612:2: ( ruleCompareOperator )
            {
            // InternalTaskDSL.g:3612:2: ( ruleCompareOperator )
            // InternalTaskDSL.g:3613:3: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OpAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_3"
    // InternalTaskDSL.g:3622:1: rule__ComparisonExpression__RightAssignment_3 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3626:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:3627:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:3627:2: ( ruleIntExpression )
            // InternalTaskDSL.g:3628:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_3"


    // $ANTLR start "rule__BooleanExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:3637:1: rule__BooleanExpressionBracket__SubAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__BooleanExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3641:1: ( ( ruleBooleanExpression ) )
            // InternalTaskDSL.g:3642:2: ( ruleBooleanExpression )
            {
            // InternalTaskDSL.g:3642:2: ( ruleBooleanExpression )
            // InternalTaskDSL.g:3643:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__BooleanExpressionConstant__ValueAssignment"
    // InternalTaskDSL.g:3652:1: rule__BooleanExpressionConstant__ValueAssignment : ( RULE_BOOL_LITERAL ) ;
    public final void rule__BooleanExpressionConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3656:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalTaskDSL.g:3657:2: ( RULE_BOOL_LITERAL )
            {
            // InternalTaskDSL.g:3657:2: ( RULE_BOOL_LITERAL )
            // InternalTaskDSL.g:3658:3: RULE_BOOL_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionConstant__ValueAssignment"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalTaskDSL.g:3667:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3671:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:3672:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:3672:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:3673:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalTaskDSL.g:3682:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3686:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:3687:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:3687:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:3688:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalTaskDSL.g:3697:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3701:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3702:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3702:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3703:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalTaskDSL.g:3712:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3716:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3717:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3717:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3718:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_2_2"
    // InternalTaskDSL.g:3727:1: rule__ExpressionLevel2__RightAssignment_1_2_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3731:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3732:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3732:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3733:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_3_2"
    // InternalTaskDSL.g:3742:1: rule__ExpressionLevel2__RightAssignment_1_3_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3746:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3747:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3747:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3748:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_4_2"
    // InternalTaskDSL.g:3757:1: rule__ExpressionLevel2__RightAssignment_1_4_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3761:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3762:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3762:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3763:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2"
    // InternalTaskDSL.g:3772:1: rule__ExpressionLevel3__RightAssignment_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3776:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3777:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3777:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3778:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalTaskDSL.g:3787:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3791:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:3792:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:3792:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:3793:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalTaskDSL.g:3802:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3806:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:3807:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:3807:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:3808:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:3817:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3821:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:3822:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:3822:2: ( ruleIntExpression )
            // InternalTaskDSL.g:3823:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalTaskDSL.g:3832:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3836:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:3837:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:3837:2: ( RULE_INT )
            // InternalTaskDSL.g:3838:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"


    // $ANTLR start "rule__ExpressionBalance__ValueAssignment"
    // InternalTaskDSL.g:3847:1: rule__ExpressionBalance__ValueAssignment : ( ruleBalance ) ;
    public final void rule__ExpressionBalance__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3851:1: ( ( ruleBalance ) )
            // InternalTaskDSL.g:3852:2: ( ruleBalance )
            {
            // InternalTaskDSL.g:3852:2: ( ruleBalance )
            // InternalTaskDSL.g:3853:3: ruleBalance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBalance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBalance__ValueAssignment"

    // $ANTLR start synpred6_InternalTaskDSL
    public final void synpred6_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:897:2: ( ( ( ruleComparisonExpression ) ) )
        // InternalTaskDSL.g:897:2: ( ( ruleComparisonExpression ) )
        {
        // InternalTaskDSL.g:897:2: ( ( ruleComparisonExpression ) )
        // InternalTaskDSL.g:898:3: ( ruleComparisonExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
        }
        // InternalTaskDSL.g:899:3: ( ruleComparisonExpression )
        // InternalTaskDSL.g:899:4: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalTaskDSL

    // $ANTLR start synpred7_InternalTaskDSL
    public final void synpred7_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:903:2: ( ( ruleBooleanExpressionBracket ) )
        // InternalTaskDSL.g:903:2: ( ruleBooleanExpressionBracket )
        {
        // InternalTaskDSL.g:903:2: ( ruleBooleanExpressionBracket )
        // InternalTaskDSL.g:904:3: ruleBooleanExpressionBracket
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBooleanExpressionBracket();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalTaskDSL

    // Delegated rules

    public final boolean synpred7_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalTaskDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalTaskDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000080000C000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001780000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000034000001020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000360000010A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00003C0000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00003C0000200002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});

}
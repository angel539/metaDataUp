package eagledata.core.dsl.rule.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslLexer extends Lexer {
    public static final int RULE_SELECTOPERATOR=6;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=7;
    public static final int RULE_OPERATOR=10;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SETOPERATOR=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalRuleDslLexer() {;} 
    public InternalRuleDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRuleDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:11:7: ( 'rule' )
            // InternalRuleDsl.g:11:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:12:7: ( '=' )
            // InternalRuleDsl.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:13:7: ( '(' )
            // InternalRuleDsl.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:14:7: ( 'on' )
            // InternalRuleDsl.g:14:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:15:7: ( '{' )
            // InternalRuleDsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:16:7: ( '}' )
            // InternalRuleDsl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:17:7: ( 'do' )
            // InternalRuleDsl.g:17:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:18:7: ( ',' )
            // InternalRuleDsl.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:19:7: ( ')' )
            // InternalRuleDsl.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20:7: ( ':' )
            // InternalRuleDsl.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:21:7: ( 'select' )
            // InternalRuleDsl.g:21:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:22:7: ( '*' )
            // InternalRuleDsl.g:22:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:23:7: ( '.' )
            // InternalRuleDsl.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:24:7: ( 'where' )
            // InternalRuleDsl.g:24:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:25:7: ( 'when' )
            // InternalRuleDsl.g:25:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1183:15: ( ( '+' | '-' | '*' | 'DIV' ) )
            // InternalRuleDsl.g:1183:17: ( '+' | '-' | '*' | 'DIV' )
            {
            // InternalRuleDsl.g:1183:17: ( '+' | '-' | '*' | 'DIV' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt1=1;
                }
                break;
            case '-':
                {
                alt1=2;
                }
                break;
            case '*':
                {
                alt1=3;
                }
                break;
            case 'D':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRuleDsl.g:1183:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1183:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1183:26: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 4 :
                    // InternalRuleDsl.g:1183:30: 'DIV'
                    {
                    match("DIV"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_LOGICALOPERATOR"
    public final void mRULE_LOGICALOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_LOGICALOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1185:22: ( ( '>' | '<' | '>=' | '<=' | '=' ) )
            // InternalRuleDsl.g:1185:24: ( '>' | '<' | '>=' | '<=' | '=' )
            {
            // InternalRuleDsl.g:1185:24: ( '>' | '<' | '>=' | '<=' | '=' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=3;
                }
                else {
                    alt2=1;}
                }
                break;
            case '<':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=2;}
                }
                break;
            case '=':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:1185:25: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1185:29: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1185:33: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalRuleDsl.g:1185:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalRuleDsl.g:1185:43: '='
                    {
                    match('='); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGICALOPERATOR"

    // $ANTLR start "RULE_SELECTOPERATOR"
    public final void mRULE_SELECTOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_SELECTOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1187:21: ( ( 'COUNT' | 'MIN' | 'MAX' ) )
            // InternalRuleDsl.g:1187:23: ( 'COUNT' | 'MIN' | 'MAX' )
            {
            // InternalRuleDsl.g:1187:23: ( 'COUNT' | 'MIN' | 'MAX' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='C') ) {
                alt3=1;
            }
            else if ( (LA3_0=='M') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='I') ) {
                    alt3=2;
                }
                else if ( (LA3_2=='A') ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:1187:24: 'COUNT'
                    {
                    match("COUNT"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1187:32: 'MIN'
                    {
                    match("MIN"); 


                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1187:38: 'MAX'
                    {
                    match("MAX"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECTOPERATOR"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1189:13: ( RULE_INT '.' RULE_INT )
            // InternalRuleDsl.g:1189:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_SETOPERATOR"
    public final void mRULE_SETOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_SETOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1191:18: ( ( 'UNION' | 'EXCEPT' | 'INTERSECT' ) )
            // InternalRuleDsl.g:1191:20: ( 'UNION' | 'EXCEPT' | 'INTERSECT' )
            {
            // InternalRuleDsl.g:1191:20: ( 'UNION' | 'EXCEPT' | 'INTERSECT' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'U':
                {
                alt4=1;
                }
                break;
            case 'E':
                {
                alt4=2;
                }
                break;
            case 'I':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRuleDsl.g:1191:21: 'UNION'
                    {
                    match("UNION"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1191:29: 'EXCEPT'
                    {
                    match("EXCEPT"); 


                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1191:38: 'INTERSECT'
                    {
                    match("INTERSECT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SETOPERATOR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1193:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRuleDsl.g:1193:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRuleDsl.g:1193:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDsl.g:1193:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRuleDsl.g:1193:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRuleDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1195:10: ( ( '0' .. '9' )+ )
            // InternalRuleDsl.g:1195:12: ( '0' .. '9' )+
            {
            // InternalRuleDsl.g:1195:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRuleDsl.g:1195:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1197:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRuleDsl.g:1197:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRuleDsl.g:1197:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRuleDsl.g:1197:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRuleDsl.g:1197:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRuleDsl.g:1197:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuleDsl.g:1197:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1197:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRuleDsl.g:1197:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRuleDsl.g:1197:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuleDsl.g:1197:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1199:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRuleDsl.g:1199:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRuleDsl.g:1199:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRuleDsl.g:1199:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1201:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRuleDsl.g:1201:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRuleDsl.g:1201:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRuleDsl.g:1201:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalRuleDsl.g:1201:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRuleDsl.g:1201:41: ( '\\r' )? '\\n'
                    {
                    // InternalRuleDsl.g:1201:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRuleDsl.g:1201:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1203:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRuleDsl.g:1203:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRuleDsl.g:1203:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRuleDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1205:16: ( . )
            // InternalRuleDsl.g:1205:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRuleDsl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_OPERATOR | RULE_LOGICALOPERATOR | RULE_SELECTOPERATOR | RULE_DOUBLE | RULE_SETOPERATOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=27;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalRuleDsl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalRuleDsl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalRuleDsl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalRuleDsl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalRuleDsl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalRuleDsl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalRuleDsl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalRuleDsl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalRuleDsl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalRuleDsl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalRuleDsl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalRuleDsl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalRuleDsl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalRuleDsl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalRuleDsl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalRuleDsl.g:1:100: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 17 :
                // InternalRuleDsl.g:1:114: RULE_LOGICALOPERATOR
                {
                mRULE_LOGICALOPERATOR(); 

                }
                break;
            case 18 :
                // InternalRuleDsl.g:1:135: RULE_SELECTOPERATOR
                {
                mRULE_SELECTOPERATOR(); 

                }
                break;
            case 19 :
                // InternalRuleDsl.g:1:155: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 20 :
                // InternalRuleDsl.g:1:167: RULE_SETOPERATOR
                {
                mRULE_SETOPERATOR(); 

                }
                break;
            case 21 :
                // InternalRuleDsl.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalRuleDsl.g:1:192: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalRuleDsl.g:1:201: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalRuleDsl.g:1:213: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalRuleDsl.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalRuleDsl.g:1:245: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalRuleDsl.g:1:253: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\42\2\uffff\1\42\2\uffff\1\42\3\uffff\1\42\2\uffff\1\42\2\uffff\1\42\2\uffff\2\42\1\66\3\42\1\40\1\uffff\3\40\2\uffff\1\42\3\uffff\1\101\2\uffff\1\102\3\uffff\1\42\2\uffff\1\42\1\uffff\1\42\1\uffff\3\42\1\uffff\1\66\1\uffff\3\42\4\uffff\1\42\2\uffff\2\42\1\60\1\42\2\121\3\42\1\125\2\42\1\130\1\42\1\uffff\3\42\1\uffff\1\42\1\136\1\uffff\1\121\1\137\2\42\1\142\2\uffff\1\137\1\42\1\uffff\2\42\1\137";
    static final String DFA16_eofS =
        "\146\uffff";
    static final String DFA16_minS =
        "\1\0\1\165\2\uffff\1\156\2\uffff\1\157\3\uffff\1\145\2\uffff\1\150\2\uffff\1\111\2\uffff\1\117\1\101\1\56\1\116\1\130\1\116\1\101\1\uffff\2\0\1\52\2\uffff\1\154\3\uffff\1\60\2\uffff\1\60\3\uffff\1\154\2\uffff\1\145\1\uffff\1\126\1\uffff\1\125\1\116\1\130\1\uffff\1\56\1\uffff\1\111\1\103\1\124\4\uffff\1\145\2\uffff\1\145\1\156\1\60\1\116\2\60\1\117\2\105\1\60\1\143\1\145\1\60\1\124\1\uffff\1\116\1\120\1\122\1\uffff\1\164\1\60\1\uffff\2\60\1\124\1\123\1\60\2\uffff\1\60\1\105\1\uffff\1\103\1\124\1\60";
    static final String DFA16_maxS =
        "\1\uffff\1\165\2\uffff\1\156\2\uffff\1\157\3\uffff\1\145\2\uffff\1\150\2\uffff\1\111\2\uffff\1\117\1\111\1\71\1\116\1\130\1\116\1\172\1\uffff\2\uffff\1\57\2\uffff\1\154\3\uffff\1\172\2\uffff\1\172\3\uffff\1\154\2\uffff\1\145\1\uffff\1\126\1\uffff\1\125\1\116\1\130\1\uffff\1\71\1\uffff\1\111\1\103\1\124\4\uffff\1\145\2\uffff\1\145\1\162\1\172\1\116\2\172\1\117\2\105\1\172\1\143\1\145\1\172\1\124\1\uffff\1\116\1\120\1\122\1\uffff\1\164\1\172\1\uffff\2\172\1\124\1\123\1\172\2\uffff\1\172\1\105\1\uffff\1\103\1\124\1\172";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\uffff\1\14\1\15\1\uffff\2\20\1\uffff\2\21\7\uffff\1\25\3\uffff\1\32\1\33\1\uffff\1\25\1\2\1\3\1\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\uffff\1\14\1\15\1\uffff\1\20\1\uffff\1\21\3\uffff\1\26\1\uffff\1\23\3\uffff\1\27\1\30\1\31\1\32\1\uffff\1\4\1\7\16\uffff\1\22\3\uffff\1\1\2\uffff\1\17\5\uffff\1\16\1\24\2\uffff\1\13\3\uffff";
    static final String DFA16_specialS =
        "\1\1\33\uffff\1\0\1\2\110\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\4\40\1\35\1\3\1\11\1\14\1\17\1\10\1\20\1\15\1\36\12\26\1\12\1\40\1\23\1\2\1\22\2\40\2\33\1\24\1\21\1\30\3\33\1\31\3\33\1\25\7\33\1\27\5\33\3\40\1\32\1\33\1\40\3\33\1\7\12\33\1\4\2\33\1\1\1\13\3\33\1\16\3\33\1\5\1\40\1\6\uff82\40",
            "\1\41",
            "",
            "",
            "\1\45",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\57",
            "",
            "",
            "\1\61",
            "",
            "",
            "\1\63",
            "\1\65\7\uffff\1\64",
            "\1\70\1\uffff\12\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\70\1\uffff\12\67",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "\1\115",
            "\1\117\3\uffff\1\116",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\120",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\126",
            "\1\127",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\1\141",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_OPERATOR | RULE_LOGICALOPERATOR | RULE_SELECTOPERATOR | RULE_DOUBLE | RULE_SETOPERATOR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_28 = input.LA(1);

                        s = -1;
                        if ( ((LA16_28>='\u0000' && LA16_28<='\uFFFF')) ) {s = 60;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='r') ) {s = 1;}

                        else if ( (LA16_0=='=') ) {s = 2;}

                        else if ( (LA16_0=='(') ) {s = 3;}

                        else if ( (LA16_0=='o') ) {s = 4;}

                        else if ( (LA16_0=='{') ) {s = 5;}

                        else if ( (LA16_0=='}') ) {s = 6;}

                        else if ( (LA16_0=='d') ) {s = 7;}

                        else if ( (LA16_0==',') ) {s = 8;}

                        else if ( (LA16_0==')') ) {s = 9;}

                        else if ( (LA16_0==':') ) {s = 10;}

                        else if ( (LA16_0=='s') ) {s = 11;}

                        else if ( (LA16_0=='*') ) {s = 12;}

                        else if ( (LA16_0=='.') ) {s = 13;}

                        else if ( (LA16_0=='w') ) {s = 14;}

                        else if ( (LA16_0=='+') ) {s = 15;}

                        else if ( (LA16_0=='-') ) {s = 16;}

                        else if ( (LA16_0=='D') ) {s = 17;}

                        else if ( (LA16_0=='>') ) {s = 18;}

                        else if ( (LA16_0=='<') ) {s = 19;}

                        else if ( (LA16_0=='C') ) {s = 20;}

                        else if ( (LA16_0=='M') ) {s = 21;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 22;}

                        else if ( (LA16_0=='U') ) {s = 23;}

                        else if ( (LA16_0=='E') ) {s = 24;}

                        else if ( (LA16_0=='I') ) {s = 25;}

                        else if ( (LA16_0=='^') ) {s = 26;}

                        else if ( ((LA16_0>='A' && LA16_0<='B')||(LA16_0>='F' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='L')||(LA16_0>='N' && LA16_0<='T')||(LA16_0>='V' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='c')||(LA16_0>='e' && LA16_0<='n')||(LA16_0>='p' && LA16_0<='q')||(LA16_0>='t' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 27;}

                        else if ( (LA16_0=='\"') ) {s = 28;}

                        else if ( (LA16_0=='\'') ) {s = 29;}

                        else if ( (LA16_0=='/') ) {s = 30;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 31;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||LA16_0==';'||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_29 = input.LA(1);

                        s = -1;
                        if ( ((LA16_29>='\u0000' && LA16_29<='\uFFFF')) ) {s = 60;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
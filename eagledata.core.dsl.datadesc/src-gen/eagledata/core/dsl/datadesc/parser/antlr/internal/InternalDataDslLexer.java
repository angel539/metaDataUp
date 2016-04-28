package eagledata.core.dsl.datadesc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_MODIFICATION_MARK=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DELETATION_MARK=9;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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

    // delegates
    // delegators

    public InternalDataDslLexer() {;} 
    public InternalDataDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDataDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDataDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:11:7: ( 'import' )
            // InternalDataDsl.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:12:7: ( '.*' )
            // InternalDataDsl.g:12:9: '.*'
            {
            match(".*"); 


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
            // InternalDataDsl.g:13:7: ( '.' )
            // InternalDataDsl.g:13:9: '.'
            {
            match('.'); 

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
            // InternalDataDsl.g:14:7: ( 'package' )
            // InternalDataDsl.g:14:9: 'package'
            {
            match("package"); 


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
            // InternalDataDsl.g:15:7: ( '{' )
            // InternalDataDsl.g:15:9: '{'
            {
            match('{'); 

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
            // InternalDataDsl.g:16:7: ( '}' )
            // InternalDataDsl.g:16:9: '}'
            {
            match('}'); 

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
            // InternalDataDsl.g:17:7: ( 'string' )
            // InternalDataDsl.g:17:9: 'string'
            {
            match("string"); 


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
            // InternalDataDsl.g:18:7: ( '=' )
            // InternalDataDsl.g:18:9: '='
            {
            match('='); 

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
            // InternalDataDsl.g:19:7: ( '(' )
            // InternalDataDsl.g:19:9: '('
            {
            match('('); 

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
            // InternalDataDsl.g:20:7: ( ',' )
            // InternalDataDsl.g:20:9: ','
            {
            match(','); 

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
            // InternalDataDsl.g:21:7: ( ')' )
            // InternalDataDsl.g:21:9: ')'
            {
            match(')'); 

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
            // InternalDataDsl.g:22:7: ( '[' )
            // InternalDataDsl.g:22:9: '['
            {
            match('['); 

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
            // InternalDataDsl.g:23:7: ( ']' )
            // InternalDataDsl.g:23:9: ']'
            {
            match(']'); 

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
            // InternalDataDsl.g:24:7: ( 'description' )
            // InternalDataDsl.g:24:9: 'description'
            {
            match("description"); 


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
            // InternalDataDsl.g:25:7: ( ':' )
            // InternalDataDsl.g:25:9: ':'
            {
            match(':'); 

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
            // InternalDataDsl.g:26:7: ( 'fragment' )
            // InternalDataDsl.g:26:9: 'fragment'
            {
            match("fragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:27:7: ( 'datatype' )
            // InternalDataDsl.g:27:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:28:7: ( 'enumeration' )
            // InternalDataDsl.g:28:9: 'enumeration'
            {
            match("enumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:29:7: ( 'struct' )
            // InternalDataDsl.g:29:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:30:7: ( 'key' )
            // InternalDataDsl.g:30:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:31:7: ( 'unique' )
            // InternalDataDsl.g:31:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:32:7: ( 'list' )
            // InternalDataDsl.g:32:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:33:7: ( 'char' )
            // InternalDataDsl.g:33:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:34:7: ( 'digit' )
            // InternalDataDsl.g:34:9: 'digit'
            {
            match("digit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:35:7: ( 'anycase_string' )
            // InternalDataDsl.g:35:9: 'anycase_string'
            {
            match("anycase_string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:36:7: ( 'lowercase_string' )
            // InternalDataDsl.g:36:9: 'lowercase_string'
            {
            match("lowercase_string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:37:7: ( 'uppercase_string' )
            // InternalDataDsl.g:37:9: 'uppercase_string'
            {
            match("uppercase_string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:38:7: ( 'digits' )
            // InternalDataDsl.g:38:9: 'digits'
            {
            match("digits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:39:7: ( 'regex_form' )
            // InternalDataDsl.g:39:9: 'regex_form'
            {
            match("regex_form"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:40:7: ( 'url' )
            // InternalDataDsl.g:40:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:41:7: ( 'int' )
            // InternalDataDsl.g:41:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:42:7: ( 'real' )
            // InternalDataDsl.g:42:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:43:7: ( 'date' )
            // InternalDataDsl.g:43:9: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:44:7: ( 'time' )
            // InternalDataDsl.g:44:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:45:7: ( 'year' )
            // InternalDataDsl.g:45:9: 'year'
            {
            match("year"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:46:7: ( 'month' )
            // InternalDataDsl.g:46:9: 'month'
            {
            match("month"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:47:7: ( 'day' )
            // InternalDataDsl.g:47:9: 'day'
            {
            match("day"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:48:7: ( 'boolean' )
            // InternalDataDsl.g:48:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:49:7: ( 'lat' )
            // InternalDataDsl.g:49:9: 'lat'
            {
            match("lat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:50:7: ( 'long' )
            // InternalDataDsl.g:50:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:51:7: ( 'casesensitive' )
            // InternalDataDsl.g:51:9: 'casesensitive'
            {
            match("casesensitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:52:7: ( 'null' )
            // InternalDataDsl.g:52:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:53:7: ( 'separator' )
            // InternalDataDsl.g:53:9: 'separator'
            {
            match("separator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:54:7: ( 'default' )
            // InternalDataDsl.g:54:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:55:7: ( 'regex' )
            // InternalDataDsl.g:55:9: 'regex'
            {
            match("regex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:56:7: ( 'flags' )
            // InternalDataDsl.g:56:9: 'flags'
            {
            match("flags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:57:7: ( 'decimalchar' )
            // InternalDataDsl.g:57:9: 'decimalchar'
            {
            match("decimalchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:58:7: ( 'pattern' )
            // InternalDataDsl.g:58:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:59:7: ( 'format' )
            // InternalDataDsl.g:59:9: 'format'
            {
            match("format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:60:7: ( 'minLength' )
            // InternalDataDsl.g:60:9: 'minLength'
            {
            match("minLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:61:7: ( 'maxLength' )
            // InternalDataDsl.g:61:9: 'maxLength'
            {
            match("maxLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:62:7: ( 'min' )
            // InternalDataDsl.g:62:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:63:7: ( 'max' )
            // InternalDataDsl.g:63:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:64:7: ( 'defaultvalue' )
            // InternalDataDsl.g:64:9: 'defaultvalue'
            {
            match("defaultvalue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:65:7: ( 'minDouble' )
            // InternalDataDsl.g:65:9: 'minDouble'
            {
            match("minDouble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:66:7: ( 'maxDouble' )
            // InternalDataDsl.g:66:9: 'maxDouble'
            {
            match("maxDouble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:67:7: ( 'defaultvalueDouble' )
            // InternalDataDsl.g:67:9: 'defaultvalueDouble'
            {
            match("defaultvalueDouble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:68:7: ( 'nullable' )
            // InternalDataDsl.g:68:9: 'nullable'
            {
            match("nullable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:69:7: ( 'header' )
            // InternalDataDsl.g:69:9: 'header'
            {
            match("header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:70:7: ( 'squema' )
            // InternalDataDsl.g:70:9: 'squema'
            {
            match("squema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:71:7: ( 'CSV' )
            // InternalDataDsl.g:71:9: 'CSV'
            {
            match("CSV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:72:7: ( 'JSON' )
            // InternalDataDsl.g:72:9: 'JSON'
            {
            match("JSON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:73:7: ( 'XML' )
            // InternalDataDsl.g:73:9: 'XML'
            {
            match("XML"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "RULE_DELETATION_MARK"
    public final void mRULE_DELETATION_MARK() throws RecognitionException {
        try {
            int _type = RULE_DELETATION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:2544:22: ( 'REMOVE' )
            // InternalDataDsl.g:2544:24: 'REMOVE'
            {
            match("REMOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DELETATION_MARK"

    // $ANTLR start "RULE_MODIFICATION_MARK"
    public final void mRULE_MODIFICATION_MARK() throws RecognitionException {
        try {
            int _type = RULE_MODIFICATION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:2546:24: ( ( 'RENAME' | 'RETYPE' ) )
            // InternalDataDsl.g:2546:26: ( 'RENAME' | 'RETYPE' )
            {
            // InternalDataDsl.g:2546:26: ( 'RENAME' | 'RETYPE' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='R') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='E') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='N') ) {
                        alt1=1;
                    }
                    else if ( (LA1_2=='T') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataDsl.g:2546:27: 'RENAME'
                    {
                    match("RENAME"); 


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2546:36: 'RETYPE'
                    {
                    match("RETYPE"); 


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
    // $ANTLR end "RULE_MODIFICATION_MARK"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:2548:14: ( ( 'true' | 'false' ) )
            // InternalDataDsl.g:2548:16: ( 'true' | 'false' )
            {
            // InternalDataDsl.g:2548:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:2548:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2548:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:2550:13: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalDataDsl.g:2550:15: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalDataDsl.g:2550:15: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataDsl.g:2550:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:2552:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDataDsl.g:2552:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDataDsl.g:2552:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:2552:11: '^'
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

            // InternalDataDsl.g:2552:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataDsl.g:
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
            	    break loop5;
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
            // InternalDataDsl.g:2554:10: ( ( '0' .. '9' )+ )
            // InternalDataDsl.g:2554:12: ( '0' .. '9' )+
            {
            // InternalDataDsl.g:2554:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDataDsl.g:2554:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalDataDsl.g:2556:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDataDsl.g:2556:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDataDsl.g:2556:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:2556:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDataDsl.g:2556:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDataDsl.g:2556:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDataDsl.g:2556:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2556:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDataDsl.g:2556:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDataDsl.g:2556:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDataDsl.g:2556:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalDataDsl.g:2558:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDataDsl.g:2558:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDataDsl.g:2558:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataDsl.g:2558:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalDataDsl.g:2560:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDataDsl.g:2560:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDataDsl.g:2560:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataDsl.g:2560:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalDataDsl.g:2560:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataDsl.g:2560:41: ( '\\r' )? '\\n'
                    {
                    // InternalDataDsl.g:2560:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDataDsl.g:2560:41: '\\r'
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
            // InternalDataDsl.g:2562:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDataDsl.g:2562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDataDsl.g:2562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDataDsl.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalDataDsl.g:2564:16: ( . )
            // InternalDataDsl.g:2564:18: .
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
        // InternalDataDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_DELETATION_MARK | RULE_MODIFICATION_MARK | RULE_BOOLEAN | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=74;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalDataDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalDataDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalDataDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalDataDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalDataDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalDataDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalDataDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalDataDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalDataDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalDataDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalDataDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalDataDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalDataDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalDataDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalDataDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalDataDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalDataDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalDataDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalDataDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalDataDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalDataDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalDataDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalDataDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalDataDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalDataDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalDataDsl.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalDataDsl.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalDataDsl.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalDataDsl.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalDataDsl.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalDataDsl.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalDataDsl.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalDataDsl.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalDataDsl.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalDataDsl.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalDataDsl.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalDataDsl.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalDataDsl.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalDataDsl.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalDataDsl.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalDataDsl.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalDataDsl.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalDataDsl.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalDataDsl.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalDataDsl.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalDataDsl.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalDataDsl.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalDataDsl.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalDataDsl.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalDataDsl.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalDataDsl.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalDataDsl.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalDataDsl.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalDataDsl.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalDataDsl.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalDataDsl.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalDataDsl.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalDataDsl.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalDataDsl.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalDataDsl.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalDataDsl.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalDataDsl.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalDataDsl.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalDataDsl.g:1:388: RULE_DELETATION_MARK
                {
                mRULE_DELETATION_MARK(); 

                }
                break;
            case 65 :
                // InternalDataDsl.g:1:409: RULE_MODIFICATION_MARK
                {
                mRULE_MODIFICATION_MARK(); 

                }
                break;
            case 66 :
                // InternalDataDsl.g:1:432: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 67 :
                // InternalDataDsl.g:1:445: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 68 :
                // InternalDataDsl.g:1:457: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // InternalDataDsl.g:1:465: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // InternalDataDsl.g:1:474: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // InternalDataDsl.g:1:486: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // InternalDataDsl.g:1:502: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalDataDsl.g:1:518: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // InternalDataDsl.g:1:526: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\54\1\56\1\54\2\uffff\1\54\6\uffff\1\54\1\uffff\22\54\1\51\1\135\1\51\1\uffff\3\51\2\uffff\2\54\3\uffff\1\54\2\uffff\3\54\6\uffff\3\54\1\uffff\35\54\2\uffff\1\135\4\uffff\1\54\1\u0092\11\54\1\u009e\6\54\1\u00a5\2\54\1\u00a8\3\54\1\u00ac\11\54\1\u00b8\1\u00bb\3\54\1\u00bf\1\54\1\u00c1\4\54\1\uffff\12\54\1\u00d0\1\uffff\6\54\1\uffff\2\54\1\uffff\1\u00d9\1\54\1\u00db\1\uffff\1\u00dc\3\54\1\u00e0\1\u00e1\1\u00e2\1\u00e3\3\54\1\uffff\2\54\1\uffff\1\54\1\u00eb\1\54\1\uffff\1\u00ed\1\uffff\16\54\1\uffff\1\u00fd\1\54\1\u00ff\1\54\1\u00e2\3\54\1\uffff\1\54\2\uffff\2\54\1\u0108\4\uffff\1\u0109\6\54\1\uffff\1\54\1\uffff\3\54\1\u0114\2\54\1\u0117\1\u0118\1\54\1\u011a\4\54\1\u011f\1\uffff\1\54\1\uffff\1\u0121\1\54\1\u0123\5\54\2\uffff\6\54\1\u012f\1\u0130\2\u0131\1\uffff\1\u0132\1\u0133\2\uffff\1\54\1\uffff\1\54\1\u0137\2\54\1\uffff\1\54\1\uffff\1\54\1\uffff\11\54\1\u0145\1\54\5\uffff\3\54\1\uffff\1\54\1\u014b\1\u014c\12\54\1\uffff\1\u0157\1\u0158\3\54\2\uffff\6\54\1\u0162\1\u0163\1\u0164\1\u0165\2\uffff\10\54\1\u016e\4\uffff\1\u016f\1\54\1\u0171\1\u0172\4\54\2\uffff\1\u0178\2\uffff\5\54\1\uffff\2\54\1\u0180\4\54\1\uffff\1\u0185\3\54\1\uffff\1\54\1\u018a\1\u018b\1\54\2\uffff\1\u018d\1\uffff";
    static final String DFA15_eofS =
        "\u018e\uffff";
    static final String DFA15_minS =
        "\1\0\1\155\1\52\1\141\2\uffff\1\145\6\uffff\1\141\1\uffff\1\141\1\156\1\145\1\156\2\141\1\156\1\145\1\151\1\145\1\141\1\157\1\165\1\145\2\123\1\115\1\105\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\160\1\164\3\uffff\1\143\2\uffff\1\162\1\160\1\165\6\uffff\1\143\1\164\1\147\1\uffff\2\141\1\162\1\154\1\165\1\171\1\151\1\160\1\154\1\163\1\156\1\164\1\141\1\163\1\171\1\141\1\155\1\165\1\141\2\156\1\170\1\157\1\154\1\141\1\126\1\117\1\114\1\115\2\uffff\1\56\4\uffff\1\157\1\60\1\153\1\164\1\151\1\141\1\145\1\143\1\141\1\151\1\141\1\60\1\151\2\147\1\155\1\163\1\155\1\60\1\161\1\145\1\60\1\164\1\145\1\147\1\60\1\162\1\145\1\143\1\145\1\154\2\145\1\162\1\164\2\60\2\154\1\144\1\60\1\116\1\60\1\117\1\101\1\131\1\162\1\uffff\1\141\1\145\1\156\1\143\1\162\1\155\1\162\1\165\1\155\1\164\1\60\1\uffff\1\164\1\155\1\163\1\141\2\145\1\uffff\1\165\1\162\1\uffff\1\60\1\162\1\60\1\uffff\1\60\1\163\1\141\1\170\4\60\1\150\1\145\1\157\1\uffff\1\145\1\157\1\uffff\1\145\1\60\1\145\1\uffff\1\60\1\uffff\1\126\1\115\1\120\1\164\1\147\1\162\1\147\1\164\2\141\1\151\1\154\1\141\1\171\1\uffff\1\60\1\145\1\60\1\164\1\60\1\162\1\145\1\143\1\uffff\1\143\2\uffff\1\145\1\163\1\60\4\uffff\1\60\1\156\1\165\1\156\1\165\1\141\1\142\1\uffff\1\162\1\uffff\3\105\1\60\1\145\1\156\2\60\1\164\1\60\1\160\1\164\1\154\1\160\1\60\1\uffff\1\156\1\uffff\1\60\1\141\1\60\2\141\1\156\1\145\1\146\2\uffff\1\147\1\142\1\147\1\142\1\156\1\154\4\60\1\uffff\2\60\2\uffff\1\157\1\uffff\1\164\1\60\1\143\1\145\1\uffff\1\164\1\uffff\1\164\1\uffff\3\163\1\137\1\157\1\164\1\154\1\164\1\154\1\60\1\145\5\uffff\1\162\1\151\1\141\1\uffff\1\150\2\60\1\151\2\145\1\151\1\163\1\162\1\150\1\145\1\150\1\145\1\uffff\2\60\1\157\1\154\1\141\2\uffff\1\157\2\137\2\164\1\155\4\60\2\uffff\1\156\1\165\1\162\1\156\2\163\1\151\1\162\1\60\4\uffff\1\60\1\145\2\60\2\164\1\166\1\151\2\uffff\1\60\2\uffff\2\162\1\145\1\156\1\157\1\uffff\2\151\1\60\1\147\1\165\2\156\1\uffff\1\60\1\142\2\147\1\uffff\1\154\2\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\156\1\52\1\141\2\uffff\1\164\6\uffff\1\151\1\uffff\1\162\1\156\1\145\1\162\1\157\1\150\1\156\1\145\1\162\1\145\2\157\1\165\1\145\2\123\1\115\1\105\2\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\160\1\164\3\uffff\1\164\2\uffff\1\162\1\160\1\165\6\uffff\1\163\1\171\1\147\1\uffff\2\141\1\162\1\154\1\165\1\171\1\151\1\160\1\154\1\163\1\167\1\164\1\141\1\163\1\171\1\147\1\155\1\165\1\141\2\156\1\170\1\157\1\154\1\141\1\126\1\117\1\114\1\124\2\uffff\1\71\4\uffff\1\157\1\172\1\153\1\164\1\165\1\141\1\145\1\143\1\141\1\151\1\145\1\172\1\151\2\147\1\155\1\163\1\155\1\172\1\161\1\145\1\172\1\164\1\145\1\147\1\172\1\162\1\145\1\143\1\145\1\154\2\145\1\162\1\164\2\172\2\154\1\144\1\172\1\116\1\172\1\117\1\101\1\131\1\162\1\uffff\1\141\1\145\1\156\1\143\1\162\1\155\1\162\1\165\1\155\1\164\1\172\1\uffff\1\164\1\155\1\163\1\141\2\145\1\uffff\1\165\1\162\1\uffff\1\172\1\162\1\172\1\uffff\1\172\1\163\1\141\1\170\4\172\1\150\1\145\1\157\1\uffff\1\145\1\157\1\uffff\1\145\1\172\1\145\1\uffff\1\172\1\uffff\1\126\1\115\1\120\1\164\1\147\1\162\1\147\1\164\2\141\1\151\1\154\1\141\1\171\1\uffff\1\172\1\145\1\172\1\164\1\172\1\162\1\145\1\143\1\uffff\1\143\2\uffff\1\145\1\163\1\172\4\uffff\1\172\1\156\1\165\1\156\1\165\1\141\1\142\1\uffff\1\162\1\uffff\3\105\1\172\1\145\1\156\2\172\1\164\1\172\1\160\1\164\1\154\1\160\1\172\1\uffff\1\156\1\uffff\1\172\1\141\1\172\2\141\1\156\1\145\1\146\2\uffff\1\147\1\142\1\147\1\142\1\156\1\154\4\172\1\uffff\2\172\2\uffff\1\157\1\uffff\1\164\1\172\1\143\1\145\1\uffff\1\164\1\uffff\1\164\1\uffff\3\163\1\137\1\157\1\164\1\154\1\164\1\154\1\172\1\145\5\uffff\1\162\1\151\1\141\1\uffff\1\150\2\172\1\151\2\145\1\151\1\163\1\162\1\150\1\145\1\150\1\145\1\uffff\2\172\1\157\1\154\1\141\2\uffff\1\157\2\137\2\164\1\155\4\172\2\uffff\1\156\1\165\1\162\1\156\2\163\1\151\1\162\1\172\4\uffff\1\172\1\145\2\172\2\164\1\166\1\151\2\uffff\1\172\2\uffff\2\162\1\145\1\156\1\157\1\uffff\2\151\1\172\1\147\1\165\2\156\1\uffff\1\172\1\142\2\147\1\uffff\1\154\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\17\25\uffff\1\104\3\uffff\1\111\1\112\2\uffff\1\104\1\2\1\3\1\uffff\1\5\1\6\3\uffff\1\10\1\11\1\12\1\13\1\14\1\15\3\uffff\1\17\35\uffff\1\103\1\105\1\uffff\1\106\1\107\1\110\1\111\57\uffff\1\37\13\uffff\1\45\6\uffff\1\24\2\uffff\1\36\3\uffff\1\47\13\uffff\1\64\2\uffff\1\65\3\uffff\1\75\1\uffff\1\77\16\uffff\1\41\10\uffff\1\26\1\uffff\1\50\1\27\3\uffff\1\40\1\42\1\102\1\43\7\uffff\1\52\1\uffff\1\76\17\uffff\1\30\1\uffff\1\56\10\uffff\1\55\1\44\12\uffff\1\1\2\uffff\1\7\1\23\1\uffff\1\74\4\uffff\1\34\1\uffff\1\61\1\uffff\1\25\13\uffff\1\73\1\100\1\101\1\4\1\60\3\uffff\1\54\15\uffff\1\46\5\uffff\1\21\1\20\12\uffff\1\72\1\53\11\uffff\1\62\1\67\1\63\1\70\10\uffff\1\35\1\16\1\uffff\1\57\1\22\5\uffff\1\66\7\uffff\1\51\4\uffff\1\31\4\uffff\1\33\1\32\1\uffff\1\71";
    static final String DFA15_specialS =
        "\1\2\44\uffff\1\0\1\1\u0167\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\4\51\1\46\1\10\1\12\2\51\1\11\1\41\1\2\1\47\12\42\1\16\2\51\1\7\3\51\2\44\1\35\6\44\1\36\7\44\1\40\5\44\1\37\2\44\1\13\1\51\1\14\1\43\1\44\1\51\1\25\1\32\1\24\1\15\1\20\1\17\1\44\1\34\1\1\1\44\1\21\1\23\1\31\1\33\1\44\1\3\1\44\1\26\1\6\1\27\1\22\3\44\1\30\1\44\1\4\1\51\1\5\uff82\51",
            "\1\52\1\53",
            "\1\55",
            "\1\57",
            "",
            "",
            "\1\63\13\uffff\1\64\2\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\3\uffff\1\73\3\uffff\1\75",
            "",
            "\1\102\12\uffff\1\100\2\uffff\1\101\2\uffff\1\77",
            "\1\103",
            "\1\104",
            "\1\105\1\uffff\1\106\1\uffff\1\107",
            "\1\112\7\uffff\1\110\5\uffff\1\111",
            "\1\114\6\uffff\1\113",
            "\1\115",
            "\1\116",
            "\1\117\10\uffff\1\120",
            "\1\121",
            "\1\124\7\uffff\1\123\5\uffff\1\122",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\134",
            "\1\134\1\uffff\12\136",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\0\137",
            "\0\137",
            "\1\140\4\uffff\1\141",
            "",
            "",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "\1\145\20\uffff\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154\2\uffff\1\153\14\uffff\1\152",
            "\1\155\4\uffff\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\173\10\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0081\5\uffff\1\u0080",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\1\u008f\5\uffff\1\u0090",
            "",
            "",
            "\1\134\1\uffff\12\136",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\13\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\3\uffff\1\u009d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a6",
            "\1\u00a7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\54\7\uffff\3\54\1\u00b7\7\54\1\u00b6\16\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\3\54\1\u00ba\7\54\1\u00b9\16\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00da",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u00ea\31\54",
            "\1\u00ec",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u00fc\7\54",
            "\1\u00fe",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0100",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "",
            "",
            "\1\u0105",
            "\1\u0106",
            "\12\54\7\uffff\32\54\4\uffff\1\u0107\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0115",
            "\1\u0116",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0119",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0120",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0122",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u0134",
            "",
            "\1\u0135",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\25\54\1\u0136\4\54",
            "\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a",
            "",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0146",
            "",
            "",
            "",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "",
            "",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0170",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "",
            "\12\54\7\uffff\3\54\1\u0177\26\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u018c",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_DELETATION_MARK | RULE_MODIFICATION_MARK | RULE_BOOLEAN | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_37 = input.LA(1);

                        s = -1;
                        if ( ((LA15_37>='\u0000' && LA15_37<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_38 = input.LA(1);

                        s = -1;
                        if ( ((LA15_38>='\u0000' && LA15_38<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='i') ) {s = 1;}

                        else if ( (LA15_0=='.') ) {s = 2;}

                        else if ( (LA15_0=='p') ) {s = 3;}

                        else if ( (LA15_0=='{') ) {s = 4;}

                        else if ( (LA15_0=='}') ) {s = 5;}

                        else if ( (LA15_0=='s') ) {s = 6;}

                        else if ( (LA15_0=='=') ) {s = 7;}

                        else if ( (LA15_0=='(') ) {s = 8;}

                        else if ( (LA15_0==',') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='[') ) {s = 11;}

                        else if ( (LA15_0==']') ) {s = 12;}

                        else if ( (LA15_0=='d') ) {s = 13;}

                        else if ( (LA15_0==':') ) {s = 14;}

                        else if ( (LA15_0=='f') ) {s = 15;}

                        else if ( (LA15_0=='e') ) {s = 16;}

                        else if ( (LA15_0=='k') ) {s = 17;}

                        else if ( (LA15_0=='u') ) {s = 18;}

                        else if ( (LA15_0=='l') ) {s = 19;}

                        else if ( (LA15_0=='c') ) {s = 20;}

                        else if ( (LA15_0=='a') ) {s = 21;}

                        else if ( (LA15_0=='r') ) {s = 22;}

                        else if ( (LA15_0=='t') ) {s = 23;}

                        else if ( (LA15_0=='y') ) {s = 24;}

                        else if ( (LA15_0=='m') ) {s = 25;}

                        else if ( (LA15_0=='b') ) {s = 26;}

                        else if ( (LA15_0=='n') ) {s = 27;}

                        else if ( (LA15_0=='h') ) {s = 28;}

                        else if ( (LA15_0=='C') ) {s = 29;}

                        else if ( (LA15_0=='J') ) {s = 30;}

                        else if ( (LA15_0=='X') ) {s = 31;}

                        else if ( (LA15_0=='R') ) {s = 32;}

                        else if ( (LA15_0=='-') ) {s = 33;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 34;}

                        else if ( (LA15_0=='^') ) {s = 35;}

                        else if ( ((LA15_0>='A' && LA15_0<='B')||(LA15_0>='D' && LA15_0<='I')||(LA15_0>='K' && LA15_0<='Q')||(LA15_0>='S' && LA15_0<='W')||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='g'||LA15_0=='j'||LA15_0=='o'||LA15_0=='q'||(LA15_0>='v' && LA15_0<='x')||LA15_0=='z') ) {s = 36;}

                        else if ( (LA15_0=='\"') ) {s = 37;}

                        else if ( (LA15_0=='\'') ) {s = 38;}

                        else if ( (LA15_0=='/') ) {s = 39;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 40;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>=';' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
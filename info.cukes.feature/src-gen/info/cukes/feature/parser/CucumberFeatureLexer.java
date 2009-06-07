// $ANTLR 3.0 ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g 2009-06-07 18:03:07

package info.cukes.feature.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CucumberFeatureLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int Tokens=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=8;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public CucumberFeatureLexer() {;} 
    public CucumberFeatureLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:22:7: ( 'Feature:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:22:7: 'Feature:'
            {
            match("Feature:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:23:7: ( 'Background:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:23:7: 'Background:'
            {
            match("Background:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:24:7: ( 'Scenario Outline:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:24:7: 'Scenario Outline:'
            {
            match("Scenario Outline:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:25:7: ( 'Examples:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:25:7: 'Examples:'
            {
            match("Examples:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:26:7: ( 'Scenario:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:26:7: 'Scenario:'
            {
            match("Scenario:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:27:7: ( 'Given' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:27:7: 'Given'
            {
            match("Given"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:28:7: ( 'When' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:28:7: 'When'
            {
            match("When"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:29:7: ( 'Then' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:29:7: 'Then'
            {
            match("Then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:30:7: ( 'And' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:30:7: 'And'
            {
            match("And"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:31:7: ( '.' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:31:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:32:7: ( ':' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:32:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:33:7: ( ',' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:33:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:34:7: ( '|' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:34:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:35:7: ( '<' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:35:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:36:7: ( '>' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:36:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1224:3: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1224:3: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1224:7: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1224:7: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1224:21: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1224:21: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1229:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1229:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1229:3: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1229:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1229:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1235:3: ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1233:1: RULE_STRING : ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1235:3: '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1235:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1235:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1235:54: ~ ( '\\\\' | '\\\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1236:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1236:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1236:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1236:54: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1242:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1242:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1242:3: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1242:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1242:9: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1242:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1248:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1248:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1248:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1254:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1254:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1254:8: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFE')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1254:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT )
        int alt12=21;
        switch ( input.LA(1) ) {
        case 'F':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='e') ) {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='a') ) {
                    int LA12_29 = input.LA(4);

                    if ( (LA12_29=='t') ) {
                        int LA12_37 = input.LA(5);

                        if ( (LA12_37=='u') ) {
                            int LA12_45 = input.LA(6);

                            if ( (LA12_45=='r') ) {
                                int LA12_52 = input.LA(7);

                                if ( (LA12_52=='e') ) {
                                    int LA12_57 = input.LA(8);

                                    if ( (LA12_57==':') ) {
                                        alt12=1;
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'B':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='a') ) {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='c') ) {
                    int LA12_30 = input.LA(4);

                    if ( (LA12_30=='k') ) {
                        int LA12_38 = input.LA(5);

                        if ( (LA12_38=='g') ) {
                            int LA12_46 = input.LA(6);

                            if ( (LA12_46=='r') ) {
                                int LA12_53 = input.LA(7);

                                if ( (LA12_53=='o') ) {
                                    int LA12_58 = input.LA(8);

                                    if ( (LA12_58=='u') ) {
                                        int LA12_62 = input.LA(9);

                                        if ( (LA12_62=='n') ) {
                                            int LA12_65 = input.LA(10);

                                            if ( (LA12_65=='d') ) {
                                                int LA12_69 = input.LA(11);

                                                if ( (LA12_69==':') ) {
                                                    alt12=2;
                                                }
                                                else {
                                                    alt12=17;}
                                            }
                                            else {
                                                alt12=17;}
                                        }
                                        else {
                                            alt12=17;}
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'S':
            {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='c') ) {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='e') ) {
                    int LA12_31 = input.LA(4);

                    if ( (LA12_31=='n') ) {
                        int LA12_39 = input.LA(5);

                        if ( (LA12_39=='a') ) {
                            int LA12_47 = input.LA(6);

                            if ( (LA12_47=='r') ) {
                                int LA12_54 = input.LA(7);

                                if ( (LA12_54=='i') ) {
                                    int LA12_59 = input.LA(8);

                                    if ( (LA12_59=='o') ) {
                                        switch ( input.LA(9) ) {
                                        case ':':
                                            {
                                            alt12=5;
                                            }
                                            break;
                                        case ' ':
                                            {
                                            alt12=3;
                                            }
                                            break;
                                        default:
                                            alt12=17;}

                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'E':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='x') ) {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='a') ) {
                    int LA12_32 = input.LA(4);

                    if ( (LA12_32=='m') ) {
                        int LA12_40 = input.LA(5);

                        if ( (LA12_40=='p') ) {
                            int LA12_48 = input.LA(6);

                            if ( (LA12_48=='l') ) {
                                int LA12_55 = input.LA(7);

                                if ( (LA12_55=='e') ) {
                                    int LA12_60 = input.LA(8);

                                    if ( (LA12_60=='s') ) {
                                        int LA12_64 = input.LA(9);

                                        if ( (LA12_64==':') ) {
                                            alt12=4;
                                        }
                                        else {
                                            alt12=17;}
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'G':
            {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='i') ) {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='v') ) {
                    int LA12_33 = input.LA(4);

                    if ( (LA12_33=='e') ) {
                        int LA12_41 = input.LA(5);

                        if ( (LA12_41=='n') ) {
                            int LA12_49 = input.LA(6);

                            if ( ((LA12_49>='0' && LA12_49<='9')||(LA12_49>='A' && LA12_49<='Z')||LA12_49=='_'||(LA12_49>='a' && LA12_49<='z')) ) {
                                alt12=17;
                            }
                            else {
                                alt12=6;}
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'W':
            {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='h') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='e') ) {
                    int LA12_34 = input.LA(4);

                    if ( (LA12_34=='n') ) {
                        int LA12_42 = input.LA(5);

                        if ( ((LA12_42>='0' && LA12_42<='9')||(LA12_42>='A' && LA12_42<='Z')||LA12_42=='_'||(LA12_42>='a' && LA12_42<='z')) ) {
                            alt12=17;
                        }
                        else {
                            alt12=7;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'T':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='h') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='e') ) {
                    int LA12_35 = input.LA(4);

                    if ( (LA12_35=='n') ) {
                        int LA12_43 = input.LA(5);

                        if ( ((LA12_43>='0' && LA12_43<='9')||(LA12_43>='A' && LA12_43<='Z')||LA12_43=='_'||(LA12_43>='a' && LA12_43<='z')) ) {
                            alt12=17;
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case 'A':
            {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='n') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='d') ) {
                    int LA12_36 = input.LA(4);

                    if ( ((LA12_36>='0' && LA12_36<='9')||(LA12_36>='A' && LA12_36<='Z')||LA12_36=='_'||(LA12_36>='a' && LA12_36<='z')) ) {
                        alt12=17;
                    }
                    else {
                        alt12=9;}
                }
                else {
                    alt12=17;}
            }
            else {
                alt12=17;}
            }
            break;
        case '.':
            {
            alt12=10;
            }
            break;
        case ':':
            {
            alt12=11;
            }
            break;
        case ',':
            {
            alt12=12;
            }
            break;
        case '|':
            {
            alt12=13;
            }
            break;
        case '<':
            {
            alt12=14;
            }
            break;
        case '>':
            {
            alt12=15;
            }
            break;
        case '#':
            {
            alt12=16;
            }
            break;
        case 'C':
        case 'D':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'U':
        case 'V':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=17;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=18;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=19;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=20;
            }
            break;
        case '/':
            {
            alt12=21;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:70: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:86: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:94: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:106: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;

        }

    }


 

}
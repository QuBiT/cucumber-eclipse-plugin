// $ANTLR 3.0 ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g 2009-06-07 11:04:22

package info.cukes.feature.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CucumberFeatureLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_BusinessValueIdentifier=4;
    public static final int Tokens=23;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=13;
    public static final int T22=22;
    public static final int T21=21;
    public static final int RULE_NotAsa=11;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=15;
    public static final int RULE_SomeActionIdentifier=6;
    public static final int RULE_STRING=8;
    public static final int RULE_NotIwantto=12;
    public static final int RULE_INT=9;
    public static final int RULE_RoleIdentifier=5;
    public static final int RULE_NotInorderto=10;
    public static final int RULE_WS=14;
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

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
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
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:23:7: ( 'Scenario:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:23:7: 'Scenario:'
            {
            match("Scenario:"); 


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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:24:7: ( 'Given' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:24:7: 'Given'
            {
            match("Given"); 


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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:25:7: ( 'When' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:25:7: 'When'
            {
            match("When"); 


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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:26:7: ( 'Then' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:26:7: 'Then'
            {
            match("Then"); 


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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:27:7: ( 'And' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:27:7: 'And'
            {
            match("And"); 


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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:28:7: ( '.' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:28:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start RULE_BusinessValueIdentifier
    public void mRULE_BusinessValueIdentifier() throws RecognitionException {
        try {
            int _type = RULE_BusinessValueIdentifier;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:299:3: ( 'In order to ' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:299:3: 'In order to '
            {
            match("In order to "); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BusinessValueIdentifier

    // $ANTLR start RULE_RoleIdentifier
    public void mRULE_RoleIdentifier() throws RecognitionException {
        try {
            int _type = RULE_RoleIdentifier;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:362:3: ( 'As a ' | 'As an ' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='A') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='s') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==' ') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='a') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='n') ) {
                                alt1=2;
                            }
                            else if ( (LA1_4==' ') ) {
                                alt1=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("360:1: RULE_RoleIdentifier : ( 'As a ' | 'As an ' );", 1, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("360:1: RULE_RoleIdentifier : ( 'As a ' | 'As an ' );", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("360:1: RULE_RoleIdentifier : ( 'As a ' | 'As an ' );", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("360:1: RULE_RoleIdentifier : ( 'As a ' | 'As an ' );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("360:1: RULE_RoleIdentifier : ( 'As a ' | 'As an ' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:362:3: 'As a '
                    {
                    match("As a "); 


                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:362:11: 'As an '
                    {
                    match("As an "); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RoleIdentifier

    // $ANTLR start RULE_SomeActionIdentifier
    public void mRULE_SomeActionIdentifier() throws RecognitionException {
        try {
            int _type = RULE_SomeActionIdentifier;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:425:3: ( 'I want to ' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:425:3: 'I want to '
            {
            match("I want to "); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SomeActionIdentifier

    // $ANTLR start RULE_NotInorderto
    public void mRULE_NotInorderto() throws RecognitionException {
        try {
            int _type = RULE_NotInorderto;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:3: ( 'In ' (~ 'o' )? | 'In o' (~ 'r' )? | 'In or' (~ 'd' )? | 'In ord' (~ 'e' )? | 'In orde' (~ 'r' )? | 'In order ' (~ 't' )? | 'In order t' (~ 'o' )? )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='I') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='n') ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==' ') ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3=='o') ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4=='r') ) {
                                int LA9_6 = input.LA(6);

                                if ( (LA9_6=='d') ) {
                                    int LA9_8 = input.LA(7);

                                    if ( (LA9_8=='e') ) {
                                        int LA9_10 = input.LA(8);

                                        if ( (LA9_10=='r') ) {
                                            int LA9_12 = input.LA(9);

                                            if ( (LA9_12==' ') ) {
                                                int LA9_14 = input.LA(10);

                                                if ( (LA9_14=='t') ) {
                                                    alt9=7;
                                                }
                                                else {
                                                    alt9=6;}
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("999:1: RULE_NotInorderto : ( 'In ' (~ 'o' )? | 'In o' (~ 'r' )? | 'In or' (~ 'd' )? | 'In ord' (~ 'e' )? | 'In orde' (~ 'r' )? | 'In order ' (~ 't' )? | 'In order t' (~ 'o' )? );", 9, 12, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            alt9=5;}
                                    }
                                    else {
                                        alt9=4;}
                                }
                                else {
                                    alt9=3;}
                            }
                            else {
                                alt9=2;}
                        }
                        else {
                            alt9=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("999:1: RULE_NotInorderto : ( 'In ' (~ 'o' )? | 'In o' (~ 'r' )? | 'In or' (~ 'd' )? | 'In ord' (~ 'e' )? | 'In orde' (~ 'r' )? | 'In order ' (~ 't' )? | 'In order t' (~ 'o' )? );", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("999:1: RULE_NotInorderto : ( 'In ' (~ 'o' )? | 'In o' (~ 'r' )? | 'In or' (~ 'd' )? | 'In ord' (~ 'e' )? | 'In orde' (~ 'r' )? | 'In order ' (~ 't' )? | 'In order t' (~ 'o' )? );", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("999:1: RULE_NotInorderto : ( 'In ' (~ 'o' )? | 'In o' (~ 'r' )? | 'In or' (~ 'd' )? | 'In ord' (~ 'e' )? | 'In orde' (~ 'r' )? | 'In order ' (~ 't' )? | 'In order t' (~ 'o' )? );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:3: 'In ' (~ 'o' )?
                    {
                    match("In "); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:8: (~ 'o' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>='\u0000' && LA2_0<='n')||(LA2_0>='p' && LA2_0<='\uFFFE')) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:9: ~ 'o'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='n')||(input.LA(1)>='p' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:16: 'In o' (~ 'r' )?
                    {
                    match("In o"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:22: (~ 'r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='\u0000' && LA3_0<='q')||(LA3_0>='s' && LA3_0<='\uFFFE')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:23: ~ 'r'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='q')||(input.LA(1)>='s' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:30: 'In or' (~ 'd' )?
                    {
                    match("In or"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:37: (~ 'd' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='\u0000' && LA4_0<='c')||(LA4_0>='e' && LA4_0<='\uFFFE')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:38: ~ 'd'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='c')||(input.LA(1)>='e' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:45: 'In ord' (~ 'e' )?
                    {
                    match("In ord"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:53: (~ 'e' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='\u0000' && LA5_0<='d')||(LA5_0>='f' && LA5_0<='\uFFFE')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:54: ~ 'e'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='d')||(input.LA(1)>='f' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:61: 'In orde' (~ 'r' )?
                    {
                    match("In orde"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:70: (~ 'r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>='\u0000' && LA6_0<='q')||(LA6_0>='s' && LA6_0<='\uFFFE')) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:71: ~ 'r'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='q')||(input.LA(1)>='s' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:79: 'In order ' (~ 't' )?
                    {
                    match("In order "); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:90: (~ 't' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='\u0000' && LA7_0<='s')||(LA7_0>='u' && LA7_0<='\uFFFE')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:91: ~ 't'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='s')||(input.LA(1)>='u' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:98: 'In order t' (~ 'o' )?
                    {
                    match("In order t"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:110: (~ 'o' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>='\u0000' && LA8_0<='n')||(LA8_0>='p' && LA8_0<='\uFFFE')) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1001:111: ~ 'o'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='n')||(input.LA(1)>='p' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NotInorderto

    // $ANTLR start RULE_NotAsa
    public void mRULE_NotAsa() throws RecognitionException {
        try {
            int _type = RULE_NotAsa;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:3: ( 'As ' (~ 'a' )? | 'As a' (~ 'n' )? )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='A') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='s') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==' ') ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3=='a') ) {
                            alt12=2;
                        }
                        else {
                            alt12=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1004:1: RULE_NotAsa : ( 'As ' (~ 'a' )? | 'As a' (~ 'n' )? );", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1004:1: RULE_NotAsa : ( 'As ' (~ 'a' )? | 'As a' (~ 'n' )? );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1004:1: RULE_NotAsa : ( 'As ' (~ 'a' )? | 'As a' (~ 'n' )? );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:3: 'As ' (~ 'a' )?
                    {
                    match("As "); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:8: (~ 'a' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>='\u0000' && LA10_0<='`')||(LA10_0>='b' && LA10_0<='\uFFFE')) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:9: ~ 'a'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='`')||(input.LA(1)>='b' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:16: 'As a' (~ 'n' )?
                    {
                    match("As a"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:22: (~ 'n' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='\u0000' && LA11_0<='m')||(LA11_0>='o' && LA11_0<='\uFFFE')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1006:23: ~ 'n'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='m')||(input.LA(1)>='o' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NotAsa

    // $ANTLR start RULE_NotIwantto
    public void mRULE_NotIwantto() throws RecognitionException {
        try {
            int _type = RULE_NotIwantto;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:3: ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? )
            int alt19=6;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='I') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='n') ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==' ') ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4=='w') ) {
                            int LA19_7 = input.LA(5);

                            if ( (LA19_7=='a') ) {
                                int LA19_10 = input.LA(6);

                                if ( (LA19_10=='n') ) {
                                    int LA19_11 = input.LA(7);

                                    if ( (LA19_11=='t') ) {
                                        int LA19_12 = input.LA(8);

                                        if ( (LA19_12==' ') ) {
                                            int LA19_14 = input.LA(9);

                                            if ( (LA19_14=='t') ) {
                                                alt19=6;
                                            }
                                            else {
                                                alt19=5;}
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 12, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt19=4;}
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 10, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA19_1==' ') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='w') ) {
                        int LA19_5 = input.LA(4);

                        if ( (LA19_5=='a') ) {
                            alt19=3;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=1;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1009:1: RULE_NotIwantto : ( 'I ' (~ 'w' )? | 'I w' (~ 'a' )? | 'I wa' (~ 'n' )? | 'In wan' (~ 't' )? | 'In want ' (~ 't' )? | 'In want t' (~ 'o' )? );", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:3: 'I ' (~ 'w' )?
                    {
                    match("I "); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:7: (~ 'w' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>='\u0000' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='\uFFFE')) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:8: ~ 'w'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='v')||(input.LA(1)>='x' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:15: 'I w' (~ 'a' )?
                    {
                    match("I w"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:20: (~ 'a' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>='\u0000' && LA14_0<='`')||(LA14_0>='b' && LA14_0<='\uFFFE')) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:21: ~ 'a'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='`')||(input.LA(1)>='b' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:28: 'I wa' (~ 'n' )?
                    {
                    match("I wa"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:34: (~ 'n' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>='\u0000' && LA15_0<='m')||(LA15_0>='o' && LA15_0<='\uFFFE')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:35: ~ 'n'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='m')||(input.LA(1)>='o' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:42: 'In wan' (~ 't' )?
                    {
                    match("In wan"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:50: (~ 't' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>='\u0000' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='\uFFFE')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:51: ~ 't'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='s')||(input.LA(1)>='u' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:58: 'In want ' (~ 't' )?
                    {
                    match("In want "); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:68: (~ 't' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>='\u0000' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='\uFFFE')) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:69: ~ 't'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='s')||(input.LA(1)>='u' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:76: 'In want t' (~ 'o' )?
                    {
                    match("In want t"); 

                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:87: (~ 'o' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>='\u0000' && LA18_0<='n')||(LA18_0>='p' && LA18_0<='\uFFFE')) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1011:88: ~ 'o'
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='n')||(input.LA(1)>='p' && input.LA(1)<='\uFFFE') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NotIwantto

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1016:3: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1016:3: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1016:7: (~ ( '\\n' | '\\r' ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFE')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1016:7: ~ ( '\\n' | '\\r' )
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
            	    break loop20;
                }
            } while (true);

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1016:21: ( '\\r' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1016:21: '\\r'
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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1021:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1021:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1021:3: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1021:4: '^'
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1021:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
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
            	    break loop23;
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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1027:3: ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1025:1: RULE_STRING : ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1027:3: '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1027:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFE')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1027:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1027:54: ~ ( '\\\\' | '\\\"' )
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
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1028:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1028:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFE')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1028:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1028:54: ~ ( '\\\\' | '\\'' )
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
                    	    break loop25;
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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1034:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1034:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1034:3: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='-') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1034:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1034:9: ( '0' .. '9' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1034:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1040:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1040:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1040:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1046:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1046:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1046:8: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFE')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFE')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1046:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:10: ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_BusinessValueIdentifier | RULE_RoleIdentifier | RULE_SomeActionIdentifier | RULE_NotInorderto | RULE_NotAsa | RULE_NotIwantto | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT )
        int alt31=19;
        switch ( input.LA(1) ) {
        case 'F':
            {
            int LA31_1 = input.LA(2);

            if ( (LA31_1=='e') ) {
                int LA31_15 = input.LA(3);

                if ( (LA31_15=='a') ) {
                    int LA31_24 = input.LA(4);

                    if ( (LA31_24=='t') ) {
                        int LA31_34 = input.LA(5);

                        if ( (LA31_34=='u') ) {
                            int LA31_46 = input.LA(6);

                            if ( (LA31_46=='r') ) {
                                int LA31_55 = input.LA(7);

                                if ( (LA31_55=='e') ) {
                                    int LA31_59 = input.LA(8);

                                    if ( (LA31_59==':') ) {
                                        alt31=1;
                                    }
                                    else {
                                        alt31=15;}
                                }
                                else {
                                    alt31=15;}
                            }
                            else {
                                alt31=15;}
                        }
                        else {
                            alt31=15;}
                    }
                    else {
                        alt31=15;}
                }
                else {
                    alt31=15;}
            }
            else {
                alt31=15;}
            }
            break;
        case 'S':
            {
            int LA31_2 = input.LA(2);

            if ( (LA31_2=='c') ) {
                int LA31_16 = input.LA(3);

                if ( (LA31_16=='e') ) {
                    int LA31_25 = input.LA(4);

                    if ( (LA31_25=='n') ) {
                        int LA31_35 = input.LA(5);

                        if ( (LA31_35=='a') ) {
                            int LA31_47 = input.LA(6);

                            if ( (LA31_47=='r') ) {
                                int LA31_56 = input.LA(7);

                                if ( (LA31_56=='i') ) {
                                    int LA31_60 = input.LA(8);

                                    if ( (LA31_60=='o') ) {
                                        int LA31_63 = input.LA(9);

                                        if ( (LA31_63==':') ) {
                                            alt31=2;
                                        }
                                        else {
                                            alt31=15;}
                                    }
                                    else {
                                        alt31=15;}
                                }
                                else {
                                    alt31=15;}
                            }
                            else {
                                alt31=15;}
                        }
                        else {
                            alt31=15;}
                    }
                    else {
                        alt31=15;}
                }
                else {
                    alt31=15;}
            }
            else {
                alt31=15;}
            }
            break;
        case 'G':
            {
            int LA31_3 = input.LA(2);

            if ( (LA31_3=='i') ) {
                int LA31_17 = input.LA(3);

                if ( (LA31_17=='v') ) {
                    int LA31_26 = input.LA(4);

                    if ( (LA31_26=='e') ) {
                        int LA31_36 = input.LA(5);

                        if ( (LA31_36=='n') ) {
                            int LA31_48 = input.LA(6);

                            if ( ((LA31_48>='0' && LA31_48<='9')||(LA31_48>='A' && LA31_48<='Z')||LA31_48=='_'||(LA31_48>='a' && LA31_48<='z')) ) {
                                alt31=15;
                            }
                            else {
                                alt31=3;}
                        }
                        else {
                            alt31=15;}
                    }
                    else {
                        alt31=15;}
                }
                else {
                    alt31=15;}
            }
            else {
                alt31=15;}
            }
            break;
        case 'W':
            {
            int LA31_4 = input.LA(2);

            if ( (LA31_4=='h') ) {
                int LA31_18 = input.LA(3);

                if ( (LA31_18=='e') ) {
                    int LA31_27 = input.LA(4);

                    if ( (LA31_27=='n') ) {
                        int LA31_37 = input.LA(5);

                        if ( ((LA31_37>='0' && LA31_37<='9')||(LA31_37>='A' && LA31_37<='Z')||LA31_37=='_'||(LA31_37>='a' && LA31_37<='z')) ) {
                            alt31=15;
                        }
                        else {
                            alt31=4;}
                    }
                    else {
                        alt31=15;}
                }
                else {
                    alt31=15;}
            }
            else {
                alt31=15;}
            }
            break;
        case 'T':
            {
            int LA31_5 = input.LA(2);

            if ( (LA31_5=='h') ) {
                int LA31_19 = input.LA(3);

                if ( (LA31_19=='e') ) {
                    int LA31_28 = input.LA(4);

                    if ( (LA31_28=='n') ) {
                        int LA31_38 = input.LA(5);

                        if ( ((LA31_38>='0' && LA31_38<='9')||(LA31_38>='A' && LA31_38<='Z')||LA31_38=='_'||(LA31_38>='a' && LA31_38<='z')) ) {
                            alt31=15;
                        }
                        else {
                            alt31=5;}
                    }
                    else {
                        alt31=15;}
                }
                else {
                    alt31=15;}
            }
            else {
                alt31=15;}
            }
            break;
        case 'A':
            {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA31_20 = input.LA(3);

                if ( (LA31_20==' ') ) {
                    int LA31_29 = input.LA(4);

                    if ( (LA31_29=='a') ) {
                        switch ( input.LA(5) ) {
                        case 'n':
                            {
                            alt31=9;
                            }
                            break;
                        case ' ':
                            {
                            alt31=9;
                            }
                            break;
                        default:
                            alt31=12;}

                    }
                    else {
                        alt31=12;}
                }
                else {
                    alt31=15;}
                }
                break;
            case 'n':
                {
                int LA31_21 = input.LA(3);

                if ( (LA31_21=='d') ) {
                    int LA31_30 = input.LA(4);

                    if ( ((LA31_30>='0' && LA31_30<='9')||(LA31_30>='A' && LA31_30<='Z')||LA31_30=='_'||(LA31_30>='a' && LA31_30<='z')) ) {
                        alt31=15;
                    }
                    else {
                        alt31=6;}
                }
                else {
                    alt31=15;}
                }
                break;
            default:
                alt31=15;}

            }
            break;
        case '.':
            {
            alt31=7;
            }
            break;
        case 'I':
            {
            switch ( input.LA(2) ) {
            case ' ':
                {
                int LA31_22 = input.LA(3);

                if ( (LA31_22=='w') ) {
                    int LA31_31 = input.LA(4);

                    if ( (LA31_31=='a') ) {
                        int LA31_42 = input.LA(5);

                        if ( (LA31_42=='n') ) {
                            alt31=10;
                        }
                        else {
                            alt31=13;}
                    }
                    else {
                        alt31=13;}
                }
                else {
                    alt31=13;}
                }
                break;
            case 'n':
                {
                int LA31_23 = input.LA(3);

                if ( (LA31_23==' ') ) {
                    switch ( input.LA(4) ) {
                    case 'w':
                        {
                        int LA31_43 = input.LA(5);

                        if ( (LA31_43=='a') ) {
                            alt31=13;
                        }
                        else {
                            alt31=11;}
                        }
                        break;
                    case 'o':
                        {
                        int LA31_44 = input.LA(5);

                        if ( (LA31_44=='r') ) {
                            int LA31_54 = input.LA(6);

                            if ( (LA31_54=='d') ) {
                                int LA31_58 = input.LA(7);

                                if ( (LA31_58=='e') ) {
                                    int LA31_61 = input.LA(8);

                                    if ( (LA31_61=='r') ) {
                                        int LA31_64 = input.LA(9);

                                        if ( (LA31_64==' ') ) {
                                            int LA31_66 = input.LA(10);

                                            if ( (LA31_66=='t') ) {
                                                int LA31_67 = input.LA(11);

                                                if ( (LA31_67=='o') ) {
                                                    alt31=8;
                                                }
                                                else {
                                                    alt31=11;}
                                            }
                                            else {
                                                alt31=11;}
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1:1: Tokens : ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_BusinessValueIdentifier | RULE_RoleIdentifier | RULE_SomeActionIdentifier | RULE_NotInorderto | RULE_NotAsa | RULE_NotIwantto | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT );", 31, 64, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        alt31=11;}
                                }
                                else {
                                    alt31=11;}
                            }
                            else {
                                alt31=11;}
                        }
                        else {
                            alt31=11;}
                        }
                        break;
                    default:
                        alt31=11;}

                }
                else {
                    alt31=15;}
                }
                break;
            default:
                alt31=15;}

            }
            break;
        case '#':
            {
            alt31=14;
            }
            break;
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'H':
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
            alt31=15;
            }
            break;
        case '\"':
        case '\'':
            {
            alt31=16;
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
            alt31=17;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt31=18;
            }
            break;
        case '/':
            {
            alt31=19;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | RULE_BusinessValueIdentifier | RULE_RoleIdentifier | RULE_SomeActionIdentifier | RULE_NotInorderto | RULE_NotAsa | RULE_NotIwantto | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT );", 31, 0, input);

            throw nvae;
        }

        switch (alt31) {
            case 1 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:10: T16
                {
                mT16(); 

                }
                break;
            case 2 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:14: T17
                {
                mT17(); 

                }
                break;
            case 3 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:18: T18
                {
                mT18(); 

                }
                break;
            case 4 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:22: T19
                {
                mT19(); 

                }
                break;
            case 5 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:26: T20
                {
                mT20(); 

                }
                break;
            case 6 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:30: T21
                {
                mT21(); 

                }
                break;
            case 7 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:34: T22
                {
                mT22(); 

                }
                break;
            case 8 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:38: RULE_BusinessValueIdentifier
                {
                mRULE_BusinessValueIdentifier(); 

                }
                break;
            case 9 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:67: RULE_RoleIdentifier
                {
                mRULE_RoleIdentifier(); 

                }
                break;
            case 10 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:87: RULE_SomeActionIdentifier
                {
                mRULE_SomeActionIdentifier(); 

                }
                break;
            case 11 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:113: RULE_NotInorderto
                {
                mRULE_NotInorderto(); 

                }
                break;
            case 12 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:131: RULE_NotAsa
                {
                mRULE_NotAsa(); 

                }
                break;
            case 13 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:143: RULE_NotIwantto
                {
                mRULE_NotIwantto(); 

                }
                break;
            case 14 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:175: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:183: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:195: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:204: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1:212: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;

        }

    }


 

}
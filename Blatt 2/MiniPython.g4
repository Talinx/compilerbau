grammar MiniPython;


startbuildingblock: statement | funcDef | classDef | ifElifElse | whileCall ;
start: startbuildingblock* ;
startfile: startbuildingblock* EOF ;

END: '#end' '\r'? '\n';
COMMENT: '#' .*? '\r'?'\n' -> skip;
WS: [ \t\r\n] -> skip ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
INTLITERAL: '-' [0-9]+ | [0-9]+ ;
fragment Stringcontent: .*? ;
STRINGLITERAL: '\'' Stringcontent '\'' | '"' Stringcontent '"' ;
BOOLEANLITERAL: 'True' | 'False' ;
literal: INTLITERAL | STRINGLITERAL | BOOLEANLITERAL ;

ellipsis: '...' ;

statement: 'pass' |
          ellipsis |
          classDef |
	  deffunc |
	  variableAssignment |
	  ifElifElse |
	  whileCall |
	  expr;

body: statement+ ;

classDef: 'class' ID ('(' ID ')')? ':' variableAssignment* deffunc* END ;
classid: ID '.' ID ;

variableAssignment: ID '=' expr | classid '=' expr ;

parameterdecl: ID? | ID (',' ID)* ;
deffunccontent: 'return' expr | body ('return' expr)? ;
deffunc: 'def' ID '(' parameterdecl ')' ':' deffunccontent END ;
funcDef: deffunc;

parametercall: expr? | expr (',' expr)* ;
funccall: ID '(' parametercall ')' ;

classfunccall: ID '.' ID '(' parametercall ')' ;

ifElifElse: 'if' expr ':' body elif* elses? END ;
elif: 'elif' expr ':' body ;
elses: 'else:' body ;

whileCall: 'while' expr ':' body END ;

MATHMULDIV: DIVISION | MULTIPLICATION ;
MATHADDSUB: ADDITION | SUBTRACTION ;
DIVISION:           '/' ;
MULTIPLICATION:     '*' ;
ADDITION:           '+' ;
SUBTRACTION:        '-' ;

ASSERTOPERATOR: ASSERTEQUAL | ASSERTLESS | ASSERTMORE | ASSERTLESSEQUAL | ASSERTMOREEQUAL | ASSERTNOTEQUAL;
ASSERTEQUAL:        '==';
ASSERTNOTEQUAL:     '!=';
ASSERTLESS:         '<' ;
ASSERTMORE:         '>' ;
ASSERTLESSEQUAL:    '<=';
ASSERTMOREEQUAL:    '>=';

baseexpr: literal | ID | funccall | classfunccall | classid | '(' expr ')' ;
opadd: baseexpr (MATHADDSUB baseexpr)* ;
opmul: opadd (MATHMULDIV opadd)* | '(' expr ')' ;
opcompare: opmul (ASSERTOPERATOR opmul)* | '(' expr ')' ;
opand: opcompare ('and' opcompare)* | '(' expr ')' ;
opdisjunction: opand ('or' opand)* | '(' expr ')' ;
opnot: opdisjunction | 'not' opnot ;

expr: funccall |
      '(' expr ')' |
      opnot ;
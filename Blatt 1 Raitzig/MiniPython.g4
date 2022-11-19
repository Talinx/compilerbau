grammar MiniPython;


eval: statement* ;
evalfile: statement* EOF ;

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
          classs |
	  deffunc |
	  vars |
	  ifs |
	  whiles |
	  expr;

classs: 'class' ID ('(' ID ')')? ':' vars* deffunc* '#end' ;
classid: ID '.' ID ;

vars: ID '=' expr | classid '=' expr ;

parameterdecl: ID? | ID (',' ID)* ;
deffunccontent: 'return' expr | statement+ ('return' expr)? ;
deffunc: 'def' ID '(' parameterdecl ')' ':' deffunccontent '#end' ;

parametercall: expr? | expr (',' expr)* ;
funccall: ID '(' parametercall ')' ;

classfunccall: ID '.' ID '(' parametercall ')' ;

ifs: 'if' expr ':' statement+ elif* elses? '#end' ;
elif: 'elif' expr ':' statement+ ;
elses: 'else:' statement+ ;

whiles: 'while' expr ':' statement+ '#end' ;

baseexpr: literal | ID | funccall | classfunccall | classid | '(' expr ')' ;
opadd: baseexpr (('+' | '-') baseexpr)* ;
opmul: opadd (('*' | '/') opadd)* | '(' expr ')' ;
compareoperator: '==' | '!=' | '>=' | '>' | '<=' | '<' | '(' expr ')' ;
opcompare: opmul (compareoperator opmul)* | '(' expr ')' ;
opand: opcompare ('and' opcompare)* | '(' expr ')' ;
opdisjunction: opand ('or' opand)* | '(' expr ')' ;
opnot: opdisjunction | 'not' opnot ;

expr: funccall |
      '(' expr ')' |
      opnot ;


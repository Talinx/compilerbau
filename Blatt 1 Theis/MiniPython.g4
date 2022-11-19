grammar MiniPython;

start: statement | funcDef | classDef | ifElifElse | whileCall;

end: END;

funcDef: 'def' ID '(' (ID (',' ID)*)? ')' ':' NEWLINE funcDefBody end;
funcDefBody: (statement NEWLINE)*;
funcCall: ID '(' parameter (',' parameter)* ')';
parameter: ID | value | funcCall;
variableAssignment: ID '=' expression;
returnCall: 'return' (ID | expression);

ID: [a-zA-Z_][a-zA-Z0-9_]*;

//Controlstructures
whileCall: 'while' '(' assertOperation ')' ':' NEWLINE whileBody end; //Defined as brackets are obligatory
whileBody: (statement NEWLINE)*;

ifCall: 'if' assertOperation ':' NEWLINE ifBody; //Defined as brackets are not allowed
ifBody: (statement NEWLINE)*;
elifCall: 'elif' assertOperation ':' NEWLINE elifBody;
elifBody: (statement NEWLINE)*;
elseCall: 'else' ':' NEWLINE elseBody;
elseBody: (statement NEWLINE)*;
ifElifElse: ifCall (elifCall)* (elseCall)? end;

value: bool | integer | STRING;
statement: variableAssignment | funcCall | returnCall;
expression: funcCall | value | assertOperation | mathOperation;

//Operations
assertion: (ID | value | funcCall | mathOperation) assertOperator (ID | value | funcCall | mathOperation);
assertOperation: LOGICNOT? assertion (logicOperator assertion)+;
mathOperation: (ID | value | funcCall) mathOperator ((ID | value | funcCall) | mathOperation);

//Classes
classDef: 'class' ID ('(' ID ')')? ':' NEWLINE classDefBody end;
classDefBody: funcDef+;
methodCall: ID '.' ID '(' parameter ')' NEWLINE;

//Data types
bool: BOOLTRUE | BOOLFALSE;
integer: DIGIT+;
STRING: ('"' .*?  '"') | ('\'' .*? '\'');

//Basics
DIGIT: [0-9];
BOOLTRUE: 'True';
BOOLFALSE: 'False';
NEWLINE: '\r'? '\n';
END: '#end' '\r'? '\n';
COMMENT: '#' .*? '\r'?'\n' -> skip;
WHITESPACE: [ \t] -> skip;

//Operators
mathOperator: DIVISION | MULTIPLICATION | ADDITION | SUBTRACTION;
DIVISION:           '/' ;
MULTIPLICATION:     '*' ;
ADDITION:           '+' ;
SUBTRACTION:        '-' ;

assertOperator: ASSERTEQUAL | ASSERTLESS | ASSERTMORE | ASSERTLESSEQUAL | ASSERTMOREEQUAL | ASSERTNOTEQUAL;
ASSERTEQUAL:        '==';
ASSERTNOTEQUAL:     '!=';
ASSERTLESS:         '<' ;
ASSERTMORE:         '>' ;
ASSERTLESSEQUAL:    '<=';
ASSERTMOREEQUAL:    '>=';

logicOperator: LOGICOR | LOGICAND;
LOGICOR: 'or'  ;
LOGICAND: 'and';
LOGICNOT: 'not';



//TODO: unäres Minus
//      Vorrangregeln
//      fragments
//      Testen ohne NEWLINE
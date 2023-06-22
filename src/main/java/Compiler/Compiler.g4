grammar Compiler;

@header {
 package Compiler;
}

// Analizador Lexico
fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];
NUMERO : DIGITO+ ;

LA : '{' ;
LC : '}' ;
CA : '['  ;
CC : ']'  ;
PA : '(' ;
PC : ')' ;
DC : ';' ;

// Operadores
EQU : '=' ;
COM : ',' ;
SUM : '+' ;
RES : '-' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
MIN : '<';
MAX : '>';
MIQ : '<=';
MAQ : '>=';
DEQ : '==';
DIS : '!=';
INC : '++' ;
DEC : '--' ;

// Tipos de datos
typeSpecifier
    :   'void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'signed'
    |   'unsigned'
    ;

// Estructuras de control
IF : 'if' ;
ELSE : 'else' ;
FOR : 'for' ;
WHILE : 'while' ;

ID : (LETRA | '_') (LETRA | DIGITO | '_')* ;
WS : [ \t\n\r] -> skip ;

// ANALIZADOR SINTACTICO
programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion
            | declaracion
            | incremento
            | funcion
            | iif
            | ifor
            | iwhile
            | bloque
            ;

bloque : LA instrucciones LC ;

declaracion : typeSpecifier listaId DC ;

asignacion : ID inicializacion DC ;

incremento : ID (INC | DEC) DC? ;

inicializacion : EQU expresion ;

listaId : ID inicializacion? (COM ID inicializacion?)* ;

funcion : typeSpecifier ID PA (declaracion)? PC bloque ;

iif : IF PA comparacion PC instruccion (ELSE instruccion)? ;

iwhile : WHILE PA comparacion PC bloque ;

ifor : FOR PA declaracion comparacion DC incremento PC bloque ;

comp : MIN | MAX | MIQ | MAQ | DEQ | DIS ;

comparacion : expresion comp expresion ;

expresion : aditivo 
          | ID
          | NUMERO
          ;

aditivo : multipl ((SUM | RES) multipl)* ;

multipl : minExpr ((MUL | DIV | MOD) minExpr)* ;

minExpr : NUMERO
        | ID
        | PA expresion PC
        ;
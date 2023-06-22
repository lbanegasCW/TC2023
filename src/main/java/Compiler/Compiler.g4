/*
    Gramatica para compilador en C - Banegas Luis  UBP - 2023
*/

grammar Compiler;

@header {
 package Compiler;
}

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
TYPE : 'void'
     | 'char'
     | 'short'
     | 'int'
     | 'long'
     | 'float'
     | 'double'
     | 'signed'
     | 'unsigned'
     ;

// Estructuras de control
IF : 'if' ;
ELSE : 'else' ;
FOR : 'for' ;
WHILE : 'while' ;

ID : (LETRA | '_') (LETRA | DIGITO | '_')* ;
WS : [ \t\n\r] -> skip ;


// Regla principal que representa un programa completo
programa : instrucciones EOF ;

// Regla para una lista de instrucciones
instrucciones : instruccion instrucciones
              |
              ;

// Regla para una asignación
instruccion : asignacion
            | declaracion
            | incremento
            | funcion
            | iif
            | ifor
            | iwhile
            | bloque
            ;

// Regla para un bloque de instrucciones { ... }
bloque : LA instrucciones LC ;

// Regla para una declaración de variables. int x;
declaracion : TYPE listaId DC ; 

// Regla para una asignación de valor a una variable. x = 2;
asignacion : ID inicializacion DC ;

// Regla para un incremento o decremento de una variable. i--
incremento : ID (INC | DEC) DC? ;

// Regla para la inicialización de una variable = any
inicializacion : EQU expresion ;

// Regla para una lista de identificadores. i = 2, ...
listaId : ID inicializacion? (COM ID inicializacion?)* ;

// Regla para una definición función(int x, ...) { ... }
funcion : TYPE ID PA (declaracion)? PC bloque ;

// Regla para una instrucción tipo if (i<3) { ... } ... 
iif : IF PA comparacion PC instruccion (ELSE instruccion)? ;

// Regla para una instrucción tipo while (i<3) { ... }
iwhile : WHILE PA comparacion PC bloque ;

// Regla para una instrucción tipo for (int x; i<3; i++) { ... }
ifor : FOR PA declaracion comparacion DC incremento PC bloque ;

// Regla para operadores de comparación
comp : MIN | MAX | MIQ | MAQ | DEQ | DIS ;

// Regla para una comparación entre expresiones
comparacion : expresion comp expresion ;

// Regla para una expresión aritmética
expresion : aditivo
          | ID
          | NUMERO
          ;

// Regla para una expresión aritmética con operadores de suma y resta
aditivo : multipl ((SUM | RES) multipl)* ;

// Regla para una expresión aritmética con operadores de multiplicación, división y módulo
multipl : minExpr ((MUL | DIV | MOD) minExpr)* ;

// Regla para una expresión. i, 5, (8)
minExpr : NUMERO
        | ID
        | PA expresion PC
        ;

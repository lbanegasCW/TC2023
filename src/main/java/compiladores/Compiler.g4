grammar compiladores;

@header { 
    package compiladores;
}

// Analizador Lexico
fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];
NUMERO : DIGITO+ ;

CI : '['  ;
CD : ']'  ;
PYC : ';' ;
PA  : '(' ;
PC  : ')' ;
LLA : '{' ;
LLC : '}' ;
ASIGN : '=' ;
COMA  : ',' ;
SUMA  : '+' ;
RESTA : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;
COMP :  '==' | '>' | '<' | '>=' | '<=' | '||' | '&&' | '!=' ;
MENOR : '<';
MAYOR : '>';
MENIG : '<=';
MAYIG : '>=';
IGUAL : '==';
DISTN : '!=';
INC : '++' ;
DEC : '--' ;

// Tipos de datos
TYPE : 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | 'string' ;

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
            | bloque
            | iwhile
            | iif
            | ifor
            | funcion
            | 'main' PYC
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN expresion PYC ;

incremento : ID (INC | DEC) ;

declaracion : TYPE ID inicializacion listaid? PYC ;

inicializacion : ASIGN expresion
               |
               ;

listaid : COMA ID inicializacion listaid
        |
        ;

funcion : TYPE ID PA (parametrosfunc)? PC instruccion ;

parametrosfunc : dec (COMA dec)* ;

decFunc : TYPE ID ;

dec : TYPE ID (COMP expresion)? PYC ;

iwhile : WHILE PA comparacion PC instruccion ;

iif : IF PA comparacion PC instruccion ELSE instruccion ;

ifor : FOR PA declaracion comparacion PYC incremento PC instruccion ; 

expresion_bool : expresion comp expresion ;

comparacion : expresion COMP expresion 
            | expresion ASIGN expresion
            |
            ; 

expresion : termino exp ;

termino : factor term ;

exp : SUMA termino exp
    | RESTA termino exp
    |
    ;

comp : MENOR 
     | MAYOR 
     | MENIG 
     | MAYIG 
     | IGUAL 
     | DISTN 
     ;
 
term : MULT factor term
     | DIV factor term
     | MOD factor term
     |
     ;
      
factor : NUMERO
       | ID
       | PA expresion PC 
       ;
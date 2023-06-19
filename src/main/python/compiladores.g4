grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PALABRA : (LETRA | '_')(LETRA | DIGITO | '_')+ ;
NUMERO : DIGITO+ ;
WS : [ \t\n\r] ;
OTRO : . ;

s : PALABRA { System.out.println("PALABRA ->" + $PALABRA.getText() + "<--"); }   s
  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | EOF
  ;

package Ejercicio_01_sign;

public class SignValidator {
    char pAbierto= '(';
    char pCerrado= ')';
    char cAbierto= '[';
    char cCerrado= ']';
    char lAbierta= '{';
    char lCerrada= '}';


public boolean isValid (String s){

    System.out.println("Su texto ingresado es: ");

    char[] texto= new char[s.length()];

    int tamanio= 0;

    for(int i=0; i<s.length(); i++){

     char caracterActual= s.charAt(i);

     //VALIDACION PARA VER SI SE ESTA EMPEZANDO CON CARACTERES ABIERTOS

     if(caracterActual == pAbierto || caracterActual == cAbierto || caracterActual == lAbierta){
        texto[tamanio++]= caracterActual;

    //SI EL PRIMER ELEMENTO ES CERRADO RETORNAR FALSO

     } else if (caracterActual == pCerrado || caracterActual == cCerrado || caracterActual == lCerrada){
             
      if (tamanio==0){
        return false;
     }

     //ULTIMO CARACTER VA EN ORDEN INVERSO

     char ultimocaracter=  texto[--tamanio];

     //VALIDACION CON RESPECTO AL CARACTER ACTUAL Y AL ULTIMO CARACTER

     if ((caracterActual == pCerrado && ultimocaracter != pAbierto) ||
     (caracterActual == cCerrado && ultimocaracter != cAbierto) ||
     (caracterActual == lCerrada && ultimocaracter != lAbierta)) {

     return false;
     
     } } else {
        return false;
     }
}
// Despues de verificar que todo este bien retorna true
 return true;
    }

   
}













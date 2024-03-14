package miPrincipal;

public class Delimitadores {

    public boolean evaluacion(String cadena){
        Pila <String> pcaracteres = new Pila <String>();
        int  i=0;
        boolean masElementosPorLeer=true;
        while (i<cadena.length() && masElementosPorLeer) {
            char car= cadena.charAt(i);
            String s= charToString(car);
            i++;
            switch (car) {
                //en caso de apilar se da cuando el caracter sea un operador de apertura ([{/* 
                case '(':
                    pcaracteres.apilar(charToString(')'));
                    break;
                case '[':
                    pcaracteres.apilar(charToString(']'));
                    break;
                case '{':
                    pcaracteres.apilar(charToString('}'));
                    break;
                case '/':{
                    //verificar si el sig carac es *
                    if (siguienteEsAsterisco(cadena, i)) {
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                }
                    break;
                
                    //para desapilar cuando el caracter leido sea )]}*/
                case ')':
                case ']': 
                case '}':
                {
                    //compara q correspondan
                    String aux=pcaracteres.cima();
                    if (aux!=null) {
                        if (s.compareTo(aux)==0) {
                            //hay correspondencia, lo elimino
                            pcaracteres.retirar();
                        }
                        else{//ya no tiene caso seguir leyendo carac, evaluacion incorrecta
                            masElementosPorLeer=false;
                        }
                    }
                }
                case '*':
                //verificar si el sig carac es /
                    if (siguienteEsDiagonal(cadena, i)) {
                       pcaracteres.retirar();
                       i++;
                    }
                default:
                    break;
            }
        }//fin while
        if (pcaracteres.esVacia() && masElementosPorLeer) {
            return true;
        }
        else
            return false;
    }

    private static String charToString(char ch){
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsterisco(String cadena, int posicion){
        char car=cadena.charAt(posicion);
        if (car=='*')
            return true;
        else
            return false; 
    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion){
        char car=cadena.charAt(posicion);
        if (car=='/')
            return true;
        else
            return false; 
    }
}

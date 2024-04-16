package miPrincipal;

public class PosicionIlegalException extends Exception{
    public PosicionIlegalException(){
        super("Posicion Ilegal en la lista");
    }
    
}
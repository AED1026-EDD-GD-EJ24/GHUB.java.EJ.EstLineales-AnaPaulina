package miPrincipal;
import java.util.Collection;
public class TestVector {
    public static void main(String[] args){
        //invocar al metodo obtener lista de la clas unombre
        Collection<String>  lista = UNombre.ObtenerLista();
        //iterar la coleccion de nombres y mostrarlos en consola
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}
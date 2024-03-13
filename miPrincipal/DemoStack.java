package miPrincipal;
import java.util.Stack;

public class DemoStack {

    public static void menu() {
        System.out.println("************************");
        System.out.println("         STACK          ");
        System.out.println("************************");
        System.out.println();
        //crear mi pila con elementos tipo entero
        Stack<Integer> pila= new Stack<Integer>();
        //Apilr elementos
        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(10);
        //consultar la posicion el elemento
        System.out.println("Posicion del elemento buscado 2: "+pila.search(2));
        System.out.println("Posicion del elemento buscado 10: "+pila.search(10));
        //consultar el elemento de la cima
        System.out.println("El elemento del tope: "+pila.peek());
        //desapilamos
        pila.pop();
        System.out.println("El elemento del tope: "+pila.peek());
        pila.pop();
        System.out.println("El elemento del tope: "+pila.peek());
    }
}
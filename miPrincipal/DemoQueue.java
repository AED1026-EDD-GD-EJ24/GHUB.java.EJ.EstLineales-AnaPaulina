package miPrincipal;
/*
 * La API de java tra implementada la cola mediante la interface 
 * java.util.Queue, como es una interface se requiere instanciar 
 * como un objeto en concreto, esta interface de puede implementar
 * con la API Collections de java:
 *    java.util.LinkedList
 *    java.util.PriorityQueue
 * LinkedList es una aplicación de cola estándar
 * PriorityQueue es una cola de prioridades que almacena
 *    sus elementos internos de acuerdo a un orden.
 * Las operaciones básica de Queue son:
 * add(). inserta un elemento en la cola
 * remove(). devuelve y remueve el primer elemento de la cola
 * peek(). devuelve el primer elmentos de la cola  y devuelve
 *        null cuando la cola esta vacía
 */

import java.util.Queue;
import java.util.LinkedList;
public class DemoQueue{
    public static void menu(){
        System.out.println("************************");
        System.out.println("          QUEUE         ");
        System.out.println("************************");
        System.out.println();
        //creamos una cola generica
        Queue<String> micola = new LinkedList<String>();
        //Agregarmos tres elementos a la cola
        micola.add("elemento 0");
        micola.add("elemento 1");
        micola.add("elemento 2");
        //Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es "+
                   micola.peek());
                   
        //Elimina el primer elemento de la cola
        micola.remove();
        //Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es "+
                   micola.peek());

        micola.remove();
        //Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es "+
                    micola.peek());
    
        micola.remove();
        //Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es "+
                    micola.peek());    





    }

}
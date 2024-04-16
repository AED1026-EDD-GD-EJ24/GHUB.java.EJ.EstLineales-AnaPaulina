package miPrincipal;
import java .util.List;
import java.util.*;
public class DemoArrayListyLinkedList {
    public static void menu(){
        System.out.println("************************");
        System.out.println("  ARRAY LIST  ");
        System.out.println(" LINKED LIST  ");
        System.out.println("************************");
        System.out.println();
        //declarar e instanciar

        try{
            List <Integer> lista = new LinkedList<Integer>();

        List <Integer> lista2 =new ArrayList<Integer>();

        lista.add(12);
        lista.add(15);
        lista.add(20);
        System.out.println("Dato en la posición 0: "+lista.get(0));
        System.out.println("Dato en la posición 1: "+lista.get(1));
        System.out.println("Dato en la posición 2: "+lista.get(2));

        lista.add(1, 13);
        lista.add(3, 16);

        System.out.println("Datos despues de la insercion");
        System.out.println("Dato en la posición 0: "+lista.get(0));
        System.out.println("Dato en la posición 1: "+lista.get(1));
        System.out.println("Dato en la posición 2: "+lista.get(2));
        System.out.println("Dato en la posición 3: "+lista.get(3));
        System.out.println("Dato en la posición 4: "+lista.get(4));
       // lista.add(6,1);//opcion invalida

       lista.remove(0);
       lista.remove(3);
       System.out.println("Datos despues de la eliminacion");
        System.out.println("Dato en la posición 0: "+lista.get(0));
        System.out.println("Dato en la posición 1: "+lista.get(1));
        System.out.println("Dato en la posición 2: "+lista.get(2));

        //itera lista para imprimir cada uno
        for (Integer aux : lista) {
            System.err.println("Elemento: "+aux);
        }



        //utilizar 
        lista2.add(null);
        lista2.add(null);
        lista2.add(15);
        lista2.add(24);

        System.out.println("Datos despues de la insercion");
        System.out.println("Dato en la posición 0: "+lista2.get(0));
        System.out.println("Dato en la posición 1: "+lista2.get(1));
        System.out.println("Dato en la posición 2: "+lista2.get(2));
        System.out.println("Dato en la posición 3: "+lista2.get(3));
        System.out.println("Dato en la posición 4: "+lista2.get(4));
          
        //recorre la coleccion 
          for (Integer aux : lista2) {
            System.out.println("Elemento: "+aux); 
        }


        lista.remove(0);
        lista.remove(3);
        //recorre la coleccion 
        for (Integer aux : lista2) {
            System.out.println("Elemento: "+aux);
        }
        System.out.println("La posicion que ocupa el elemento 15: "+lista2.indexOf(15));
        lista2.set(0, 100);
        System.out.println("Dato de la posicion 0: "+lista2.get(0));

        System.out.println("Tamaño de LinkedList: "+lista.size());
        System.out.println("Tamaño de ArrayList: "+lista.size());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}

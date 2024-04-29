package miPrincipal;

public class DemoListaSimple {
    public static void menu() throws PosicionIlegalException {
        System.out.println("************************");
        System.out.println("   LISTA SIMPLE   ");
        System.out.println("************************");
        System.err.println();
        Lista<Integer> lista = new Lista<Integer>();
        lista.agregar(12); //0
        lista.agregar(15); //1
        lista.agregar(20); //2
        //Imprimir los elementos agregados
        System.out.println("Dato posicion 0: "+lista.getValor(0));
        System.out.println("Dato posicion 1: "+lista.getValor(1));
        System.out.println("Dato posicion 2: "+lista.getValor(2));
        //insertar el elemento 13 en la posicion 1
        lista.insertar(13,1);
        //insertar el elemento 16 en la posicion 3
        lista.insertar(16,3);
        System.out.println("Listar elementos agregados");
        System.out.println("Dato posicion 0: "+lista.getValor(0));
        System.out.println("Dato posicion 1: "+lista.getValor(1));
        System.out.println("Dato posicion 2: "+lista.getValor(2));
        System.out.println("Dato posicion 3: "+lista.getValor(3));
        System.out.println("Dato posicion 4: "+lista.getValor(4));
        //lista.insertar(17,6); //es un error porque no existe la poscion 5
        //Eliminar el primer elemento de la lista
        lista.remover(0);
        //Eliminar el dato de la posicion 3
        lista.remover(3);
        System.out.println("Listo los elementos después de la eliminación");
        System.out.println("Dato posicion 0: "+lista.getValor(0));
        System.out.println("Dato posicion 1: "+lista.getValor(1));
        System.out.println("Dato posicion 2: "+lista.getValor(2));



    }
    
}
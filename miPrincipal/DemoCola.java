package miPrincipal;
public class DemoCola {

    public static void menu(){
        System.out.println("************************");
        System.out.println("          COLA          ");
        System.out.println("************************");
        System.out.println();
        Cola<Integer> cola = new Cola<Integer>();
        //se encolan algunos elementos
        cola.encolar(12);
        cola.encolar(13);
        cola.encolar(14);
        cola.encolar(15);
        //Se imprime el primer elemento de la cola
        System.out.println("El primer elemento de la cola es:"+
                           cola.frente());
        cola.desencolar();
        System.out.println("El primer elemento de la cola es:"+
        cola.frente().toString());
        
        cola.desencolar();
        System.out.println("El primer elemento de la cola es:"+
        cola.frente().toString());

        cola.desencolar();
        System.out.println("El primer elemento de la cola es:"+
        cola.frente().toString());

        cola.desencolar();
        System.out.println("El primer elemento de la cola es:"+
        cola.frente());



    }
}
package miPrincipal;
public class Concatenar2Listas {
    public static void menu() throws PosicionIlegalException{
        System.out.println("***************************");
        System.out.println("   CONCATENAR DOS LISTAS   ");
        System.out.println("***************************");

        Lista<Integer> lst1 = new Lista<Integer>();
        lst1.agregar(1);
        lst1.agregar(2);
        lst1.agregar(3);
        
        Lista<Integer> lst2 = new Lista<Integer>();
        lst2.agregar(4);
        lst2.agregar(5);
        lst2.agregar(6);
        System.out.println("LISTA 1:");
        for (int i=0;i<lst1.getTamaño();i++){
            System.out.println("Elemento "+i+":"+lst1.getValor(i));

        }

        System.out.println("LISTA 2:");
        for (int i=0;i<lst2.getTamaño();i++){
            System.out.println("Elemento "+i+":"+lst2.getValor(i));

        }

        lst1.concatLista(lst1,lst2);
        System.out.println("LISTAS CONCATENADAS:");
        for (int i=0;i<lst1.getTamaño();i++){
            System.out.println("Elemento "+i+":"+lst1.getValor(i));

        }
        
        
    }
    
    
}
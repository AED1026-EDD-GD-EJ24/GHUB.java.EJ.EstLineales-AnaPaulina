package miPrincipal;

public class Lista<T> {
    //Atributos
    private Nodo <T> cabeza;//primer elemento de la lista
    private int tamaño;//total de elementos
    public Lista(){//constructor por defcto
        cabeza=null;
        tamaño=0;
    }
    
    public int getTamaño() {//devuelve tamaño de lista
        return tamaño;
    }

    //consulta si es vacia
    public boolean esVacia(){
        if (cabeza == null) 
            return true;
        return false;
    }   

    //Agrega un nuevonodo al final de la lista
    public void agregar(T valor){

        Nodo<T> nuevo=new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza=nuevo;
        }else{
            //Agregar alfinal de lista
            Nodo <T> aux= cabeza;
            while (aux.getSiguiente()!=null) {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

}

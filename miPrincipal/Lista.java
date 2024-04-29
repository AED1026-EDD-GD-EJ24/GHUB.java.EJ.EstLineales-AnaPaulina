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
    
            
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamaño){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            //el nuevo nodo se inserta al inicio de la lista
            if(pos==0){
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }
            else{
                //el nuevo nodo se inserta al final de la lista
                if(pos==tamaño){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente()!=null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                }
                else{
                    //el nuevo nodo se inserta en cualquier posicion de la lista
                    Nodo<T> aux = cabeza;
                    for(int i=0; i<=pos-2; i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
                
            }
            tamaño++;

        }
        else{
            throw new PosicionIlegalException();
        }
        
            
    }

    //Devueve el valor de una determinada posicion
    public T getValor(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamaño)
        {
            T valor;
            if(pos ==0){
                valor = cabeza.getValor();
                return valor;
            }
            else{
                Nodo<T> aux = cabeza;
                for(int i=0; i<=pos-1; i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();

            }
            return valor;

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public void remover (int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamaño){
            if (pos==0){
                //el nodo a eliminar esta en la primera posicion
                cabeza= cabeza.getSiguiente();
                tamaño--;
            }
            //se elimina en medio y al final
            else{
                Nodo<T> aux = cabeza;
                for(int i=0;i<=pos-2;i++){
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamaño--;
            }

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    //elimina toda la lista
    public void limpiar(){
        cabeza=null;
        tamaño=0;

    }

}

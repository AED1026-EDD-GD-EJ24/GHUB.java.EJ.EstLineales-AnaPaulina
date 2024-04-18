package miPrincipal;

public class ListaDeContactos {
    //atributo
    private Lista <Contacto> contactos;

    public ListaDeContactos() {
        contactos=new Lista <Contacto>();
    }
    //retorna una lista de todos los contactos
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
    //agrega nuevo contacto a la lista si todavia no hay ningun contacto con los nombres y apellidos dados
    public boolean agregarContactos(String nombres, String apellidos, String direccion, String correo, String telefono,
    String celular) throws PosicionIlegalException{
        Contacto con=buscarContacto(nombres, apellidos);
        if (con==null) {//se puede agregar el contacto
            Contacto nuevo=new Contacto(nombres, apellidos, direccion, correo, telefono, celular);
            contactos.agregar(nuevo);
            return true;
        }
        return false;
    }
    //busca un contacto dado nombre y apellido,regresa contacto o null
    //throws PosicionIlegalException
    public Contacto buscarContacto(String nombres, String apellidos) throws PosicionIlegalException{
        for (int i = 0; i < contactos.getTamaño(); i++) {
            Contacto con=contactos.getValor(i);
            if (nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())) {
                return con;
            }
        }
        return null;//si no encuentra regresa null
    }
    //elimina n contacto dado sus nombres y apellidos si el usuario existe en la lista lo elimina 
    //return true si se puede 
    public boolean eliminarContacto(String nombres, String apellidos) throws PosicionIlegalException{
        Contacto con=buscarContacto(nombres, apellidos);
        if(con!=null){
            for (int i = 0; i < contactos.getTamaño(); i++) {
                Contacto con=contactos.getValor(i);
                if (nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())) {
                    return con;
                }
            }

        }

    }

}

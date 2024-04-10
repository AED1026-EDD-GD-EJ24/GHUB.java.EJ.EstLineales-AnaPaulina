package miPrincipal;

public class Persona {
    private String nombre;
    private int edad;
    private String Nacionalidad;
    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        Nacionalidad = nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
    @Override
    public String toString() {
        return nombre + ", " + edad + "," + Nacionalidad;
    }
    
    
}
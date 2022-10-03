public class Persona {
    //Atributos
    private String nombre, apellido;
    private int edad;
    //Constructor
    public Persona ( String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }
    //Metodos
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
}

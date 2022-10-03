import java.util.ArrayList;
import java.util.List;

public class Registro {
    //Atributos
    private String nombre;
    private List<Persona> pacientes;
    //Constructor
    public Registro(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<Persona>();
    }
    //Metodos
    public Persona agregarPaciente(String nombre, String apellido, int edad){
        Persona pacienteNuevo = new Persona(nombre, apellido, edad);
        this.pacientes.add(pacienteNuevo);
        return pacienteNuevo;
    }
    public Boolean eliminarPaciente(String nombre, String apellido){
        for(Persona paciente : this.pacientes){
            if(paciente.getNombre().equals(nombre) && paciente.getApellido().equals(apellido)){
                this.pacientes.remove(paciente);
                return true;

            }
        }
        return false;
    }


}

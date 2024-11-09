package co.edu.uniquindio.poo.model.Personas;

public class Empleado extends Persona{
    
    public Empleado(String nombre, String apellido, String id, int telefono, String correo) {
        super(nombre, apellido, id, telefono, correo);
    }

    @Override
    public String toString() {
        return "Empleado []";
    }

}
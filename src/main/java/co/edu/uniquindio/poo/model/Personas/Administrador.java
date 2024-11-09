package co.edu.uniquindio.poo.model.Personas;

public class Administrador extends Persona{
    
    public Administrador(String nombre, String apellido, String id, int telefono, String correo) {
        super(nombre, apellido, id, telefono, correo);
    }

    @Override
    public String toString() {
        return "Administrador []";
    }

}

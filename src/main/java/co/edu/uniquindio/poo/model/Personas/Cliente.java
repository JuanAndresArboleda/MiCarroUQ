package co.edu.uniquindio.poo.model.Personas;

public class Cliente extends Persona{

    public Cliente(String nombre, String apellido, String id, int telefono, String correo) {
        super(nombre, apellido, id, telefono, correo);
    }

    @Override
    public String toString() {
        return "Cliente []";
    }

    
}

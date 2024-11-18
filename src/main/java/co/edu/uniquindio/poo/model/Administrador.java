package co.edu.uniquindio.poo.model;

public class Administrador extends Persona{
    
    public Administrador(String nombre, int id, int telefono, String correo) {
        super(nombre, id, telefono, correo);
    }

    @Override
    public String toString() {
        return "Administrador []";
    }

}

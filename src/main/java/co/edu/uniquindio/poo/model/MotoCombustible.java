package co.edu.uniquindio.poo.model;

public class MotoCombustible extends VehiculoCombustible{

    public MotoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
    }

    @Override
    public String toString() {
        return "MotoCombustible []";
    }

    
}
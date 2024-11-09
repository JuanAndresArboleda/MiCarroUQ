package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado, Transmision transmision, Combustible combustible){
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible);
    }

    @Override
    public String toString() {
        return "Moto []";
    }

}

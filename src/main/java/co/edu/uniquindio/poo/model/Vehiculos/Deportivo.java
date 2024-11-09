package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Deportivo extends Automovil {

    private int caballosFuerza;
    private double tiempoAlcanza100kmh;

    public Deportivo(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire, int caballosFuerza, double tiempoAlcanza100kmh) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible, numeroPuerta,
                numeroPasasjero, numerodebolsasdeaire);
        this.caballosFuerza = caballosFuerza;
        this.tiempoAlcanza100kmh = tiempoAlcanza100kmh;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getTiempoAlcanza100kmh() {
        return tiempoAlcanza100kmh;
    }

    public void setTiempoAlcanza100kmh(double tiempoAlcanza100kmh) {
        this.tiempoAlcanza100kmh = tiempoAlcanza100kmh;
    }

    @Override
    public String toString() {
        return "Deportivo [caballosFuerza=" + caballosFuerza + ", tiempoAlcanza100kmh=" + tiempoAlcanza100kmh + "]";
    }

}

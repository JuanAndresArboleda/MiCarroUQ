package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Automovil extends Vehiculo {

    private int NumeroPuerta;
    private int NumeroPasasjero;
    private int numerodebolsasdeaire;

    public Automovil(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible);
        NumeroPuerta = numeroPuerta;
        NumeroPasasjero = numeroPasasjero;
        this.numerodebolsasdeaire = numerodebolsasdeaire;
    }

    public int getNumeroPuerta() {
        return NumeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        NumeroPuerta = numeroPuerta;
    }

    public int getNumeroPasasjero() {
        return NumeroPasasjero;
    }

    public void setNumeroPasasjero(int numeroPasasjero) {
        NumeroPasasjero = numeroPasasjero;
    }

    public int getNumerodebolsasdeaire() {
        return numerodebolsasdeaire;
    }

    public void setNumerodebolsasdeaire(int numerodebolsasdeaire) {
        this.numerodebolsasdeaire = numerodebolsasdeaire;
    }

    @Override
    public String toString() {
        return "Automovil [NumeroPuerta=" + NumeroPuerta + ", NumeroPasasjero=" + NumeroPasasjero
                + ", numerodebolsasdeaire=" + numerodebolsasdeaire + "]";
    }

}
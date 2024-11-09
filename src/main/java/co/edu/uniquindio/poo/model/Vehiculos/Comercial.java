package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Comercial extends Automovil {

    private boolean camaradereversa;
    private boolean aireacondicionado;
    private boolean abs;

    public Comercial(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire, boolean camaradereversa, boolean aireacondicionado,
            boolean abs) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible, numeroPuerta,
                numeroPasasjero, numerodebolsasdeaire);
        this.camaradereversa = camaradereversa;
        this.aireacondicionado = aireacondicionado;
        this.abs = abs;
    }

    public boolean isCamaradereversa() {
        return camaradereversa;
    }

    public void setCamaradereversa(boolean camaradereversa) {
        this.camaradereversa = camaradereversa;
    }

    public boolean isAireacondicionado() {
        return aireacondicionado;
    }

    public void setAireacondicionado(boolean aireacondicionado) {
        this.aireacondicionado = aireacondicionado;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Comercial [camaradereversa=" + camaradereversa + ", aireacondicionado=" + aireacondicionado + ", abs="
                + abs + "]";
    }

}
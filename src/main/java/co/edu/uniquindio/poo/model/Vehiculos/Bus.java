package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Bus extends Urbano {

    private int ejes;
    private int salidasEmergencia;

    public Bus(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire, boolean camaradereversa, boolean aireacondicionado,
            boolean abs, int capacidadCarga, int ejes, int salidasEmergencia) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible, numeroPuerta,
                numeroPasasjero, numerodebolsasdeaire, camaradereversa, aireacondicionado, abs, capacidadCarga);
        this.ejes = ejes;
        this.salidasEmergencia = salidasEmergencia;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

    @Override
    public String toString() {
        return "Bus [ejes=" + ejes + ", salidasEmergencia=" + salidasEmergencia + "]";
    }

}

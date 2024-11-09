package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Pickup extends Comercial {

    private int capacidadCarga;
    private boolean cuatroXcuatro;

    public Pickup(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire, boolean camaradereversa, boolean aireacondicionado,
            boolean abs, int capacidadCarga, boolean cuatroXcuatro) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible, numeroPuerta,
                numeroPasasjero, numerodebolsasdeaire, camaradereversa, aireacondicionado, abs);
        this.capacidadCarga = capacidadCarga;
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    @Override
    public String toString() {
        return "Pickup [capacidadCarga=" + capacidadCarga + ", cuatroXcuatro=" + cuatroXcuatro + "]";
    }

}

package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Camion extends Vehiculo {

    private int numeroEjes;
    private double capacidadCarga;
    private String tipoCamion;
    private boolean frenosAire;
    private boolean aireAcondicionado;
    private boolean abs;

    public Camion(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroEjes,
            double capacidadCarga, String tipoCamion, boolean frenosAire, boolean aireAcondicionado, boolean abs) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible);
        this.numeroEjes = numeroEjes;
        this.capacidadCarga = capacidadCarga;
        this.tipoCamion = tipoCamion;
        this.frenosAire = frenosAire;
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Camion [numeroEjes=" + numeroEjes + ", capacidadCarga=" + capacidadCarga + ", tipoCamion=" + tipoCamion
                + ", frenosAire=" + frenosAire + ", aireAcondicionado=" + aireAcondicionado + ", abs=" + abs + "]";
    }

}

package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int cambios;
    private double velocidadMaxima;
    private double cilindraje;
    private Estado estado;
    private Transmision transmision;
    private Combustible Combustible;

    public Vehiculo(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado, Transmision transmision, Combustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.estado = estado;
        this.transmision = transmision;
        this.Combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public Combustible getCombustible() {
        return Combustible;
    }

    public void setCombustible(Combustible combustible) {
        Combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", cambios=" + cambios + ", velocidadMaxima="
                + velocidadMaxima + ", cilindraje=" + cilindraje + ", estado=" + estado + ", transmision=" + transmision
                + ", Combustible=" + Combustible + "]";
    }

   

   

}
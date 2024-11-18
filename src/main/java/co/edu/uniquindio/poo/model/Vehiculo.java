package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private String marca;
    private Estado estado;
    private int modelo;
    private int cambios;
    private double velocidadmaxima;
    private double cilindraje;
    private Transmision transmision;
    private String matricula;

    public Vehiculo(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.matricula = matricula;
    }

    

    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public Estado getEstado() {
        return estado;
    }



    public void setEstado(Estado estado) {
        this.estado = estado;
    }



    public int getModelo() {
        return modelo;
    }



    public void setModelo(int modelo) {
        this.modelo = modelo;
    }



    public int getCambios() {
        return cambios;
    }



    public void setCambios(int cambios) {
        this.cambios = cambios;
    }



    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }



    public void setVelocidadmaxima(double velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }



    public double getCilindraje() {
        return cilindraje;
    }



    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }



    public Transmision getTransmision() {
        return transmision;
    }



    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }



    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", estado=" + estado + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadmaxima=" + velocidadmaxima + ", cilindraje=" + cilindraje + ", transmision=" + transmision
                + ", matricula=" + matricula + "]";
    }
}
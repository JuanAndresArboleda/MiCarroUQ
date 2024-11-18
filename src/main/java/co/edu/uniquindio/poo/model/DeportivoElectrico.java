package co.edu.uniquindio.poo.model;

public class DeportivoElectrico extends VehiculoElectrico{

    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean bolsasAire;
    private double caballosFueza;
    private double tiempo100KmH;

    DeportivoElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision,String matricula, int autonomiacargacompleta, String tiempodecarga,
            int numeroPasajeros, int numeroPuertas, boolean bolsasAire, double caballosFueza, double tiempo100KmH){
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
        autonomiacargacompleta, tiempodecarga,matricula);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFueza = caballosFueza;
        this.tiempo100KmH = tiempo100KmH;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean getBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    public double getCaballosFueza() {
        return caballosFueza;
    }

    public void setCaballosFueza(double caballosFueza) {
        this.caballosFueza = caballosFueza;
    }

    public double getTiempo100KmH() {
        return tiempo100KmH;
    }

    public void setTiempo100KmH(double tiempo100KmH) {
        this.tiempo100KmH = tiempo100KmH;
    }
}
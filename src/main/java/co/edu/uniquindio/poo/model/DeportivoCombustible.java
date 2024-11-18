package co.edu.uniquindio.poo.model;

public class DeportivoCombustible extends VehiculoCombustible {

    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean bolsasAire;
    private int caballosFueza;
    private double tiempo100KmHr;

    public DeportivoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, int numeroPasajeros,
            int numeroPuertas, boolean bolsasAire, int caballosFueza, double tiempo100KmHr) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFueza = caballosFueza;
        this.tiempo100KmHr = tiempo100KmHr;
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

    public boolean isBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    public int getCaballosFueza() {
        return caballosFueza;
    }

    public void setCaballosFueza(int caballosFueza) {
        this.caballosFueza = caballosFueza;
    }

    public double getTiempo100KmHr() {
        return tiempo100KmHr;
    }

    public void setTiempo100KmHr(double tiempo100KmHr) {
        this.tiempo100KmHr = tiempo100KmHr;
    }

    @Override
    public String toString() {
        return "DeportivoCombustible [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", bolsasAire=" + bolsasAire + ", caballosFueza=" + caballosFueza + ", tiempo100KmHr=" + tiempo100KmHr
                + "]";
    }

}
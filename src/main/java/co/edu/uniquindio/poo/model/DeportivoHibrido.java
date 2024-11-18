package co.edu.uniquindio.poo.model;

public class DeportivoHibrido extends VehiculoHibrido{
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean bolsasAire;
    private int caballosFuerza;
    private double tiempo100KmH;

    DeportivoHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido, int numeroPasajeros,
            int numeroPuertas, boolean bolsasAire,int caballosFuerza, double tiempo100KmH) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFuerza = caballosFuerza;
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

    public boolean isBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getTiempo100KmH() {
        return tiempo100KmH;
    }

    public void setTiempo100KmH(double tiempo100KmH) {
        this.tiempo100KmH = tiempo100KmH;
    }
}
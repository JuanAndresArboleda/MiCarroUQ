package co.edu.uniquindio.poo.model;

public class AutomovilHibrido extends VehiculoHibrido {
    private int capacidadMaletero;
    private boolean bolsaDeAire;
    private int numeroPuerta;
    private int numeroPasajeros;
    private boolean camaraReversa;

    public AutomovilHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido,
            int capacidadMaletero, boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        this.capacidadMaletero = capacidadMaletero;
        this.bolsaDeAire = bolsaDeAire;
        this.numeroPuerta = numeroPuerta;
        this.numeroPasajeros = numeroPasajeros;
        this.camaraReversa = camaraReversa;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isBolsaDeAire() {
        return bolsaDeAire;
    }

    public void setBolsaDeAire(boolean bolsaDeAire) {
        this.bolsaDeAire = bolsaDeAire;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    @Override
    public String toString() {
        return "AutomovilHibrido [capacidadMaletero=" + capacidadMaletero + ", bolsaDeAire=" + bolsaDeAire
                + ", numeroPuerta=" + numeroPuerta + ", numeroPasajeros=" + numeroPasajeros + ", camaraReversa="
                + camaraReversa + "]";
    }

}
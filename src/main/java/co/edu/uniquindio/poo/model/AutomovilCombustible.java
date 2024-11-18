package co.edu.uniquindio.poo.model;

public class AutomovilCombustible extends VehiculoCombustible {

    private int capacidadMaletero;
    private boolean abs;
    private boolean bolsaDeAire;
    private int numeroPuerta;
    private int numeroPasajeros;
    private boolean camaraReversa;
    private boolean aireAcondicionado;

    public AutomovilCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, int capacidadMaletero,
            boolean abs, boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa,
            boolean aireAcondicionado) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.capacidadMaletero = capacidadMaletero;
        this.abs = abs;
        this.bolsaDeAire = bolsaDeAire;
        this.numeroPuerta = numeroPuerta;
        this.numeroPasajeros = numeroPasajeros;
        this.camaraReversa = camaraReversa;
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
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

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "AutomovilCombustible [capacidadMaletero=" + capacidadMaletero + ", abs=" + abs + ", bolsaDeAire="
                + bolsaDeAire + ", numeroPuerta=" + numeroPuerta + ", numeroPasajeros=" + numeroPasajeros
                + ", camaraReversa=" + camaraReversa + ", aireAcondicionado=" + aireAcondicionado + "]";
    }

}
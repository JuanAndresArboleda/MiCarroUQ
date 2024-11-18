package co.edu.uniquindio.poo.model;

public class AutomovilElectrico extends VehiculoElectrico {

    private int capacidadMaletero;
    private boolean abs;
    private boolean bolsaDeAire;
    private int numeroPuertas;
    private int numeroPasajeros;
    private boolean camaraReversa;
    private boolean aireAcondicionado;

    AutomovilElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision,String matricula, int autonomiacargacompleta, String tiempodecarga,
            int capacidadMaletero, boolean abs, boolean bolsaDeAire, int numeroPuertas, int numeroPasajeros,
            boolean camaraReversa, boolean aireAcondicionado) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, autonomiacargacompleta,
                tiempodecarga,matricula);

        this.capacidadMaletero = capacidadMaletero;
        this.abs = abs;
        this.bolsaDeAire = bolsaDeAire;
        this.numeroPuertas = numeroPuertas;
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

    public boolean Abs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean BolsaDeAire() {
        return bolsaDeAire;
    }

    public void setBolsaDeAire(boolean bolsaDeAire) {
        this.bolsaDeAire = bolsaDeAire;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean CamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean AireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "AutomovilElectrico [capacidadMaletero=" + capacidadMaletero + ", abs=" + abs + ", bolsaDeAire="
                + bolsaDeAire + ", numeroPuertas=" + numeroPuertas + ", numeroPasajeros=" + numeroPasajeros
                + ", camaraReversa=" + camaraReversa + ", aireAcondicionado=" + aireAcondicionado + "]";
    }

}

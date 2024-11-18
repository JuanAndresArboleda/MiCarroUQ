package co.edu.uniquindio.poo.model;

public class PickUpHibrido extends VehiculoHibrido {

    private String capacidadCarga;
    private boolean aireAcondicionado;
    private boolean Abs;
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean camaraReversa;
    private boolean bolsasAire;
    private boolean cuatroxcuatro;

    public PickUpHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, TipoHibrido tipoHibrido, String capacidadCarga,
            boolean aireAcondicionado, boolean abs, int numeroPasajeros, int numeroPuertas, boolean camaraReversa,
            boolean bolsasAire, boolean cuatroxcuatro) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        Abs = abs;
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAbs() {
        return Abs;
    }

    public void setAbs(boolean abs) {
        Abs = abs;
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

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    @Override
    public String toString() {
        return "PickUpHibrido [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado + ", Abs="
                + Abs + ", numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", camaraReversa="
                + camaraReversa + ", bolsasAire=" + bolsasAire + ", cuatroxcuatro=" + cuatroxcuatro + "]";
    }

}
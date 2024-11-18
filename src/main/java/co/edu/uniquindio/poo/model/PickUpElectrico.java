package co.edu.uniquindio.poo.model;

public class PickUpElectrico extends VehiculoElectrico {
    private String capacidadCarga;
    private boolean aireAcondicionado;
    private boolean abs;
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean camaraReversa;
    private boolean bolsasAire;
    private boolean cuatroxcuatro;

    public PickUpElectrico(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision,String matricula,int autonomiacargacompleta, String tiempodecarga,
            String capacidadCarga, boolean aireAcondicionado, boolean abs, int numeroPasajeros, int numeroPuertas,
            boolean camaraReversa, boolean bolsasAire, boolean cuatroxcuatro) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
        autonomiacargacompleta, tiempodecarga,matricula);

        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
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
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
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


}

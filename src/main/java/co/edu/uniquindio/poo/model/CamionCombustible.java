package co.edu.uniquindio.poo.model;

public class CamionCombustible extends VehiculoCombustible {
    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean Abs;
    private boolean frenosAire;
    private int numeroEjes;
    private String tipoCamion;
    private Uso uso;

    public CamionCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, int capacidadCarga,
            boolean aireAcondicionado, boolean abs, boolean frenosAire, int numeroEjes, String tipoCamion, Uso uso) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        Abs = abs;
        this.frenosAire = frenosAire;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.uso = uso;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
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

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "CamionCombustible [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado
                + ", Abs=" + Abs + ", frenosAire=" + frenosAire + ", numeroEjes=" + numeroEjes + ", tipoCamion="
                + tipoCamion + ", uso=" + uso + "]";
    }

}
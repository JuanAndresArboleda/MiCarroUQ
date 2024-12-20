package co.edu.uniquindio.poo.model;

public class CamionElectrico extends VehiculoElectrico {
    private String capacidadCarga;
    private boolean aireAcondicionado;
    private boolean abs;
    private boolean frenosAire;
    private String numeroEjes;
    private String tipoCamion;
    private Uso uso;

    public CamionElectrico(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision,String matricula,int autonomiacargacompleta, String tiempodecarga,
            String capacidadCarga, boolean aireAcondicionado, boolean abs, boolean frenosAire, String numeroEjes,
            String tipoCamion,Uso uso) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
        autonomiacargacompleta, tiempodecarga,matricula);

        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
        this.capacidadCarga = capacidadCarga;
        this.frenosAire = frenosAire;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.uso = uso;
    }


    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean getAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean getAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean getFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public String getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(String numeroEjes) {
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

    public void setEstado(Uso uso) {
        this.uso = uso;
    }



    @Override
    public String toString() {
        return "CamionElectrico [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado
                + ", abs=" + abs + ", frenosAire=" + frenosAire + ", numeroEjes=" + numeroEjes + ", tipoCamion="
                + tipoCamion + "]";
    }

}
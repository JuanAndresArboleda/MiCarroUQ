package co.edu.uniquindio.poo.model;

public class VehiculoElectrico extends Vehiculo {

    private int autonomiacargacompleta;
    private String tiempodecarga;

    public VehiculoElectrico(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision, int autonomiacargacompleta, String tiempodecarga,
            String matricula) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.autonomiacargacompleta = autonomiacargacompleta;
        this.tiempodecarga = tiempodecarga;
    }

    public int getAutonomiacargacompleta() {
        return autonomiacargacompleta;
    }

    public void setAutonomiacargacompleta(int autonomiacargacompleta) {
        this.autonomiacargacompleta = autonomiacargacompleta;
    }

    public String getTiempodecarga() {
        return tiempodecarga;
    }

    public void setTiempodecarga(String tiempodecarga) {
        this.tiempodecarga = tiempodecarga;
    }
}

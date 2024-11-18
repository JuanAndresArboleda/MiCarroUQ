package co.edu.uniquindio.poo.model;

public class UrbanoCombustible extends VehiculoCombustible {
    private boolean velocidadCrucero;
    private boolean sensorColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentenPermanenciaCarril;

    public UrbanoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, boolean velocidadCrucero,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentenPermanenciaCarril) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.velocidadCrucero = velocidadCrucero;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentenPermanenciaCarril = asistentenPermanenciaCarril;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public boolean isSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentenPermanenciaCarril() {
        return asistentenPermanenciaCarril;
    }

    public void setAsistentenPermanenciaCarril(boolean asistentenPermanenciaCarril) {
        this.asistentenPermanenciaCarril = asistentenPermanenciaCarril;
    }

    @Override
    public String toString() {
        return "UrbanoCombustible [velocidadCrucero=" + velocidadCrucero + ", sensorColision=" + sensorColision
                + ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asistentenPermanenciaCarril="
                + asistentenPermanenciaCarril + "]";
    }

}
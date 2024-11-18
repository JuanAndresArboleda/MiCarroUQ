package co.edu.uniquindio.poo.model;

public class CamionetaCombustible extends UrbanoCombustible{
    private boolean cuatroxcuatro;

    public CamionetaCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, boolean velocidadCrucero,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentenPermanenciaCarril,
            boolean cuatroxcuatro) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                velocidadCrucero, sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    @Override
    public String toString() {
        return "CamionetaCombustible [cuatroxcuatro=" + cuatroxcuatro + "]";
    }

    
}
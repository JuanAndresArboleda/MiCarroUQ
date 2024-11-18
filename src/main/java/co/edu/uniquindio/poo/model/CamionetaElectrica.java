package co.edu.uniquindio.poo.model;

public class CamionetaElectrica extends UrbanoElectrico {
    private boolean cuatroxcuatro;

    public CamionetaElectrica(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta,
            String tiempodecarga, boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentenPermanenciaCarril, boolean cuatroxcuatro) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                autonomiacargacompleta, tiempodecarga, velocidadCrucero, sensorColision, sensorTraficoCruzado,
                asistentenPermanenciaCarril);
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
        return "CamionetaElectrica [cuatroxcuatro=" + cuatroxcuatro + "]";
    }

}
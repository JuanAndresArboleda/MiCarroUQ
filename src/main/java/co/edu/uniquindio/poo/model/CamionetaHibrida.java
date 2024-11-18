package co.edu.uniquindio.poo.model;

public class CamionetaHibrida extends UrbanoHibrido {
    private boolean cuatroxcuatro;

    public CamionetaHibrida(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido,
            int capacidadMaletero, boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa,
            boolean velocidadCrucero, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentenPermanenciaCarril, boolean cuatroxcuatro) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido,
                capacidadMaletero, bolsaDeAire, numeroPuerta, numeroPasajeros, camaraReversa, velocidadCrucero,
                sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
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
        return "CamionetaHibrida [cuatroxcuatro=" + cuatroxcuatro + "]";
    }

    



}
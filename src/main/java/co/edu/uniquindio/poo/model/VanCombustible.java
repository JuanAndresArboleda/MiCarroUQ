package co.edu.uniquindio.poo.model;

public class VanCombustible extends UrbanoCombustible{

    public VanCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios,
            int velocidadmaxima, double cilindraje, Transmision transmision, String matricula, boolean velocidadCrucero,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentenPermanenciaCarril) {
        super(combustible, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula,
                velocidadCrucero, sensorColision, sensorTraficoCruzado, asistentenPermanenciaCarril);
    }

    @Override
    public String toString() {
        return "VanCombustible []";
    }

    
}
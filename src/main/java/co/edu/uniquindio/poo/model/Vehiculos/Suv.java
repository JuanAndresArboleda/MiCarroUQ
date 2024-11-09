package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Suv extends Personal {

    private boolean cuatroXcuatro;

    public Suv(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire, boolean camaradereversa, boolean aireacondicionado,
            boolean abs, int capacidadCarga, boolean velocidadCrucero, boolean sensoresColision,
            boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, boolean cuatroXcuatro) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible, numeroPuerta,
                numeroPasasjero, numerodebolsasdeaire, camaradereversa, aireacondicionado, abs, capacidadCarga,
                velocidadCrucero, sensoresColision, sensorTraficoCruzado, asistentePermanenciaCarril);
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    @Override
    public String toString() {
        return "Suv [cuatroXcuatro=" + cuatroXcuatro + "]";
    }

}

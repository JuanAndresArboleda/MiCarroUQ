package co.edu.uniquindio.poo.model.Vehiculos;

import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Transmision;

public class Sedan extends Personal {
    
    public Sedan(String marca, String modelo, int cambios, double velocidadMaxima, double cilindraje, Estado estado,
            Transmision transmision, co.edu.uniquindio.poo.model.Combustible combustible, int numeroPuerta,
            int numeroPasasjero, int numerodebolsasdeaire, boolean camaradereversa, boolean aireacondicionado,
            boolean abs, int capacidadCarga, boolean velocidadCrucero, boolean sensoresColision,
            boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
        super(marca, modelo, cambios, velocidadMaxima, cilindraje, estado, transmision, combustible, numeroPuerta,
                numeroPasasjero, numerodebolsasdeaire, camaradereversa, aireacondicionado, abs, capacidadCarga,
                velocidadCrucero, sensoresColision, sensorTraficoCruzado, asistentePermanenciaCarril);
    }
}
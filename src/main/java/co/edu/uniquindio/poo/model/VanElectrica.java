package co.edu.uniquindio.poo.model;

public class VanElectrica extends AutomovilElectrico{

    VanElectrica(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision,String matricula, int autonomiacargacompleta, String tiempodecarga,
            int capacidadMaletero, boolean abs, boolean bolsaDeAire, int numeroPuertas, int numeroPasajeros,
            boolean camaraReversa, boolean aireAcondicionado, int numeroEjes, int numeroSalidasEmergencia) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, 
                autonomiacargacompleta, tiempodecarga, capacidadMaletero, abs, bolsaDeAire, numeroPuertas, numeroPasajeros,
                camaraReversa, aireAcondicionado);
    }
}
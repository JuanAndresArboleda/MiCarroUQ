package co.edu.uniquindio.poo.model;

public class MotoElectrica extends VehiculoElectrico {

    public MotoElectrica(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision,String matricula,int autonomiacargacompleta, String tiempodecarga) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
        autonomiacargacompleta, tiempodecarga, matricula);
    }

    @Override
    public String toString() {
        return "MotoElectrica []";
    }
    
}
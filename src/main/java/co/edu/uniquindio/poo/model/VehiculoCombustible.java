package co.edu.uniquindio.poo.model;

public class VehiculoCombustible extends Vehiculo {

    private Combustible combustible;


    public VehiculoCombustible(Combustible combustible, String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.combustible= combustible;
    }
        public Combustible getcCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

        @Override
    public String toString() {
        return "VehiculoElectrico [Combustible="+combustible+"]";
    }
    
}
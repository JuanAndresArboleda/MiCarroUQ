package co.edu.uniquindio.poo.model;

public class VehiculoHibrido extends Vehiculo{
    private TipoHibrido tipoHibrido;

    VehiculoHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, TipoHibrido tipoHibrido) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula);
        this.tipoHibrido = tipoHibrido;
    }

    public TipoHibrido getTipoHibrido() {
        return tipoHibrido;
    }

    public void setTipoHibrido(TipoHibrido tipoHibrido) {
        this.tipoHibrido = tipoHibrido;
    }
}
package co.edu.uniquindio.poo.model;

public class MotoHibrida extends VehiculoHibrido{

    MotoHibrida(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima,
            double cilindraje, Transmision transmision,int autonomiacargacompleta,
            String tiempodecarga, String matricula, TipoHibrido tipoHibrido) {
    super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido);
    }
    
}
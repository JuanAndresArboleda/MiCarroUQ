package co.edu.uniquindio.poo.controller;

/**
import java.util.Collection;
import co.edu.uniquindio.poo.model.Consesionario;
import co.edu.uniquindio.poo.model.Reserva;

public class AdministradorController {
    
    private static AdministradorController instance;
    Consesionario consesionario;

    public AdministradorController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public Collection<Reserva> obtenerListaReservas() {
        return consesionario.getReservas();
    }

    public static AdministradorController getInstance() {
        if (instance == null) {
            // instance = new ConsesionarioController();
        }
        return instance;
    }
}*/

package co.edu.uniquindio.poo.controller;

/**
import java.util.Collection;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Consesionario;

public class ClienteController {
    
    private static ClienteController instance;
    Consesionario consesionario;

    public ClienteController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public Collection<Reserva> obtenerListaReservas() {
        return consesionario.getReservas();
    }

    public static ClienteController getInstance() {
        if (instance == null) {
            // instance = new ReservasController();
        }
        return instance;
    }
}*/

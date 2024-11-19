package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Consesionario;

public class GestionAlqController {

    private static GestionAlqController instance;
    Consesionario consesionario;

    public GestionAlqController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public boolean crearAlquiler(Alquiler alquiler) {
        return consesionario.agregarAlquiler(alquiler);
    }

    public Collection<Alquiler> obtenerListaAlquileres() {
        return consesionario.getAlquileres();
    }

    public boolean eliminarAlquiler(String codigo) {
        return consesionario.eliminarAlquiler(codigo);
    }

    public boolean actualizarAlquiler(String codigo, Alquiler alquiler) {
        return consesionario.actualizarAlquiler(codigo, alquiler);
    }

    public static GestionAlqController getInstance() {
        if (instance == null) {
            // instance = new AlquilerController();
        }
        return instance;
    }
}

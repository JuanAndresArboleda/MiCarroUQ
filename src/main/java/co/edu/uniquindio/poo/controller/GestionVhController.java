package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Consesionario;
import co.edu.uniquindio.poo.model.Vehiculo;

public class GestionVhController {
    private static GestionVhController instance;
    Consesionario consesionario;

    public GestionVhController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public boolean crearVehiculo(Vehiculo vehiculo) {
        return consesionario.agregarVehiculo(vehiculo);
    }

    public Collection<Vehiculo> obtenerListaVehiculos() {
        return consesionario.getVehiculos();
    }

    public boolean eliminarVehiculo(String matricula) {
        return consesionario.eliminarVehiculo(matricula);
    }

    public boolean actualizarVehiculo(String matricula, Vehiculo vehiculo) {
        return consesionario.actualizarVehiculo(matricula, vehiculo);
    }

    public static GestionVhController getInstance() {
        if (instance == null) {
            // instance = new GestionVhController();
        }
        return instance;
    }
}

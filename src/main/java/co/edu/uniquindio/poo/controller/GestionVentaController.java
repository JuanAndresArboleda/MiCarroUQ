package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Venta;
import co.edu.uniquindio.poo.model.Consesionario;

public class GestionVentaController {

    private static GestionVentaController instance;
    Consesionario consesionario;

    public GestionVentaController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public boolean crearVenta(Venta venta) {
        return consesionario.agregarVenta(venta);
    }

    public Collection<Venta> obtenerListaVentas() {
        return consesionario.getVentas();
    }

    public boolean eliminarVenta(String id) {
        return consesionario.eliminarVenta(id);
    }

    public boolean actualizarVenta(String id, Venta venta) {
        return consesionario.actualizarVenta(id, venta);
    }

    public static GestionVentaController getInstance() {
        if (instance == null) {
            // instance = new ClienteController();
        }
        return instance;
    }
}

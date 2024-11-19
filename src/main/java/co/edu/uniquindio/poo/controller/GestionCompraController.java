package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.Consesionario;

public class GestionCompraController {

    private static GestionCompraController instance;
    Consesionario consesionario;

    public GestionCompraController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public boolean crearCompra(Compra compra) {
        return consesionario.agregarCompra(compra);
    }

    public Collection<Compra> obtenerListaClientes() {
        return consesionario.getCompras();
    }

    public boolean eliminarCompra(String id) {
        return consesionario.eliminarCompra(id);
    }

    public boolean actualizarCompra(String id, Compra compra) {
        return consesionario.actualizarCompra(id, compra);
    }

    public static GestionCompraController getInstance() {
        if (instance == null) {
            // instance = new ClienteController();
        }
        return instance;
    }
}

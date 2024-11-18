package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Consesionario;

public class GestionClController {

    private static GestionClController instance;
    Consesionario consesionario;

    public GestionClController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public boolean crearCliente(Cliente cliente) {
        return consesionario.agregarCliente(cliente);
    }

    public Collection<Cliente> obtenerListaClientes() {
        return consesionario.getClientes();
    }

    public boolean eliminarCliente(int id) {
        return consesionario.eliminarCliente(id);
    }

    public boolean actualizarCliente(int id, Cliente cliente) {
        return consesionario.actualizarCliente(id, cliente);
    }

    public static GestionClController getInstance() {
        if (instance == null) {
            // instance = new ClienteController();
        }
        return instance;
    }
}

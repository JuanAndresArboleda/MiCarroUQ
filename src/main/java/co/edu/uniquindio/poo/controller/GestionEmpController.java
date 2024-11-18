package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Consesionario;

public class GestionEmpController {
    private static GestionClController instance;
    Consesionario consesionario;

    public GestionEmpController(Consesionario consesionario) {
        this.consesionario = consesionario;
    }

    public boolean crearEmpleado(Empleado empleado) {
        return consesionario.agregarEmpleado(empleado);
    }

    public Collection<Empleado> obtenerListaEmpleados() {
        return consesionario.getEmpleados();
    }

    public boolean eliminarEmpleado(int id) {
        return consesionario.eliminarEmpleado(id);
    }

    public boolean actualizarEmpleado(int id, Empleado empleado) {
        return consesionario.actualizarEmpleado(id, empleado);
    }

    public static GestionClController getInstance() {
        if (instance == null) {
            // instance = new EmpleadoController();
        }
        return instance;
    }
}

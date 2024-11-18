package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente extends Persona{
    public LinkedList<Vehiculo> vehiculos;

    public Cliente(String nombre, int id, int telefono, String correo) {
        super(nombre, id, telefono, correo);
        vehiculos = new LinkedList<>();
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculosgetVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Cliente []";
    }
// ------------------------------------------------Vehiculo---------------------------------------------------//

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
}

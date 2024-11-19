package co.edu.uniquindio.poo.model;

public class Compra {
    private String id;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Estado estado;

    public Compra(String id, Cliente cliente, Vehiculo vehiculo, Estado estado) {
        this.id = id;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Venta [id=" + id + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", estado=" + estado + "]";
    }

}

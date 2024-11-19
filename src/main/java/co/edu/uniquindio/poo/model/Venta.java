package co.edu.uniquindio.poo.model;

public class Venta {
    private String id;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private EstadoVenta estadoVenta;

    public Venta(String id, Cliente cliente, Vehiculo vehiculo, EstadoVenta estadoVenta) {
        this.id = id;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.estadoVenta = estadoVenta;
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

    public EstadoVenta getEstadoVenta() {
        return estadoVenta;
    }

    public void setestadoVenta(EstadoVenta estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    @Override
    public String toString() {
        return "Venta [id=" + id + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", estadoVenta=" + estadoVenta + "]";
    }

}

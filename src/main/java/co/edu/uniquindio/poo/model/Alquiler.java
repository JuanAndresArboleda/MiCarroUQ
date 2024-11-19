package co.edu.uniquindio.poo.model;

public class Alquiler {

    private String codigo;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String tiempoAlquiler;
    private EstadoAlq estadoAlq;

    public Alquiler(String codigo, Cliente cliente, Vehiculo vehiculo, String tiempoAlquiler, EstadoAlq estadoAlq) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tiempoAlquiler = tiempoAlquiler;
        this.estadoAlq = estadoAlq;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getTiempoAlquiler() {
        return tiempoAlquiler;
    }

    public void setTiempoAlquiler(String tiempoAlquiler) {
        this.tiempoAlquiler = tiempoAlquiler;
    }

    public EstadoAlq getEstadoAlq() {
        return estadoAlq;
    }

    public void setEstadoAlq(EstadoAlq estadoAlq) {
        this.estadoAlq = estadoAlq;
    }

    @Override
    public String toString() {
        return "Alquiler [codigo=" + codigo + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", tiempoAlquiler="
                + tiempoAlquiler + ", estadoAlq=" + estadoAlq + "]";
    }

}
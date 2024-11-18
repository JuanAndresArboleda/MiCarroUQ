package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Consesionario {

    private String nombre;
    private int id;
    private Collection<Vehiculo> vehiculos;
    private Collection<Administrador> administradores;
    private Collection<Empleado> empleados;
    private Collection<Cliente> clientes;

  
    public Consesionario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        vehiculos = new LinkedList<>();
        administradores = new LinkedList<>();
        empleados = new LinkedList<>();
        clientes = new LinkedList<>();
    }

    /**
    public static void main(String[] args) {
        // Crear un vehículo de tipo PickUp
        Vehiculo pickUp = crearVehiculo("PickUp", "Ford", "F-150", 2023, "Rojo", 25000.00, 200, 60.0, 1000.0);
        System.out.println("PickUp: " + pickUp.getMarca() + " " + pickUp.getModelo());

        // Crear un vehículo de tipo Camión
        Vehiculo camion = crearVehiculo("Camión", "Volvo", "FH16", 2022, "Azul", 100000.00, 120, 150.0, 40000.0);
        System.out.println("Camión: " + camion.getMarca() + " " + camion.getModelo());
    }

    // Método para crear vehículos
    public static Vehiculo crearVehiculo(String tipo, String marca, String modelo, int año, String color, double precio,
            int velocidadMaxima, double capacidadTanque, double atributoAdicional) {
        Vehiculo vehiculo = null;

        switch (tipo) {
            case "PickUp":
                vehiculo = new PickUpElectrico(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Camión":
                vehiculo = new CamionElectrico(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Camioneta":
                vehiculo = new CamionetaElectrica(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Van":
                vehiculo = new VanElectrica(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Moto":
                vehiculo = new MotoElectrica(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Bus":
                vehiculo = new Bus(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Deportivo":
                vehiculo = new Deportivo(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            case "Sedan":
                vehiculo = new Sedan(marca, modelo, año, color, precio, velocidadMaxima, capacidadTanque,
                        atributoAdicional);
                break;
            default:
                System.out.println("Tipo de vehículo inválido.");
        }

        return vehiculo;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Consesionario [nombre=" + nombre + ", id=" + id + ", vehiculos=" + vehiculos + ", administradores="
                + administradores + ", empleados=" + empleados + ", clientes=" + clientes + "]";
    }




// ------------------------------------------------Administrador---------------------------------------------------//
    public boolean verificarAdministrador(int id) {
        boolean centinela = false;
        for (Administrador administrador : administradores) {
            if (administrador.getId() == id) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarAdministrador(Administrador administrador) {
        if (verificarAdministrador(administrador.getId()) == false) {
            administradores.add(administrador);
        }
    }

    public void eliminarAdministrador(Administrador administrador) {
        if (verificarAdministrador(administrador.getId()) == true) {
            administradores.remove(administrador);
        }
    }

    // ------------------------------------------------Empleado---------------------------------------------------//

    public boolean agregarEmpleado(Empleado empleado) {
        boolean centinela = false;
        if (!verificarEmpleado(empleado.getId())) {
            empleados.add(empleado);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarEmpleado(int id) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                empleados.remove(empleado);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarEmpleado(int id, Empleado actualizado) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                empleado.setId(actualizado.getId());
                empleado.setNombre(actualizado.getNombre());
                empleado.setTelefono(actualizado.getTelefono());
                empleado.setCorreo(actualizado.getCorreo());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarEmpleado(int id) {
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                centinela = true;
            }
        }
        return centinela;
    }
   
    // ------------------------------------------------Clientes---------------------------------------------------//
    
    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getId())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCliente(int id) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(int id, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setId(actualizado.getId());
                cliente.setNombre(actualizado.getNombre());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setCorreo(actualizado.getCorreo());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarCliente(int id) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                centinela = true;
            }
        }
        return centinela;
    }

    // ------------------------------------------------Clientes---------------------------------------------------//


    public boolean agregarVehiculo(Vehiculo vehiculo) {
        boolean centinela = false;
        if (!verificarVehiculo(vehiculo.getMatricula())) {
            vehiculos.add(vehiculo);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarVehiculo(String matricula) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculos.remove(vehiculo);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarVehiculo(String matricula, Vehiculo actualizado) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setModelo(actualizado.getModelo());
                vehiculo.setMarca(actualizado.getMarca());
                vehiculo.setMatricula(actualizado.getMatricula());
                vehiculo.setEstado(actualizado.getEstado());
                vehiculo.setCambios(actualizado.getCambios());
                vehiculo.setVelocidadmaxima(actualizado.getVelocidadmaxima());
                vehiculo.setCilindraje(actualizado.getCilindraje());
                vehiculo.setTransmision(actualizado.getTransmision());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarVehiculo(String matricula) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }


}

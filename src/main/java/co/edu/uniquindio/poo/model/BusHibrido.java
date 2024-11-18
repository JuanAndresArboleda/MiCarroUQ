package co.edu.uniquindio.poo.model;

public class BusHibrido extends AutomovilHibrido {
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    public BusHibrido(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, TipoHibrido tipoHibrido, int capacidadMaletero,
            boolean bolsaDeAire, int numeroPuerta, int numeroPasajeros, boolean camaraReversa, int numeroEjes,
            int numeroSalidasEmergencia) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, matricula, tipoHibrido,
                capacidadMaletero, bolsaDeAire, numeroPuerta, numeroPasajeros, camaraReversa);
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    @Override
    public String toString() {
        return "BusHibrido [numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]";
    }

}
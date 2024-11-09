package co.edu.uniquindio.poo.Model.QueSonEstasMrds.NOSE.QUE.SON.ESTAS;

public class Electrico {
    private int autonomiacargcompleta;
    private String tiempodecarga;

    public Electrico(int autonomiacargcompleta, String tiempodecarga) {
        this.autonomiacargcompleta = autonomiacargcompleta;
        this.tiempodecarga = tiempodecarga;
    }

    public int getAutonomiacargcompleta() {
        return autonomiacargcompleta;
    }

    public void setAutonomiacargcompleta(int autonomiacargcompleta) {
        this.autonomiacargcompleta = autonomiacargcompleta;
    }

    public String getTiempodecarga() {
        return tiempodecarga;
    }

    public void setTiempodecarga(String tiempodecarga) {
        this.tiempodecarga = tiempodecarga;
    }
}

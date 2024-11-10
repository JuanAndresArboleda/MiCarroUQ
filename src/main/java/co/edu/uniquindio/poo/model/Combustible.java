package co.edu.uniquindio.poo.model;

public class Combustible {
    public static class Gasolina extends Combustible {
    }

    public static class Diesel extends Combustible {
    }

    public static class Electrico extends Combustible {
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

    public static class Hibrido extends Combustible {
        public static class HibridoNoEnchufable extends Hibrido {
            public static final HibridoNoEnchufable HIBRIDO_LIGERO = new HibridoNoEnchufable();
            public static final HibridoNoEnchufable HIBRIDO_NO_LIGERO = new HibridoNoEnchufable();
        }

        public static final Hibrido ENCHUFABLE = new Hibrido();
    }
}

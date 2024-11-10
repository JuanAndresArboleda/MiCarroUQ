package co.edu.uniquindio.poo.model;

public class Combustible {
    public static class Gasolina extends Combustible {
    }

    public static class Diesel extends Combustible {
    }

    public static class Electrico extends Combustible {
        private int autonomiaCargCompleta;
        private String tiempoCarga;

        public Electrico(int autonomiaCargCompleta, String tiempoCarga) {
            this.autonomiaCargCompleta = autonomiaCargCompleta;
            this.tiempoCarga = tiempoCarga;
        }

        public int getAutonomiaCargCompleta() {
            return autonomiaCargCompleta;
        }

        public void setAutonomiaCargCompleta(int autonomiaCargCompleta) {
            this.autonomiaCargCompleta = autonomiaCargCompleta;
        }

        public String getTiempoCarga() {
            return tiempoCarga;
        }

        public void setTiempoCarga(String tiempoCarga) {
            this.tiempoCarga = tiempoCarga;
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


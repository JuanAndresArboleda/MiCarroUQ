package co.edu.uniquindio.poo.model;

public class Combustible {
    public static class Gasolina extends Combustible {
    }

    public static class Diesel extends Combustible {
    }

    public static class Electrico extends Combustible {
        private int autonomiaCargaCompleta;
        private String tiempoCarga;

        public Electrico(int autonomiaCargaCompleta, String tiempoCarga) {
            this.autonomiaCargaCompleta = autonomiaCargaCompleta;
            this.tiempoCarga = tiempoCarga;
        }

        public int getAutonomiaCargaCompleta() {
            return autonomiaCargaCompleta;
        }

        public void setAutonomiaCargaCompleta(int autonomiaCargaCompleta) {
            this.autonomiaCargaCompleta = autonomiaCargaCompleta;
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


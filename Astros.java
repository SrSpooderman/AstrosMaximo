public class Astros {
    private String nombre;
    private int radio_ecuatorial;
    private double rotacion_eje_masa;
    private double masa;
    private int temperatura_media;
    private double gravedad;

    public Astros(String nombre, int radio_ecuatorial, double rotacion_eje_masa, double masa, int temperatura_media, double gravedad) {
        this.nombre = nombre;
        this.radio_ecuatorial = radio_ecuatorial;
        this.rotacion_eje_masa = rotacion_eje_masa;
        this.masa = masa;
        this.temperatura_media = temperatura_media;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio_ecuatorial() {
        return radio_ecuatorial;
    }

    public void setRadio_ecuatorial(int radio_ecuatorial) {
        this.radio_ecuatorial = radio_ecuatorial;
    }

    public double getRotacion_eje_masa() {
        return rotacion_eje_masa;
    }

    public void setRotacion_eje_masa(double rotacion_eje_masa) {
        this.rotacion_eje_masa = rotacion_eje_masa;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public int getTemperatura_media() {
        return temperatura_media;
    }

    public void setTemperatura_media(int temperatura_media) {
        this.temperatura_media = temperatura_media;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
}
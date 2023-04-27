public class Satelites extends Astros{
    private int distancia_planeta;
    private double orbita_planetaria;
    private Planetas planeta;

    public Satelites(String nombre, int radio_ecuatorial, double rotacion_eje_masa, double masa, int temperatura_media, double gravedad, int distancia_planeta, double orbita_planetaria, Planetas planeta) {
        super(nombre, radio_ecuatorial, rotacion_eje_masa, masa, temperatura_media, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta = planeta;
    }

    public int getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(int distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public double getOrbita_planetaria() {
        return orbita_planetaria;
    }

    public void setOrbita_planetaria(double orbita_planetaria) {
        this.orbita_planetaria = orbita_planetaria;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString(){
        return "Nombre: "+ super.getNombre() +"\n"+
                "Planeta: "+planeta.getNombre()+"\n"+
                "Radio: "+ super.getRadio_ecuatorial() +"\n"+
                "Rotacion: "+super.getRotacion_eje_masa()+"\n"+
                "Masa: "+super.getMasa()+"\n"+
                "Temperatura: "+super.getTemperatura_media()+"\n"+
                "Gravedad: "+super.getGravedad()+"\n"+
                "Distancia de"+planeta.getNombre()+": "+distancia_planeta+"\n"+
                "Orbita planetaria: "+orbita_planetaria;
    }
}

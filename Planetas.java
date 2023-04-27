public class Planetas extends Astros {
    private long distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelites;

    public Planetas(String nombre, int radio_ecuatorial, double rotacion_eje_masa, double masa, int temperatura_media, double gravedad, long distancia_sol, int orbita_sol, boolean tiene_satelites){
        super(nombre,radio_ecuatorial,rotacion_eje_masa,masa,temperatura_media,gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita_sol = orbita_sol;
        this.tiene_satelites = tiene_satelites;
    }

    public long getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(long distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public int getOrbita_sol() {
        return orbita_sol;
    }

    public void setOrbita_sol(int orbita_sol) {
        this.orbita_sol = orbita_sol;
    }

    public boolean isTiene_satelites() {
        return tiene_satelites;
    }

    public void setTiene_satelites(boolean tiene_satelites) {
        this.tiene_satelites = tiene_satelites;
    }

    @Override
    public String toString(){
        return "Nombre: "+ super.getNombre() +"\n"+
                "Radio: "+ super.getRadio_ecuatorial() +"\n"+
                "Rotacion: "+super.getRotacion_eje_masa()+"\n"+
                "Masa: "+super.getMasa()+"\n"+
                "Temperatura: "+super.getTemperatura_media()+"\n"+
                "Gravedad: "+super.getGravedad()+"\n"+
                "Distancia del Sol: "+distancia_sol+"\n"+
                "Orbita del Sol: "+orbita_sol+"\n"+
                "Satelites? "+tiene_satelites;
    }


}

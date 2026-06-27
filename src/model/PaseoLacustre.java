package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;
    private String tipoRecorrido;
    private int capacidadMaxima;

    public PaseoLacustre() {
    }

    public PaseoLacustre(String tipoEmbarcacion, String tipoRecorrido, int capacidadMaxima, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.tipoRecorrido = tipoRecorrido;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoRecorrido() {
        return tipoRecorrido;
    }

    public void setTipoRecorrido(String tipoRecorrido) {
        this.tipoRecorrido = tipoRecorrido;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "PaseoLacustre{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                ", tipoRecorrido='" + tipoRecorrido + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}

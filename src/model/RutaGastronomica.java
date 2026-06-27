package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica() { // vacio
    }

    public RutaGastronomica(int numeroDeParadas, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }  // atributos combinados

    public RutaGastronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    } // atributos solo de esta clase

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // se podria generar solo el get y set de numero de paradas ya que los otros ya estan hechos.
    @Override
    public String toString() {
        return "RutaGastronomica{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", numeroDeParadas=" + numeroDeParadas +
                '}';
    }

}

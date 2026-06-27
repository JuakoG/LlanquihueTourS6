package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;
    private String guiaTuristico;

    public ExcursionCultural() {
    }

    public ExcursionCultural(String lugarHistorico, String guiaTuristico, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
        this.guiaTuristico = guiaTuristico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public String getGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(String guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    @Override
    public String toString() {
        return "ExcursionCultural{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", lugarHistorico='" + lugarHistorico + '\'' +
                ", guiaTuristico='" + guiaTuristico + '\'' +
                '}';
    }
}

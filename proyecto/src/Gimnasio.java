
import java.util.List;

public class Gimnasio extends EspacioDeportivo {

    private time horarioApertura;

    private int capacidadGym;

    private int capacidadMaquinas;

    private double anchoGym;

    private double largoGym;

    private time horarioCierre;

    private boolean servicioMantenimiento;

    public Gimnasio(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio, String ubicacionEspacio) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio, idEspacio, ubicacionEspacio);
    }

    public List<String> serviciosAdicionalesGym() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<String> maquinasDisponibles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

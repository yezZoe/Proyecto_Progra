package Espacios;


import java.util.List;

public class CanchaSintetica extends EspacioDeportivo {

    

    private int capacidadCancha;

    private int cantidadEquipos;

    private double anchoCancha;

    private double largoCancha;

   

    private boolean servicioMantenimiento;

    public CanchaSintetica(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio, String ubicacionEspacio) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio);
    }

    public List<String> serviciosAdicionalesCancha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<String> equiposDisponibles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

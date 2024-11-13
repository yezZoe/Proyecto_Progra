package Espacios;

/**
 * @author reiko
 */

import java.util.ArrayList;
import java.util.List;

public class CanchaSintetica extends EspacioDeportivo {

    /**
     * @param capacidadCancha
     * @param cantidadEquipos
     * @param anchoCancha
     * @param largoCancha
     * @param servicioMantenimiento
     * @param nombreEspacio
     * @param tipoEspacio
     * @param capacidadEspacio
     * @param horarioApertura
     * @param horarioCierre 
     */
    
    public CanchaSintetica(int capacidadCancha, int cantidadEquipos, 
       double anchoCancha, double largoCancha, boolean servicioMantenimiento,
       String nombreEspacio, String tipoEspacio, int capacidadEspacio,
       String horarioApertura, String horarioCierre) {
        
        super(nombreEspacio, tipoEspacio, capacidadEspacio);
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.capacidadCancha = capacidadCancha;
        this.cantidadEquipos = cantidadEquipos;
        this.anchoCancha = anchoCancha;
        this.largoCancha = largoCancha;
        this.servicioMantenimiento = servicioMantenimiento;
    }
    
    private String horarioApertura;
    
    private String horarioCierre;
    
    private int capacidadCancha;

    private int cantidadEquipos;

    private double anchoCancha;

    private double largoCancha;

    private boolean servicioMantenimiento;
    
    /**
     * Muestra los datos para verificar la disponibilidad
     */
    
    public void verDisponibilidadEspacioGym() {
        super.verDisponibilidadEspacio();
        System.out.println("Horario de apertura: " + horarioApertura);
        System.out.println("Horario de cierre: " + horarioCierre);
        System.out.println("Capacidad máxima: " + capacidadCancha);
        System.out.println("Cantidad de equipos: " + cantidadEquipos);
    }
    
    /**
     * lista de servicios adiccionales que posee la cancha sintetica
     * @return 
     */

    public List<String> serviciosAdicionalesCancha() {
        List<String> servicios = new ArrayList<>();
        servicios.add("Iluminación nocturna");
        servicios.add("Vestidores y duchas");
        servicios.add("Área de descanso");
        servicios.add("Alquiler de calzado y balones");
        
        if (servicioMantenimiento) {
            servicios.add("Mantenimiento regular");
        }
        
        return servicios;
    }
    
    /**
     * Lista de materiales o equipoos disponibles en la cancha sintetica
     * @return 
     */

    public List<String> equiposDisponibles() {
        List<String> equipos = new ArrayList<>();
        equipos.add("Balones de fútbol");
        equipos.add("Conos para entrenamiento");
        equipos.add("Redes portátiles");
        
        if (cantidadEquipos > 10) {
            equipos.add("Uniformes adicionales");
            equipos.add("Porterías adicionales");
        }
        
        return equipos;
    }

    /**
     * @return the capacidadCancha
     */
    public int getCapacidadCancha() {
        return capacidadCancha;
    }

    /**
     * @param capacidadCancha the capacidadCancha to set
     */
    public void setCapacidadCancha(int capacidadCancha) {
        this.capacidadCancha = capacidadCancha;
    }

    /**
     * @return the cantidadEquipos
     */
    public int getCantidadEquipos() {
        return cantidadEquipos;
    }

    /**
     * @param cantidadEquipos the cantidadEquipos to set
     */
    public void setCantidadEquipos(int cantidadEquipos) {
        this.cantidadEquipos = cantidadEquipos;
    }

    /**
     * @return the anchoCancha
     */
    public double getAnchoCancha() {
        return anchoCancha;
    }

    /**
     * @param anchoCancha the anchoCancha to set
     */
    public void setAnchoCancha(double anchoCancha) {
        this.anchoCancha = anchoCancha;
    }

    /**
     * @return the largoCancha
     */
    public double getLargoCancha() {
        return largoCancha;
    }

    /**
     * @param largoCancha the largoCancha to set
     */
    public void setLargoCancha(double largoCancha) {
        this.largoCancha = largoCancha;
    }

    /**
     * @return the servicioMantenimiento
     */
    public boolean isServicioMantenimiento() {
        return servicioMantenimiento;
    }

    /**
     * @param servicioMantenimiento the servicioMantenimiento to set
     */
    public void setServicioMantenimiento(boolean servicioMantenimiento) {
        this.servicioMantenimiento = servicioMantenimiento;
    }

    /**
     * @return the horarioApertura
     */
    public String getHorarioApertura() {
        return horarioApertura;
    }

    /**
     * @param horarioApertura the horarioApertura to set
     */
    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    /**
     * @return the horarioCierre
     */
    public String getHorarioCierre() {
        return horarioCierre;
    }

    /**
     * @param horarioCierre the horarioCierre to set
     */
    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }
}

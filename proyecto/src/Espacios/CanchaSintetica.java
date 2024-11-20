package Espacios;

/**
 * @author reiko
 */

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CanchaSintetica extends EspacioDeportivo {

    /**
     * @param capacidadCancha
     * @param cantidadEquipos
     * @param servicioMantenimiento
     * @param nombreEspacio
     * @param tipoEspacio
     * @param capacidadEspacio
     * @param horarioApertura
     * @param horarioCierre 
     * @param tamañoCancha 
     */
    
    public CanchaSintetica(String nombreEspacio, String tipoEspacio,
     int capacidadCancha, int cantidadEquipos, String tamañoCancha,
     LocalTime horarioApertura, LocalTime horarioCierre, int capacidadEspacio,
     int opcionEspacio3, boolean servicioMantenimiento) {
        
        super(nombreEspacio, tipoEspacio, capacidadEspacio);
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.capacidadCancha = capacidadCancha;
        this.cantidadEquipos = cantidadEquipos;
        this.servicioMantenimiento = servicioMantenimiento;
    }
    
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private String tamañoCancha;
    private int capacidadCancha;
    private int cantidadEquipos;
    private boolean servicioMantenimiento;
      SistemaReserva sistema = new SistemaReserva();
    
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

   public void mostrarServiciosAdicionalesCAN() {
        System.out.println(sistema.translate(
                "Additional services in the synthetic field area:",
                "Servicios adicionales en la zona de cancha sintética:",
                "Serviços adicionais na área de gramado sintético:"
        ));
        List<String> servicios = serviciosAdicionalesCAN();
        for (String servicio : servicios) {
            System.out.println("- " + servicio);
        }
    }
    
    /**
     * Lista de materiales o equipoos disponibles en la cancha sintetica
     * @return 
     */

     public void mostrarEquiposDisponibles() {
        System.out.println(sistema.translate(
            "The material equipment of the synthetic field:",
            "Los equipos materiales de la cancha sintética:",
            "O equipamento material do gramado sintético:"
        ));
        List<String> equipos = serviciosAdicionalesCAN();
        for (String equipo : equipos) {
            System.out.println("- " + equipo);
        }
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
    public String getTamañoCancha() {
        return tamañoCancha;
    }

    /**
     * @param tamañoCancha the tamañoCancha to set
     */
    public void setTamañoCancha(String tamañoCancha) {
        this.tamañoCancha = tamañoCancha;
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
    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    /**
     * @param horarioApertura the horarioApertura to set
     */
    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    /**
     * @return the horarioCierre
     */
    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    /**
     * @param horarioCierre the horarioCierre to set
     */
    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }
    
    public List<String> serviciosAdicionalesCAN() {
        List<String> servicios = new ArrayList<>();
        servicios.add(sistema.translate("1.Night lighting", "1.Iluminación nocturna", "1.Iluminação noturna"));
        servicios.add(sistema.translate("2.Dressing rooms and showers", "2.Vestidores y duchas", "2.Vestiários e chuveiros"));
        servicios.add(sistema.translate("3.Rest area", "3.Área de descanso", "3.Área de descanso"));
        servicios.add(sistema.translate("4.Equipment rental", "4.Alquiler de equipo", "4.Aluguel de equipamentos"));
        
        return servicios;
    }
    
     public List<String> equiposDisponibles() {
        List<String> equipos = new ArrayList<>();
        equipos.add(sistema.translate("1.Soccer balls", "1.Balones de fútbol", "1.Bolas de futebol"));
        equipos.add(sistema.translate("2.Training cones", "2.Conos para entrenamiento", "2.Cones de treinamento"));
        equipos.add(sistema.translate("3.Portable nets", "3.Redes portátiles", "3.Redes portáteis"));
        
        return equipos;
    }

    void tamañoCancha() {
        System.out.println(sistema.translate(
            "50 meters long and 30 meters wide",
            "50 metros de longitud y 30 metros de ancho",
            "50 metros de comprimento e 30 metros de largura"
         ));
    }
}

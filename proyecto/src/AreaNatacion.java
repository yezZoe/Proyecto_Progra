
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;


/**
 * Clase que representa un área de natación, derivada de EspacioDeportivo.
 * 
 */


public class AreaNatacion extends EspacioDeportivo {

    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private int capacidadNatacion;
    private double temperaturaAgua;
    private double profundidad;
    private boolean servicioMantenimiento;

    /**
     * Constructor para inicializar un área de natación con nombre, tipo,
     * capacidad, ID y ubicación.
     *
     * @param nombreEspacio Nombre del espacio deportivo.
     * @param tipoEspacio Tipo de espacio deportivo.
     * @param capacidadEspacio Capacidad del espacio deportivo.
     * @param idEspacio Identificador único del espacio deportivo.
     * @param ubicacionEspacio Ubicación del espacio deportivo.
     * @param horarioApertura Hora de apertura del área de natación.
     * @param horarioCierre Hora de cierre del área de natación.
     * @param capacidadNatacion Capacidad específica para el área de natación.
     * @param temperaturaAgua Temperatura del agua del área de natación.
     * @param profundidad Profundidad máxima del área de natación.
     * @param servicioMantenimiento Indica si el área de natación tiene servicio
     * de mantenimiento.
     */
    public AreaNatacion(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio, String ubicacionEspacio,
            LocalTime horarioApertura, LocalTime horarioCierre, int capacidadNatacion, double temperaturaAgua,
            double profundidad, boolean servicioMantenimiento) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio, idEspacio, ubicacionEspacio);
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.capacidadNatacion = capacidadNatacion;
        this.temperaturaAgua = temperaturaAgua;
        this.profundidad = profundidad;
        this.servicioMantenimiento = servicioMantenimiento;
    }

    
    public void ajustarTemperatura(double nuevaTemperatura) {
        this.temperaturaAgua = nuevaTemperatura;
        System.out.println("La temperatura del agua se ha ajustado a: " + nuevaTemperatura + "°C");
    }

    /**
     * Devuelve una lista de servicios adicionales disponibles en el gimnasio.
     *
     * @return Lista de servicios adicionales.
     */
    public List<String> serviciosAdicionalesGym() {
        List<String> servicios = new ArrayList<>();
        servicios.add("Sauna");
        servicios.add("Jacuzzi");
        servicios.add("Entrenador personal");
        return servicios;
    }

    
    public void mostrarProfundidad() {
        System.out.println("La profundidad máxima del área de natación es: " + profundidad + " metros.");
    }

    /**
     * Muestra la disponibilidad del área de natación con información adicional.
     */
    @Override
    public void verDisponibilidadEspacio() {
        super.verDisponibilidadEspacio();
        System.out.println("Horario de apertura: " + horarioApertura);
        System.out.println("Horario de cierre: " + horarioCierre);
        System.out.println("Capacidad máxima de nadadores: " + capacidadNatacion);
    }

   
    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public int getCapacidadNatacion() {
        return capacidadNatacion;
    }

    public void setCapacidadNatacion(int capacidadNatacion) {
        this.capacidadNatacion = capacidadNatacion;
    }

    public double getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public void setTemperaturaAgua(double temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public boolean isServicioMantenimiento() {
        return servicioMantenimiento;
    }

    public void setServicioMantenimiento(boolean servicioMantenimiento) {
        this.servicioMantenimiento = servicioMantenimiento;
    }
}

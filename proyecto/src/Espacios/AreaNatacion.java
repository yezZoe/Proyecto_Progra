package Espacios;

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
    SistemaReserva sistema = new SistemaReserva();

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
     * @param profundidad Profundidad máxima del área de natación.
     * @param servicioMantenimiento Indica si el área de natación tiene servicio
     * de mantenimiento.
     */
    public AreaNatacion(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio, String ubicacionEspacio,
            LocalTime horarioApertura, LocalTime horarioCierre, int capacidadNatacion,
            double profundidad, boolean servicioMantenimiento) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio);
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.capacidadNatacion = capacidadNatacion;
        this.profundidad = profundidad;
        this.servicioMantenimiento = servicioMantenimiento;
    }

    

    

    public void ajustarTemperatura(double nuevaTemperatura) {
        this.temperaturaAgua = nuevaTemperatura;
        System.out.println(sistema.translate(
                "Water temperature adjusted to: " + nuevaTemperatura + "°C.",
                "Temperatura del agua ajustada a: " + nuevaTemperatura + "°C.",
                "Temperatura da água ajustada para: " + nuevaTemperatura + "°C."
        ));
    }

    /**
     * Devuelve una lista de servicios adicionales disponibles en el gimnasio.
     *
     * @return Lista de servicios adicionales.
     */
    public void mostrarServiciosAdicionalesNAT() {
        System.out.println(sistema.translate(
                "Additional swimming area services:",
                "Servicios adicionales del area de natacion:",
                "Serviços adicionais do área de natação:"
        ));
        List<String> servicios = serviciosAdicionalesNAT();
        for (String servicio : servicios) {
            System.out.println("- " + servicio);
        }
    }


    public void mostrarProfundidad() {
        System.out.println(sistema.translate(
            "The maximum depth of the swimming area is: 30 meters.",
            "La profundidad máxima del área de natación es: 30 metros.",
            "A profundidade máxima da área de natação é: 30 metros."
        ));
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

    public List<String> serviciosAdicionalesNAT() {
        List<String> servicios = new ArrayList<>();
        servicios.add(sistema.translate("1.Sauna", 
                "1.Sauna", "1.Sauna"));
        servicios.add(sistema.translate("2.Jacuzzi", 
                "2.Jacuzzi", "2.Jacuzzi"));
        servicios.add(sistema.translate("3.Personal Trainer",
                "3.Entrenador personal", "3.Treinador pessoal"));
        return servicios;
    }
}

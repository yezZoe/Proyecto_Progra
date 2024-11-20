package Espacios;

import java.util.ArrayList;

public class Gym extends EspacioDeportivo {

    private String horarioApertura;
    private String horarioCierre;
    private int capacidadMaxima;
    private int cantidadMaquinas;
    private ArrayList<String> serviciosAdicionales;
    private final SistemaReserva sistema;

    /**
     * Constructor para inicializar un gimnasio.
     *
     * @param nombreEspacio Nombre del gimnasio.
     * @param tipoEspacio Tipo de espacio (en este caso, "Gimnasio").
     * @param capacidadEspacio Capacidad del gimnasio.
     * @param idEspacio Identificador único del gimnasio.
     * @param ubicacionEspacio Ubicación del gimnasio.
     * @param horarioApertura Horario de apertura del gimnasio.
     * @param horarioCierre Horario de cierre del gimnasio.
     * @param capacidadMaxima Capacidad máxima de usuarios.
     * @param cantidadMaquinas Cantidad de máquinas disponibles.
     * @param language
     *.
     */
    
     /**
      * Constructor que inicializa un gimnasio con los datos proporcionados.
     * Este constructor establece el nombre, tipo, capacidad, horarios,
     * cantidad de máquinas y servicios adicionales del gimnasio.
      * 
      */
     
    public Gym(String nombreEspacio, String tipoEspacio, int capacidadEspacio,
            int idEspacio,
            String ubicacionEspacio, String horarioApertura,
            int capacidadMaxima,
            int cantidadMaquinas, String horarioCierre, String language) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio);

        this.horarioApertura = horarioApertura;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadMaquinas = cantidadMaquinas;
        this.horarioCierre = horarioCierre;
        this.serviciosAdicionales = new ArrayList<>();
        this.sistema = new SistemaReserva();

        // Agregar servicios adicionales traducidos
        serviciosAdicionales.add(sistema.translate(
                "2.Social Events", "2.Eventos Sociales",
                "2.Eventos Sociais"));
        serviciosAdicionales.add(sistema.translate(
                "3.Personal Trainer",
                "3.Entrenador personal", "3.Treinador pessoal"));
        serviciosAdicionales.add(sistema.translate(
                "Aulas de Grupo", "Aulas de Grupo", "Aulas de Grupo"));
    }

    /**
     * Muestra la disponibilidad del gimnasio incluyendo horario de apertura,
     * cierre y capacidad.
     */
    @Override
    public void verDisponibilidadEspacio() {
        super.verDisponibilidadEspacio(); // Llamar al método de la clase base

        // Mostrar mensajes traducidos según el idioma 
        System.out.println(sistema.translate(
                "Opening hours 6am"
                , "Horario de apertura 6am"
                , "Horário de abertura 6am") + ": " + horarioApertura);
        System.out.println(sistema.translate(
                "Closing hours 10pm",
                "Horario de cierre 10pm",
                "Horário de fechamento 10pm") + ": " + horarioCierre);
        System.out.println(sistema.translate(
                "Maximum capacity :50 ",
                "Capacidad máxima :50", 
                "Capacidade máxima :50") + ": " + capacidadMaxima);
        System.out.println(sistema.translate(
                "Number of machines :20", 
                "Número de máquinas :20", 
                "Número de máquinas:20") + ": " + cantidadMaquinas);

        // Mostrar los servicios adicionales traducidos
        System.out.println(sistema.translate(
                "Additional services", 
                "Servicios adicionales", "Serviços adicionais") + ":");
        for (String servicio : serviciosAdicionales) {
            System.out.println("- " + servicio);

        }
    }
// Getters y setters
    /**
     * Obtiene el horario de apertura del gimnasio.
     *
     * @return El horario de apertura del gimnasio.
     */

    public String getHorarioApertura() {
        return horarioApertura;
    }

    /**
     * Establece el horario de apertura del gimnasio.
     *
     * @param horarioApertura El nuevo horario de apertura del gimnasio.
     */
    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }
    /**
     * Obtiene el horario de cierre del gimnasio.
     *
     * @return El horario de cierre del gimnasio.
     */

    public String getHorarioCierre() {
        return horarioCierre;
    }
/**
     * Establece el horario de cierre del gimnasio.
     *
     * @param horarioCierre El nuevo horario de cierre del gimnasio.
     */
    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }
/**
     * Obtiene la capacidad máxima del gimnasio.
     *
     * @return La capacidad máxima del gimnasio.
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Establece la capacidad máxima del gimnasio.
     *
     * @param capacidadMaxima La nueva capacidad máxima del gimnasio.
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Obtiene el número de máquinas disponibles en el gimnasio.
     *
     * @return El número de máquinas disponibles.
     */
    public int getCantidadMaquinas() {
        return cantidadMaquinas;
    }
/**
     * Establece el número de máquinas disponibles en el gimnasio.
     *
     * @param cantidadMaquinas La nueva cantidad de máquinas disponibles.
     */
    public void setCantidadMaquinas(int cantidadMaquinas) {
        this.cantidadMaquinas = cantidadMaquinas;
    }
}

package Espacios;


import java.util.ArrayList;
import java.util.List;

public class Gym extends EspacioDeportivo{
    private String horarioApertura;
    private int capacidadMaxima;
    private final List<String> serviciosAdicionales;
    private int cantidadMaquinas;
    private String horarioCierre;
    private String language; // Campo para almacenar el idioma

    /**
     * @author Nicole Leiva 
     * Constructor para inicializar un gimnasio.
     * @param nombreEspacio Nombre del gimnasio.
     * @param tipoEspacio Tipo de espacio (en este caso, "Gimnasio").
     * @param capacidadEspacio Capacidad del gimnasio.
     * @param idEspacio Identificador único del gimnasio.
     * @param ubicacionEspacio Ubicación del gimnasio.
     * @param horarioApertura Horario de apertura del gimnasio.
     * @param capacidadMaxima Capacidad máxima de usuarios.
     * @param cantidadMaquinas Cantidad de máquinas disponibles.
     * @param horarioCierre Horario de cierre del gimnasio.
     * @param language Idioma de la aplicación (por ejemplo, "ingles" o "portugues").
     */
    public Gym(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio,
               String ubicacionEspacio, String horarioApertura, int capacidadMaxima,
               int cantidadMaquinas, String horarioCierre, String language) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio, idEspacio, ubicacionEspacio);
        this.horarioApertura = horarioApertura;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadMaquinas = cantidadMaquinas;
        this.horarioCierre = horarioCierre;
        this.language = language;  // Guardar el idioma seleccionado
        this.serviciosAdicionales = new ArrayList<>();
        
        // Agregar servicios adicionales por defecto
        serviciosAdicionales.add("Aulas de Grupo");
        serviciosAdicionales.add("Eventos Sociales");
        serviciosAdicionales.add("Entrenador Personal");
    }

    /**
     * Muestra la disponibilidad del gimnasio según el idioma seleccionado.
     */
    
    public void verDisponibilidadEspacioGym() {
        super.verDisponibilidadEspacio(); // Llamar al método de la clase base
        
        // Mostrar mensajes según el idioma guardado en 'language'
        if ("ingles".equalsIgnoreCase(language)) {
            System.out.println("Opening hours: " + horarioApertura);
            System.out.println("Closing hours: " + horarioCierre);
            System.out.println("Maximum capacity: " + capacidadMaxima);
            System.out.println("Number of machines: " + cantidadMaquinas);
        } else if ("portugues".equalsIgnoreCase(language)) {
            System.out.println("Horário de abertura: " + horarioApertura);
            System.out.println("Horário de fechamento: " + horarioCierre);
            System.out.println("Capacidade máxima: " + capacidadMaxima);
            System.out.println("Número de máquinas: " + cantidadMaquinas);
        } else {
            // En caso de que no se haya especificado un idioma reconocido
            System.out.println("Unrecognized language. Please select between 'English' or 'Portuguese'.");
        }
    }

    /**
     * Agrega un servicio adicional al gimnasio.
     * @param servicio El servicio adicional a agregar.
     */
    public void agregarServicioAdicional(String servicio) {
        serviciosAdicionales.add(servicio);
    }

    /**
     * Muestra los servicios adicionales del gimnasio.
     * @return Lista de servicios adicionales.
     */
    public List<String> verServiciosAdicionales() {
        return serviciosAdicionales;
    }

    // Getters y setters
    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadMaquinas() {
        return cantidadMaquinas;
    }

    public void setCantidadMaquinas(int cantidadMaquinas) {
        this.cantidadMaquinas = cantidadMaquinas;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public void setLanguage(String language) {
        this.language = language; // Cambiar el idioma directamente
    }
}

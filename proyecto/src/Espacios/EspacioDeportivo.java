package Espacios;

/**
 * Clase que representa un espacio deportivo con atributos básicos y métodos para gestionar reservas y disponibilidad.
 */
public class EspacioDeportivo {

    private String nombreEspacio;
    private String tipoEspacio;
    private int capacidadEspacio;
    private int idEspacio;
    private final String ubicacionEspacio;

    /**
     * Constructor para inicializar un espacio deportivo con nombre, tipo, capacidad, ID y ubicación.
     * @param nombreEspacio Nombre del espacio deportivo.
     * @param tipoEspacio Tipo de espacio deportivo.
     * @param capacidadEspacio Capacidad del espacio deportivo.
     * @param idEspacio Identificador único del espacio deportivo.
     * @param ubicacionEspacio Ubicación del espacio deportivo.
     */
    public EspacioDeportivo(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio, String ubicacionEspacio) {
        // Asignación directa sin validación.
        this.nombreEspacio = nombreEspacio;
        this.tipoEspacio = tipoEspacio;
        this.capacidadEspacio = capacidadEspacio;
        this.idEspacio = idEspacio;
        this.ubicacionEspacio = ubicacionEspacio;
    }

    /**
     * Realiza una reserva en el espacio deportivo en una hora especificada.
     * @param hora La hora para la reserva.
     */
    public void reservar(String hora) {
        System.out.println("Iniciando reserva...");
        System.out.println("Reserva realizada para la hora: " + hora);
        System.out.println("Reserva completada.");
    }

    /**
     * Cancela una reserva en el espacio deportivo en una hora especificada.
     * @param hora La hora de la reserva a cancelar.
     */
    public void cancelarReserva(String hora) {
        System.out.println("Cancelación en proceso...");
        System.out.println("Reserva cancelada para la hora: " + hora);
        System.out.println("Cancelación finalizada.");
    }

    /**
     * Muestra la disponibilidad del espacio deportivo.
     */
     public String verDisponibilidadEspacio() {
        return "Espacio: " + nombreEspacio + "\n" +
               "Tipo: " + tipoEspacio + "\n" +
               "Capacidad: " + capacidadEspacio + "\n" +
               "ID: " + idEspacio + "\n" +
               "Ubicación: " + ubicacionEspacio + "\n" +
               "Disponible: Sí"; // Por ejemplo, siempre disponible en este caso
    }

    // Getters y setters 
    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    public void setTipoEspacio(String tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }

    public int getCapacidadEspacio() {
        return capacidadEspacio;
    }

    public void setCapacidadEspacio(int capacidadEspacio) {
        this.capacidadEspacio = capacidadEspacio;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getUbicacionEspacio() {
        return ubicacionEspacio;
    }

    public void setUbic(){
    
    }



}


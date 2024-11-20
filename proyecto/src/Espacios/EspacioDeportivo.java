package Espacios;

/**
 * Clase que representa un espacio deportivo con atributos básicos y métodos para gestionar reservas y disponibilidad.
 */
public class EspacioDeportivo {

     private String nombreEspacio;
    private String tipoEspacio;
    private int capacidadEspacio;
    private int idEspacio;
    private String ubicacionEspacio;

    /**
     * Constructor para inicializar un espacio deportivo con nombre, tipo, capacidad, ID y ubicación.
     * @param nombreEspacio Nombre del espacio deportivo.
     * @param tipoEspacio Tipo de espacio deportivo.
     */
    
    public EspacioDeportivo(String nombreEspacio, String tipoEspacio, 
            int capacidadEspacio) {
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
    // Métodos getter
    public String getNombreEspacio() { return nombreEspacio; }
    public String getTipoEspacio() { return tipoEspacio; }
    public int getCapacidad() { return capacidadEspacio; }

    @Override
    public String toString() {
        return nombreEspacio + " (" + tipoEspacio + "), Capacidad: " + 
                capacidadEspacio;
    }

    int getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void verDisponibilidadEspacio() {
         
    }

    
    
}
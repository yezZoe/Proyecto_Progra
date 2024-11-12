package Espacios;

public class Gym extends EspacioDeportivo {

    private String horarioApertura;
    private String horarioCierre;
    private int capacidadMaxima;
    private int cantidadMaquinas;

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
     */
    public Gym(String nombreEspacio, String tipoEspacio, int capacidadEspacio, int idEspacio,
            String ubicacionEspacio, String horarioApertura, String horarioCierre,
            int capacidadMaxima, int cantidadMaquinas) {
        super(nombreEspacio, tipoEspacio, capacidadEspacio);
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadMaquinas = cantidadMaquinas;
    }

    /**
     * Muestra la disponibilidad del gimnasio incluyendo horario de apertura,
     * cierre y capacidad.
     */
    public void verDisponibilidadEspacioGym() {
        super.verDisponibilidadEspacio(); // Llama al método de la clase base para mostrar información básica
        System.out.println("Horario de apertura: " + horarioApertura);
        System.out.println("Horario de cierre: " + horarioCierre);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Cantidad de máquinas: " + cantidadMaquinas);
    }

    // Getters y setters
    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
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
}

package Espacios;

import java.time.LocalTime;
import java.util.Date;

/**
 * Clase que representa una reserva en el sistema de reservas.
 */
public class Reserva {

    private int idReserva;
    private String nombreReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private boolean estado;

     public Reserva(int idReserva, String nombreReserva, Date fechaInicio, Date fechaFin, boolean estado) {
        this.idReserva = idReserva;
        this.nombreReserva = nombreReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Reserva(int i, String nombreReserva, Date fechaInicio, Date fechaFin, LocalTime horaInicio, LocalTime horaFin, boolean b) {
        this.idReserva = i;
        this.nombreReserva = nombreReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = b;
    }

     

    // Getters y setters aquí según sea necesario
    public int getIdReserva() { return idReserva; }
    public String getNombreReserva() { return nombreReserva; }
    public Date getFechaInicio() { return fechaInicio; }
    public Date getFechaFin() { return fechaFin; }
    public boolean isEstado() { return estado; }

    // Método para verificar si la reserva está activa
    public boolean validarDisponibilidad() {
        return !estado; // Devuelve true si no está reservada
    }

    @Override
    public String toString() {
        return " Reserva: \n Identificacion de Reserva:  " + idReserva + 
                "\n Nombre de Reserva:  " + nombreReserva + 
                "\n Fecha de Inicio:  " + fechaInicio + 
                "\n Fecha que finaliza:  " + fechaFin +
                "\n Hora de Inicio:  " + horaInicio + 
                "\n Hora que finaliza:  " + horaFin +
                "\n Estado:  " + estado + '}';
    }
    
}
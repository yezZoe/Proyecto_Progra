package Espacios;

import java.util.Date;

/**
 * Clase que representa una reserva en el sistema de reservas.
 */
public class Reserva {

    private int idReserva;
    private String nombreReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean estado;

     public Reserva(int idReserva, String nombreReserva, Date fechaInicio, Date fechaFin, boolean estado) {
        this.idReserva = idReserva;
        this.nombreReserva = nombreReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    Reserva(int i, String nombreReserva, Date fechaInicio, Date fechaFin, Date horaInicio, Date horaFin, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
}
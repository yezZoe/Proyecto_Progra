package Espacios;


import java.util.Date;

public class Reserva {

    private int idReserva;

    private String nombreReserva;

    private Date fechaInicio;

    private Date fechaFin;

    private time horaInicio;

    private time horaFin;

    private boolean estado;
    public static void main(String [] args){
        System.out.println("Hola mundo");
    
    }
    public boolean Reserva(Date date, time horaInicio, time horaFin, boolean estado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getestado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setestado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean validarDisponibilidad() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
}
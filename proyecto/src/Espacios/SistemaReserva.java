package Espacios;

import java.util.ArrayList;
import java.util.List;

public class SistemaReserva {

    private int nivelAcceso;
    private List<Reserva> listaReservas;
    private List<EspacioDeportivo> listaEspaciosDeportivos;

    // Constructor que inicializa las listas de reservas y espacios deportivos
    public SistemaReserva(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
        this.listaReservas = new ArrayList<>();
        this.listaEspaciosDeportivos = new ArrayList<>();
    }

    public SistemaReserva() {
    }

    // Método para agregar un espacio deportivo al sistema
    public void agregarEspacioDeportivo(EspacioDeportivo espacio) {
        listaEspaciosDeportivos.add(espacio);
    }

    // Método para obtener disponibilidad de un recurso dado
    public String obtenerDisponibilidad(String nombreEspacio) {
        for (EspacioDeportivo espacio : listaEspaciosDeportivos) {
            if (espacio.getNombreEspacio().equals(nombreEspacio)) {
                return espacio.verDisponibilidadEspacio();
            }
        }
        return "Espacio no encontrado";
    }

    // Método para gestionar reservas, toma una reserva y la añade a la lista
    public String gestionarReservas(Reserva reserva) {
        listaReservas.add(reserva);
        return "Reserva añadida: " + reserva.toString();
    }

    // Método para ver todas las reservas
    public List<Reserva> verReservas() {
        return listaReservas;
    }

    // Método para realizar acciones administrativas basadas en el nivel de acceso
    public String accionesAdministrativas() {
        if (nivelAcceso > 1) {
            return "Acceso concedido para acciones administrativas.";
        } else {
            return "Acceso denegado. Nivel insuficiente.";
        }
    }

    // Método para cancelar una reserva
    public String cancelarReserva(int reservaId) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getIdReserva() == reservaId) {
                listaReservas.remove(reserva);
                return "Reserva cancelada: " + reservaId;
            }
        }
        return "Reserva no encontrada.";
    }

    // Getter para el nivel de acceso
    public int getNivelAcceso() {
        return nivelAcceso;
    }

    // Setter para el nivel de acceso
    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    // Método que devuelve la lista de espacios deportivos para mostrar en el JFrame
    public List<EspacioDeportivo> getListaEspaciosDeportivos() {
        return listaEspaciosDeportivos;
    }

    // Método que devuelve la lista de reservas para mostrar en el JFrame

    public Object getListaReservas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

package Espacios;


import java.util.List;

public class UsuarioCliente extends Usuario {

    private List<Reserva> historialReservas;

    private String membresia;

    public UsuarioCliente(String nombre, String email, int numeroCelular, int idUsuario, String ingresoPin) {
        super(nombre, email, numeroCelular, idUsuario, ingresoPin);
    }

    public void verHistorial(List<Reserva> listaReservas) {
    }

    public void actualizarDatos() {
    }
}

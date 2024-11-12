package Espacios;

public class Usuario {

    private String nombre;

    private String email;

    private int numeroCelular;

    private int idUsuario;

    private String ingresoPin;

    public boolean iniciarSesion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Usuario(String nombre, String email, int numeroCelular, int idUsuario, String ingresoPin) {
        this.nombre = nombre;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.idUsuario = idUsuario;
        this.ingresoPin = ingresoPin;
    }

    public void cerrarSesion() {
    }
}

package Espacios;

/**
 * Clase que representa un usuario en el sistema de reservas.
 */
public class Usuario {

    private String nombre;
    private String identificacion;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + ", Identificación: " + identificacion;
    }
}

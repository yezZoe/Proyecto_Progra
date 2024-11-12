package Espacios;

/**
 * Clase que representa un administrador en el sistema de reservas.
 */
public class UsuarioAdministrador extends Usuario {
    private String numeroCarnet;

    public UsuarioAdministrador(String nombre, String identificacion, String numeroCarnet) {
        super(nombre, identificacion);
        this.numeroCarnet = numeroCarnet;
    }

    public String getNumeroCarnet() { return numeroCarnet; }

    @Override
    public String toString() {
        return super.toString() + ", Carnet de Administrador: " + numeroCarnet;
    }
}


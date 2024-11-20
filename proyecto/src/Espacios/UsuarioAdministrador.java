package Espacios;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa un administrador en el sistema de reservas.
 * 
 */
public class UsuarioAdministrador extends Usuario {
    private String numeroCarnet;

    /**
     * 
     * @author Nicole Leiva 
     * @param identificacion
     * @param numeroCarnet 
     * // Constructor , Inicializa los atributos heredados (nombre e identificacion) de la clase Usuario
     */
    public UsuarioAdministrador(String nombre, String identificacion, String numeroCarnet) {
        super(nombre, identificacion);
        this.numeroCarnet = numeroCarnet;
    }

    /**
     * Método getter para obtener el número de carnet del administrador.
     * 
     * @return El número de carnet del administrador.
     */
    public String getNumeroCarnet() { 
        return numeroCarnet; 
    }
/**
     * Método {@code toString} modificado para incluir las traducciones del administrador.
     * Este método devuelve una representación en cadena del administrador, 
     * incluyendo el nombre, identificación y número de carnet.
     * 
     * @return Una cadena que representa al administrador con los detalles adicionales.
     */
    public String toString() {
        // Instanciamos el objeto de SistemaReserva
        SistemaReserva sistema = new SistemaReserva();
        
        // Usamos el método translate para traducir el texto al idioma correspondiente
        return super.toString() + ", " +
                sistema.translate("Administrator Card:", "Carnet de Administrador:", "Cartão de Administrador:") + " " + numeroCarnet;
    }
     /**
     * Método para eliminar un espacio deportivo de la lista.
     * @param listaEspaciosDeportivos La lista de espacios deportivos donde se buscará el espacio a eliminar.
     * @param sistema El objeto del sistema de reservas para utilizar las traducciones.
     */
    public void eliminarEspacioDeportivo(List<EspacioDeportivo> listaEspaciosDeportivos, SistemaReserva sistema) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del espacio deportivo a eliminar
        System.out.println(sistema.translate(
                "Enter the name of the sports space to remove:", // English
                "Ingrese el nombre del espacio deportivo a eliminar:", // Español
                "Digite o nome do espaço desportivo para remover:" // Portugués
        ));
        String nombreEspacio = scanner.nextLine();

        // Buscar y eliminar el espacio deportivo en la lista
        EspacioDeportivo espacioAEliminar = null;
        for (EspacioDeportivo espacio : listaEspaciosDeportivos) {
            if (espacio.getNombreEspacio().equalsIgnoreCase(nombreEspacio)) {
                espacioAEliminar = espacio;
                break;
            }
        }

        // Si se encuentra el espacio, eliminarlo
        if (espacioAEliminar != null) {
            listaEspaciosDeportivos.remove(espacioAEliminar);
            System.out.println(sistema.translate(
                    "Sports space removed successfully.", // English
                    "Espacio deportivo eliminado con éxito.", // Español
                    "Espaço desportivo removido com sucesso." // Portugués
            ));
        } else {
            System.out.println(sistema.translate(
                    "Sports space not found.", // English
                    "Espacio deportivo no encontrado.", // Español
                    "Espaço desportivo não encontrado." // Portugués
            ));
        }
    }
}


package Espacios;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Reiko
 */

/**
 * Clase que representa un usuario en el sistema de reservas.
 */
public class Usuario {

    private final String nombre;
    
    private final String identificacion;
    
    private String ingresoPin;
    
    private int intentosFallidos = 0;
    
    private boolean cuentaBloqueada = false;
    
    private final ArrayList<Date> historialSecc = new ArrayList<>();


    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.ingresoPin = ingresoPin;
    }
    
    
    public boolean iniciarSesion(String ingresoPin, String identificacion) {
        
        if (cuentaBloqueada) {
            System.out.println("La cuenta está bloqueada. Intente más tarde.");
            return false;
        }
       
       if (nombre.equals(this.nombre));{
         System.out.println("Nombre de usuario correctamento");
        } 
        
        if (identificacion.equals(this.identificacion));{
         System.out.println("Identificacion de usuario correctamento");
        }
        
        if(this.ingresoPin.equals(ingresoPin)) {  
            System.out.println("Inicio de sesión exitoso");
            historialSecc.add(new Date());
            intentosFallidos = 0;
            return true;
        } else {
            intentosFallidos++;
            System.out.println("ID de usuario o PIN incorrectos");
            
            if (intentosFallidos >= 3) {
                cuentaBloqueada = true;
                System.out.println("Demasiados intentos fallidos. La cuenta ha sido bloqueada.");
            }
            return false;
        }
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada correctamente.");
    }
    
     public void desbloquearCuenta() {
        cuentaBloqueada = false;
        intentosFallidos = 0;
        System.out.println("La cuenta ha sido desbloqueada.");
    }
     
     public void mostrarHistorialInicioSesion() {
        System.out.println("Historial de inicio de sesión:");
        for (Date fecha : historialSecc) {
            System.out.println(fecha);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        return "Usuario: " + getNombre() + ", Identificación: " + getIdentificacion();
    }

    /**
     * @return the ingresoPin
     */
    public String getIngresoPin() {
        return ingresoPin;
    }
}

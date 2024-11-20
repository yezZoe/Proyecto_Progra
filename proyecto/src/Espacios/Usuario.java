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
    private final ArrayList<Date> historialSecc = new ArrayList<>();
    SistemaReserva sistema = new SistemaReserva();


    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.ingresoPin = ingresoPin;
    }
    
    
    public boolean iniciarSesion(String ingresoPin, String identificacion) {
        
       
       if (nombre.equals(this.nombre));{
         System.out.println(sistema.translate(
            "User name correctly",
            "Nombre de usuario correctamente",
            "O nome de usuário está correto"
         ));
        } 
        
        if (identificacion.equals(this.identificacion));{
        System.out.println(sistema.translate(
            "User ID is correct",
            "Identificacion de usuario correctamento",
            "Login de usuário bem-sucedido"
         ));
        }
        
        if(this.ingresoPin.equals(ingresoPin)) {  
           System.out.println(sistema.translate(
            "Successful login",
            "Inicio de sesión exitoso",
            "Login bem-sucedido"
         ));
            historialSecc.add(new Date());
            intentosFallidos = 0;
            return true;
        } else {
            intentosFallidos++;
            System.out.println(sistema.translate(
            "Incorrect User ID or PIN",
            "ID de usuario o PIN incorrectos",
            "ID de usuário ou PIN incorretos"
            ));
            
            if (intentosFallidos >= 3) {
             System.out.println(sistema.translate(
                "Too many failed attempts.",
                "Demasiados intentos fallidos.",
                "Muitas tentativas fracassadas."
             ));
            }
            return false;
        }
    }

     public void mostrarHistorialInicioSesion() {
         System.out.println(sistema.translate(
            "Login history:",
            "Historial de inicio de sesión:",
            "Histórico de login:"
        ));
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
        System.out.println(sistema.translate(
        "Usuario: " + getNombre() + ", Identificación: " + getIdentificacion(),
        "Usuario: " + getNombre() + ", Identificación: " + getIdentificacion(),
        "Usuario: " + getNombre() + ", Identificación: " + getIdentificacion()
        ));
        return null;
    }

    /**
     * @return the ingresoPin
     */
    public String getIngresoPin() {
        return ingresoPin;
    }
}

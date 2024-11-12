package Espacios;


import java.time.LocalDate;
import java.util.List;

public class UsuarioAdministrador extends Usuario {

    private List<String> permissions; // List of permissions
    private LocalDate hireDate; // Hire date
    private String language; // Language parameter

    // Constructor with the language parameter
      public UsuarioAdministrador(String nombre, String email, int numeroCelular,
              int idUsuario, String ingresoPin, 
           List<String> permisos, LocalDate fechaContratacion, String language) {
        super(nombre, email, numeroCelular, idUsuario, ingresoPin);
        this.permissions = permissions;
        this.hireDate = hireDate;
        this.language = language; // Store the language
    }

    // Private method to show messages based on the language
    private void showMessage(String englishMessage, String portugueseMessage) {
        if ("english".equalsIgnoreCase(language)) {
            System.out.println(englishMessage);
        } else if ("portuguese".equalsIgnoreCase(language)) {
            System.out.println(portugueseMessage);
        } else {
            System.out.println("Language not recognized. Please choose either 'english' or 'portuguese'.");
        }
    }

    // Method to add space
    public void addSpace() {
        showMessage("Space added.", "Espaço adicionado.");
    }

    // Method to remove space
    public void removeSpace() {
        showMessage("Space removed.", "Espaço removido.");
    }

    // Method to modify space
    public void modifySpace() {
        showMessage("Space modified.", "Espaço modificado.");
    }

    // Method to view reservations
    public void viewReservations(List<Reserva> reservationList) {
        // Initial message based on the language
        if ("english".equalsIgnoreCase(language)) {
            System.out.println("Viewing reservations:");
        } else if ("portuguese".equalsIgnoreCase(language)) {
            System.out.println("Visualizando reservas:");
        } else {
            System.out.println("Language not recognized. Please choose either 'english' or 'portuguese'.");
        }

        // Display the reservations
        for (Reserva reservation : reservationList) {
            System.out.println(reservation); // Assuming Reserva class has a toString() method
        }
    }

    // Getters and Setters
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language; // Change the language
    }
}

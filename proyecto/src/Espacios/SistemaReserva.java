package Espacios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa el sistema de reservas.
 */
public class SistemaReserva {

    private List<Reserva> listaReservas = new ArrayList<>();
    private List<EspacioDeportivo> listaEspaciosDeportivos = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private int idReservaActual = 1;

    public SistemaReserva() {

        listaEspaciosDeportivos.add(new EspacioDeportivo("Piscina Olímpica", "Natación", 50));
        listaEspaciosDeportivos.add(new EspacioDeportivo("Cancha de Fútbol", "Fútbol", 30));
        listaEspaciosDeportivos.add(new EspacioDeportivo("Gimnasio Principal", "Gimnasia", 20));
    }

    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de usuario:");
        System.out.println("1. Cliente");
        System.out.println("2. Administrador");
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su identificación: ");
        String identificacion = scanner.nextLine();

        if (tipoUsuario == 1) {
            Usuario usuario = new Usuario(nombre, identificacion);
            listaUsuarios.add(usuario);
            System.out.println("Cliente registrado exitosamente.");
        } else if (tipoUsuario == 2) {
            System.out.print("Ingrese su número de carnet: ");
            String numeroCarnet = scanner.nextLine();
            UsuarioAdministrador admin = new UsuarioAdministrador(nombre, identificacion, numeroCarnet);
            listaUsuarios.add(admin);
            System.out.println("Administrador registrado exitosamente.");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void mostrarUsuarios() {
        System.out.println("Usuarios registrados:  ");
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }

    public void crearReserva() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Reservas");
        mostrarEspaciosDisponibles();
        System.out.print("Seleccione el número del espacio deportivo que desea reservar: ");
        int opcionEspacio = scanner.nextInt();
        scanner.nextLine();

        if (opcionEspacio < 1 || opcionEspacio > listaEspaciosDeportivos.size()) {
            System.out.println("Opción inválida.");
            return;
        }

        EspacioDeportivo espacioSeleccionado = listaEspaciosDeportivos.get(opcionEspacio - 1);
        System.out.println("Ha seleccionado: " + espacioSeleccionado.getNombreEspacio());

        System.out.print("Ingrese el nombre de la reserva: ");
        String nombreReserva = scanner.nextLine();
        // Formato para la fecha

        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
            dateFormatter.setLenient(false); // Asegura validación estricta

            // Solicitar fecha de inicio
            System.out.print("Ingrese la fecha de inicio (yyyy/MM/dd): ");
            Date fechaInicio = dateFormatter.parse(scanner.nextLine());
            
            // Solicitar fecha de fin
            System.out.print("Ingrese la fecha de fin (yyyy/MM/dd): " );
            Date fechaFin = dateFormatter.parse(scanner.nextLine());
            
            System.out.println("Fecha de Inicio: " + dateFormatter.format(fechaInicio));
        System.out.println("Fecha que Finaliza: " + dateFormatter.format(fechaFin));
            
            DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
            
            // Solicita la hora de inicio
            System.out.print("Ingrese la hora de inicio (HH:mm, formato militar): ");
            String horaInicioStr = scanner.nextLine().trim(); // Elimina espacios adicionales
            System.out.println("Hora inicio ingresada: " + horaInicioStr); // Debug
            LocalTime horaInicio = LocalTime.parse(horaInicioStr, horaFormatter);

            // Solicita la hora de fin
            System.out.print("Ingrese la hora de fin (HH:mm, formato militar): ");
            String horaFinStr = scanner.nextLine().trim(); // Elimina espacios adicionales
            System.out.println("Hora fin ingresada: " + horaFinStr); // Debug
            LocalTime horaFin = LocalTime.parse(horaFinStr, horaFormatter);

            Reserva nuevaReserva = new Reserva(idReservaActual++, nombreReserva, fechaInicio, fechaFin, horaInicio, horaFin, true);
            listaReservas.add(nuevaReserva);

            System.out.println("Reserva creada con éxito");
            System.out.println("Detalles de la reserva: \n" + nuevaReserva);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
        }

    }

    public void mostrarReservas() {
        System.out.println("Reservas Actuales:");
        if (!listaReservas.isEmpty()) {
            for (Reserva reserva : listaReservas) {
                System.out.println(reserva);
            }
        } else {
            System.out.println("No existe ninguna reserva");
        }

    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("Espacios deportivos disponibles:");
        for (int i = 0; i < listaEspaciosDeportivos.size(); i++) {
            EspacioDeportivo espacio = listaEspaciosDeportivos.get(i);
            System.out.println((i + 1) + ". " + espacio.getNombreEspacio() + " - Tipo: " + espacio.getTipoEspacio() + ", Capacidad: " + espacio.getCapacidad());
        }
    }

    public static void main(String[] args) {
        SistemaReserva sistemaReserva = new SistemaReserva();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Reservas");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Crear Reserva");
            System.out.println("3. Mostrar Usuarios");
            System.out.println("4. Mostrar Reservas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistemaReserva.registrarUsuario();
                    break;
                case 2:
                    sistemaReserva.crearReserva();
                    break;
                case 3:
                    sistemaReserva.mostrarUsuarios();
                    break;
                case 4:
                    sistemaReserva.mostrarReservas();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        }
    }

}

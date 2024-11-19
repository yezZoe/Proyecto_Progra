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
    private String language = "EN";
    

    public SistemaReserva() {

        listaEspaciosDeportivos.add(new EspacioDeportivo("Piscina Olímpica", "Natación", 50));
        listaEspaciosDeportivos.add(new EspacioDeportivo("Cancha de Fútbol", "Fútbol", 30));
        listaEspaciosDeportivos.add(new EspacioDeportivo("Gimnasio Principal", "Gimnasia", 20));
    }
    
    
    private String translate(String en, String es, String pt){
        switch (language) {
            case "ES":
              return es;
            case "Pt":
              return pt;
              
            default:
             return en;
             
        }
    }
    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(translate(
        "Select user type",
        "seleccione el tipo de usuario",
        " Selecione o tipo de usuario:"));
       
        System.out.println("1." + translate("Client", "Cliente"," Cliente"));
        System.out.println("2." + translate("Administrator","Administrador","Administrator"));
        
        
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();

        System.out.print(translate(
                "Enter your name:",
                "Ingrese su nombre:",
                "Digite seu nome"));
        String nombre = scanner.nextLine();

        System.out.print(translate(
                "Enter yuor ID: ",
                "Ingrese su identificación: ",
                "Digite sua identificação: "));
        String identificacion = scanner.nextLine();

        if (tipoUsuario == 1) {
            Usuario usuario = new Usuario(nombre, identificacion);
            listaUsuarios.add(usuario);
            System.out.println(translate(
                    "Client successfully registered.",
                    "Cliente registrado exitosamente.",
                    "Cliente registrado com sucesso."));
        } else if (tipoUsuario == 2) {
            System.out.print(translate(
                    "Enter your admin card number: ",
                    "Ingrese su número de carnet: ",
                    "Digite seu número de cartão: "));
            String numeroCarnet = scanner.nextLine();
            UsuarioAdministrador admin = new UsuarioAdministrador(nombre, identificacion, numeroCarnet);
            listaUsuarios.add(admin);
           System.out.println(translate(
                    "Administrator successfully registered.",
                    "Administrador registrado exitosamente.",
                    "Administrador registrado com sucesso."));
        } else {
            System.out.println(translate(
                    "Invalid option.",
                    "Opción inválida.",
                    "Opção inválida."));

        }
    }

    public void mostrarUsuarios() {
       System.out.println(translate(
                "Available sports spaces:",
                "Espacios deportivos disponibles:",
                "Espaços desportivos disponíveis:"));
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }

    public void crearReserva() {
        Scanner scanner = new Scanner(System.in);

         System.out.println(translate(
                "Welcome to the Reservation System",
                "Bienvenido al Sistema de Reservas",
                "Bem-vindo ao Sistema de Reservas"));
        mostrarEspaciosDisponibles();
      System.out.print(translate(
                "Select the number of the sports space you want to reserve: ",
                "Seleccione el número del espacio deportivo que desea reservar: ",
                "Selecione o número do espaço desportivo que deseja reservar: "));
        int opcionEspacio = scanner.nextInt();
        scanner.nextLine();

        if (opcionEspacio < 1 || opcionEspacio > listaEspaciosDeportivos.size()) {
           System.out.println(translate(
                    "Invalid option.",
                    "Opción inválida.",
                    "Opção inválida."));
            return;
        }

        EspacioDeportivo espacioSeleccionado = listaEspaciosDeportivos.get(opcionEspacio - 1);
       System.out.println(translate(
                "You selected: ",
                "Ha seleccionado: ",
                "Você selecionou: ") + espacioSeleccionado.getNombreEspacio());

        System.out.print(translate(
                "Enter the reservation name: ",
                "Ingrese el nombre de la reserva: ",
                "Digite o nome da reserva: "));
        String nombreReserva = scanner.nextLine();
       

        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
            dateFormatter.setLenient(false); // Asegura validación estricta

           
            System.out.print(translate(
                    "Enter the start date (yyyy/MM/dd): ",
                    "Ingrese la fecha de inicio (yyyy/MM/dd): ",
                    "Digite a data de início (yyyy/MM/dd): "));
            Date fechaInicio = dateFormatter.parse(scanner.nextLine());
            
      
            System.out.print(translate(
                    "Enter the end date (yyyy/MM/dd): ",
                    "Ingrese la fecha de fin (yyyy/MM/dd): ",
                    "Digite a data final (yyyy/MM/dd): "));;
            Date fechaFin = dateFormatter.parse(scanner.nextLine());
            
            System.out.println("Fecha de Inicio: " + dateFormatter.format(fechaInicio));
        System.out.println("Fecha que Finaliza: " + dateFormatter.format(fechaFin));
            
            DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
            
            // Solicita la hora de inicio
                 System.out.print(translate(
                    "Enter the start time (HH:mm, 24-hour format): ",
                    "Ingrese la hora de inicio (HH:mm, formato militar): ",
                    "Digite a hora de início (HH:mm, formato 24 horas): "));
            String horaInicioStr = scanner.nextLine().trim(); // Elimina espacios adicionales
            System.out.println("Hora inicio ingresada: " + horaInicioStr); // Debug
            LocalTime horaInicio = LocalTime.parse(horaInicioStr, horaFormatter);

            // Solicita la hora de fin
             System.out.print(translate(
                    "Enter the end time (HH:mm, 24-hour format): ",
                    "Ingrese la hora de fin (HH:mm, formato militar): ",
                    "Digite a hora final (HH:mm, formato 24 horas): "));
            String horaFinStr = scanner.nextLine().trim(); // Elimina espacios adicionales
            System.out.println("Hora fin ingresada: " + horaFinStr); // Debug
            LocalTime horaFin = LocalTime.parse(horaFinStr, horaFormatter);

            Reserva nuevaReserva = new Reserva(idReservaActual++, nombreReserva,
                    fechaInicio, fechaFin, horaInicio, horaFin, true);
            listaReservas.add(nuevaReserva);

             System.out.println(translate(
                    "Reservation created successfully.",
                    "Reserva creada con éxito.",
                    "Reserva criada com sucesso."));
            System.out.println(translate("Reservation details: ", 
                    "Detalles de la reserva: ", "Detalhes da reserva: ") + "\n" 
                    + nuevaReserva);
        } catch (ParseException e) {
            System.out.println(translate(
                    "Invalid date format.",
                    "Formato de fecha incorrecto.",
                    "Formato de data inválido."));
        }

    }

    public void mostrarReservas() {
        System.out.println(translate(
                "Current reservations:",
                "Reservas actuales:",
                "Reservas atuais:"));
        if (!listaReservas.isEmpty()) {
            for (Reserva reserva : listaReservas) {
                System.out.println(reserva);
            }
        } else {
            System.out.println(translate(
                    "No reservations found.",
                    "No existe ninguna reserva.",
                    "Nenhuma reserva encontrada."));
        }

    }

    public void mostrarEspaciosDisponibles() {
       System.out.println(translate(
                "Available sports spaces:",
                "Espacios deportivos disponibles:",
                "Espaços desportivos disponíveis:"));
        for (int i = 0; i < listaEspaciosDeportivos.size(); i++) {
            EspacioDeportivo espacio = listaEspaciosDeportivos.get(i);
            System.out.println((i + 1) + ". " + espacio.getNombreEspacio() 
                    + " - " + translate("Type", "Tipo", "Tipo") + ": " +
                    espacio.getTipoEspacio() + ", " 
                    + translate("Capacity", "Capacidad", "Capacidade") + ": " 
                    + espacio.getCapacidad());
        }
    }

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Select your language:");
        System.out.println("Seleccione su idioma:");
        System.out.println("Selecione seu idioma:");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.println("3. Português");
        
        
        SistemaReserva sistemaReserva = new SistemaReserva();
        
        System.out.println("Bienvenido al Sistema de Reservas");

        boolean continuar = true;
        while (continuar) {
            
            System.out.println(sistemaReserva.translate(
                    "\nSelect an option:",
                    "\nSeleccione una opción:",
                    "\nSelecione uma opção:"));
            System.out.println("1. " + sistemaReserva.translate("Register User", 
                    "Registrar Usuario", "Registrar Usuário"));
            System.out.println("2. " + sistemaReserva.translate("Create Reservation",
                    "Crear Reserva", "Criar Reserva"));
            System.out.println("3. " + sistemaReserva.translate("Show Users", 
                    "Mostrar Usuarios", "Mostrar Usuários"));
            System.out.println("4. " + sistemaReserva.translate("Show Reservations"
                    , "Mostrar Reservas", "Mostrar Reservas"));
            System.out.println("5. " + sistemaReserva.translate("Exit", "Salir",
                    "Sair"));

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
                     System.out.println(sistemaReserva.translate(
                            "Exiting the system...",
                            "Saliendo del sistema...",
                            "Saindo do sistema..."));
                    break;
                default:
                   System.out.println(sistemaReserva.translate(
                            "Invalid option. Try again.",
                            "Opción inválida. Intente nuevamente.",
                            "Opção inválida. Tente novamente."));
                    break;
            }

        }
    }

}

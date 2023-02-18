import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Usuario implements Asesoria{

Scanner sc = new Scanner(System.in);

    // Atributos
    private String nombre;
    private LocalDate nacimiento;
    private String rut;

    // Constructor vacio

    public Usuario() {
    }

    // Contructor con parámetros
    public Usuario(String nombre, LocalDate nacimiento, String rut, LocalDate fechaActual) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.rut = rut;

    }

    // Getters and Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() < 10 || nombre.length() > 50) {
            System.out.println("Nombre inválido, por favor vuelve a ingresar tu nombre.");
            return;
        }
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return this.nacimiento;
    }

    /**
     * @param nacimiento
     */
    public void setNacimiento(LocalDate nacimiento) {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        System.out.println(fechaFormateada);

        if (nacimiento == null) {
            System.out.println("Fecha inválida, por favor ingresar una fecha válida.");
            return;
        }
        this.nacimiento = nacimiento;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        if (rut.matches("[0-9, kK-]{6,10}")) {
            this.rut = rut;
        } else {
            System.out.println("El RUT ingresado no es válido. Por favor, ingrese un RUT válido.");
            do {
                System.out.print("Ingrese el RUT: ");
                rut = sc.nextLine();
            } while (!rut.matches("[0-9, kK-]{6,10}"));
            this.rut = rut;
        }
    }
/*
 
- analizar Usuario () - Despliega Nombre y Rut.
 */
//Metodos.
 public void mostrarEdad() {
    LocalDate fechaActual = LocalDate.now();
    int edad = Period.between(nacimiento, fechaActual).getYears();
    System.out.println("El usuario tiene" + edad + "años"); 
}
public String analizarUsuario() {
    return "Usuario [Nombre= " + nombre + " \n Rut= " + rut + "]";
}
}
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario implements Asesoria{

    // Atributos
    private String nombre;
    private LocalDate nacimiento;
    private int rut;

    // Constructor vacio

    public Usuario() {
    }

    // Contructor con parámetros
    public Usuario(String nombre, LocalDate nacimiento, int rut, LocalDate fechaActual) {
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

    public int getRut() {
        return this.rut;
    }

    public void setRut(int rut) {
        if (rut < 0 || rut > 99999999) {
            System.out.println("RUT inválido. Por favor ingresa un RUT válido.");
            return;
        }
        this.rut = rut;

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
public void analizarUsuario() {
    System.out.println("Nombre del usuario: " + nombre);
    System.out.println("Rut del usuario: " + rut);
}
}
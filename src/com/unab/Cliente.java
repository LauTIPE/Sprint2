package com.unab;

import java.time.LocalDate;
import java.time.Period;
/**

La clase Cliente representa a un usuario que es cliente de la empresa.
Contiene información personal del usuario, como su nombre, dirección y edad,
así como información específica del cliente, como su número de teléfono,
sistema de salud y AFP. También incluye métodos para establecer y obtener
la información del usuario y para analizar la información del cliente.
*/
import java.util.Scanner;
public class Cliente extends Usuario {

Scanner sc = new Scanner(System.in);

	// atributos
	private String rut = " ";
	private String telefono = " ";
	private String afp = " ";
	private int sistemaSalud = 0;
	private String direccion = " ";
	private String comuna = " ";
	private int edad = 0;

/**
Crea un nuevo objeto Cliente con la información personal y de contacto del usuario.
@param nombre el nombre del cliente
@param apellidos los apellidos del cliente
@param rut el RUT del cliente (debe tener entre 0 y 10 dígitos)
@param telefono el número de teléfono del cliente
@param afp la AFP del cliente
@param sistemaSalud el sistema de salud del cliente (1 para Isapre, 2 para Fonasa, otro número para desconocido)
@param direccion la dirección del cliente
@param comuna la comuna del cliente
@param edad la edad del cliente (se puede establecer más tarde...)
*/
	public Cliente(String nombre, String apellidos, String rut, String telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		//super(nombre, apellidos);
		
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	// Getters and setters
/*
 * Verifica si el RUT ingresado es válido y lo asigna como valor de la propiedad "rut".
 * Si el RUT no es válido, se muestra un mensaje de error y se solicita al usuario que ingrese el RUT nuevamente.
 * @param rut el RUT a verificar y asignar
 */
	public String getRut() {
		return rut;
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
 * verifica  si los datos telefono han sido ingresados, sino los vuelve a pedir
 */

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		do {
            System.out.print("Ingrese su número de teléfono (8 dígitos): +56 9");
            telefono = sc.nextLine();
        } while (telefono.length() != 8);

        System.out.println("Número de teléfono ingresado: +56 9 " + telefono);
    		this.telefono = telefono;
	}

	/*
 * verifica  si los datos AFP han sido ingresados, sino los vuelve a pedir
 */
	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		do {
            System.out.print("Ingrese su AFP (mínimo 4 caracteres, máximo 30): ");
            afp = sc.nextLine();
        } while (afp.length() < 4 || afp.length() > 30);

        System.out.println("AFP ingresada: " + afp);
		
		this.afp = afp;
    }
	/*
 * verifica  si los datos del Sistema de salud han sido ingresados.
 * Sino devuelve el sistema de salud del cliente.
 * @throws IllegalArgumentException si el valor del atributo sistemaSalud no es 1 ni 2
 */
public void getSistemaSalud() {
    // Verifica si el valor del atributo sistemaSalud es 1 o 2
    if (sistemaSalud == 1) {
        System.out.println("Sistema de Salud: Fonasa");
    } else if (sistemaSalud == 2) {
        System.out.println("Sistema de Salud: Isapre");
    } else {
        // Si el valor no es 1 ni 2, lanza una excepción con un mensaje indicando el error
        throw new IllegalArgumentException("Valor incorrecto para sistema de salud");
    }
    return;
}

/**
 * Establece el sistema de salud del cliente.
 * @param sistemaSalud el sistema de salud del cliente, debe ser 1 (Fonasa) o 2 (Isapre)
 * @throws IllegalArgumentException si el valor de sistemaSalud no es 1 ni 2
 */
public void setSistemaSalud(int sistemaSalud) {
    // Verifica si el valor del parámetro sistemaSalud es 1 o 2
    while (sistemaSalud != 1 && sistemaSalud != 2) {
        // Si no es 1 ni 2, solicita al usuario que ingrese un valor válido
        System.out.println("Ingrese un valor válido para sistema de salud (1 para Fonasa, 2 para Isapre): ");
        sistemaSalud = sc.nextInt();
    }
    // Si es así, asigna el valor al atributo sistemaSalud
    this.sistemaSalud = sistemaSalud;
}

public String getDireccion() {
	return comuna;
}
	/**
 * Obtiene la dirección del cliente.
 * @return la dirección del cliente
 */
public void setDireccion(String direccion) {
    // Validación de que la dirección no es nula
    if (direccion == null) {
        throw new IllegalArgumentException("La dirección no puede ser nula");
    }

    // Verificar si la dirección es nula o si supera los 70 caracteres
    if (direccion.trim().isEmpty()) {
        throw new IllegalArgumentException("La dirección no puede estar vacía");
    } else if (direccion.trim().length() > 70) {
        throw new IllegalArgumentException("La dirección no puede superar los 70 caracteres");
    }

    // Asignar la dirección al atributo correspondiente
    this.direccion = direccion;
}


	public String getComuna() {
		return comuna;
	}
/**
 * Obtiene la comuna del cliente.
 * @return la comuna del cliente
 */
	public void setComuna(String comuna) {
		// Validación de que la comuna no es nula
		if (comuna == null) {
			throw new IllegalArgumentException("La comuna no puede ser nula");
		}
		 // Verificar si la comuna es nula o si supera los 70 caracteres
		 if (comuna.trim().isEmpty()) {
			throw new IllegalArgumentException("La comuna no puede estar vacía");
		} else if (comuna.trim().length() > 50) {
			throw new IllegalArgumentException("La comuna no puede superar los 70 caracteres");
		}
	
		// Asignar la comuna al atributo correspondiente
		this.comuna = comuna;
	}
/**
 * Obtiene la edad del cliente.
 * @return la edad del cliente
 */
	public int getEdad() {
		return edad;
	}

/**
 * Establece la edad del paciente.
 * @param edad la edad a establecer
 * @throws IllegalArgumentException si la edad es menor que cero o mayor que 150
 */
public void setEdad(int edad) {
    // Bucle do-while para pedir la edad y verificar si está dentro del rango adecuado
    do {
        // Pedir la edad
        System.out.println("Ingrese la edad (mayor o igual a cero, menor a 150): ");
        String input = sc.nextLine();

        // Verificar si la entrada es un número
        try {
            edad = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número entero.");
            continue;
        }

        // Verificar si la edad está dentro del rango adecuado
        if (edad < 0 || edad >= 150) {
            System.out.println("La edad debe ser mayor o igual a cero y menor a 150.");
        }
    } while (edad < 0 || edad >= 150);

    // Asignar la edad al atributo correspondiente
    this.edad = edad;
}

//metodo analizar usuario
public String analizarUsuario() {
	super.analizarUsuario();
	
		return "Cliente [ Teléfono:" + telefono+ "\n AFP:" + afp + "\n Sistema de salud: " + sistemaSalud + "\n Dirección" + direccion + "\n Comuna" + comuna + "\n Edad" + edad + "]";
	}
		
}
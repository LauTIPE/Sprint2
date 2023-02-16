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
public class Cliente{ //extends Usuario {

	// atributos
	private String rut = " ";
	private double telefono = 0;
	private String afp = " ";
	private int sistemaSalud = 0;
	private String direccion = " ";
	private String comuna = " ";
	private int edad = 0;

/**
Crea un nuevo objeto Cliente con la información personal y de contacto del usuario.
@param nombre el nombre del cliente
@param apellidos los apellidos del cliente
@param rut el RUT del cliente (debe tener entre 0 y 9 dígitos)
@param telefono el número de teléfono del cliente
@param afp la AFP del cliente
@param sistemaSalud el sistema de salud del cliente (1 para Isapre, 2 para Fonasa, otro número para desconocido)
@param direccion la dirección del cliente
@param comuna la comuna del cliente
@param edad la edad del cliente (se puede establecer más tarde...)
*/
	public Cliente(String nombre, String apellidos, String rut, double telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		//super(nombre, apellidos);
		if (rut.matches("[0-9]{6,8}")) {
			this.rut = rut;
		}
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	// Getters and setters

	public String getRut() {
		return rut;
	}
/**
Establece el RUT del cliente.
@param rut el nuevo RUT del cliente (debe tener entre 0 y 9 dígitos)
*/
	public void setRut(String rut) {
		this.rut = rut;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public void getSistemaSalud() {
		if (sistemaSalud == 1) {
			System.out.println("Sistema de Salud: Isapre");
		} else if (sistemaSalud == 2) {
			System.out.println("Sistema de Salud: Fonasa");
		} else {
			System.out.println("Sistema de Salud desconocido");
		}
		return;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}
//metodo calcular edad
	public static int calcularEdad(int año, int mes, int dia) {
		if (año > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
			LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
			LocalDate hoy = LocalDate.now();
			Period periodo = Period.between(fechaNacimiento, hoy);
			return periodo.getYears();
		} else {
			System.out.println("Fecha de nacimiento inválida.");
			return -1;
		}
	}
//metodo set edad
	public void setEdad(int año, int mes, int dia) {
		int edadCalculada = calcularEdad(año, mes, dia);
		if (edadCalculada != -1) {
			this.edad = edadCalculada;
		} else {
			System.out.println("No se pudo establecer la edad.");
		}
	}
//metodo analizar usuario
	public void analizarUsuario() {
	//	super.analizarUsuario();
		System.out.println("Rut:" + rut);
		System.out.println("Teléfono:" + telefono);
		System.out.println("AFP:" + afp);
		System.out.println("Sistema de salud: " + sistemaSalud);
		System.out.println("Dirección" + direccion);
		System.out.println("Comuna" + comuna);
		System.out.println("Edad" + edad);

	}
}
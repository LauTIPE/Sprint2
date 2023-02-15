package com.unab;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Usuario {

	// atributos
	private String rut = "";
	private double telefono = 0;
	private String afp = "";
	private int sistemaSalud = 0;
	private String direccion = "";
	private String comuna = "";
	private int edad = 0;

	public Cliente(String nombre, String apellidos, String rut, double telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		super(nombre, apellidos);
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

	public void setEdad(int año, int mes, int dia) {
		int edadCalculada = calcularEdad(año, mes, dia);
		if (edadCalculada != -1) {
			this.edad = edadCalculada;
		} else {
			System.out.println("No se pudo establecer la edad.");
		}
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Rut:" + rut);
		System.out.println("Teléfono:" + telefono);
		System.out.println("AFP:" + afp);
		System.out.println("Sistema de salud: " + sistemaSalud);
		System.out.println("Dirección" + direccion);
		System.out.println("Comuna" + comuna);
		System.out.println("Edad" + edad);

	}
}
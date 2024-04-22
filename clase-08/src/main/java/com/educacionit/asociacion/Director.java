package com.educacionit.asociacion;

public class Director {
	private String nombre;
	private int experiencia;

	public Director(String nombre, int experiencia) {
		this.nombre = nombre;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public void imprimirDirector() {
		System.out.println("Director - Nombre: " + nombre + ". Experiencia: " + experiencia);
	}
}

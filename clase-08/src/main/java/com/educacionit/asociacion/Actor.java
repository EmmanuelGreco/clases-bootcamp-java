package com.educacionit.asociacion;

public class Actor {
	private String nombre;

	public Actor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void imprimirActor() {
		System.out.println("Actor - Nombre: " + nombre);
	}
}

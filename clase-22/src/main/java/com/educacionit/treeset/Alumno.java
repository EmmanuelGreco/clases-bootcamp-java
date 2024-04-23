package com.educacionit.treeset;

public class Alumno implements Comparable<Alumno> {
	private String nombre;
	private Integer edad;

	public Alumno(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Alumno alumno) {
		int comparacion = this.nombre.compareTo(alumno.getNombre());
		if (comparacion == 0) {
			comparacion = this.edad.compareTo(alumno.getEdad()); // Ascendente
			// comparacion = alumno.getEdad().compareTo(this.edad); // Descendente
		}
		
		return comparacion;
	}
}

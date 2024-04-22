package com.educacionit.asociacion;

public class Pelicula {	
	private String nombre;
	private Director director;
	private Actor[] actores;
	private int cantidadActores = 0;
	
	public Pelicula(String nombre, Director director) {
		this.nombre = nombre;
		this.director = director;
		this.actores = new Actor[3];
		//this.cantidadActores = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Director getDirector() {
		return director;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public void agregarActor(Actor actor) {
	
		if (cantidadActores < actores.length) {
			actores[cantidadActores] = actor;
			cantidadActores++;
		} else {
			System.out.println("Ya se agregaron todos los actores permitidos!");
		}
		/*actores[0] = actor;
		actores[1] = actor;
		actores[2] = actor;*/
	}
	
	public void imprimirPelicula() {
		System.out.println("Pelicula - Nombre: " + nombre);
		director.imprimirDirector();		
		//System.out.println(director.getNombre() + director.getExperiencia());
		
		for (int contador = 0; contador<cantidadActores; contador++) {
			Actor miActor = actores[contador];
			miActor.imprimirActor();
		}
	}
}

package com.educacionit.asociacion;

public class Main {
	/*
	 * Película con sus atributos que permita agregar solo 3 actores.
	 * Director debe tener los atributos: nombre, experiencia.
	 * Actor debe tener el atributo: nombre.
	 * Película debe tener los atributos: nombre, director, actor.
	 */
	public static void main(String[] args) {
		Pelicula unaPelicula = null;

		Director unDirector = null;
		unDirector = new Director("Francis Ford Coppola", 10);

		unaPelicula = new Pelicula("El Padrino I", unDirector);

		Actor actor1 = new Actor("Marlon Brando");
		unaPelicula.agregarActor(actor1);

		Actor actor2 = new Actor("Al Pacino");
		unaPelicula.agregarActor(actor2);

		Actor actor3 = new Actor("Diane Keaton");
		unaPelicula.agregarActor(actor3);

		Actor actor4 = new Actor("James Caan");
		unaPelicula.agregarActor(actor4);

		unaPelicula.imprimirPelicula();
	}
}

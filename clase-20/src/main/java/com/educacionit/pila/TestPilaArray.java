package com.educacionit.pila;

import com.educacionit.pila.exception.NoExisteElementoException;

public class TestPilaArray {

	public static void main(String[] args) throws NoExisteElementoException {
		PilaArray<Integer> miPila = new PilaArray<>(4);
		Integer enteroUno = 30;
		Integer enteroDos = Integer.valueOf(20);
		Integer enteroTres = Integer.valueOf(25);
		Integer enteroCuatro = Integer.valueOf(50);
		Integer enteroCinco = Integer.parseInt("45");
		boolean anadio;

		try {
			anadio = miPila.aniadir(enteroUno);
			System.out.println("Aniadio: " + enteroUno + " " + anadio);
			anadio = miPila.aniadir(enteroDos);
			System.out.println("Aniadio: " + enteroDos + " " + anadio);
			anadio = miPila.aniadir(enteroTres);
			System.out.println("Aniadio: " + enteroTres + " " + anadio);
			anadio = miPila.aniadir(enteroCuatro);
			System.out.println("Aniadio: " + enteroCuatro + " " + anadio);
			anadio = miPila.aniadir(enteroCinco);
			System.out.println("Aniadio: " + enteroCinco + " " + anadio);
			anadio = miPila.aniadir(Integer.valueOf(90));
			System.out.println("Aniadio: " + Integer.valueOf(90) + " " + anadio);

			miPila.mostrarPila();

			Integer valorExtraido = miPila.extraer();
			System.out.println("Valor extraido de la pila: " + valorExtraido);
			Integer primero = miPila.primero();
			System.out.println("Primer elemento aniadido a la pila: " + primero);
			Integer ultimo = miPila.ultimo();
			System.out.println("Último elemento aniadido a la pila: " + ultimo);

			miPila.mostrarPila();
		} catch (NoExisteElementoException excep) {
			System.out.println("Error: " + excep.getMessage());
		}

		System.out.println("---------------------------------------------------------");

		try {
			Integer extraer1 = miPila.extraer();
			System.out.println("Valor extraido de la pila: " + extraer1);
			Integer extraer2 = miPila.extraer();
			System.out.println("Valor extraido de la pila: " + extraer2);
			Integer extraer3 = miPila.extraer();
			System.out.println("Valor extraido de la pila: " + extraer3);

			// Intenta extraer de una pila vacía, salta a excepcion.
			Integer extraer4 = miPila.extraer();
			System.out.println("Valor extraido de la pila: " + extraer4);
		} catch (NoExisteElementoException exex) {
			System.out.println("No pude extraer un elemento de la pila porque esta vacía.");
			System.out.println("Error: " + exex.getMessage());
		}

		miPila.mostrarPila();

		if (miPila.estaVacia()) {
			System.out.println("La pila está vacía.");
		} else {
			System.out.println("La pila no está vacía.");
		}

		anadio = miPila.aniadir(enteroCuatro);
		anadio = miPila.aniadir(enteroCinco);
		anadio = miPila.aniadir(Integer.valueOf(90));
		miPila.mostrarPila();

		if (anadio) {
			System.out.println("La pila no esta vacía.");
		} else {
			System.out.println("La pila esta vacía.");
		}

		Integer primero = null;
		try {
			primero = miPila.primero();
			System.out.println("Primer elemento de la pila: " + primero);
		} catch (NoExisteElementoException excex) {
			System.out.println("No pude recuperar el primer elemento de la pila. Error: " + excex.getMessage());
		}

		Integer ultimo = null;
		try {
			ultimo = miPila.ultimo();
			System.out.println("Último elemento de la pila: " + ultimo);
		} catch (NoExisteElementoException excex) {
			System.out.println("No pude recuperar el último elemento de la pila. Error: " + excex.getMessage());
		}
	}
}

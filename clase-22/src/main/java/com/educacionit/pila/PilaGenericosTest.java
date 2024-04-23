package com.educacionit.pila;

import com.educacionit.pila.exception.NoExisteElementoException;

public class PilaGenericosTest {

	public static void main(String[] args) throws NoExisteElementoException {
		Pila<String> pila = new Pila<>();
		
		pila.aniadir("P1");
		pila.aniadir("P2");
		pila.aniadir("P3");
		
		while(!pila.estaVacia()) {
			System.out.println("Tamano de la pila:" + pila.tamano());
			System.out.println("Primero de la pila: " + pila.primero());
			System.out.println("Extracciòn de la pila: " + pila.extraer() + "\n" );
		}
	}
}

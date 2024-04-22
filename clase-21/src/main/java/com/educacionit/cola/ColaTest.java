package com.educacionit.cola;

public class ColaTest {

	public static void main(String[] args) {
		Cola<String> cola = new Cola<>(5);
		
		cola.encolar("P1");
		cola.encolar("P2");
		cola.encolar("P3");
		
		/*String string1 = cola.desencolar();
		String string2 = cola.desencolar();
		String string3 = cola.desencolar();*/

		System.out.println("El primer elemento de la cola es: " + cola.primero());
		System.out.println("El tamano de la cola es: " + cola.tamano());
				
		while (!cola.estaVacia()) {
		
			String ele = cola.desencolar();
			System.out.println("Elemento: " + ele);			
		}
	}
}

package com.educacionit.cola;

public class ColaTest {

	public static void main(String[] args) {
		Cola<String> cola = new Cola<>();
		
		cola.encolar("P1");
		cola.encolar("P2");
		cola.encolar("P3");
		
		/*String string1 = cola.desencolar();
		String string2 = cola.desencolar();
		String string3 = cola.desencolar();*/

		/*System.out.println("El primer elemento de la cola es: " + cola.primero());
		System.out.println("El tamano de la cola es: " + cola.tamano());*/
				
		while (!cola.estaVacia()) {
			System.out.println("Tamano de la cola: " + cola.tamano());
			System.out.println("Primer elemento: " + cola.primero());
			System.out.println("Elemento desencolado : " + cola.desencolar() + "\n");			
		}
	}
}

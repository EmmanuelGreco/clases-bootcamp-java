package com.educacionit.string;

public class Ejercicio01 {

	public static void main(String[] args) {		
		String miCadena = "Hola Mundo!";
		int longitud;
		longitud = miCadena.length();

		System.out.println("Longitud de la cadena: " + longitud + " caracteres");
		System.out.println("Longitud de la cadena: " + miCadena.length() + " caracteres");
		System.out.println("Posicion del caracter H: " + miCadena.indexOf("H"));
		System.out.println("Posicion de la cadena Mundo: " + miCadena.indexOf("Mundo"));
		
		char posicionChar = miCadena.charAt(1);
		System.out.println("El caracter de la posicion 2 es: " + posicionChar);
		System.out.println("El caracter de la posicion 2 es: " + miCadena.charAt(1));
	}
}

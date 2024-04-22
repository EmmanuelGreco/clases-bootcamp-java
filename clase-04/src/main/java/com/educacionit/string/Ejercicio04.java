package com.educacionit.string;

public class Ejercicio04 {

	public static void main(String[] args) {		
		String miCadena = "-[123]-";
		
		int indiceInicial = miCadena.indexOf('[');
		int indiceFinal = miCadena.indexOf(']');
		System.out.println("IndiceInicial: " + (indiceInicial+1));
		System.out.println("IndiceFinal: " + (indiceFinal-1));
		
		//String cadenaNumerica = miCadena.substring(miCadena.indexOf('['),5)
		String cadenaNumerica = miCadena.substring(2,5);
		System.out.println("Cadena Numerica: " + cadenaNumerica);
	}
}

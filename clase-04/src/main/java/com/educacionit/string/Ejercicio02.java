package com.educacionit.string;

public class Ejercicio02 {

	public static void main(String[] args) {		
		String miCadena = "Apellido, PrimerNombre, SegundoNombre";

		String[] resultadoSplit = miCadena.split(",");

		String apellido = resultadoSplit[0];
		apellido = apellido.toUpperCase();
		System.out.println("El apellido es: " + apellido);
		System.out.println("El apellido es: " + resultadoSplit[0].toUpperCase());

		System.out.println("El primer nombre es: " + resultadoSplit[1].toLowerCase());
		System.out.printf("El primer nombre es: [%s]\n", resultadoSplit[1].toLowerCase());
		System.out.printf("El primer nombre es: [%s] - [%s]\n", resultadoSplit[1].toLowerCase(),
				(resultadoSplit[1].toLowerCase()).trim());

		String segunNombre = resultadoSplit[2];
		segunNombre = segunNombre.trim();
		System.out.printf("El segundo nombre es: \"%s\"", segunNombre);
	}
}

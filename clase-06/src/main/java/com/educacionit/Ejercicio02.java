package com.educacionit;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * Realizar un programa que permita al usuario ingresar por consulta una
	 * oración. El programa debe mostrar cada palabra ingresada con su indice como
	 * se indica abajo:
	 * 
	 * Ingreso: "Esto es una frase"
	 * 
	 * Salida: 1.- Esto 2.- es 3.- una 4.- frase
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una cadena ");
		String cadena = scanner.nextLine();

		String[] arrayPalabras = cadena.split(" ");

		// arrayPalabras.length
		for (int contador = 0; contador < arrayPalabras.length; contador++) {
			System.out.println((contador + 1) + ".- " + arrayPalabras[contador]);

			scanner.close();
		}
	}
}

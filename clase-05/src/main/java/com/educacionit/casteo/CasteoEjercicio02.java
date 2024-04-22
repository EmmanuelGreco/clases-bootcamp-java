package com.educacionit.casteo;

import java.util.Scanner;

public class CasteoEjercicio02 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un valor decimal: ");
		double unDouble = scanner.nextDouble();

		System.out.printf("El valor ingresado es: %.5f\n", unDouble);

		// 1.0 --> No tiene decimales
		// 1.1 --> Si tiene decimales

		// Dado 1.3
		// 1 1.3
		// int unInt = (int) unDouble;

		// 0.3 1.3 - 1
		// double resultado = unDouble - unInt;

		// 0.3 6.3 - 6.0
		// double resultado = unDouble - unInt;

		int parteEntera = (int) unDouble;
		double decimales = unDouble - parteEntera;

		if (decimales > 0) {
			System.out.println("El numero ingresado " + unDouble + "Posee decimales");
		} else {
			System.out.println("El numero ingresado " + unDouble + " No posee decimales");

		}
		scanner.close();
	}
}

package com.educacionit;

import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) {		
		int array[] = new int[3];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese El primer valor entero: ");
		array[0] = scanner.nextInt();

		System.out.println("Ingrese El segundo valor entero: ");
		array[1] = scanner.nextInt();

		System.out.println("Ingrese El tercer valor entero: ");
		array[2] = scanner.nextInt();

		System.out.println("Contenido de la posicion 1 del array: " + array[0]);
		System.out.println("Contenido de la posicion 2 del array: " + array[1]);
		System.out.println("Contenido de la posicion 3 del array: " + array[2]);
		
		//System.out.println("Valor: " + array[0]);
		//System.out.printf("Valor: [%d]", array[0]);
		scanner.close();
	}
}

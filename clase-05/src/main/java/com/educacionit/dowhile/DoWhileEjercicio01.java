package com.educacionit.dowhile;

import java.util.Scanner;

public class DoWhileEjercicio01 {
	/*
	 * Escribir un programa que solicite la carga de un numero entre 0 y 999, e
	 * indique la cantida de digitos del mismo. Finalizar el programa cuando se
	 * cargue el valor 0
	 */
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int valor;

		do {
			System.out.println("Ingrese un valor entre 1 y 999 (0 finaliza): ");
			valor = scanner.nextInt();

			if (valor < 0 || valor > 999) {
				continue;

			}
			if (valor >= 100 && valor <= 999) {
				System.out.println("El numero ingresado tiene 3 digitos");
			} else if (valor >= 10) {
				System.out.println("El numero ingresado tiene 2 digitos");
			} else if (valor >= 0) {
				System.out.println("El numero ingresado tiene 1 digito");
			}

		} while (valor != 0);

		System.out.println("Fin");
		scanner.close();
	}
}

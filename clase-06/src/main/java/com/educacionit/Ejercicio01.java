package com.educacionit;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		double base = 0;
		int exponente = 0;
		
		Scanner scanner = new Scanner(System.in);		
		
		do {
			System.out.println("Ingrese la base (0 termina): ");
			base = scanner.nextDouble();
			if (base == 0) {
				continue;
			}
			
			System.out.println("Ingrese el exponente (0 termina)");
			exponente = scanner.nextInt();
			if (exponente == 0) {
				break;
			}
			
			//double resultado=base;
			double resultado=1;
			for (int contador=0; contador<exponente; contador++) {
				resultado = resultado * base;
			}
			
			System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
			
		} while (base != 0 && exponente != 0);
		
		System.out.println("Fin Main");
		scanner.close();
	}	
}

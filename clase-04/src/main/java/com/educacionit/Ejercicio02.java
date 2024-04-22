package com.educacionit;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese los grados: ");
		double grados = scanner.nextDouble();
		
		//F = 32 + ( 9 * C / 5)
		double gradosF = 32 + ( 9 * grados / 5);
		
		System.out.println("Los grados C " + grados + " corresponden a F: " + gradosF);
		
		scanner.close();
	}
}

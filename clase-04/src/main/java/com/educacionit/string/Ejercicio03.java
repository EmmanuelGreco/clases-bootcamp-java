package com.educacionit.string;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese primer cadena");
		String primerCadena = scanner.nextLine();
		
		System.out.println("Ingrese segunda cadena");
		String segundaCadena = scanner.nextLine();
		
		System.out.println("Longitud primerCadena: " + primerCadena.length());
		System.out.println("Longitud segundaCadena: " + segundaCadena.length());
		
		if (primerCadena.isEmpty() || primerCadena.isBlank()) {
			System.out.println("La primer cadena ingresada tiene longitud 0 o esta toda en blanco");
		}
		
		if (segundaCadena.isEmpty() || primerCadena.isBlank()) {
			System.out.println("La segunda cadena ingresada tiene longitud 0 o esta toda en blanco");
		}
		
		scanner.close();		
	}
}

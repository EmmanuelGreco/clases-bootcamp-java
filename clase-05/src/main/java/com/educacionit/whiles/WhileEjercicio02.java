package com.educacionit.whiles;

import java.util.Scanner;

public class WhileEjercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de numeros a leer por teclado: ");
		int CantidadDeNumerosAIngresar = scanner.nextInt();
		int ContadorNumerosIngresados = 0;
		int ContadorMayoresQueCero = 0;
		int ContadorMenoresQueCero = 0;
		int ContadorIgualesACero = 0;
	
		while (ContadorNumerosIngresados < CantidadDeNumerosAIngresar) {
			System.out.println("Ingreso " + (ContadorNumerosIngresados+1) + ". Ingrese valor");
			int NumeroIngresado = scanner.nextInt();
			
			if (NumeroIngresado > 0) {
				ContadorMayoresQueCero++;
			} else if (NumeroIngresado<0) {
				ContadorMenoresQueCero++;
			} else {
				ContadorIgualesACero++;
			}
				ContadorNumerosIngresados++;		
		}
		
		System.out.println("Cantidad de numeros mayores que cero: " + ContadorMayoresQueCero);
		System.out.println("Cantidad de numeros menores que cero: " + ContadorMenoresQueCero);
		System.out.println("Cantidad de numeros iguales a cero: " + ContadorIgualesACero);		
		scanner.close();
	}
}

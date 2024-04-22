package com.educacionit.math;

import java.util.Scanner;

public class MathEjercicio01 {
	/* Realizar un programa que solicite el ingreso de un valor (r),
	 * correspondiente al radio de un círculo. Luego se debera calcular su área.
	 * 
	 * Area del circulo: Area = * r2
	 */	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el radio de un circulo");
		double valorRadio = scanner.nextDouble();
		
		double areaCirculo = Math.PI * Math.pow(valorRadio, 2);
		System.out.printf("El area del circulo con radio %.2f es : %5f\n", valorRadio , areaCirculo);		
		
		scanner.close();
	}
}

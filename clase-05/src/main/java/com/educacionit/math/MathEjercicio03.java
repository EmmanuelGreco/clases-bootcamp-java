package com.educacionit.math;

public class MathEjercicio03 {

	public static void main(String[] args) {
		// Raiz cuadrada
		double unDouble = 9.0;
		double resultado = Math.sqrt(unDouble);
		System.out.println("Raiz cuadrada de " + unDouble + " es: " + resultado);

		// Raiz cubica
		unDouble = 27;
		double resultado2 = Math.cbrt(unDouble);
		System.out.println("Raiz cubica de " + unDouble + " es: " + resultado2);
	}
}

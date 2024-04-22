package com.educacionit.funproc;

public class Ejerciocio02 {
	// Imprimir números comprendidos entre 3 y 5.
	public static void main(String[] args) {
		int numeroA = 5;
		int numeroB = 3;
		
		imprimirNumeros(numeroA, numeroB);
		//imprimirNumeros(5, 3);
	}
									//(    5,     3)
	public static void imprimirNumeros(int a, int b) {
		// 3, 4, 5
		int minimo;
		int maximo;
		maximo = Math.max(a, b);
		minimo = Math.min(b, a);
		
		for (int contador = minimo; contador <= maximo; contador++) {
			System.out.print(contador + " ");
		}		
	}
}

package com.educacionit.funproc;

public class Ejercicio01 {

	public static void main(String[] args) {
		int valorA = 3;
		int valorB = 2;
		int valorC = 1;
		int resultado;

		resultado = calcularMaximo(valorA, valorB, valorC);		
		System.out.println("Valor de retorno de la funcion: " + resultado);
		
		System.out.println("Valor de retorno de la funcion: " + calcularMaximo(valorA, valorB, valorC));				
	}	
								  //(    3,     2,     1)
	public static int calcularMaximo(int a, int b, int c) {
		int retorno = -1;
		
		if (a>b && a>c) {
			//return a;
			retorno = a;
		} else if (b>a && b>c) {
			//return b;
			retorno = b;
		} else {
			//return c;
			retorno = c;
		}
			
		return retorno;
	}
}

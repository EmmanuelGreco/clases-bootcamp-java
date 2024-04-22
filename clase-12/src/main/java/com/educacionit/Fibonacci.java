package com.educacionit;

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci(2);
	}
	
	private static void fibonacci(int terminos) {
		int primerTermino = 0;
		int segundoTermino = 1;
		
		if (terminos == 1) {
			System.out.println(primerTermino);
			return;
		}
		
		if (terminos == 2) {
			System.out.println(primerTermino);
			System.out.println(segundoTermino);
			return;
		}
		
		System.out.println(primerTermino);
		System.out.println(segundoTermino);
		
		for (int contador = 3; contador <= terminos; contador ++) {
			int nuevoElemento= primerTermino + segundoTermino;
			System.out.println(nuevoElemento);
			primerTermino = segundoTermino;
			segundoTermino = nuevoElemento;
		}
	}	
}

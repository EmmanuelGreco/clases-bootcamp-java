package com.educacionit.math;

public class MathEjercicio02 {

	public static void main(String[] args) {
		double unDouble = 4.5;
		double resultado;
		
		resultado = Math.ceil(unDouble);
		System.out.println("ceil: " + resultado);
		
		resultado = Math.floor(unDouble);
		System.out.println("floor: " + resultado);
	
		resultado = Math.round(unDouble);
		System.out.println("round: " + resultado);
	}
}

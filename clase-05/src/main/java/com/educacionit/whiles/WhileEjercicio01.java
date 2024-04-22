package com.educacionit.whiles;

public class WhileEjercicio01 {

	public static void main(String[] args) {
		int contador = 1;
		
		while (contador<=10 && contador>-1000)
		{System.out.println("Valor del contador: " + contador);
		contador++; // contador = contador + 1;
		}
		
		System.out.println("Fin");
		
		while (true)
		{
		System.out.println("No termina");
		}		
	}
}

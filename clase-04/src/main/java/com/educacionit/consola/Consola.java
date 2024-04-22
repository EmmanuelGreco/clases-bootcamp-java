package com.educacionit.consola;

public class Consola {
	
	public static void main(String[] args) {
		
		System.out.println("La cantidad de parametro recibidos son: " + args.length);
		
		if (args.length == 1) {
			System.out.println("out - Se llamo con un solo parametros: " + args[0]);
			System.err.println("err - Se llamo con un solo parametros: " + args[0]);
		} else if (args.length ==0) {
			System.out.println("Se llamo sin parametros");
			System.err.println("Se llamo sin parametros");
		}		
	}
}

package ar.educacionit.arrays;

public class Ejercicio_01 {

	public static void main(String[] args) {		
		int CantidadDePosiciones = args.length;
		System.out.println("Cantidad de argumentos pasados al programa main: " + CantidadDePosiciones);
		
		String miVar = args[0];
		
		System.out.println("Primer argumento: " + args[0]);
		System.out.println("Segundo argumento: " + args[1]);
		System.out.println("Contenido de miVar: " + miVar);
	}
}

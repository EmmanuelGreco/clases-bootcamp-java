package ar.educacionit.arrays;

public class Ejercicio_01B {

	public static void main(String[] args) {
		
		if (args.length ==3) {
			System.out.println("Valor de la posicion1: " + args[0]);
			System.out.println("Valor de la posicion2: " + args[1]);
			System.out.println("Valor de la posicion3: " + args[2]);
		} else {
			System.out.println("Debe ejecutar el programa con 3 argumentos");
			//Help
		}
	}
}

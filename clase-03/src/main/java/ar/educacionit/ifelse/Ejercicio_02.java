package ar.educacionit.ifelse;

public class Ejercicio_02 {

	public static void main(String[] args) {
		char unCaracter = '-';
		
		if (unCaracter >= 'A' && unCaracter <= 'Z' ) { //Es un caracter Mayuscula
			System.out.println("El caracter " + unCaracter + " es una letra mayuscula");
		} else if (unCaracter >= 97 && unCaracter <=120) {
			System.out.println("El catacter " + unCaracter + " es una letra miniscula");
		} else {
			System.out.println("El caracter " + unCaracter + " no es una letra");
		}
	}
}

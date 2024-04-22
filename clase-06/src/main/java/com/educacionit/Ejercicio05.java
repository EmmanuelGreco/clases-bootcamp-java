package com.educacionit;

public class Ejercicio05 {

	public static void main(String[] args) {
		String unaCadena = "x87y5z";
		char[] arrayChar = new char[unaCadena.length()];
		int indiceNuevoArray = 0;
		
		//unaCadena.lenght();
		for (int contadorCadena=0; contadorCadena < unaCadena.length(); contadorCadena++) {	
			char unCaracter = unaCadena.charAt(contadorCadena);
			
			//if (unCaracter >= 48 && unCaracter <= 57) {
			if (unCaracter >= '0' && unCaracter <= '9') {
				arrayChar[indiceNuevoArray] = unCaracter;
				indiceNuevoArray++;
			}
		}
		
		System.out.println("Cadena original: " + unaCadena + " - Resultado: " + new String(arrayChar));
		System.out.println("La longitud del array resultante es: " + indiceNuevoArray);
	}
}

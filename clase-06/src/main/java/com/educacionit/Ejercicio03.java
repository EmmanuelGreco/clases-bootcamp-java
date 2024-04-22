package com.educacionit;

public class Ejercicio03 {

	public static void main(String[] args) {
		String cadena = "Ho5la";
		//String todoMayuscula = cadena.toUpperCase();
		
		//System.out.println("Original: " + cadena + "- toUpperCase: " + todoMayuscula);
		
		char[] toUpperCase = new char [cadena.length()];
		
		for (int contador = 0; contador < cadena.length(); contador++) {
			char unCaracter = cadena.charAt(contador);
			
			if (unCaracter >= 'a' && unCaracter <= 'z') {
				toUpperCase[contador] = (char)(unCaracter -32);
			} else { 
				toUpperCase[contador] = unCaracter;
			}				
		}
					
		System.out.println(new String (toUpperCase));		

		String cadena2 = "hO5LA";
		//String todoMayuscula = cadena.toUpperCase();
		
		//System.out.println("Original: " + cadena + "- toUpperCase: " + todoMayuscula);
		
		char [] toLowerCase = new char [cadena2.length()];
		
		for (int contador = 0; contador < cadena2.length(); contador++) {
			char unCaracter = cadena2.charAt(contador);
			
			if (unCaracter >= 'A' && unCaracter <= 'Z') {
				toLowerCase[contador] = (char)(unCaracter +32);
			} else { 
				toLowerCase[contador] = unCaracter;
			}			
		}
					
		System.out.println(new String (toLowerCase));
	}	
}

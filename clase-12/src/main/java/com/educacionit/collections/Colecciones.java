package com.educacionit.collections;

import java.util.Arrays;
import java.util.Collections;

public class Colecciones {

	public static void main(String[] args) {

		String cadenaInicial = "esto es una cadena inicial";

		String [] arrayCadenaInicial = cadenaInicial.split(" "); //{"esto", "es", "una", "cadena", "inicial"}
			
		System.out.println("Cantida de palabras de la cadena inicial: " + arrayCadenaInicial.length + " palabras");
		
		String arrayParaImprimir = Arrays.toString(arrayCadenaInicial);
		System.out.println("Array de String antes de ordenar: " + arrayParaImprimir);
		
		Arrays.sort(arrayCadenaInicial); //Modifica el array arrayCadenaInicial
		arrayParaImprimir = Arrays.toString(arrayCadenaInicial);
		System.out.println("Array de String después de ordenar: " + arrayParaImprimir);
		
		// Ordenar de forma descendente
		Arrays.sort(arrayCadenaInicial, Collections.reverseOrder());
		System.out.println("Array de String ordenando de forma descendente: " + Arrays.toString(arrayCadenaInicial));		
	}
}

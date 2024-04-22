package com.educacionit;

public class Ejercicio06 {

	public static void main(String[] args) {
		char[] arrayUno = {'H', 'o', 'l', 'a'};
		int[] arrayDos = {' ', 'M', 'u', 'n', 'd', 'o'};
		char[] arrayResultado = new char[arrayUno.length + arrayDos.length];
		int indiceArrayResultado = 0;
		
		for (int indice=0; indice<arrayUno.length; indice++) {
			arrayResultado[indiceArrayResultado] = arrayUno[indice];
			indiceArrayResultado++;
		}
		
		for (int indice=0; indice <arrayDos.length; indice++) {
			arrayResultado[indiceArrayResultado] = (char) arrayDos[indice];
			indiceArrayResultado++;
		}
			
		System.out.println(new String(arrayResultado));		
	}
}

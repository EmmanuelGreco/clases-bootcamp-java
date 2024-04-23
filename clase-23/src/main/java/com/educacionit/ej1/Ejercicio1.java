package com.educacionit.ej1;

import java.io.File;

public class Ejercicio1 {

	private static String RUTA_BASE = "src/main/resources";
	
	public static void main(String[] args) {

		File file = new File("src/main/resources");
		
		String [] listaDirectorio = file.list();
		for (String unaEntrada : listaDirectorio) {
			System.out.println("Procesando la entrada " + unaEntrada);
			mostrarEntrada(unaEntrada);
		}
	}

	public static void mostrarEntrada(String unaEntrada) {
		
		File unFile = new File(RUTA_BASE + "/" + unaEntrada);
		
		if (unFile.isFile()) { // Es un archivo
			System.out.println("El archivo " + unaEntrada + ((unFile.canRead())?" Se puede leer":" No se puede leer"));
			System.out.println("El archivo " + unaEntrada + ((unFile.canWrite())?" Se puede escribir":" No se puede escribir"));
			System.out.println("El archivo " + unaEntrada + ((unFile.canExecute())?" Se puede ejecutar":" No se puede ejecutar"));
			System.out.println("El archivo " + unaEntrada + ((unFile.isHidden())?" Es un archivo oculto":" No es un archivo oculto"));
			
		} else if (unFile.isDirectory()) { // Es un directorio
			String[] lista = unFile.list();
			for (String entradaDirectorio : lista) {
				System.out.println("En el directorio " + unaEntrada + ". Tiene: " + entradaDirectorio);
			}		
		} else {
			System.out.println("No es posible determinar que es " + unaEntrada);
		}
	}
}

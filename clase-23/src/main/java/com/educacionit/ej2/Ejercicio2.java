package com.educacionit.ej2;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static String NOMBRE_ARCHIVO = "src/main/resources/alumnos.csv";

	public static void main(String[] args) throws IOException {		
		Scanner scannerMain = new Scanner(System.in);
		AltaAlumno alumno = new AltaAlumno(NOMBRE_ARCHIVO);
		int opcion;
		
		do {
			System.out.println("1.- Ingresar un Alumno");
			System.out.println("2.- Salir");
			opcion = scannerMain.nextInt();
			
			if (opcion == 1) {
				alumno.agregarAlumno();				
			}
			
		} while (opcion == 1);		
		
		alumno.close();
		scannerMain.close();
	}
}

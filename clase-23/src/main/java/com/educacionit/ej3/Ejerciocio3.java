package com.educacionit.ej3;

import java.util.Scanner;

public class Ejerciocio3 {

	private static String RUTA_ARCHIVO = "src/main/resources/alumnos.csv";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		ConsultaAlumno alumnos = new ConsultaAlumno(RUTA_ARCHIVO);

		do {
			System.out.println("1.- Consultar Legajo: ");
			System.out.println("2.- Salir: ");
			opcion = scanner.nextInt();
			
			if (opcion == 1) {
				System.out.println("Ingrese el legajo a consultar: ");
				Integer legajo = scanner.nextInt();

				try {
					Alumno unAlumno = alumnos.consultar(legajo);
					System.out.println("El alumno consultado con legajo " + legajo + " es: " + unAlumno);
					
				} catch (Exception ex) {
					System.out.println("El alumno con legajo " + legajo + " No Existe!");
				}
			}
		} while (opcion != 2);

		System.out.println("FIN");
		scanner.close();
	}
}

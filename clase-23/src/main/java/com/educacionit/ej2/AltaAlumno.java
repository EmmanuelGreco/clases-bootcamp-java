package com.educacionit.ej2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AltaAlumno {
	
	private FileWriter writer;	
			
	public AltaAlumno(String nombreArchivo) throws IOException {
		super();
		writer = new FileWriter(nombreArchivo);
	}

	public void agregarAlumno() {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese legajo. ");
		Integer legajo = scanner.nextInt();
		
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		
		System.out.println("Ingrese edad: ");
		Integer edad = scanner.nextInt();
		
		guardarAlumno(legajo, nombre, apellido, edad);
		
		//scanner.close(); // No se utilizar porque usamos System.in.
	}
	
	private void guardarAlumno(Integer legajo, String nombre, String apellido, Integer edad) {
		try {
			String registro = legajo + "," + nombre + "," + apellido + "," + edad + "\n";
			writer.write(registro);
			//writer.flush();						
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void close() throws IOException {
		writer.close();
	}	
}

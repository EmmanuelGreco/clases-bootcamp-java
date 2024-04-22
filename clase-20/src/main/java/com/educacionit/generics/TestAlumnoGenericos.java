package com.educacionit.generics;

public class TestAlumnoGenericos {

	public static void main(String[] args) {
		Alumno<String, Double> alumno1 = new Alumno<String, Double>();
		
		alumno1.setLegajo("LEG123");
		alumno1.setPromedio(7.5);

		Alumno<Integer, Long> alumno2 = new Alumno<Integer, Long>();
		alumno2.setLegajo (Integer.valueOf(1234));
		alumno2.setPromedio(Long.valueOf(8));
		
		System.out.println("Alumno 1\nLegajo: " + alumno1.getLegajo() + "\nPromedio: " + alumno1.getPromedio());
		System.out.println();
		System.out.println("Alumno 1\nLegajo: " + alumno2.getLegajo() + "\nPromedio: " + alumno2.getPromedio());
	}
}

package com.educacionit.treeset;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {
		Set<String> coleccion = new TreeSet<>();
		coleccion.add("B");
		coleccion.add("C");
		coleccion.add("A");
		System.out.println(coleccion);
		
		Set<Alumno> alumnos = new TreeSet<>();
		
		alumnos.add(new Alumno("B", 30));
		alumnos.add(new Alumno("A", 20));
		alumnos.add(new Alumno("C", 10));
		alumnos.add(new Alumno("C", 99));
		alumnos.add(new Alumno("C", 30));
		alumnos.add(new Alumno("A", 20));
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}		
	}
}

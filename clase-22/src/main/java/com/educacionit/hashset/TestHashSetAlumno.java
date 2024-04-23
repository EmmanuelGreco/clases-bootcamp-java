package com.educacionit.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSetAlumno {

	public static void main(String[] args) {		
		Set<Alumno> alumnos = new HashSet<>();
		
		alumnos.add(new Alumno("A", 10));
		alumnos.add(new Alumno("B", 20));
		alumnos.add(new Alumno("C", 30));
		
		System.out.println(alumnos);
		alumnos.add(new Alumno("C", 30));
		System.out.println(alumnos);
		
		boolean contiene = alumnos.contains(new Alumno("C", 30));
		System.out.println("Contiene al alumno " + contiene);

		for (Iterator<Alumno> iterator = alumnos.iterator(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			Alumno alumno = (Alumno) iterator.next();
		}
		
		Set<Alumno> linkedHash = new LinkedHashSet<>();
		linkedHash.add(new Alumno("A", 10));
		linkedHash.add(new Alumno("B", 20));
		linkedHash.add(new Alumno("C", 30));
		System.out.println(linkedHash);
	}
}

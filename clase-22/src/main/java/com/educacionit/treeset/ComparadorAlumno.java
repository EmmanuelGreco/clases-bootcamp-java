package com.educacionit.treeset;

import java.util.Comparator;

public class ComparadorAlumno implements Comparator<Alumno> {

	@Override
	public int compare(Alumno alumno1, Alumno alumno2) {
		int comparacion = -1;
		
		comparacion = alumno1.getNombre().compareTo(alumno2.getNombre());
		
		if (comparacion == 0) {
			comparacion = alumno1.getEdad().compareTo(alumno2.getEdad());
		}
		
		return comparacion;		
	}
}

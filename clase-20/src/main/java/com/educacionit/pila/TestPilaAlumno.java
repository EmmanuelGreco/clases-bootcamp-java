package com.educacionit.pila;

import com.educacionit.pila.exception.NoExisteElementoException;

public class TestPilaAlumno {

	public static void main(String[] args) throws NoExisteElementoException {
		PilaArray<String> pilaString = new PilaArray<>(3);
		pilaString.aniadir("Un Valor");
		pilaString.mostrarPila();

		try {
			pilaString.extraer();
			pilaString.mostrarPila();
		} catch (NoExisteElementoException excep) {
			excep.printStackTrace();
		}

		System.out.println("---------------------------");
		PilaArray<Float> pilaNumeros = new PilaArray<>(3);
		Float unFloat = Float.valueOf(9);
		pilaNumeros.aniadir(unFloat);
		pilaNumeros.mostrarPila();
		
		try {
			unFloat = pilaNumeros.extraer();
			pilaNumeros.mostrarPila();
		} catch (NoExisteElementoException excec) {
			excec.printStackTrace();
		}

		System.out.println("---------------------------");
		PilaArray<Alumno> pilaAlumno = new PilaArray<>(3);
		Alumno unAlumno = new Alumno("Juan", 30);
		pilaAlumno.aniadir(unAlumno);
		pilaAlumno.mostrarPila();

		try {
			unAlumno = pilaAlumno.extraer();
			pilaNumeros.mostrarPila();
		} catch (NoExisteElementoException excex) {
			excex.printStackTrace();
		}
	}
}

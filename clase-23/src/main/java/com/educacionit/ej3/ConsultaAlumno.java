package com.educacionit.ej3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ConsultaAlumno {
	// Estructura en memoria que guarda Alumnos
	HashMap<Integer, Alumno> mapaAlumnos = new HashMap<>();

	public ConsultaAlumno(String file) {
		super();
		preProcesamiento(file);
	}

	public Alumno consultar(Integer legajo) throws Exception {

		if (!mapaAlumnos.containsKey(legajo)) {
			throw new Exception("El alumno con legajo " + legajo + " No Existe!");
		}

		Alumno alumnoconsultado = mapaAlumnos.get(legajo);

		return alumnoconsultado;
	}

	private void preProcesamiento(String file) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			String str;

			while ((str = reader.readLine()) != null) {

				// Cortamos el registro en campos
				String[] campos = str.split(",");
				Alumno unAlumno = new Alumno();

				// Creacion de Alumno en base al registro de campos
				unAlumno.setLegajo(Integer.valueOf(campos[0]));
				unAlumno.setNombre(campos[1]);
				unAlumno.setApellido(campos[2]);
				unAlumno.setEdad(Integer.valueOf(campos[3]));

				// Guardar el Alumno en el mapa
				mapaAlumnos.put(unAlumno.getLegajo(), unAlumno);
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

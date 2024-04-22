package com.educacionit.ejinstanceof;

public class Medico {
	private String nombre;

	public Medico() {
		super();
	}

	public Medico(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void esUnPediatra(Medico m) {
		if (m instanceof Pediatra) {
			System.out.println(m.getNombre() + ": Es un Médico Pediatra.");
		} else {
			System.out.println(m.getNombre() + ": No es un Médico Pediatra.");
		}
	}
	
	public void esUnOrtopedista(Medico m) {
		if (m instanceof Ortopedista) {
			System.out.println(m.getNombre() + ": Es un Médico Ortopedista.");
		} else {
			System.out.println(m.getNombre() + ": No es un Médico Ortopedista.");
		}
	}
}

package com.educacionit.wrapper;

public class Wrapper {

	@SuppressWarnings({ "removal", "static-access", "unused" })
	public static void main(String[] args) {

		Integer enteroUno;
		Integer enteroDos;

		// Antiguo
		enteroUno = new Integer(1);
		enteroDos = new Integer("1");
		// ----- Miembros de clase -----
		enteroUno = Integer.valueOf(1);
		enteroDos = Integer.valueOf("1");

		enteroDos.valueOf(0);
		Integer.valueOf(0);
		enteroDos.parseInt("");

		// ----- Miembros de instancia -----
		int unEnteroPrimitivo = enteroUno.intValue();
		

		Long longUno;
		Long longDos;

		// Antiguo
		longUno = new Long(1);
		longDos = new Long("1");
		// ----- Miembros de clase -----
		longUno = Long.valueOf(1l);
		try {
			longDos = Long.valueOf("Hola");
			longDos.parseLong("");
		} catch (NumberFormatException exec) {
			exec.printStackTrace();
		}

		// ----- Miembros de instancia -----
		long unLongPrimitivo = longUno.longValue();
		

		Boolean booleanUno;
		Boolean booleanDos;

		// Antiguo
		booleanUno = new Boolean(true);
		booleanDos = new Boolean("fAlSe");
		// ----- Miembros de clase -----
		booleanUno = Boolean.valueOf(true);
		booleanDos = Boolean.valueOf("fAlSe");

		// ----- Miembros de instancia -----
		boolean unBooleanPrimitivo = booleanUno.booleanValue();
		

		// ----- Boxing -----
		Float unFloat = 1.0f;
		Boolean unBooleano = false;

		// ----- UnBoxing -----
		float unFloatPrimitivo = unFloat;
		boolean unBooleanPrimitivo2 = unBooleano;
	}
}

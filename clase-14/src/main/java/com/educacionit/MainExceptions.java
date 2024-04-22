package com.educacionit;

import java.sql.SQLException;

public class MainExceptions {

	public static void main(String[] args) {

		try {
			divisionPorCero();
			System.out.println("Fin del bloque try");
		} catch (DivisionPorCeroException | SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Este bloque se ejecuta si se produjo o no una exception");
		}

		System.out.println("Fin Main");
	}

	public static void divisionPorCero() throws DivisionPorCeroException, SQLException {

		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException exection) {
			System.out.println("Se produjo la exception: ArithmeticException");
			throw new DivisionPorCeroException("Se produjo la exception: ArithmeticException", exection);
		}
	}
}

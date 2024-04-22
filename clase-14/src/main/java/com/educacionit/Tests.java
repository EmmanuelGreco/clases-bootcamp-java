package com.educacionit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.educacionit.exception.DBManagerException;
import com.educacionit.exception.DBManagerObtenerAlumnoException;

public class Tests {

	public static void main(String[] args) throws DBManagerException, SQLException {

		testDBManager();
		System.out.println("\n=============================================================\n");
		testDBManager2();
		System.out.println("\n=============================================================\n");
		testConexion();
		
	}

	private static void testDBManager() throws DBManagerException {		
		DBManager dbManager = new DBManager();
	
		dbManager.conectar();
	
		dbManager.mostrarAlumnos();		
			
		Alumno alumno = new Alumno(3000, "Juana", 1, null);
		dbManager.insertarAlumno(alumno);
		dbManager.mostrarAlumnos();
		
		dbManager.obtenerAlumno(1000);
		
		dbManager.obtenerAlumnos();
		
		alumno.setEdad(40);
		alumno.setEspecialidad("Sistemas");
		dbManager.modificarAlumno(alumno);
		dbManager.mostrarAlumnos();
		dbManager.eliminarAlumno(alumno.getLegajo());
				
		dbManager.cerrarConexion();
	}
	
	private static void testDBManager2() throws DBManagerException {	
		ArrayList<Alumno> alumnos = null;
		DBManager dbManager = new DBManager();
		
		try {			
			dbManager.conectar();			
			dbManager.obtenerAlumno(1000);			
			alumnos = dbManager.obtenerAlumnos();
			
			
		} catch (DBManagerObtenerAlumnoException exec) {
			System.out.println("No fue posible encontrar al alumno. Err: " + exec.getMessage());
		} catch (DBManagerException exec) {
			System.out.println("Se produjo un error: " + exec.getMessage());
		} finally {
			try {
				dbManager.cerrarConexion();
			} catch (DBManagerException exec) {
				System.out.println(exec.getMessage());
			}
		}		
	
		try {
			dbManager.conectar();
		} catch (DBManagerException exec) {
			System.out.println("Se produjo un error al conectar con la DB");
		}
		
		try {
			dbManager.mostrarAlumnos();
		} catch (DBManagerException exec) {
			System.out.println("Se produj un eror mostrando los alumnos");
		}
		
		try {
			alumnos = dbManager.obtenerAlumnos();
			
			// Mostramos la coleccion de alumnos
			for (int indice = 0; indice < alumnos.size(); indice++) {
				Alumno unAlumno = alumnos.get(indice);
				System.out.println("Alumno: " + unAlumno);
			}			
		} catch (DBManagerException exec) {
			System.out.println("Se produjo un error obteniendo los alumnos");
		}
	}
	
	public static void testConexion() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bootcamp", "root", "admin");
		
		if (conn != null) {
			System.out.println("La conexión se establecio correctamente");
		}

		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("select legajo, nombre, edad, especialidad from alumnos");
		
		while (resultSet.next()) {
			
			//Integer legajo =  resultSet.getInt("legajo");			
			Integer legajo =  resultSet.getInt(1);			
			//String nombre = resultSet.getString("nombre");
			String nombre = resultSet.getString(2);
			//Integer edad = resultSet.getInt(3);
			Integer edad = resultSet.getInt("edad");
			//String especialidad = resultSet.getString(4);
			String especialidad = resultSet.getString("especialidad");
			
			System.out.printf("Legajo = [%d] - Nombre = [%s] - Edad = [%d] - Especialidad = [%s]\n", legajo, nombre, edad, especialidad);
		}
		
		resultSet.close();		
		stmt.close();		
		conn.close();
	}
}

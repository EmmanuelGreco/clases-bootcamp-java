package com.educacionit.constructores;

public class ArticuloCientifico {
	// Sobrecarga constructores
	public String nombreArticulo; // Ejemplo acceder del main sin getter (public).
	private String autor;
	private String palabrasClaves;
	private String nombrePublicacion;
	private int anoPublicacion;
	private String resumen;
	
	public ArticuloCientifico() {
	}
	
	public ArticuloCientifico(String nombreArticulo, String autor) {
		this.nombreArticulo = nombreArticulo;
	}
	
	public ArticuloCientifico(String nombreArticulo, String autor, String palabrasClaves, String nombrePublicacion, int anoPublicacion) {
		this(nombreArticulo, autor);
		this.palabrasClaves = palabrasClaves;
		this.nombrePublicacion = nombrePublicacion;
		this.anoPublicacion = anoPublicacion;
	}
	
	public ArticuloCientifico(String nombreArticulo, String autor, String palabrasClaves, String nombrePublicacion, int anoPublicacion, String resumen) {
		this(nombreArticulo, autor, palabrasClaves, nombrePublicacion, anoPublicacion);
		this.resumen = resumen;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getPalabrasClaves() {
		return palabrasClaves;
	}

	public String getNombrePublicacion() {
		return nombrePublicacion;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public String getResumen() {
		return resumen;
	}	
}

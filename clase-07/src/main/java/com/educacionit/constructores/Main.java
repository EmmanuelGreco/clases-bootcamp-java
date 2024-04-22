package com.educacionit.constructores;

public class Main {
	// Sobrecarga constructores
	public static void main(String[] args) {		
		ArticuloCientifico articuloCientifico = new ArticuloCientifico("Título del Artículo científico", "Nombre de algún autor");
		
		String tituloEnMain = articuloCientifico.getNombreArticulo();
		System.out.println("Valor del título: " + tituloEnMain + ".");
		
		System.out.println("Valor del título: " + articuloCientifico.nombreArticulo + ".");
		articuloCientifico.nombreArticulo = "Nuevo nombre del Título";
		System.out.println("Valor del título: " + articuloCientifico.nombreArticulo + ".");
	}
}

package com.educacionit;

import java.util.List;

public class CalcularFormulas {
	
	public static <T extends Forma> void calcular(List<T> listaFormas) {

		// foreach
		for (Forma unaForma : listaFormas) {
			
			double area = unaForma.calcularArea();				//Polimorfismo
			double perimetro = unaForma.calcularPerimetro();	//Polimorfismo
			
			System.out.println("Objeto: " + unaForma);
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
			System.out.println();			
		}
		
		// FOR tradicional
		/*for (int contador = 0; contador <listaFormas.size(); contador ++) {
			
			Forma unForma = listaFormas.get(contador);
			
			double area = unForma.calcularArea();
			double perimetro = unForma.calcularPerimetro();
			
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
		}*/
	}
}

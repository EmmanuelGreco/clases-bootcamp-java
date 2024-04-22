package com.educacionit;

import java.util.ArrayList;
import java.util.List;

public class TestFormas {

	public static void main(String[] args) {
		List<Forma> listaFormas = new ArrayList<>();		
		
		Circulo unCirculo = new Circulo(Double.valueOf(20));
		Rectangulo unRectangulo = new Rectangulo(1D, 2D);
		Triangulo unTriangulo = new Triangulo(1d, 2d, 3d);
		
		listaFormas.add(unCirculo);
		listaFormas.add(unRectangulo);
		listaFormas.add(unTriangulo);
		
		CalcularFormulas.calcular(listaFormas);
	}
}

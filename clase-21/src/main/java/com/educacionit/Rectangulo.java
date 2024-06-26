package com.educacionit;

public class Rectangulo implements Forma {
	private Double longitud;
	private Double ancho;
		
	public Rectangulo(Double longitud, Double ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}

	@Override
	public Double calcularArea() {
		return longitud * ancho;
	}

	@Override
	public Double calcularPerimetro() {
		return 2 * (longitud + ancho);
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}
}

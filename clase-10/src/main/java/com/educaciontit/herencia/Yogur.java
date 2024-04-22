package com.educaciontit.herencia;

public class Yogur {	
	protected float calorias = 120.5f;
	
	public Yogur() {
	}
	
	public float consultarCalorias() {
		return calorias;
	}
	
	protected void esteMetodoNoEsVisible () {		
	}
}

package com.educaciontit.herencia;

public class YogurDescremado extends Yogur {
	
	public YogurDescremado() {
		super();
	}

	@Override
	public float consultarCalorias() {
		//float resultado = super.consultarCalorias() / 2;
		//return resultado;		
		//return super.consultarCalorias() / 2;
		return super.consultarCalorias() / 2;
	}
}

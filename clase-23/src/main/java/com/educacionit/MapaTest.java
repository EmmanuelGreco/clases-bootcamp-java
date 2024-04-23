package com.educacionit;

import java.util.HashMap;

public class MapaTest {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<>();
		
		Integer unEntero = 1000;
		
		mapa.put("UnaClave", unEntero);
		
		System.out.println("Tamaño del mapa: " + mapa.size());
		
		Integer retorno = mapa.get("UnaClave");
		
		System.out.println("Valor de retorno: " + retorno);
		
		System.out.println("Existe la clave UnaClave: " + mapa.containsKey("UnaClave"));
		System.out.println("Existe el objeto unEntero : " + mapa.containsValue(unEntero));		
	}
}

package com.educacionit;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapaPersona {

	public static void main(String[] args) {
		HashMap<Integer, Persona> mapa = new HashMap<>();
		
		Persona p1 = new Persona("Nombre1", 10);
		Persona p2 = new Persona("Nombre2", 20);
		
		//mapa.put(p1.getNombre()+p1.getEdad(), p1); // Con String sin hashCode
		//mapa.put(p2.getNombre()+p2.getEdad(), p2); // Con String sin hashCode
		mapa.put(p1.hashCode(), p1);
		mapa.put(p2.hashCode(), p2);
		
		//Persona p3 = mapa.get(p1.getNombre()+p1.getEdad()); // Con String sin hashCode
		Persona p3 = mapa.get(p1.hashCode());
		System.out.println(p3);
		
		Set<Entry<Integer, Persona>> entrys = mapa.entrySet();
		
		for (Entry<Integer, Persona> entry : entrys) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}				
	}
}

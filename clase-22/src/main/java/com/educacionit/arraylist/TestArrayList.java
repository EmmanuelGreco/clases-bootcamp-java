package com.educacionit.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		System.out.println(lista);
		
		lista.add(0, 90);		// Desplaza
		System.out.println(lista);
		
		lista.set(2, 50);		// Reemplaza
		System.out.println(lista);
		
		lista.remove(1);		// Elimina la posicion 2, valor 10
		System.out.println(lista);
		
		lista.add(50);
		lista.add(50);
		System.out.println(lista);
		
		int posicion = lista.indexOf(50);
		System.out.println("Posicion del Integer 50: " + posicion);
		
		posicion = lista.lastIndexOf(50);
		System.out.println("Ultima posicion del Integer 50: " + posicion);
		
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println();
		
		for (ListIterator<Integer> iterator = lista.listIterator(); iterator.hasPrevious();) {
			Integer entero = iterator.previous();
			System.out.println(entero);
		}
		
		List<Integer> subList = lista.subList(2, 4);
		System.out.println(subList);				
	}
}

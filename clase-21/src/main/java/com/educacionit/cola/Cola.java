package com.educacionit.cola;

import com.educacionit.cola.exception.ColaException;

public class Cola <T>{	
	private T[] elementos;
	private int capacidad;
	private int inicio; 
	private int tamano;
	
	@SuppressWarnings("unchecked")
	public Cola(int capacidad) {		
		this.capacidad = capacidad;
		elementos = (T[]) new Object[capacidad];
		inicio = 0;
		tamano = 0;
	}
	
	public T desencolar() {
		if (tamano == 0) {
			throw new ColaException("La cola esta vacia!");
		}
		
		T elemento = elementos[inicio];
		inicio++;
		tamano--;
		
		return elemento;
	}
	
	public void encolar(T elemento) throws ColaException {
		if (tamano == capacidad) {
			throw new ColaException("La cola esta llena!");
		}
	
		elementos[tamano] = elemento;
		tamano++;
	}
	
	public boolean estaVacia() {
		/* if (tamano == 0) {
		  return true;
		}
		
		return false;*/
		return (tamano == 0);
	}
	
	public T primero() {
		if (tamano == 0) {
			throw new ColaException("La cola esta vacia!");
		}
		
		return elementos[inicio];
	}
	
	public int tamano() {
		return tamano;
	}
}

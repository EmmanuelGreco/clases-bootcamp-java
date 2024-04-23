package com.educacionit.cola;

import java.util.ArrayDeque;
import java.util.Queue;

import com.educacionit.cola.exception.ColaException;

public class Cola<T>{	
	private Queue<T> cola = new ArrayDeque<>();
	
	public Cola() {
	}
	
	public T desencolar() {
		if (estaVacia()) {
			throw new ColaException("La cola esta vacia!");
		}
		/*T elemento = cola.poll();
		return elemento;*/
		return cola.poll();
	}
	
	public void encolar(T elemento) throws ColaException {
		cola.add(elemento);
	}
	
	public boolean estaVacia() {
		return cola.isEmpty();
	}
	
	public T primero() {
		if (estaVacia()) {
			throw new ColaException("La cola esta vacia!");
		}
		T elemento = cola.peek();
		return elemento;
	}
	
	public int tamano() {
		return cola.size();
	}
}

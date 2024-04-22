package com.educacionit.pila;

import com.educacionit.pila.exception.NoExisteElementoException;

public class PilaArray <E>{	
	private E [] pila;
	private int contador;
	
	@SuppressWarnings("unchecked")
	public PilaArray(int capacidad) {
		this.pila = (E[]) new Object [capacidad];
		this.contador = 0;
	}
	
	public boolean estaVacia() {
		if (contador == 0) {     // Entonces la pila esta vacia
			return true;
		}		
		return false;
	}
	
	public boolean aniadir(E elemento) {		
		if (contador < pila.length) {
            pila[contador] = elemento;
            contador++;
            return true;
        } else {
            return false; // No se pudo añadir, pila llena
        }
	}

	public E extraer() throws NoExisteElementoException {		
		if (contador > 0) {
            contador--;
            E elementoExtraido = pila[contador];
            pila[contador] = null; // Eliminar referencia para evitar "memory leak"
            return elementoExtraido;
        } else {
            throw new NoExisteElementoException("La pila está vacía.");
        }
	}
	
	public E primero() throws NoExisteElementoException {		
		if (contador > 0) {
			return pila[0];
		} else {
			throw new NoExisteElementoException("La pila está vacía.");
		}
	}
	
	public E ultimo() throws NoExisteElementoException {		
		if (contador > 0) {
            return pila[contador - 1];
        } else {
            throw new NoExisteElementoException("La pila está vacía.");
        }
    }
	
	public void mostrarPila() {
		System.out.println("Contenido de la pila:");
		for (int i = 0; i < contador; i++) {
			E elemento = pila[i];
			if (elemento instanceof Alumno) {
				Alumno alumno = (Alumno) elemento;
				System.out.println("Nombre: " + alumno.getNombre() + ", Edad: " + alumno.getEdad());
			} else {
				System.out.println(elemento);
			}
		}
	}
}

package com.educacionit;

public class Ejercicio04 {

	public static void main(String[] args) throws InterruptedException {

		for (int hora = 0; hora<24; hora++) {
			for (int minuto = 0; minuto<60; minuto++) {
				for (int segundo = 0; segundo<60; segundo++) {
					System.out.println(hora + ":" + minuto + ":" + segundo);
					Thread.sleep(25);
					
				}
			}
		}		
	}
}

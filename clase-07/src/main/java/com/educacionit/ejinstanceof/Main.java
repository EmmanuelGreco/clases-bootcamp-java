package com.educacionit.ejinstanceof;

public class Main {

	public static void main(String[] args) {
		Pediatra pediatra1 = new Pediatra("Carlos");
		Ortopedista ortopedista1 = new Ortopedista("Roberto");
		
		pediatra1.esUnPediatra(pediatra1);		
		pediatra1.esUnOrtopedista(pediatra1);
		
		System.out.println();
		
		ortopedista1.esUnPediatra(ortopedista1);		
		ortopedista1.esUnOrtopedista(ortopedista1);		
	}
}	

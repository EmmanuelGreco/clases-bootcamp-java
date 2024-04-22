package com.educacionit.casteo;

public class CasteoEjercicio01 {

	public static void main(String[] args) {		
		int unInt = 10;
		double unDouble;
		float unFloat;
		long unLong;
		short unShort;
		
		unDouble = unInt;		// casteo implicito
		unFloat = unInt;		// casteo implicito
		unLong = unInt;			// casteo implicito
		unShort = (short)unInt; // casteo implicito
		
		System.out.printf("Valor Double: %.2f - Valor Short: %d\n", unDouble, unShort);
		System.out.printf("Valor Float: %.2f - Valor Long: %d\n", unFloat, unLong);
		
		unDouble = 2.56;
		unShort = (short)unDouble;
		unFloat = (float)unDouble;
		unLong = (long)unDouble;
		
		System.out.printf("Valor Double: %.2f - Valor Short: %d\n", unDouble, unShort);
		System.out.printf("Valor Float: %.2f - Valor Long: %d\n", unFloat, unLong);
		
		short s= 129;
		if (s>129) { System.out.println("No deberia castear");}
		byte b = (byte) s;
		
		System.out.println("Short: " + s + " - Valor Byte: " + b);		
	}
}

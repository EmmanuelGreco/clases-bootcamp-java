package ar.educacionit.switchcase;

public class Ejercicio_02 {

	public static void main(String[] args) {		
		int unValor = 2;
		
		switch (unValor) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Menor que cinco, o menor igual que cuatro");
			break;
		case 5:
			System.out.println("Igual a cinco");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("El numero es mayor que cinoc y menor que diez");
			break;
		default:
				System.out.println("El numero es mayor o igual que diez");
		}
		
		System.out.println("Fin main");
	}
}

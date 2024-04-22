package ar.educacionit.ifelse;

public class Ejercicio_03 {

	public static void main(String[] args) {		
		float nota1 = 2.49F;
		float nota2 = 7.98F;
		float nota3;
		int cantidaNotasMayoresQue4 =0;
		int cantidaNotasMenoresQue4 =0;	
		
		float promedio;
		nota3 = 3.4F;
		promedio = (nota1 + nota2 + nota3) / 3;
		
		if (promedio >= 6.59) {
			System.out.println("El promedio SUPERA los 6.59 puntos");
		} else {
			System.out.println("El promedio NO SUPERA los 6.59 puntos");
		}
		
		if (nota1 > 4) {
			//cantidaNotasMayoresQue4 = cantidaNotasMayoresQue4 +1;
			//cantidaNotasMayoresQue4 += 10;
			cantidaNotasMayoresQue4++;
		} else {
			cantidaNotasMenoresQue4++;
		}
		
		if (nota2 > 4 ) {
			cantidaNotasMayoresQue4++;
		} else {
			cantidaNotasMenoresQue4++;
		}
		
		if (nota3 > 4) {
			cantidaNotasMayoresQue4++;
		} else {
			cantidaNotasMenoresQue4++;
		}
		
		System.out.println("Cantidad de notas mayores que 4: " + cantidaNotasMayoresQue4 + "\n\n");
		System.out.println("Cantidad de notas menores que 4: " + cantidaNotasMenoresQue4 + "\n");
	}
}

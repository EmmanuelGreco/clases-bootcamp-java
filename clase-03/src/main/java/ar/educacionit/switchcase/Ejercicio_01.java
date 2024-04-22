package ar.educacionit.switchcase;

public class Ejercicio_01 {

	public static void main(String[] args) {
		int DiaDeLaSemana = 3;
		
		switch (DiaDeLaSemana) {
		case 1:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es lunes");
			break;
		case 2:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es martes");
			break;
		case 3:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es miercoles");
			break;
		case 4:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es jueves");
			break;
		case 5:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es viernes");
			break;
		case 6:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es sabado");
			break;
		case 7:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "es domingo");
			break;
		default:
			System.out.println("El dia de la semana" + DiaDeLaSemana + "no es un valor valido");			
		}
		
		System.out.println("Fin de main");
	}
}

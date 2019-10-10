import java.util.Scanner;

public class EjercicioTrece {

    public static void main(String Args []) {

	int segundos;
	int minutos;
	int horas;
	int dias;
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Introduce una cantidad de segundos");

	segundos = scan.nextInt();
	minutos = segundos / 60;
	segundos = segundos % 60;
	horas = minutos / 60;
	minutos = minutos % 60;
	dias = horas / 24;
	horas = horas % 24;

	System.out.println("Esa cantidad equivale a:");
	System.out.println(minutos + " minutos");
	System.out.println(horas + " horas");
	System.out.println(dias + " dias");

    }

}

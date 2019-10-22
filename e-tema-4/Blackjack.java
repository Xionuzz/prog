
import java.util.Scanner;
import java.util.Random;

public class Blackjack {

	public static void main(String Args[]) {
		
		final int PUNTUACIONMAXIMA = 11;
		int dado = 0;
		int puntuacionJugador = 0;
		String lanzarDado = "";

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("--- BLACKJACK ---");

		do {
			if(puntuacionJugador != PUNTUACIONMAXIMA){

				System.out.println("LANZAR DADO? Y/N"); 

				lanzarDado = scan.nextLine();
				scan.reset();

				if (lanzarDado.equalsIgnoreCase("Y")){
					
					dado = rnd.nextInt(6 - 1 + 1) + 1;
				}



			}

			else if (
		
		
		
		}

		

	}
}


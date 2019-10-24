
import java.util.Scanner;
import java.util.Random;

public class Blackjack {

	public static void main(String Args[]) {
		
		final int PUNTUACIONMAXIMA = 11;
		final int PUNTUACIONMAXIMAPORRAS = 5;

		boolean turnoOrdenador = false;
		boolean turnoJugador = true;
		boolean plantarse = false;
		boolean juego = true;

		

		int respuestaJugador = 0;

		int puntuacionJugador = 0;
		int porrasJugador = 0;
		int resultadoJugador = 0;

		int puntuacionOrdenador = 0;
		int porrasOrdenador = 0;
		int resultadoOrdenador = 0;

		

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("--- BLACKJACK ---");

		
		do {

			if(porrasOrdenador >= 5){
				System.out.println("HAS PERDIDO LA PARTIDA GANA EL ORDENADOR");
				turnoJugador = false;
				turnoOrdenador = false;
				juego = false;
			}

			while(turnoJugador){
			    
			        
				System.out.println("1)LANZAR DADO");
				System.out.println("2)PLANTARSE");
				System.out.println("3)VER PUNTAUCION ACTUAL");

				respuestaJugador = scan.nextInt();
				scan.reset();

				switch(respuestaJugador){
					case 1:
					puntuacionJugador = rnd.nextInt(6 - 1 + 1) + 1;
					resultadoJugador = resultadoJugador + puntuacionJugador;
					System.out.println("Has sacado un: " + puntuacionJugador);
					break;
					case 2:
					System.out.println("Te has plantado con: " + resultadoJugador);
					turnoJugador = false;
					turnoOrdenador = true;
					break;
					case 3:
					System.out.println("Tu puntuación es:"); 
					System.out.println("Turno actual: " + resultadoJugador);
					System.out.println("Porras totales: " + porrasJugador);
					break;
					default:
					System.out.println("Comando no válido, intenta otra vez");
					break;
				}

				if(resultadoJugador == PUNTUACIONMAXIMA){
					System.out.println("PUNTUACIÓN MÁXIMA \n \n ¡SUMAS 2 PORRAS!");
					porrasJugador = porrasJugador + 2;
					resultadoJugador = 0;

				}

				if(porrasJugador >= 5){
					System.out.println("HAS GANADO LA PARTIDA");
					turnoJugador = false;
					turnoOrdenador = false;
					juego = false;

				}

				else if(resultadoJugador > PUNTUACIONMAXIMA) {
					System.out.println("TE HAS PASADO \n \n ¡EL ORDENADOR SUMA 1 PORRA!");
					porrasOrdenador = porrasOrdenador + 1;
					resultadoJugador = 0;
				}

			}

			while(turnoOrdenador){
				System.out.println("ES EL TURNO DEL ORDENADOR");

				puntuacionOrdenador = rnd.nextInt(6 - 1 + 1) + 1;
				resultadoOrdenador = resultadoOrdenador + puntuacionOrdenador;


				if(resultadoOrdenador > 11){
					System.out.println("EL ORDENADOR SE HA PASADO! OBTIENES UNA PORRA!");
					porrasJugador = porrasJugador + 1;
					turnoOrdenador = false;
					turnoJugador = true;
				}
				else if(resultadoOrdenador == 11){
					System.out.println("EL ORDENADOR HA SACADO LA PUNTUACIÓN MÁXIMA! SUMA DOS PORRAS!");
					porrasOrdenador = porrasOrdenador + 2;
					turnoOrdenador = false;
					turnoJugador = true;
				}

				else if(resultadoOrdenador >= resultadoOrdenador){
					System.out.println("EL ORDENADOR HA IGUALADO O SUPERADO TU PUNTUACIÓN SUMA UNA PORRA!");
					porrasOrdenador = porrasOrdenador + 1;
					turnoOrdenador = false;
					turnoJugador = true;
					resultadoJugador = 0;

				}
			}

			resultadoOrdenador = 0;

		} while(juego);
		
	}
}


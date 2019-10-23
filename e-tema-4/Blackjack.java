
import java.util.Scanner;
import java.util.Random;

public class Blackjack {

	public static void main(String Args[]) {
		
		final int PUNTUACIONMAXIMA = 11;
		final int PUNTUACIONMAXIMAPORRAS = 5;

		boolean turnoOrdenador = true;
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
			}

			while(turnoJugador){

				//resultadoJugador = 0;

				System.out.println("// TURNO JUGADOR // \n \n 1)LANZAR DADO \n 2)PLANTARSE \n 3)VER PUNTAUCION ACTUAL");

				respuestaJugador = scan.nextInt();

				switch(respuestaJugador){
					case 1:
					puntuacionJugador = rnd.nextInt(6 - 1 + 1) + 1;
					resultadoJugador = resultadoJugador + puntuacionJugador;
					System.out.println("Has sacado un: " + puntuacionJugador);
					break;
					case 2:
						if(puntuacionJugador == 0){
							System.out.println("Tu puntuación actual es 0. No puedes plantarte con 0");
						}
						else {
							System.out.println("Te has plantado con: " + puntuacionJugador);
							plantarse = true;
						}
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

				}

				else if(porrasJugador >= 5){
					System.out.println("HAS GANADO LA PARTIDA");
					turnoJugador = false;
					turnoOrdenador = false;

				}

				else if(resultadoJugador > PUNTUACIONMAXIMA) {
					System.out.println("TE HAS PASADO \n \n ¡EL ORDENADOR SUMA 1 PORRA!");
					porrasOrdenador = porrasOrdenador + 1;
				}

				else if(plantarse) {
					turnoJugador = false;
				}
			}

			while(turnoOrdenador){
				System.out.println("ES EL TURNO DEL ORDENADOR");

				puntuacionOrdenador = rnd.nextInt(6 - 1 + 1) + 1;
				resultadoOrdenador = resultadoOrdenador + puntuacionOrdenador;


				if(puntuacionOrdenador > 11){
					System.out.println("EL ORDENADOR SE HA PASADO! \n OBTIENES UNA PORRA!");
					porrasJugador = porrasJugador + 1;
					turnoOrdenador = false;
					turnoJugador = true;
				}
				else if(puntuacionOrdenador == 11){
					System.out.println("EL ORDENADOR HA SACADO LA PUNTUACIÓN MÁXIMA! \n SUMA DOS PORRAS");
					porrasOrdenador = porrasOrdenador + 2;
					turnoOrdenador = false;
					turnoJugador = true;
				}

				else if(puntuacionOrdenador >= puntuacionJugador){
					System.out.println("EL ORDENADOR HA IGUALADO O SUPERADO TU PUNTUACIÓN \n SUMA UNA PORRA!");
					porrasOrdenador = porrasOrdenador + 1;
					turnoOrdenador = false;
					turnoJugador = true;

				}
			}
			resultadoJugador = 0;

		} while(juego);
		
	}
}


/*El usuario adivina un número aleatorio del 1 al 100 con intentos limitados.
 *Ejercicio 12-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;                           

public class AdivinarNumero {

    public static void main(String[] args) {

	int numeroAleatorio = (int) (Math.random() * 100 + 1); 
	int numero = 0;
	int intentos = 0;
	int contadorIntentos = 0;
	String jugarOtra = "";

        Scanner scan = new Scanner(System.in);

	System.out.println("////// ADIVINA EL NÚMERO //////");
	System.out.print("Número de intentos: ");

	intentos = scan.nextInt();

        do {

            while (numero != numeroAleatorio) {
                System.out.println("Intenta adivinar un número del 1 al 100:");
                numero = scan.nextInt();
		
                if (numero < numeroAleatorio) {
                    System.out.println(numero + " demasiado bajo. Intentalo otra vez.");
		    contadorIntentos++;
		}

		else if (numero > numeroAleatorio) {
                    System.out.println(numeroAleatorio + " demasiado alto. Intenta otra vez");
		    contadorIntentos++;
		}

		if (contadorIntentos == intentos) {
		    System.out.println("Has perdido");
		    return;
		}
		
		else
                    System.out.println(numeroAleatorio + " HAS GANADO!");

            }

            System.out.println("Jugar otra partida? y/n");

            jugarOtra = scan.next();


        } while (jugarOtra.equalsIgnoreCase("y"));

        System.out.println("Gracias por jugar!");

    }
}


/*Comprueba si un número entero introducido es primo o no.
 *Ejercicio 8-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String Args[]) {

	int numero;
	int resto = 0;
	int contador = 1;
	int contadorResto = 0;
	boolean bucle = true;

	Scanner scan = new Scanner(System.in);
	
	System.out.println("//// NÚMERO PRIMO ////");
	System.out.print("Introduce el número entero: ");

	numero = scan.nextInt();
	scan.reset();

	/* Itera dividiendo el número entre 1 hasta el número. Cada resto igual a 0 *
	 * añade un punto al contador de restos. Cuando el dividendo es más grande  *
	 * que el número introducido, se para el bucle*/
	
	while (bucle) {
	    resto = numero % contador;
	    contador++;

	    if (resto == 0) {
		contadorResto++;
	    }

	    if (contador > numero) {
		bucle = false;
	    }
	}

	// Si el contador es más grande que 2, el número no es primo.

	if (contadorResto > 2) {
	    System.out.println("No primo");
	}

	else
	    System.out.println("Primo");
    }
}

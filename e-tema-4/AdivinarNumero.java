/*El usuario adivina un número aleatorio del 1 al 100 con intentos limitados.
 *Ejercicio 12-4-2
 *@author: Rafa Carrió
 *@version: 1
 */

import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

	int numeroAleatorio = (int) (Math.random() * 100 + 1); // Número aleatorio a adivinar.
	int numero = 0;
	int intentos = 0;
	int contadorIntentos = 0;
	boolean bucleAdivinar = true; // Controla la ejecución del bucle.

        Scanner scan = new Scanner(System.in);

	System.out.println("////// ADIVINA EL NÚMERO //////");
	System.out.print("Número de intentos: ");
	intentos = scan.nextInt();
	System.out.println("Intenta adivinar un número del 1 al 100:");

	/*En el bucle el usuario introduce un número, si falla, se le indica
	 *de que manera (por arriba o por abajo) y se añade un punto al conta-
	 *dor. Al final del bucle se comprueba el número y si es igual, el usuario
	 *gana. Al principio del bucle siempre se comprueba el número de intentos, si
	 *es igual al número de intentos establecido, el usuario pierde.*/

	while(bucleAdivinar) {
	    
	    if (contadorIntentos == intentos) {
		System.out.println("HAS PERDIDO!");
		bucleAdivinar = false;
		System.out.println("Gracias por jugar!");		
		return;
	    }
		
	    numero = scan.nextInt();

	    if (numero < numeroAleatorio) {
		System.out.println("Demasiado bajo. Intentalo otra vez.");
		contadorIntentos++;
	    }

	    else if (numero > numeroAleatorio) {
		System.out.println("Demasiado alto. Intenta otra vez");
		contadorIntentos++;
	    }
	    
	    else if (numero == numeroAleatorio) {
		System.out.println("HAS GANADO!");
		bucleAdivinar = false;
		System.out.println("Gracias por jugar!");
		return;
	    }  
	} 
    }
}
 

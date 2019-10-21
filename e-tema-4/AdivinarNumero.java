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
	boolean bucleAdivinar = true;

        Scanner scan = new Scanner(System.in);

	System.out.println("////// ADIVINA EL NÚMERO //////");
	System.out.print("Número de intentos: ");
	intentos = scan.nextInt();
	System.out.println("Intenta adivinar un número del 1 al 100:");

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
	    }
	    
	} 

        System.out.println("Gracias por jugar!");

    }
}
 

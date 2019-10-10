/*Solicita dos números reales 
 *Ejercicio 4-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class MayorMenorReales {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);
	
	float primerNumero;
	float segundoNumero;

	System.out.println("Introduce el primer número:");
	primerNumero = scan.nextFloat(); // Pedir el primer número
	scan.reset();
	System.out.println("Introduce el segundo número:");
	segundoNumero = scan.nextFloat(); // Pedir el segundo número

	// Comprueba cual es mayor y los muestra por pantalla ordenados

	if (primerNumero > segundoNumero ){
	    System.out.println(primerNumero);
	    System.out.println(segundoNumero);
	}
	else {
	    System.out.println(segundoNumero);
	    System.out.println(primerNumero);
	}
    }
}

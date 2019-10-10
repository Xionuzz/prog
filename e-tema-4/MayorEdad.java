/*Solicita la edad del usuario en forma de entero y después comprueba si es mayor o menor de edad.
 *Ejercicio 3-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class MayorEdad {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);
	
	int edad; 

	System.out.println("Este programa calcula si eres mayor de edad");
	System.out.println("Introduce tu edad en números enteros:");
	edad = scan.nextInt(); // Pedir edad
	scan.reset();
	
	// Comprueba si es mayor de edad

	if (edad >= 18 )
	    System.out.println("Eres mayor de edad");
	else System.out.println("Eres menor de edad");
	
    }
}

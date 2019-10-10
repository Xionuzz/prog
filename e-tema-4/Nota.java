/*
 *Ejercicio 6-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class Nota {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);
	
	int nota; // Se define nota

	System.out.println("Introduce la nota del alumno");

	nota = scan.nextInt(); // Pedir nota

	// Comprobar la nota y sacar por pantalla el resultado 
	switch (nota) {
	case 1:
	case 2:
	case 3:
	case 4:
	    System.out.println("INSUFICIENTE");
	    break;
	case 5:
	    System.out.println("SUFICIENTE");
	    break;
	case 6:
	    System.out.println("BIEN");
	    break;
	case 7:
	case 8:
	    System.out.println("NOTABLE");
	    break;
	case 9:
	case 10:
	    System.out.println("SOBRESALIENTE");
	    break;
	default:
	    System.out.println("Error");
	    break;
	    
	}
	
    }
}

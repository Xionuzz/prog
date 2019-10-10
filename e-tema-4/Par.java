/*
 *Ejercicio 1-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class Par {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);
	
	int number; // number declared

	System.out.println("Introduce un número");

	number = scan.nextInt(); // ask for the mark

	if (number % 2 == 0)
	    System.out.println("El número es par");
	else System.out.println("El número no es par");
		
    }
}

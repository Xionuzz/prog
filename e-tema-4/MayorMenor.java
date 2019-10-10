/*Solicita dos números enteros y comprueba si el primer número es mayor, menor 
 *o igual al segundo número introducido.
 *Ejercicio 2-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class MayorMenor {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);
	
	int primerNumero; 
	int segundoNumero;  

	System.out.println("Introduce el primer número");
	primerNumero = scan.nextInt(); // Pedir el primer número
	scan.reset();
	System.out.println("Introduce el segundo número");
	segundoNumero = scan.nextInt(); // Pedir el segundo número

	// Comprueba la relación entre los números

	if (primerNumero > segundoNumero)
	    System.out.println("El primer número es mayor que el segundo");
	else if (primerNumero < segundoNumero)
	    System.out.println("El primer número es menor que el segundo");
	else System.out.println("Los dos números son iguales");
	
    }
}

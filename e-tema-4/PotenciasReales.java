/*Obtiene la potencia de un número real mediante multiplicaciones.
 *Ejercicio 6-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class PotenciasReales {
    
    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);

	float base;
	int exponente;
	float resultado = 2;
	
	System.out.print("Introduce el número base: ");
	base = scan.nextFloat();
	scan.reset();
	System.out.println("Introduce el número exponente: ");
	exponente = scan.nextInt();
	scan.reset();

	for (int i = 1; i < exponente; i++) {
	    resultado = resultado * base;
	    
	    System.out.println(resultado);
	    
	}

	System.out.println("Resultado: " + resultado);
    }
}

/*Obtiene el producto de dos números mediante sucesivas sumas.
 *Ejercicio 3-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class BucleSuma{

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);

	

	// Suma los números comprendidos entre 1 y 1000.
	
	for (int i = 2; i <= 1000; i++){
	    resultado = resultado + i;
	}

	System.out.println(resultado);
    }
}
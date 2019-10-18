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
	float resultado = 1;
	boolean exponenteNegativo = false;
	
	System.out.print("Introduce el número base: ");
	base = scan.nextFloat();
	scan.reset();
	System.out.print("Introduce el número exponente: ");
	exponente = scan.nextInt();
	scan.reset();

	if (exponente < 0) {
		exponente = exponente * (-1);
		
		exponenteNegativo = true;
	}

	for (int i = 0; i < exponente; i++) {
	     resultado = resultado * base;
	       
	}

	if (exponenteNegativo == true) {
		resultado = 1/resultado;
		
	}

	System.out.println(resultado);
    }
}

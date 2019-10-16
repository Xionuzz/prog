/*Suma los números comprendidos entre el 1 y el 1000.
*Ejercicio 2-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

public class BucleSuma{

    public static void main(String Args[]) {

	long resultado = 1;

	// Suma los números comprendidos entre 1 y 1000.
	
	for (int i = 2; i <= 1000; i++){
	    resultado = resultado + i;
	}

	System.out.println(resultado);
    }
}

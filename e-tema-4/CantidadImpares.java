/*Muestra los números impares del 1 al 100 y cuenta su cantidad.
 *Ejercicio 4-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

public class CantidadImpares{

    public static void main(String Args[]) {

	int contadorImpares = 0;

	/* Itera y solo muestra si el número no da 0 al divir entre 2, cada pase
	 vez que cuenta un impar, añade 1 al contador de impares. */
	
	for (int numeros = 1; numeros < 101; numeros++) {

	    if (numeros % 2 != 0) {
		System.out.println(numeros);
		contadorImpares++;
	    }
	}

	// Muestra por pantalla la cantidad de números impares.
	
	System.out.println("Hay un total de " + contadorImpares+ " números impares");
	
    }
}

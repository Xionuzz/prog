/*Suma los números comprendidos entre el 1 y el 1000.
*Ejercicio 2-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class Productos{

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);

	int numeroMultiplicar;
	int cantidad;
	int resultado = 0;

	// Pide al usuario el número y la cantidad
	
	System.out.println("Introduce el número que quieres multiplicar:");
	numeroMultiplicar = scan.nextInt();
	scan.reset();

	System.out.println("Introduce el número de veces:");
	cantidad = scan.nextInt();
	scan.reset();
	
	// Itera, sumando hasta alcanzar el producto de la multipicación.
	
	for (int i = 0; i < cantidad; i++){
	    resultado = resultado + numeroMultiplicar;
	}

	// Muestra el resultado por pantalla.
	
	System.out.println(resultado);
    }
}
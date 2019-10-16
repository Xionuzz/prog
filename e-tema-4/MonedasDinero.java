/*A una cantidad de dinero indicada, representa con la menor cantidad de monedas posible
 *Ejercicio 6-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class MonedasDinero {

    public static void main(String Args[]) {

	    Scanner scan = new Scanner(System.in);
        
        /* Se declara la variable que almacenará la cantidad de dinero, el
         valor de las monedas y un contador de cantidad de cada una.*/

	    double dinero;
	    double monedaDos;

	    System.out.println("Introduce una cantidad de dinero:");
	    dinero = scan.nextFloat(); //
	    scan.reset();

	    if (dinero >= 2.0) {
		monedaDos = dinero / 2.0;
		System.out.println(monedaDos);
		

	    }

	    else if (dinero >= 1) {
	    }

	    else if (dinero >= 0.50) {
	    }

	    else if (dinero >= 0.20) {
	    }

	    else if (dinero >= 0.50) {
	    }
	
	    // Se itera, restando la cantidad de cada moneda a dinero y añadiendo una unidad de esa moneda.
	    

        /*/ Muestra el resultado por pantalla
        
        System.out.println("Monedas de 2 euros = " + cantidadDos);
        System.out.println("Monedas de 1 euro = " + cantidadUno);
        System.out.println("Monedas de 50 céntimos de euro = " + cantidadCincuenta);
        System.out.println("Monedas de 20 céntimos de euro = " + cantidadVeinte);
        System.out.println("Monedas de 10 céntimos de euro = " + cantidadDiez);
        System.out.println("Monedas de 5 céntimos de euro = " + cantidadCinco);
        System.out.println("Monedas de 2 céntimos de euro = " + cantidadDosCent);
        System.out.println("Monedas de 1 céntimos de euro = " + cantidadUnoCent);
	*/
    }
}

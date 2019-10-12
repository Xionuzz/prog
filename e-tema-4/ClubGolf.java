/*Programa de matriculación de un club de golf. Comprueba la edad del usuario
que va a matricularse y aplica los descuentos pertinentes.
 *Ejercicio 7-4
 *@author: Rafa Carrió 
 *@version: 2
*/

import java.util.Scanner;

public class ClubGolf {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);

	/* Se declaran las variables que almacenan la edad, el precio de la cuota y si los padres son socios */
	
	int edad;
	float cuota = 500f;
	String padresSocio;
	
	System.out.println("///MATRICULACIÓN CLUB DE GOLF///");
	System.out.println("Introduce tu edad por favor:");

	edad = scan.nextInt();
	scan.reset();
	
	/* Comprueba los descuentos aplicables según edad y si los padres son socios */
	
	if (edad >= 65) {
	    cuota = cuota - 250;
	    System.out.println("Descuento del 50% por se mayor de 65 años");
	    System.out.println("Su cuota es de " + cuota + "€");
	}
	
	else if (edad < 18) {
	    System.out.println("Eres menor de edad. Padres son socios? Si/No ");
	    padresSocio = scan.next();
	    System.out.println("flag");

	    if (padresSocio.equalsIgnoreCase("Si")) {
		    cuota = cuota - 175;
		    System.out.println("Descuento del 35% por padres socios");
		    System.out.println("Su cuota es de " + cuota + "€");
	    }

	    else 
		cuota = cuota - 125;
	        System.out.println("Descuento del 25% por menor de edad");
		System.out.println("Su cuota es de " + cuota + "€");

	}
	
	/* En este caso no se aplica ningún descuento*/
	
	else System.out.println("Su cuota es de " + cuota + "€");

    }
    
}

/*
 *Ejercicio -4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Random;

public class DadoSeis {

    public static void main(String Args[]) {

	int dado = 0;
	int contadorUno = 0;
	int contadorDos = 0;
	int contadorTres = 0;
	int contadorCuatro = 0;
	int contadorCinco = 0;
	int contadorSeis = 0;
	
	Random rnd = new Random();
	

	for(int i = 0; i <= 1000000; i++){
	    dado = rnd.nextInt(1 - 6 + 1) + 1;

	    switch (nota){
	    case 1:
		contadorUno++;
		break;
	    case 2:
		contadorDos++;
		break;
	    case 3:
		contadorTres++;
		break;
	    case 4:
		contadorCuatro++;
		break;
	    case 5:
		contadorCinco++;
		break;
	    case 6:
		contadorSeis++;
		break;
	    default:
		System.out.println("Error");
		break;
			
	    }
	}

	System.out.println(cara);
	System.out.println(cruz);

	System.out.println(cara / (cara + cruz) * cara);
    }
}

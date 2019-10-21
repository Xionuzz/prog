/*
 *Ejercicio -4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Random;

public class PorcentajeCaraCruz {

    public static void main(String Args[]) {

	int moneda = 0;
	int cara = 0;
	int cruz = 0;
	
	Random rnd = new Random();
	

	for(int i = 0; i <= 1000000; i++){
	    moneda = rnd.nextInt(2 - 1 + 1) + 1;

	    if (moneda == 1) {
		cara++;
	    }

	    else
		cruz++;
	}

	System.out.println(cara);
	System.out.println(cruz);

	System.out.println(cara / (cara + cruz) * cara);
    }
}

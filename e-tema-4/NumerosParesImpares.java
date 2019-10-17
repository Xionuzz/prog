/*
 *Ejercicio 5-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String Args[]) {

        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorCincos = 0;

        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaCincos = 0;

        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " número par.");
                contadorPares++;
                sumaPares = sumaPares + i;
            }

            else if (i % 2 != 0) {
                System.out.println(i + " número impar.");
                contadorImpares++;
                sumaImpares = sumaImpares + i;
            }

            if (i % 5 == 0) {
                System.out.println( "El número anterior es múltiplo de 5.");
                contadorCincos++;
                sumaCincos = sumaCincos + i;
                
            }       
        }
        System.out.println("//////////////// RESULTADO ////////////////////");
        System.out.println("La cantidad total de pares es: " + contadorPares);
        System.out.println("La cantidad total de impares es: " + contadorImpares);
        System.out.println("La cantidad total de múltiplos de cinco " + contadorCincos);
        System.out.println("La suma de todos los pares es: " + sumaPares);
        System.out.println("La suma de todos los impares es: " + sumaImpares);
        System.out.println("La suma de todos los múltiplos de cinco es: " + sumaCincos);
    
    }
}
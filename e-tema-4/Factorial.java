/*Obtiene el factorial de un número.
 *Ejercicio 8-4-2
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class Factorial {

    public static void main(String Args[]) {

        Scanner scan = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Introduce el número a factorizar: ");

        numero = scan.nextInt();

        for (int i = numero; i > 0; i--){
            factorial = factorial * i;
            System.out.println(factorial);
        }

        System.out.println("El factorial de " + numero + "es = " + factorial);



    }

}

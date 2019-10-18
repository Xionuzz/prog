/*Suma números enteros introducidos por el usuario hasta que se introduce un negativo,
 *calcula la media de los números introducidos.
 *Ejercicio 11-4-2
 *@author: Rafa Carrió
 *@version: 1
 */

import java.util.Scanner;

public class SumaEnterosMedia {

    public static void main(String Args[]) {

        boolean bucleSuma = true;
        int numero = 0;
        int resultado = 0;
        int contadorMedia = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("////// SUMA CONTINUA DE ENTEROS //////");
        
        /* Itera pidiendo al usuario enteros hasta que la entrada es 0,
         * entonces detiene el bucle. */

        while (bucleSuma) {

            System.out.print("Introduce un número entero(Introduce un negativo para parar): ");
            numero = scan.nextInt();

            resultado = resultado + numero;
            contadorMedia++;

            /* Filtra numeros negativos, parando el bucle y restando el negativo al resultado
             * y la operación al contador */

            if (numero < 0){
                bucleSuma = false;
                resultado = resultado - numero;
                contadorMedia--;  
            }
        }

        // Muestra por pantalla la suma de todos los números introducidos.

        System.out.println("La suma de todos los enteros introducidos es: " + resultado);
        System.out.println("La media de los números introducidos es: " + resultado / contadorMedia);
    }
}
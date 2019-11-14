/**
 * Ejercicio 14
 * @author Rafael Carrió
 * Calcula un numero combinatorio
 */


import java.util.Scanner;

 public class NumeroCombinatorio {

    public static void main(String Args[]){
        
        Scanner scan = new Scanner(System.in);

        int numeroM = 0;
        int numeroN = 0;
        int numeroCombinatorio = 0;

        System.out.println("Calcula el numero combinatorio m sobre n");
        System.out.print("Introduce m: ");
        numeroM = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce n: ");
        numeroN = scan.nextInt();
        scan.nextLine();

        numeroCombinatorio = calculacombinatoria(numeroM, numeroN);

        System.out.println("Numero combinatorio = " + numeroCombinatorio);

    }

    /**
     * 
     * @param m
     * @param n
     * @return Un número combinatorio
     */

    public static int calculacombinatoria(int m, int n){
        
        return factorial(m) / (factorial(n) * factorial(m-n));
    }


     /**
     * Calculates the factorial of a integer number
     * @param factorialNumber
     * @return int
     */


    public static int factorial(int factorial){

        if (factorial == 0){
            factorial = 1;
            return factorial;
        }

        for(int i = factorial; i > 0; i--){
            factorial = factorial * i;
        }

        return factorial;
     }    
}
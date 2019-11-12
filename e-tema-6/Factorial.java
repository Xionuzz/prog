/* Ejercicio 7
 * Rafael Carrio
 * Calculates the n! of a given interger*/


import java.util.Scanner;


public class Factorial {

    public static void main(String Args[]) {

        int factorialNumber = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce the number to n!(interger): ");
        factorialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("The n! of " + factorialNumber + " is: " + factorial(factorialNumber));
    }

    
    /**
     * Calculates the factorial of a interger number
     * @param factorial
     * @return int
     */


    public static int factorial(int factorial){

        for(int i = factorial; i > 0; i--){
            factorial = factorial * i;
        }

        return factorial;
    }
}   
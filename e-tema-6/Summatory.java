/* Ejercicio 9
 * Rafael Carrio
 * Outputs the result of a integer summatory */

import java.util.Scanner;

public class Summatory {

    public static void main(String Args[]) {

        int number = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce a number(integer): ");
        number = scan.nextInt();
        scan.nextLine();
        System.out.println(sumatory(number));
    }

    
    /**
     * Does the summatory of an integer number
     * @param number an integer variable
     * @return The result of the summatory
     */


    public static int sumatory(int number){

        int result = 0;

        for(int x = 0; x <= number; x++){
            result = result + x;
        }
        return result;
    }
}   
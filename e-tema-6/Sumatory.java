/* Ejercicio 9
 * Rafael Carrio
 *  */

import java.util.Scanner;

public class Sumatory {

    public static void main(String Args[]) {

        int number = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce a number(interger): ");
        number = scan.nextInt();
        scan.nextLine();
        System.out.println(sumatory(number));
    }

    
    /**
     * Outputs to screen character a numberTimes
     * @param number an integer variable
     * @return The summatory of the input integer
     */


    public static int sumatory(int number){

        int result = 0;

        for(int x = 0; x <= number; x++){
            result = result + x;
        }
        return result;
    }
}   
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
        sumatory(number);
    }

    
    /**
     * Outputs to screen character a numberTimes
     * @param character
     * @param numberTimes
     */


    public static void sumatory(int number){

        int result = 0;

        for(int x = 0; x <= number; x++){
            result = result + x;
        }
        
        System.out.println("The sumatory is: " + result);

        return;
    }
}   
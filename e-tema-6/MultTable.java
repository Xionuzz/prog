/* Ejercicio 10
 * Rafael Carrio
 *  */

import java.util.Scanner;

public class MultTable {

    public static void main(String Args[]) {

        int number = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce a number(interger): ");
        number = scan.nextInt();
        scan.nextLine();
        multiplication(number);
    }

    
    /**
     * Outputs to screen character a numberTimes
     * @param character
     * @param numberTimes
     */


    public static void multiplication(int number){

        for(int x = 1; x <= 10; x++){
            System.out.println(number + "x" + x + "=" + number * x);
        }
        return;
    }
}   
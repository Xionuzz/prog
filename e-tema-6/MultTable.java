/* Ejercicio 10
 * Rafael Carrio
 *  */

import java.util.Scanner;

public class MultTable {

    public static void main(String Args[]) {

        int number = 0;
        boolean multiplication = true;

        Scanner scan = new Scanner(System.in);
        
        while(multiplication){
            System.out.print("Introduce a number(integer): ");
            number = scan.nextInt();
            scan.nextLine();
            if (number < 0 ){
                multiplication = false;
            }
            multiplication(number);
        }
    }

    
    /**
     * Outputs to screen the multiplication table of a given integer
     * @param number an integer
     * @return void
     */


    public static void multiplication(int number){

        if (number < 0){
            return;
        }

        for(int x = 1; x <= 10; x++){
            System.out.println(number + "x" + x + "=" + number * x);
        }
        return;
    }
}   
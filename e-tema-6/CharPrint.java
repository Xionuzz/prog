/* Ejercicio 5
 * Rafael Carrio
 * Prints a char inputed by user a x number of times */

import java.util.Scanner;

public class CharPrint {

    public static void main(String Args[]) {

        char character;
        int numberTimes = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce a character: ");
        character = scan.next().charAt(0);
        System.out.print("Introduce the number of times(Interger): ");
        numberTimes = scan.nextInt();
        printChar(character, numberTimes);
    }

    
    /**
     * Outputs to screen character a numberTimes
     * @param character
     * @param numberTimes
     */


    public static void printChar(char character, int numberTimes){

        for(int x = 0; x < numberTimes; x++){
            System.out.println(character);
        }
        
        return;
    }
}   

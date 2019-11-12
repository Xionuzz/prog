/* Ejercicio 6  
 * Rafael Carrio
 * Prints a char a n number of times in n number of lines*/

import java.util.Scanner;

public class CharPrintLines {

    public static void main(String Args[]) {

        char character;
        int numberTimes = 0;
        int numberLines = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce a character: ");
        character = scan.next().charAt(0);
        System.out.print("Introduce the number of times per line(Interger): ");
        numberTimes = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce number of lines(Interger): ");
        numberLines = scan.nextInt();

        printChar(character, numberTimes, numberLines);
    }

    
    /**
     * Outputs to screen a numberTimes a character in a number of numberLines lines.
     * @param character
     * @param numberTimes
     * @param numberLines
     * @return void
     */


    public static void printChar(char character, int numberTimes, int numberLines){

        for(int x = 0; x < numberLines; x++){
            
            for(int j = 0; j < numberTimes; j++){
                System.out.printf("%s",character);
            }

        System.out.println(""); // New line at the end of each sequence char print.
        
        }

        return;
    }
}   
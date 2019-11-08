/* Ejercicio 4
 * Rafael Carrio
 * Returns the greatest of four given numbers */

import java.util.Scanner;

public class GreatNumberFour {

    public static void main(String Args[]) {

	int firstNumber = 0;
	int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
	int greatNumber = 0;
        int max = 0;
        int min = 0;
	boolean comparing = true; /* Controls the loop */
	String userInput = "";

	Scanner scan = new Scanner(System.in);

        /*Keeps asking for numbers and comparing them*/

	while(comparing){
	    
	    System.out.print("Enter the first number: ");
	    firstNumber = scan.nextInt();
	    scan.nextLine();
	    
	    System.out.print("Enter the second number: ");
	    secondNumber = scan.nextInt();
	    scan.nextLine();

            System.out.print("Enter the third number: ");
	    thirdNumber = scan.nextInt();
	    scan.nextLine();

            System.out.print("Enter the fourth number: ");
	    fourthNumber = scan.nextInt();
	    scan.nextLine();

            greatNumber = compare(firstNumber, secondNumber, thirdNumber, fourthNumber, max, min);

	    System.out.println("The great number is: " + greatNumber);

	    System.out.println("Exit? Y/N");
            userInput = scan.nextLine();

	    if (userInput.equalsIgnoreCase("y"))
		comparing = false;
	}
    }


    /*Returns the greatest of two given numbers*/

    public static int compare(int first, int second, int third, int fourth, int max, int min){

        if (first >= second) {
            first = max;
        } else {
            second = max;
        }

        if (third >= fourth) {
            third = min;
        } else {
            fourth = min;
        }

        if (max >= min) {
            return max;
        } else {
            return min;
        }

    }
}

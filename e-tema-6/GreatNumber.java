/* Ejercicio 3
 * Rafael Carrio
 * Returns the greatest of two given numbers */

import java.util.Scanner;

public class GreatNumber {

    public static void main(String Args[]) {

	int firstNumber = 0;
	int secondNumber = 0;
	int greatNumber = 0;
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

            greatNumber = compare(firstNumber, secondNumber);

	    System.out.println("The great number is: " + greatNumber);

	    System.out.println("Exit? Y/N");
            userInput = scan.nextLine();

	    if (userInput.equalsIgnoreCase("y"))
		comparing = false;
	}
    }

    /*Returns the greatest of two given numbers*/

	public static int compare(int firstNumber, int secondNumber)
	{

		if (firstNumber >= secondNumber)
		{
            return firstNumber;
		} 
		else 
		{
            return secondNumber;
        }
    }
}

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
    int max1 = 0;
    int max2 = 0;
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

        max1 = compare(firstNumber, secondNumber);
        max2 = compare(thirdNumber, fourthNumber);
        greatNumber = compare(max1, max2);

	    System.out.println("The great number is: " + greatNumber);

	    System.out.println("Exit? Y/N");
            userInput = scan.nextLine();

	    if (userInput.equalsIgnoreCase("y"))
		comparing = false;
	}
}

    /**
     * 
     * @param first
     * @param second
     * @return
     */

    public static int compare(int first, int second)
	{

		if (first >= second)
		{
            return first;
		} 
		else 
		{
            return second;
        }
    }
}

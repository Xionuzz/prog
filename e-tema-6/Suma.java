/* Adds interger numbers using methods*/

import java.util.Scanner;

public class AdditionMethod {

    public static void main(String Args[]) {

	int firstOperator = 0;
	int secondOperator = 0;
	int result = 0;
	boolean adding = true; /* Controls the loop */
	String userInput = "";

	Scanner scan = new Scanner(System.in);

        /*Keeps asking for numbers and printing results on screen*/

	while(adding){
	    
	    System.out.print("Introduce el primer operador: ");
	    firstOperator = scan.nextInt();
	    scan.reset();
	    
	    System.out.print("Introduce el segundo operador: ");
	    secondOperator = scan.nextInt();
	    scan.nextLine();

	    result = suma(firstOperator, secondOperator);
	    System.out.println("Result= " + result);

	    System.out.println("Salir? Y/N");
            userInput = scan.nextLine();

	    if (respuestaUsuario.equalsIgnoreCase("y"))
		sumando = false;
	}
    }

    /*Returns the sum of the two operators entered my the user*/

    public static int suma(int firstOperator, int secondOperator){
	return firstOperator + secondOperator;
    }
}


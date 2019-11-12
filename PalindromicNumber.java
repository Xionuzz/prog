/* Ejercicio 7
 * Rafael Carrio
 * Returns true if 4 inputed interger numbers are a palindrome*/

import java.util.Scanner;


public class PalindromicNumber {

    public static void main(String Args[]) {

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        boolean palindromic = false;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce the first number(interger): ");
        firstNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce the second number(interger): ");
        firstNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce the third number(interger): ");
        firstNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce the fourth number(interger): ");
        firstNumber = scan.nextInt();
        scan.nextLine();

        palindromic = palindrome(firstNumber, secondNumber, thirdNumber, fourthNumber);

        if (palindromic == true){
            System.out.println("The numbers are palindromic");
        } else {
            System.out.println("The numbers aren't palindromic");
        }
    }

    
    /**
     * Evaluates if four given interger numbers ara palindromic
     * @param 
     * @return boolean
     */


    public static boolean palindrome(int first, int second, int third, int fourth){

        boolean firstAndSecond = false;
        boolean thirdAndFourth = false;
        
        if (first == second){
            firstAndSecond = true;
        }

        if (third == fourth) {
            thirdAndFourth = true;
        }

        if (firstAndSecond && thirdAndFourth == true) {
            return true;
        } else{
            return false;
        }

    }
}   
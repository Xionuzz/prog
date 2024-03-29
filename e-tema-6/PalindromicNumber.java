/* Ejercicio 7
 * Rafael Carrio
 * Returns true if 4 inputed integer numbers are a palindrome*/

import java.util.Scanner;


public class PalindromicNumber {

    public static void main(String Args[]) {

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        boolean palindromic = false;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce the first number(integer): ");
        firstNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce the second number(integer): ");
        secondNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce the third number(integer): ");
        thirdNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce the fourth number(integer): ");
        fourthNumber = scan.nextInt();
        scan.nextLine();

        palindromic = palindrome(firstNumber, secondNumber, thirdNumber, fourthNumber);

        if (palindromic){
            System.out.println("The numbers are palindromic");
        }else{
            System.out.println("The numbers aren't palindromic");
        }

    }

    
    /**
     * Evaluates if four given interger numbers ara palindromic
     * @param Four integer variables
     * @return returns true if the numbers are palindromic
     */


    public static boolean palindrome(int first, int second, int third, int fourth){
        
        boolean firstFourth = false;
        boolean secondThird = false;
        
        if (first == fourth){
            firstSecond = true;
        }
        
        if(second == third){
            fourthThird = true;
        }
        
        if (firstFourth == true && secondThird == true){
            return true;
        }else{
            return false;
        }
    }
}   
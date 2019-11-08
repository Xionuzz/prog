/* Ejercicio 2
 * Rafael Carrio
 * Calculates the area and length of a circumference for a given radius */

import java.util.Scanner;

public class Circumference { 

    public static void main(String Args[]){

        Scanner scan = new Scanner(System.in);
        double radius = 0f;
        double area = 0f;
        double length = 0f;

        System.out.print("Enter the radius: ");
        radius = scan.nextDouble();
        area = calcArea(radius);
        length = calcLong(radius);

        System.out.printf("The area is: " + "%.2f\n",area);
        System.out.printf("The length is: " + "%.2f\n",length);

    }
    /**
     * Calculates the area of a circumferance of radius radius
     * @param radio Circumferance radius
     * @return Area of circumferance
     */

    public static double calcArea(double radio){
        radio = (radio * radio) * Math.PI;
        return radio;

    }

    public static double calcLong(double leng){
        leng = 2 * leng * Math.PI;
        return leng;

    }
}
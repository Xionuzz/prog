import java.util.Scanner;

public class DecimalesFormato {

    public static void main(String Args[]){

        Scanner scan = new Scanner(System.in);

        double numeroReal = 0;

        do {
            System.out.print("Introduce un número real (0 para salir):");
            numeroReal = scan.nextDouble();
            System.out.printf("El número es: %.2f\n",numeroReal);

        }while(numeroReal != 0);
    }
}
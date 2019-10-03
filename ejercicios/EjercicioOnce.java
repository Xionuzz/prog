import java.util.Scanner;

public class EjercicioOnce {

    public static void main (String Args[]) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Este programa resta dos números enteros.\n Introduce el primer número:");

	int primerNumero = scan.nextInt();

	System.out.println("Introduce el segundo número:");

	int segundoNumero = scan.nextInt();

	int resultadoResta = primerNumero - segundoNumero;

	System.out.println("El resultado de la operación es: " + resultadoResta);

      

    }

}

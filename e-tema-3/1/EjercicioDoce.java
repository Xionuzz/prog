import java.util.Scanner;

public class EjercicioDoce {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);

	int divisor;
	int dividendo;
	int cociente;
	int resto;

	System.out.println("Este programa divide dos números.\n" + "Introduce el dvisor:");

	divisor = scan.nextInt();

	System.out.println("Introduce el dividendo:");

	dividendo = scan.nextInt();

	cociente = dividendo / divisor;
	resto = dividendo % divisor;

	System.out.println(cociente);
	System.out.println(resto);

	


    }

}

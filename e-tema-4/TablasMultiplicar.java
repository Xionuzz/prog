import java.util.Scanner;


public class TablasMultiplicar{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int mult = 1;
        int resultado;

        // solicitamos al usuario un número del 1 al 10.
        System.out.println("Introduzca un número del 1 al 10:");

        numero = scan.nextInt();
	scan.reset();

        // Iteramos para multiplicar cada número de la tabla y mostramos por pantalla.
        for (int i = 1; i <= 10; i++){
            
            resultado = numero * mult;
            System.out.println(numero + "x" + i + "=" + resultado);
            mult++;

        }
    }

}

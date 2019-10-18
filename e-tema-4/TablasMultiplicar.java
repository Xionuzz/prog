import java.util.Scanner;


public class TablasMultiplicar{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int mult = 1;
        int resultado;
        boolean validado;

        // Solicitamos al usuario un número del 1 al 10.
        

        
        do {
            System.out.println("Introduzca un número del 1 al 10:");
            numero = scan.nextInt();
            scan.reset();
            validado = numero == 0 && numero > 10;

            while 


        }
        // Iteramos para multiplicar cada número de la tabla y mostramos por pantalla.
        for (int i = 1; i <= 10; i++){
            
            resultado = numero * mult;
            System.out.println(numero + "x" + i + "=" + resultado);
            mult++;

        }
    }

}

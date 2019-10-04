import java.util.Scanner;

public class EjercicioDiecisiete {

    public static void main(String Args []) {
        
        Scanner scan = new Scanner(System.in);

        float precioLitroPrimeraVez;
        float totalDepositoPrimeraVez;
        float nKilometrosPrimeraVez;

        float precioLitroSegundaVez;
        float totalDepositoSegundaVez;

        float nKilometrosTerceraVez;


        System.out.println("Este programa calcula el consumo de combustible de un automóvil. Para ello es necesario introducir una serie de datos. Siga las instrucciones en pantalla");

        //Primera vez
        
        System.out.println(" De las tres últimas veces que repostó, la menos reciente, indique: \n Precio del litro de combustible?");
        precioLitroPrimeraVez = scan.nextFloat();

        System.out.println("El total pagado para llenar el depósito?");
        totalDepositoPrimeraVez = scan.nextFloat();

        System.out.println("El número de kilómetros que marcaba el cuentakilómetros entonces?");
        nKilometrosPrimeraVez = scan.nextFloat();


        // Segunda vez

        System.out.println("De la segunda vez que reposto, Indique el precio de litro");
        precioLitroSegundaVez = scan.nextFloat();

        System.out.println(" Indique el total pagado al llenar el depósito");
        totalDepositoSegundaVez = scan.nextFloat();


        // Tercera vez

        System.out.println("En la última vez que repostó, ¿Cuantos kilómetros maracaba el depósito?");
        nKilometrosTerceraVez = scan.nextFloat();


        // Operaciones

        float distanciaRecorrida = nKilometrosTerceraVez - nKilometrosPrimeraVez;
        float dineroTotal = totalDepositoPrimeraVez + totalDepositoSegundaVez;
        //float dineroKilometro = distanciaRecorrida / dineroTotal;
        


        // Calcular consumo cada 100KM y consumo por kilometro
    }

}
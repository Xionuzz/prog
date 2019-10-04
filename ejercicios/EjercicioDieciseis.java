import java.util.Scanner;

public class EjercicioDieciseis {

    public static void main(String Args []) {
        
        Scanner scan = new Scanner(System.in);
        
        float euros;
        final float VALORESTERLINA = 1.12f;
        final float VALORDOLAR = 1.10f;

        System.out.println("Introduce una cantidad de euros: ");

        euros = scan.nextFloat();

        System.out.println(VALORESTERLINA * euros);
        System.out.println(VALORDOLAR * euros);


    }

}
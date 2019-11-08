import java.util.Scanner;

public class HoraFormato { 

    public static void main(String Args[]) {

        Scanner scan = new Scanner(System.in);

        short horas = 0;
        short minutos = 0;
        short segundos = 0;

        do {

            System.out.print("Introduce una cantidad válida de horas:");
            horas = scan.nextShort();

        }while(horas > 23);

        do {
            
            System.out.print("Introduce una cantidad válida de minutos:");
            minutos = scan.nextShort();

        }while(minutos > 59);

        do {
            
            System.out.print("Introduce una cantidad válida de segundos:");
            segundos = scan.nextShort();

        }while(segundos > 59);

        System.out.printf("HORA: %02d:%02d:%02d\n",horas, minutos,segundos);
    }
}

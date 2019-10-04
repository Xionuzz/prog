import java.util.Scanner;

public class EjercicioCatorce {

    public static void main(String Args[]) {

	Scanner scan = new Scanner(System.in);

	 final float PI = 3.14f;
	 float radio;
	 float longitud;
	 float area;
	 float diametro;
	
	 System.out.println("Este programa calcula la longitud y el área de una circunferencia\n" + "Introduce el radio de la circunferencia: ");
	 
	 radio = scan.nextInt();
	 diametro = radio * 2;
	 area = (radio * 2) * PI;
	 longitud = PI * diametro;

	System.out.println("El área de la circunferencia es = " + area);
	System.out.println("El diametro de la circunferencia es = " + diametro );
	System.out.println("La longitud de la circunferencia es = " + longitud);

	
    }
}

import java.util.Scanner;
public class EstacionMeteo {

    public static void main(String Args[]) {

        String nombreAplicacion = "** ESTACIÓN METEREOLÓGICA **";
        String nombreCiudad = "";
	String tab = "";
        int dia = 0;
        int mes = 0;
        int año = 0;
        int hora = 0;
        int minuto = 0;
        int segundo = 0;
        int velocidadViento = 0;
        int probLluvia = 0;
        int uvi = 0;
	double temperatura = 0;
        double presionAtmos = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println(nombreAplicacion);
        System.out.println("Introduce los datos por favor");

        do {
            System.out.println("Nombre ciudad:");
            nombreCiudad = scan.nextLine();
            scan.nextLine();
        } while(nombreCiudad == "");

        do {
            System.out.print("Introduce día:");
            dia = scan.nextInt();
            scan.nextLine();
            System.out.print("Introduce mes:");
            mes = scan.nextInt();
            scan.nextLine();
            System.out.print("Introduce año:");
            año = scan.nextInt();
            scan.nextLine();
        } while(dia == 0 || mes == 0 || año == 0);

        do {
            System.out.print("Introduce hora:");
            hora = scan.nextInt();
            scan.nextLine();
            System.out.print("Introduce minuto:");
            minuto = scan.nextInt();
            scan.nextLine();
            System.out.print("Introduce segundo:");
            segundo = scan.nextInt();
            scan.nextLine();
        } while(hora >= 24 || minuto >= 60 || segundo >= 60);

        do {
            System.out.print("Introduce la velocidad del viento:");
            velocidadViento = scan.nextInt();
            scan.nextLine();

        } while(velocidadViento < 0);

        do {
            System.out.print("Introduce la temperatura (En grados CELSIUS):");
            temperatura = scan.nextDouble();
            scan.nextLine();
        } while(temperatura == 9999999);

        do {
            System.out.print("Introduce presión atmosférica:");
            presionAtmos = scan.nextDouble();
            scan.nextLine();

        } while(presionAtmos == 9999);

        do {
            System.out.print("Introduce la probabilidad de lluvia (0-100):");
            probLluvia = scan.nextInt();
            scan.nextLine();

        } while(probLluvia < 0 || probLluvia > 100);

        do {
            System.out.print("Introduce índice de radiación ultravioleta:");
            uvi = scan.nextInt();
            scan.nextLine();

        } while(uvi < 0);

        // Imprimir formateado en pantalla.

        System.out.printf("\u001B[1;37;44m" + "%s\n",nombreAplicacion);
        System.out.printf("Ciudad:" + "%10s%s\n",tab,nombreCiudad);
        System.out.printf("Fecha:" + "%10s" + "%s%2d/%2d/%4d",tab, dia, mes, año);
        System.out.printf("%10s" + "%02d:%02d:%02d",tab, hora, minuto, segundo);

	/////////

	if (velocidadViento < 30) {
            System.out.printf("%10s" + "\u001B[1;32;40m" + "%2d",tab, velocidadViento);
        }

        else if (velocidadViento < 61){
            System.out.printf("%10s" + "\u001B[1;33;40m" + "%2d",tab, velocidadViento);
        }
        else 
	    System.out.printf("%10s" + "\u001B[1;31;40m" + "%2d",tab, velocidadViento);


	///////////////////////////////
	if (temperatura < 22) {
	    System.out.printf("%10s" + "\u001B[1;32;40m" + "%2f",tab, temperatura);
	}
	else if (temperatura <= 60) {
	    System.out.printf("%10s" + "\u001B[1;33;40m" + "%2f",tab, temperatura);
	}
	else if (temperatura > 60) {
	    System.out.printf("%10s" + "\u001B[1;31;40m" + "%2f",tab, temperatura);
	}

	/////////
        System.out.printf("%10s" + "%10.1f",tab, presionAtmos);
        
        switch(probLluvia){
            case 0:
            case 35:
                System.out.printf("%10d" + "\u001B[1;32;40m" + "%2d",probLluvia);
                break;
            case 70: 
                System.out.printf("%10d" + "\u001B[1;33;40m" + "%2d",probLluvia);
                break;
            case 100:
                System.out.printf("%10d" + "\u001B[1;31;40m" + "%2d",probLluvia);
                break;
        }
	/*
        switch(uvi){
            case 2:
            case 5:
                System.out.printf("%10s" + "\u001B[1;32;40m" + "2d%",tab, uvi);
                break;
            case 7: 
                System.out.printf("%10s" + "\u001B[1;34;40m" + "2d%",tab, uvi);
                break;
            case 10:
                System.out.printf("%10s" + "\u001B[1;33;40m" + "2d%",tab, uvi);
                break;
            case 11:
                System.out.printf("%10s" + "\u001B[1;31;40m" + "2d%",tab, uvi);
                break;
        }
	*/
    
    }

}

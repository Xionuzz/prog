/*Estacion metereologica*/

import java.util.Scanner;

public class EstacionMeteo {

    public static void main(String Args[]) {

        String nombreAplicacion = "*** ESTACIÓN METEREOLÓGICA ***";
        String nombreCiudad = "";
	String tab = ""; // Tabulacion para el formato de la tabla
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
        boolean validado; // Variable de validacion para cada entrada

        Scanner scan = new Scanner(System.in);

        System.out.println(nombreAplicacion);
        System.out.println("Introduce los datos por favor");

	/* Validar la entrada de todos los datos*/
	
        do {
            System.out.print("Nombre ciudad:");
            nombreCiudad = scan.nextLine();
            scan.reset();
        } while(nombreCiudad.equals(""));

        do {
            System.out.print("Introduce día:");
            dia = scan.nextInt();
            scan.nextLine();
	    validado = dia > 0 && dia <= 31;
        } while(!validado);
        
        do {
            System.out.print("Introduce mes:");
            mes = scan.nextInt();
            scan.nextLine();
	    validado = mes > 0 && mes <= 12;
        } while(!validado);

        do {
            System.out.print("Introduce año:");
            año = scan.nextInt();
            scan.nextLine();
	    validado = año >= 0;
        } while(!validado);

        do {
            System.out.print("Introduce hora:");
            hora = scan.nextInt();
            scan.nextLine();
	    validado = hora >= 0 && hora < 24;
        } while(!validado);

        do {
            System.out.print("Introduce minuto:");
            minuto = scan.nextInt();
            scan.nextLine();
	    validado = minuto >= 0 && minuto < 60; 
        } while(!validado);

        do {
            System.out.print("Introduce segundo:");
            segundo = scan.nextInt();
            scan.nextLine();
	    validado = segundo >= 0 && segundo < 60;
        } while(!validado);

        do {
            System.out.print("Introduce la velocidad del viento:");
            velocidadViento = scan.nextInt();
            scan.nextLine();
	    validado = velocidadViento >= 0;
        } while(!validado);

        do {
            System.out.print("Introduce la temperatura (En grados CELSIUS):");
            temperatura = scan.nextDouble();
            scan.nextLine();
	    validado = temperatura >= -100 && temperatura <= 100;
        } while(!validado);

        do {
            System.out.print("Introduce presión atmosférica:");
            presionAtmos = scan.nextDouble();
            scan.nextLine();
            validado = presionAtmos > 0 && presionAtmos < 1200;
        } while(!validado);

        do {
            System.out.print("Introduce la probabilidad de lluvia (0-100):");
            probLluvia = scan.nextInt();
            scan.nextLine();
	    validado = probLluvia >= 0 && probLluvia <= 100;
        } while(!validado);

        do {
            System.out.print("Introduce índice de radiación ultravioleta:");
            uvi = scan.nextInt();
            scan.nextLine();
	    validado = uvi >= 0;
        } while(!validado);

        // Imprimir formateado en pantalla.
	
        System.out.printf("\u001B[1;37;44m" + "%s\n",nombreAplicacion); // Nombre
	System.out.print("\u001B[1;37;40m"); // Reset del color
        System.out.printf("Ciudad:" + "%-15s%-1s\n",tab,nombreCiudad);
        System.out.printf("Fecha:" + "%-16s%02d/%02d/%04d\n",tab, dia, mes, año);
        System.out.printf("Hora de la mesura:" + "%-4s%02d:%02d:%02d\n",tab, hora, minuto, segundo);

	// Velocidad del viento

	if (velocidadViento < 30) {
	    System.out.printf("Velocidad del viento:" + "%1s" + "\u001B[1;32;40m" + "%02d ",tab, velocidadViento);
	}
	else if (velocidadViento < 61){
	    System.out.printf("Velocidad del viento:" + "%1s" + "\u001B[1;33;40m" + "%02d ",tab, velocidadViento);
	}
	else { 
	    System.out.printf("Velocidad del viento:" + "%1s" + "\u001B[1;31;40m" + "%02d ",tab, velocidadViento);	  
	}

	System.out.print("\u001B[1;37;40m");
	System.out.print("km/h\n");

	// Temperatura
	
	if (temperatura < 22) {
	    System.out.print("Temperatura:");
	    System.out.printf("%10s" + "\u001B[1;32;40m" + "%.2f ",tab, temperatura);

	}
	else if (temperatura <= 60) {
	    System.out.print("Temperatura:");
	    System.out.printf("%10s" + "\u001B[1;33;40m" + "%.2f ",tab, temperatura);

	}
	else if (temperatura > 60) {
	    System.out.print("Temperatura:");
	    System.out.printf("%10s" + "\u001B[1;31;40m" + "%.2f ",tab, temperatura);
	}

	System.out.print("\u001B[1;37;40m");
	System.out.print("Cº\n");

	// Presion atmosferica

	System.out.printf("Presión atmosférica:" + "%2s" + "%.1f hPa\n",tab, presionAtmos);

	// Prob.Lluvia
	
        if (probLluvia < 35){
            System.out.printf("Probabilidad lluvia:" + "%2s" + "\u001B[1;32;40m" + "%02d ",tab,probLluvia);
        }
        else if (probLluvia <= 70){
            System.out.printf("Probabilidad lluvia:" + "%2s" + "\u001B[1;33;40m" + "%02d ",tab,probLluvia);
        }
        else
            System.out.printf("Probabilidad lluvia:" + "%2s" + "\u001B[1;31;40m" + "%02d ",tab,probLluvia);

	System.out.print("\u001B[1;37;40m");
	System.out.print("%\n"); // Porcentaje
        
        //UVI

        if (uvi <= 2){
            System.out.printf("UVI:" + "%18s" + "\u001B[1;32;40m" + "%02d\n",tab,uvi);
        }
        else if (uvi <= 5){
            System.out.printf("UVI:" + "%18s" + "\u001B[1;34;40m" + "%02d\n",tab,uvi);
        }
        else if (uvi <= 7) {
            System.out.printf("UVI:" + "%18s" + "\u001B[1;33;40m" + "%02d\n",tab,uvi);
        }
        else if (uvi <= 10){
            System.out.printf("UVI:" + "%18s" + "\u001B[1;31;40m" + "%02d\n",tab,uvi);
        }
        else 
            System.out.printf("UVI:" + "%18s" + "\u001B[1;35;40m" + "%02d\n",tab,uvi);

	System.out.print("\u001B[1;37;40m"); // Reset del color
    }
}

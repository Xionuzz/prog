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
        boolean validado;

        Scanner scan = new Scanner(System.in);

        System.out.println(nombreAplicacion);
        System.out.println("Introduce los datos por favor");

        do {
            System.out.print("Nombre ciudad:");
            nombreCiudad = scan.nextLine();
            scan.reset();
        } while(nombreCiudad.equals(""));

        do {
            System.out.print("Introduce día:");
            dia = scan.nextInt();
            scan.nextLine();
        } while(dia == 0 || dia > 31);
        
        do {
            System.out.print("Introduce mes:");
            mes = scan.nextInt();
            scan.nextLine();
        } while(mes == 0 || mes > 12);

        do {
            System.out.print("Introduce año:");
            año = scan.nextInt();
            scan.nextLine();
        } while(año == 0);

        do {
            System.out.print("Introduce hora:");
            hora = scan.nextInt();
            scan.nextLine();
        } while(hora == 0 || hora >= 24);

        do {
            System.out.print("Introduce minuto:");
            minuto = scan.nextInt();
            scan.nextLine();
        } while(minuto > 60);

        do {
            System.out.print("Introduce segundo:");
            segundo = scan.nextInt();
            scan.nextLine();
        } while(segundo >= 60);

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
            validado = presionAtmos > 0 && presionAtmos < 1200;
        } while(!validado);

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
        String format = "%-40s%s%n";
        System.out.printf("\u001B[1;37;44m" + "%s\n\n",nombreAplicacion);
        System.out.printf("Ciudad:" + "%-16s%-1s\n",tab,nombreCiudad);
        System.out.printf("Fecha:" + "%-17s%02d/%02d/%04d\n",tab, dia, mes, año);
        System.out.printf("Hora de la mesura:" + "%-25s%02d:%02d:%02d\n",tab, hora, minuto, segundo);

	/////////

	if (velocidadViento < 30) {
        System.out.printf("Velocidad del viento:" + "%10s" + "\u001B[1;32;40m" + "%-2dkmh\n",tab, velocidadViento);
    }
    else if (velocidadViento < 61){
        System.out.printf("Velocidad del viento:" + "%10s" + "\u001B[1;33;40m" + "%-2d\n",tab, velocidadViento);
    }
    else 
	    System.out.printf("Velocidad del viento:" + "%10s" + "\u001B[1;31;40m" + "%-2d\n",tab, velocidadViento);


	///////////////////////////////
	if (temperatura < 22) {
	    System.out.printf("Temperatura:" + "%10s" + "\u001B[1;32;40m" + "%-2f\n",tab, temperatura);
	}
	else if (temperatura <= 60) {
	    System.out.printf("Temperatura:" + "%10s" + "\u001B[1;33;40m" + "%-2f\n",tab, temperatura);
	}
	else if (temperatura > 60) {
	    System.out.printf("Temperatura:" + "%10s" + "\u001B[1;31;40m" + "%-2f\n",tab, temperatura);
	}

	/////////
        System.out.printf("Presión atmosférica:" + "%10s" + "%-10.1f\n",tab, presionAtmos);

        if (probLluvia < 35){
            System.out.printf("Probabilidad de lluvia:" + "%10s" + "\u001B[1;32;40m" + "%2d\n",tab,probLluvia);
        }
        else if (probLluvia <= 70){
            System.out.printf("Probabilidad de lluvia:" + "%10s" + "\u001B[1;33;40m" + "%2d\n",tab,probLluvia);
        }
        else
            System.out.printf("Probabilidad de lluvia:" + "%10s" + "\u001B[1;31;40m" + "%2d\n",tab,probLluvia);
        
        /////////////////

        if (uvi <= 2){
            System.out.printf("UVI:" + "%10s" + "\u001B[1;32;40m" + "%2d\n",tab,uvi);
        }
        else if (uvi <= 5){
            System.out.printf("UVI:" + "%10s" + "\u001B[1;32;40m" + "%2d\n",tab,uvi);
        }
        else if (uvi <= 7) {
            System.out.printf("UVI:" + "%10s" + "\u001B[1;33;40m" + "%2d\n",tab,uvi);
        }
        else if (uvi <= 10){
            System.out.printf("UVI:" + "%10s" + "\u001B[1;33;40m" + "%2d\n",tab,uvi);
        }
        else 
            System.out.printf("UVI:" + "%10s" + "\u001B[1;33;40m" + "%2d\n",tab,uvi);
        
              
        
	
    
    }

}

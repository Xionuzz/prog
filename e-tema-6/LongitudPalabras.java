/**
 * Ejercicio 15
 * @author Rafael Carrió
 * 
 */


import java.util.Scanner;

 public class LongitudPalabras {

    public enum Vocales {a,e,i,o,u,A,E,I,O,U,Á,É,Í,Ó,Ú,á,é,í,ó,ú}

    public static void main(String Args[]){

        
        menu();

    }

    public static void menu(){

        boolean ejecutando = true;
        int userInput = 0;
        Scanner scan = new Scanner(System.in);
        

        do{
            System.out.print("MENÚ PRINCIPAL\n==============\n");
            System.out.println("1. Palabra más larga.");
            System.out.println("2. Palabra más corta.");
            System.out.println("3. Número de vocales.");
            System.out.println("---------------------");
            System.out.println("0. Salir.");
            
            userInput = scan.nextInt();
            scan.nextLine();

            if (userInput == 1){
                System.out.println("La palabra más larga es: " + palabraLarga());

            }else if (userInput == 2){

            }else if (userInput == 3){
                System.out.println(numeroVocales());

            }else if (userInput == 0){
                System.out.println("Gracias por usar el programa");
                ejecutando = false;
            }
        }while(ejecutando);
    }

    public static String palabraLarga(){
        
        Scanner scan = new Scanner(System.in);

        String primeraPalabra = "";
        String segundaPalabra = "";
        String terceraPalabra = "";

        System.out.println("Introduce la primera palabra");
        primeraPalabra = scan.nextLine();
        System.out.println("Introduce la segunda palabra");
        segundaPalabra = scan.nextLine();
        System.out.println("Introduce la tercera palabra");
        terceraPalabra = scan.nextLine();
        /*
        if (primeraPalabra.lenght() > segundaPalabra.lenght() && primeraPalabra.length() > 
        terceraPalabra.length()) {
            return primeraPalabra;
        }else if (segundaPalabra.length() > primeraPalabra.length() && segundaPalabra.length() >
        terceraPalabra.length()){
            return segundaPalabra;
            */
       // }else{
            return terceraPalabra;
        //}
        
        
    }

    //public static String palabraCorta(){
    
    //}

    public static int numeroVocales(){
        
        Scanner scan = new Scanner(System.in);

        String palabra = "";
        String letras = "";
        int contadorVocales = 0;

       

        
        
        System.out.print("Introduce una palabra: ");
        palabra = scan.nextLine();

        for (int i = 0; i < palabra.length(); i++){

            System.out.println(palabra.charAt(i));

            if (palabra.contains("a")){
                contadorVocales++;
            }
        }

        return contadorVocales;
    }
}
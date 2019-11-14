/**
 * Ejercicio 15
 * @author Rafael Carrió
 * 
 */


import java.util.Scanner;

 public class LongitudPalabras {

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

        if (primeraPalabra.lenght() > segundaPalabra.lenght()) {
            
            if(s.lenght(primeraPalabra) > s.lenght(terceraPalabra)){
                return primeraPalabra;
            }else{
                return terceraPalabra;
            } 
        
        }else if (s.lenght(segundaPalabra) > s.lenght(terceraPalabra)){
            return segundaPalabra;

        }else{
            return terceraPalabra;
        }
        
        
    }

    //public static String palabraCorta(){
    
    //}

    public static int numeroVocales(){
        
        Scanner scan = new Scanner(System.in);

        String palabra = "";
        int contadorVocales = 0;
        
        System.out.print("Introduce una palabra: ");
        palabra = scan.nextLine();

        for (int i = 0; i > palabra.length(); i++){

            if (palabra.charAt(i) == "a" || "e" || "i" || "o" || "u"){
                contadorVocales++;
            }
        }

        return contadorVocales;
    }
}
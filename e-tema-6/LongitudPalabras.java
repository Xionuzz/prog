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


    /**
     * 
     */
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
                System.out.println("La palabra más corta es: " + palabraCorta());

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
        int longFirstWord = 0;
        int longSecondWord = 0;
        int longThirdWord = 0;

        System.out.print("Introduce la primera palabra");
        primeraPalabra = scan.nextLine();
        System.out.print("Introduce la segunda palabra");
        segundaPalabra = scan.nextLine();
        System.out.print("Introduce la tercera palabra");
        terceraPalabra = scan.nextLine();

        longFirstWord = primeraPalabra.length();
        longSecondWord = segundaPalabra.length();
        longThirdWord = terceraPalabra.length();

        if (longFirstWord > longSecondWord && longFirstWord > longThirdWord){
            return primeraPalabra;
        } else if(longSecondWord > longFirstWord && longSecondWord > longThirdWord){
            return segundaPalabra;
        }else{
            return terceraPalabra;
        }
    }


    /**
     * 
     * @return
     */


    public static String palabraCorta(){

        Scanner scan = new Scanner(System.in);

        String primeraPalabra = "";
        String segundaPalabra = "";
        String terceraPalabra = "";
        int longFirstWord = 0;
        int longSecondWord = 0;
        int longThirdWord = 0;

        System.out.print("Introduce la primera palabra");
        primeraPalabra = scan.nextLine();
        System.out.print("Introduce la segunda palabra");
        segundaPalabra = scan.nextLine();
        System.out.print("Introduce la tercera palabra");
        terceraPalabra = scan.nextLine();

        longFirstWord = primeraPalabra.length();
        longSecondWord = segundaPalabra.length();
        longThirdWord = terceraPalabra.length();

        if (longFirstWord < longSecondWord && longFirstWord < longThirdWord){
            return primeraPalabra;
        } else if(longSecondWord < longFirstWord && longSecondWord < longThirdWord){
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
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++){
            
            switch(palabra.charAt(i)){
                case 'a':
                case 'e':
                case 'i': 
                case 'o': 
                case 'u':
                case 'á': 
                case 'é':   
                case 'í':    
                case 'ó': 
                case 'ú':
                   contadorVocales++;
                   break;
            }

            
    
        }

        return contadorVocales;
    }
}
/**
 * Ejercicio 17
 * @author Rafael Carrió
 * Imprime por pantalla un rectángulo compuesto por un símbolo
 */


import java.util.Scanner;


public class Rectangulo {

    
    public static void main(String Args[]){

        int anchoRectangulo = 0;
        int longitudRectangulo = 0;
        String caracter = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el ancho: ");
        anchoRectangulo = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce la longitud: ");
        longitudRectangulo = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce el caracter a imprimir: ");
        caracter = scan.nextLine();

        imprimirRectangulo(anchoRectangulo, longitudRectangulo, caracter);
        
    }


    /**
     * Imprime por pantalla un réctangulo formado por un caracter
     * @param anchura La altura del rectángulo
     * @param longitud La anchura
     * @param simbolo El caracter que forma el rectángulo
     * @return void
     */

     
    public static void imprimirRectangulo(int anchura, int longitud, String simbolo){

        /* Controla la altura del rectangulo*/ 
        for(int i = 0; i < anchura; i++){
            for(int j = 0; j < longitud; j++){
                System.out.print(simbolo);
            }

            System.out.println(""); // Salto de línea
        }

    }

}
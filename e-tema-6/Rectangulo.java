/**
 * Ejercicio 17
 * @author Rafael Carrió
 * 
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

    public static void imprimirRectangulo(int anchura, int longitud, String simbolo){

        for(int i = 0; ){}

    }
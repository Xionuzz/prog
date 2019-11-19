/**
 * 
 * 
 * 
 */

import java.util.Scanner;

public class SecuenciaCeros {


    public static void main(String Args[]){

        int numeroSustituir = 0;
        String letra = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el número que quieres sustituir: ");
        numeroSustituir = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce la letra sustituta: ");
        letra = scan.nextLine();
        letra = letra.toUpperCase();
        imprimirNumeros(numeroSustituir, letra);
    }

    public static void imprimirNumeros(int numeroSustituir, String letra){

        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= 9; k++){
                    for(int l= 0; l <= 9; l++){
                        
                        if(i == numeroSustituir){
                            System.out.print(letra + "-");
                        } else {
                            System.out.print(i + "-");
                        }

                        if(j == numeroSustituir){
                            System.out.print(letra + "-");
                        } else {
                            System.out.print(j + "-");
                        }

                        if(k == numeroSustituir){
                            System.out.print(letra + "-");
                        } else {
                            System.out.print(k + "-");
                        }

                        if(l == numeroSustituir){
                            System.out.print(letra);
                        } else {
                            System.out.print(l);
                        }

                        System.out.println("");
                    }
                }
            }       
        }
    }
}
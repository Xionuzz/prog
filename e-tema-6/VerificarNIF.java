/**
 * Ejercicio 19
 * @author Rafael Carrió
 * Comprueba si un NIF introducido es correcto.
 */

import java.util.Scanner;


public class VerificarNIF {

    public static void main(String Args[]){
        
        String NIF = obtenerNIF();
        verificarNIF(NIF);
       
    }


    /**
     * Obtiene el NIF
     * 
     * @return
     */


    public static String obtenerNIF(){
        
        Scanner scan = new Scanner(System.in);
        
        String NIF = "";
        
        System.out.print("Introduce tu NIF (DNI con letra): ");
        NIF = scan.nextLine();
        
        return NIF;

    }


    /**
     * 
     * @param DNI
     * @return
     */


    public static String verificarNIF(String NIF){
        
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        String errorMessage = "El DNI introducido no es correcto";
        int numeroDNI = 0;
        int restoDNI = 0;
        char letraDNI = 'e';


        numeroDNI = Integer.parseInt(DNI);
        restoDNI = numeroDNI % 23;

        for(int i = 0; i < letrasDNI.length();i++){
            if(restoDNI == i){
                letraDNI = letrasDNI.charAt(i);
            }
        }

        if(letraDNI == 'e'){
            return errorMessage;
        } else{
            return String.valueOf(letraDNI);
        }
    }
}


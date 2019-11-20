/**
 * Ejercicio 18
 * @author Rafael Carrió
 * Calcula la letra correspondiente a un DNI
 */

import java.util.Scanner;


public class DNImodulo23 {

    public static void main(String Args[]){
        
        String NIF = "";
        String DNI = obtenerDNI();

        NIF = DNI + calcularNIF(DNI);

        System.out.println("El NIF es: " + NIF);
    }


    /**
     * Obtiene el DNI sin la letra
     * 
     * @return
     */


    public static String obtenerDNI(){
        
        Scanner scan = new Scanner(System.in);
        
        String dni = "";
        
        System.out.print("Introduce tu DNI(Sin la letra): ");
        dni = scan.nextLine();
        
        return dni;

    }
    

    /**
     * Calcula la letra del DNI
     * @param DNI
     * @return NIF 
     */


    public static String calcularNIF(String DNI){
        
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
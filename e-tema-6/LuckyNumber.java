/**
 * Ejercicio 20
 * @author Rafael Carrió
 * Comprueba el Lucky Number de una persona
 */

 
import java.util.Scanner;

import sun.tools.tree.IntegerExpression;


public class LuckyNumber {

    public static void main(String Args[]){
        
        System.out.println(tratarStringFecha());
    }

    public static String obtenerFecha(){
        
        String fechaNacimiento = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aa): ");
        fechaNacimiento = scan.nextLine(); 

        return fechaNacimiento;
    }

    public static int tratarStringFecha(){

        String fecha = obtenerFecha();
        int primeraSuma = 0;
        String numeros = "";

        for(int i = 0; i < fecha.length(); i++){
            
            if(Character.isDigit(fecha.charAt(i))){
                
                

                numeros += fecha.charAt(i);
            }

        }

        for(int j = 0; j < numeros.length(); j++){
            
            primeraSuma += Character.getNumericValue(numeros.charAt(j));
        }

        fecha = String.valueOf(primeraSuma);
        primeraSuma = 0;

        for(int k = 0; k < fecha.length(); k++){
            
            primeraSuma += Character.getNumericValue(fecha.charAt(k));
        }

        return primeraSuma;
    }
}
/*Calculadora básica: suma, resta, multiplica, divide y indica el resto de una división. 
 *@author: Rafa Carrió
 *@version: 1
*/

import java.util.Scanner;

public class Calculadora {

    public static void main(String Args[]){

        boolean cicloCalculadora = true; // Controla el bucle de la calculadora.
        int inputUsuario = 0; // Las operaciones solicitadas por el usuario.
        int primerOperando = 0;
        int segundoOperando = 0;
        int resultado = 0; // Almacena el resultado. 
        String retornoUsuario; // El usuario pulsa ENTER después de cada operación.

        Scanner scan = new Scanner(System.in);

        System.out.println("|||CALCULADORA|||\n");
        
        while(cicloCalculadora) {

            /*Muestra por pantalla un menu con las funciones de la calculadora disponibles*/
         
            System.out.println("Elige una opcion:");
            System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Resto division");
            System.out.println("------------------");
            System.out.println("0. Salir");

            inputUsuario = scan.nextInt(); // Lee que operación quiere hacer el usuario.
            scan.nextLine();

            switch(inputUsuario){
                
                case 0:
                    cicloCalculadora = false; // Finaliza el bucle y el programa al pulsar 0.
                    System.out.println("Gracias por usar la Calculadora");
                    break;
                case 1:
                    System.out.print("Introduce el primer sumando:");
                    primerOperando = scan.nextInt();
                    scan.nextLine(); // Consumir retorno de carro.
                    System.out.print("Introduce el segundo sumando:");
                    segundoOperando = scan.nextInt();
                    scan.nextLine();
                    resultado = primerOperando + segundoOperando;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0; // Resetea la variable para almacenar más operaciones.
                    break;
                case 2:
                    System.out.print("Introduce el minuendo:");
                    primerOperando = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Introduce el sustraendo:");
                    segundoOperando = scan.nextInt();
                    scan.nextLine();
                    resultado = primerOperando - segundoOperando;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;
                    break;
                case 3:
                    System.out.print("Introduce el primer operador:");
                    primerOperando = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Introduce el segundo operador:");
                    segundoOperando = scan.nextInt();
                    scan.nextLine();
                    resultado = primerOperando * segundoOperando;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;	
                    break;
                case 4:
                    System.out.print("Introduce el dividendo:");
                    primerOperando = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Introduce el divisor:");
                    segundoOperando = scan.nextInt();
                    scan.nextLine();
                    resultado = primerOperando / segundoOperando;
                    System.out.println("El resultado es: " + resultado);
                    resultado = 0;	
                    break;
                case 5:
                    System.out.print("Introduce el dividendo:");
                    primerOperando = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Introduce el divisor:");
                    segundoOperando = scan.nextInt();
                    scan.nextLine();
                    resultado = primerOperando % segundoOperando;
                    System.out.println("El resto de la division es: " + resultado);
                    resultado = 0;	
                    break;
                default:
                    System.out.println("Error, comando no valido");
                    break;
            }	    

            System.out.println("Pulsa ENTER para continuar");
            retornoUsuario = scan.nextLine();
        }
    }
}


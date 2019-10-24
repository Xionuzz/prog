import java.util.Scanner;

public class Calculadora {

    public static void main(String Args[]){

        boolean cicloCalculadora = true; // Controla el bucle de la calculadora, evalua a falso cuando el usuario introduce 0.
        int inputUsuario = 0;
        int primerOperando = 0;
        int segundoOperando = 0;
        int resultado = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("|||CALCULADORA|||");
        
        while(cicloCalculadora){

        /*Muestra por pantalla un menu con las funciones de la calculadora disponibles*/
         
        System.out.println("Elige una opción:");
        System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Resto división");
        System.out.println("------------------");
        System.out.println("0. Salir");

        inputUsuario = scan.nextInt();
        scan.reset();

        switch(inputUsuario){
            case 0:
            cicloCalculadora = false; // Finaliza el bucle y el programa
            break;
            case 1:
                System.out.print("Introduce el primer sumando:");
                primerOperando = scan.nextInt();
                scan.reset();
                System.out.print("Introduce el segundo sumando:");
                segundoOperando = scan.nextInt();
                scan.reset();
                resultado = primerOperando + segundoOperando;
                System.out.println("El resultado es: " + resultado);
                resultado = 0;
            break;
            case 2:
                System.out.print("Introduce el minuendo:");
                primerOperando = scan.nextInt();
                scan.reset();
                System.out.print("Introduce el sustraendo:");
                segundoOperando = scan.nextInt();
                scan.reset();
                resultado = primerOperando - segundoOperando;
                System.out.println("El resultado es: " + resultado);
                resultado = 0;
            break;
            case 3:
                System.out.print("Introduce el primer operador:");
                primerOperando = scan.nextInt();
                scan.reset();
                System.out.print("Introduce el segundo operador:");
                segundoOperando = scan.nextInt();
                scan.reset();
                resultado = primerOperando * segundoOperando;
                System.out.println("El resultado es: " + resultado);
                resultado = 0;
            break;
            case 4:
                System.out.print("Introduce el dividendo:");
                primerOperando = scan.nextInt();
                scan.reset();
                System.out.print("Introduce el divisor:");
                segundoOperando = scan.nextInt();
                scan.reset();
                resultado = primerOperando / segundoOperando;
                System.out.println("El resultado es: " + resultado);
                resultado = 0;
            break;
            case 5:
                System.out.print("Introduce el dividendo:");
                primerOperando = scan.nextInt();
                scan.reset();
                System.out.print("Introduce el divisor:");
                segundoOperando = scan.nextInt();
                scan.reset();
                resultado = primerOperando % segundoOperando;
                System.out.println("El resto de la división es: " + resultado);
                resultado = 0;
            break;
            default:
            System.out.println("Error, comando no válido");
            break;
        }

        }
    }
}


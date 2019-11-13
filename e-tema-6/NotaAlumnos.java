/**
 * Ejercicio 12
 * @author Rafael Carrió
 * Calcula de manera aleatoria una nota del 1 al 10
 */


import java.util.Random;


public class NotaAlumnos {

    
    public static void main(String Args[]){
        
        final int NUMERO_ALUMNOS = 50;
        int numero = 0;
        imprimirNota(NUMERO_ALUMNOS);


    }


    public static int randomNumber(int randomNumber){
        
        Random rnd = new Random();
        randomNumber = rnd.nextInt(10 - 0) + 0; // TODO Que saque DIEZ?
        return randomNumber;

    }


    public static void imprimirNota(int NUMERO_ALUMNOS){

        int nota = 0;
        String calificacion = "";
        String nombre = "Alumno";

        for(int i = 1; i < NUMERO_ALUMNOS;i++){
           nota = randomNumber(nota);
           
           if (nota <= 4){
                System.out.printf("%s%d%d\n",nombre,i, nota);
           } else if(nota == 5){
                System.out.printf("%s%d%d\n",nombre,i, nota);
           } else if(nota == 6){
                System.out.printf("%s%d%d\n",nombre,i, nota);
           } else if(nota <= 8){
                System.out.printf("%s%d%d\n",nombre,i, nota);
           } else if(nota <= 10){
            System.out.printf("%s%d%d\n",nombre,i, nota);
           }
        }

    }
}

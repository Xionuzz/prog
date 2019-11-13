/**
 * Ejercicio 12
 * @author Rafael Carrió
 * Calcula de manera aleatoria una nota del 1 al 10
 */


import java.util.Random;


public class NotaAlumnos {

    
    public static void main(String Args[]){
        
        final int NUMERO_ALUMNOS = 50;
        imprimirNota(NUMERO_ALUMNOS);
    }


    /**
     * Genera un número aleatorio entre 0-10
     * @param randomNumber
     * @return Entero aleatorio
     */


    public static int randomNumber(int randomNumber){
        
        Random rnd = new Random();
        randomNumber = rnd.nextInt(10 - 0) + 0; 
        return randomNumber;

    }


    /**
     * Imprime por pantalla calificaciones con una nota alfabetica.
     * @param NUMERO_ALUMNOS
     * @return void
     */


    public static void imprimirNota(int NUMERO_ALUMNOS){

        int nota = 0;
        String calificacion = "";
        String nombre = "Alumno";

        for(int i = 1; i <= NUMERO_ALUMNOS;i++){
           
            nota = randomNumber(nota);
           
            if (nota <= 4){
                calificacion = "INSUFICIENTE";
                System.out.printf("%-5s%-2d%20s\n",nombre,i,calificacion);
            } else if(nota == 5){
                calificacion = "SUFICIENTE";
                System.out.printf("%-5s%-2d%20s\n",nombre,i,calificacion);
            } else if(nota == 6){
                calificacion = "BIEN";
                System.out.printf("%-5s%-2d%20s\n",nombre,i, calificacion);
            } else if(nota <= 8){
                calificacion = "NOTABLE";
                System.out.printf("%-5s%-2d%20s\n",nombre,i,calificacion);
            } else if(nota <= 10){
                calificacion = "EXCELENTE";
                System.out.printf("%-5s%-2d%20s\n",nombre,i,calificacion);
           }
        }
    }
}

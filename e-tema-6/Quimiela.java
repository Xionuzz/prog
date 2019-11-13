/**
 * Ejercicio 11
 * @author Rafael Carrio
 * Imprime por pantalla una Quimiela de futbol aleatoria
 */


import java.util.Random;


public class Quimiela {

    public static void main(String args[]){

        final int NUMERO_PARTIDOS = 16;
        printQuimiela(NUMERO_PARTIDOS);
    }


    /**
     * Genera y devuelve un número aleatorio con el método random
     * @param randomNumber
     * @return Numero aleatorio entre el 1 y el 3
     */
    public static int randomNumber(int randomNumber){
        
        Random rnd = new Random();
        randomNumber = rnd.nextInt(3 - 1 + 1) + 1;
        return randomNumber;

    }


    /**
     * Imprime formateado por pantalla una quimiela aleatoria.
     * @param partidos numero de partidos que juegan la quimiela.
     * @return void
     */


    public static void printQuimiela(int partidos){
       
        int numeroAle = 0;
        String tab = "Partido";
        String empate = "X";

        for(int i = 1; i < partidos; i++){
            numeroAle = randomNumber(numeroAle);
            if (numeroAle == 3){
                System.out.printf("%-5s%-2d%5s\n",tab,i, empate);
                
            }else{
                System.out.printf("%-5s%-2d%5d\n",tab,i, numeroAle);
            }
        }
    }

}
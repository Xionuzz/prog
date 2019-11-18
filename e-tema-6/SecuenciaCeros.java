/**
 * 
 * 
 * 
 */


public class SecuenciaCeros {


    public static void main(String Args[]){
        imprimirNumeros();
    }

    public static void imprimirNumeros(){

        int numeroUno = 0;
        int numeroDos = 0;
        int numeroTres = 0;
        int numeroCuatro = 0;

        int contadorTres = 1;
        int contadorDos = 1;

        boolean ejecutarBucle = false;

        for(int i = 0; i <= 200; i++){
            System.out.printf("%d-%d-%d-%d\n",numeroUno,numeroDos,numeroTres,numeroCuatro);

            //if(numeroUno == 5 || numeroDos == 5 || numeroTres == 5 || numeroCuatro == 5){
              //  letra();
            //}

            if(numeroCuatro < 9){
                numeroCuatro++;
            } else if (numeroTres < 9){
                numeroTres++;
                if(numeroTres == contadorTres){
                    numeroCuatro = 0;
                    contadorTres++;
                }
            } else if (numeroDos < 9){
                numeroDos++;
            } else if (numeroUno < 9){
                numeroUno++;
            }

            //System.out.printf("%d" + "-" + "%d" + "-" + "%d" + "-" + "%d",numeroUno,numeroDos,numeroTres,numeroCuatro);
        }
    }

    public static String letra(){
        return "hola";
    }
}
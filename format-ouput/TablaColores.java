public class TablaColores { 

    public static void main(String Args[]) {

        String s = "";

		/*Imprime en pantalla la tabla ASCI de colores de 8*/
		
		for(int i = 0; i <= 1; i++){

            for(int j = 0; j <= 7; j++){
                System.out.println(""); // Salto de línea al principio del cambio de fondo

                for(int k = 0; k <= 7; k++){
                    s = i + ";3" + j + ";4" + k; // Actualiza la string para mostrar el código correspondiente al color y el fondo
                    System.out.printf("\u001B[" + i + ";3" + j + ";4" + k  + "m" + "%7s",s);
                }
        }

        System.out.printf("\u001B[0;30;40m" + "%12s", s); // Salto de línea al cambiar a negrita.
        
        }
        
        System.out.println(""); // Salto de línea final al acabar el programa.
    }
}
/**
 * Ejercicio 13
 * @author Rafael Carrió
 * Escribe un mensaje de saludo en el idioma elegido.
 */


import java.util.Scanner;

 public class SaludaIdioma {

    public static void main(String Args[]){
        
        Scanner scan = new Scanner(System.in);

        boolean validado = false;
        int codigo = 0;
        String nombre = "";
        System.out.print("Introduce tu nombre: ");
        nombre = scan.nextLine();

        do{
            System.out.print("Introduce el idioma (1-ENG 2-ESP 3-CAT)");
            codigo = scan.nextInt();
            scan.nextLine();
            if (codigo > 0 && codigo < 4){
                validado = true;
            }
        } while(!validado);

       saludoPersonalizado(nombre, codigo);
    }

    public void saludoPersonalizado(String test, int codigo){

        switch(codigo){
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
        }


    }

}
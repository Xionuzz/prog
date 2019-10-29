public class NumerosAlineadosAnidado { 

    public static void main(String Args[]) {

        String s = "";
        String a = "";
        
		/*Imprime formateado en pantalla los números del 1 al 9*/
		
		for(int i = 1; i <= 9; i++){
            s = s + i;
           
            System.out.printf("%9s",s);
            
            for(int c = 1; i <= 9; c++){
                a = a + c
                System.out.printf("%1s",a);
            }
            
		}
    }
}
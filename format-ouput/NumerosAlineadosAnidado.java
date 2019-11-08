public class NumerosAlineadosAnidado { 

    public static void main(String Args[]) {

        String s = "";
        String a = "";
        
		/*Imprime formateado en pantalla los números del 1 al 9*/
		
		for(int i = 1; i <= 9; i++){
            s = s + i;
            System.out.printf("%9s",s);
            a = "";
            
            for(int c = s.length() - 1; c >= 0; c--){
                a = a + s.charAt(c);
            }
            System.out.printf("%-9s\n",a); 
		}
    }
}
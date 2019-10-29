
public class NumerosColor { 

    public static void main(String Args[]) {

		String s = "";
		
		/*Imprime formateado en pantalla los números del 1 al 9*/
		
		for(int i = 1; i <= 9; i++){
			s = s + i;
			System.out.printf("\u001B[1;30;40m%9s\n",s);
		}
    }
}
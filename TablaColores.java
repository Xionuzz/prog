public class TablaColores { 

    public static void main(String Args[]) {

        String s = "";
        int color = 0;
        int fondo = 0;
        int bold = 0;

        int argumentoBold = 0;
        int argumentoColor = 31;
        int argumentoFondo = 40;
        
		/*Imprime formateado en pantalla los números del 1 al 9*/
		
		for(int i = 0; i <= 1; i++){
            
            for(int j = 0; j <= 7; j++){
                
            
        
            for(int k = 0; k <= 7; k++){
                System.out.println( i + ";3" + j + ";4" + k);

            }
        }
            //System.out.printf("%d;%2d;%2d\n", argumentoBold, argumentoColor,argumentoFondo);
            //argumentoColor++;
            //argumentoFondo++;
            




           // System.out.printf("\u001B[3"+color+ ";4" + fondo + "m%9s",s);
           // System.out.printf("\u001B[3"+color+ ";4" + fondo + "m%9s\n",s);
            
		}
    }
}
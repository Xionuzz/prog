import java.util.Scanner;

public class EjercicioQuince {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float gradosCelsius;
        final float CONVERSIONKELVIN = 273.15f;         // Crea un final con la constante para convertir a grados Kelvin
        float gradosKelvin;
        float gradosFahrenheit;

        System.out.println("Introduce una temperatura en grados celsius: ");

        gradosCelsius = scan.nextFloat();
        gradosKelvin = CONVERSIONKELVIN + gradosCelsius;
        gradosFahrenheit = (gradosCelsius * 9/5) + 32;   // Aplicar fórmula para convertir a grados Fahrenheit

        
        // Mostrar resultado por pantalla
        
        System.out.println("Esta temperatura es equivalente a:");
        System.out.println("Grados Kelvin = " + gradosKelvin);
        System.out.println("Grados Fahrenheit = " + gradosFahrenheit);
    }



}
public class EjercicioDiez {

    public enum mesesAño {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}

    public enum notasMusicales {DO, RE, MI, FA, SOL, LA, SI, DOAGUDO}

    public enum calificacionesAlumno {INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE, NP}
    
    public static void main (String Args[]) {

	calificacionesAlumno notaRafa = calificacionesAlumno.EXCELENTE;
	mesesAño mes = mesesAño.OCTUBRE;
	notasMusicales notaMusical = notasMusicales.RE;
	
	System.out.println("Estamos en el mes: " + mes);
	System.out.println("La mejor nota musical es: " + notaMusical);
	System.out.println("La nota del alumno Rafa es: " + notaRafa);
    }

}

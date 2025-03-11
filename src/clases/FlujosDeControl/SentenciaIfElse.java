package FlujosDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 6.8f;

        /*A diferencia de otros casos que he usado el if else, aprendo que
        si es una sola sentencia, puedo solo utilizar una sola llave como en el siguiente ejemplo, pero
        si son dos o mas, como dos print, dara error, esto debido a que excede las sentencias permitivas,
        pero como buenas practicas, se recomienda siempre usar llaves para cerrar la condicion*/
        if(promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio!!");
            System.out.println();
        }else if (promedio >= 6.0){
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!!");
        } else if (promedio >= 5.0 ) {
            System.out.println("Regular, necesitas esforzarte un poco mas!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado");
        }
        System.out.println("Tu promedio es " + promedio);
    }
}

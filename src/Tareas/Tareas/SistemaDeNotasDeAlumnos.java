package Tareas.Tareas;

import java.util.Scanner;
//Nota, ejercicio mal hecho por mi parte, no entendi los requerimientos
public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Double[] calificacion = new Double[2];//array
        String mensaje = "La calificacion es invalida, porfavor respeta el rango de calificaciones";//mensaje de control
        int notasMayores5 = 0;
        int notasMenores4 = 0;
        int notasIguales1 = 0;
        double sumanotasMayores5 = 0;
        double sumanotasMenores4 = 0;
        double sumatotal = 0;

        System.out.println("---Ingresa 20 calificaciones con rango de 1 a 7 porfavor--- \n");//peticiones

        int i = 0;//inicio de conteo
        for (;i < calificacion.length ;){//aumento

            System.out.println("Ingrese su calificacion: ");
            calificacion[i] = s.nextDouble();//lectura de el ingreso del usuario

            boolean evaluarMax = ( calificacion[i] < 1.0 );//evaluador
            boolean evaluarMin = ( calificacion[i] > 7.0 );//evaluado

            if ( calificacion[i] == 1){
                notasIguales1++;

            } else if (calificacion[i] > 5){
                notasMayores5++;

            }else if (calificacion[i] < 4){
                System.out.println ("");

            }

            if (evaluarMax){//control de errores
                System.out.println( mensaje );
                break;

            } else if (evaluarMin) {
                System.out.println( mensaje );
                break;

            }
            i++;//aumento
        }
    }
}

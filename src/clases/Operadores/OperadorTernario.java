package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String variable = 7 == 7 ? "si es verdadero": "si es falso";/*El dos puntos
        sirve con un else, osea que sirve como si no es esto, imprimir lo otro, camino
        alternativo*/
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas, ciencias, historia = 0.0;
        System.out.println("Ingresa la nota de matematicas entre 2.0 - 7.0");
        matematicas = s.nextDouble();

        System.out.println("Ingresa la nota de ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();

        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";/*Si promedio es mayor o igual a
        5.49 imprimir aprobado, de lo contrario rechazado*/
        System.out.println("estado = " + estado + "\t" + "//" + promedio + "//");

//        if( promedio >= 5.49){
//            System.out.println("Aprobado" );
//        }else{
//            System.out.println("Rechazado");
//        } El equivalente del ejercicio de arriba con if seria este, es mas corto el primero
//        por las líneas de código
    }
}

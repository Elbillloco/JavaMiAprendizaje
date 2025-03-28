package Tareas.Tareas;

import java.util.Scanner;

public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Double[] calificaciones = new Double[20];
        double contadorCalificacion = 0;
        double contadorMayor5 = 0;
        double contadorMenor4 = 0;
        double contador1 = 0;
        double totalMayor5 = 1;
        double totalMenor4 = 1;
        double total1 = 1;
        double totalGlobal;
        double promedioMayor5;
        double promedioMenor4;
        double promedio1;
        boolean continuar = true;

        System.out.println("--Bienvenido al Sistema de notas de Alumnos--\n");

        while (continuar){
            for (int i = 0; i <= calificaciones.length; ){
                System.out.println("Ingrese su calificacion en escala de 1 a 7: ");
                contadorCalificacion = s.nextDouble();

                if (contadorCalificacion > 7.0) {
                System.out.println("Porfavor ingrese calificaciones dentro del rango");
                break;

                } else if (contadorCalificacion < 1.0) {
                    System.out.println("Porfavor ingrese calificaciones dentro del rango");
                    break;

                }else if (contadorCalificacion == 1.0){
                    contador1 += total1;
                    System.out.println("Se ha sumado!!");

                }else if (contadorCalificacion <=4.0){
                    contadorMenor4 += totalMenor4;
                    System.out.println("Se ha sumado!!");

                } else if (contadorCalificacion >=5.0) {
                    contadorMayor5 += totalMayor5;
                    System.out.println("Se ha sumado!!");

                }


                i++;

                if (i == calificaciones.length){
                    promedio1 = ( contador1 / calificaciones.length ) * 7;
                    promedioMayor5 = ( contadorMayor5 / calificaciones.length) * 7;
                    promedioMenor4 = ( contadorMenor4 / calificaciones.length ) * 7 ;
                    totalGlobal = (( promedio1 + promedioMayor5 + promedioMenor4 ) / calificaciones.length ) * 10  ;

                    System.out.println("Total de mayor o igual a 5 son = " + contadorMayor5);
                    System.out.println("Total de menor o igual a 4 son = " + contadorMenor4);
                    System.out.println("Total de igual a 1 son = " + contador1 + "\n");

                    System.out.println("Promedio total de mayores o iguales a 5 son = " + promedioMayor5);
                    System.out.println("Promedio total de menores o iguales a 4 son = " + promedioMenor4);
                    System.out.println("Promedio total de iguales a 1 son = " + promedio1 + "\n");

                    System.out.println("Promedio total de todas las calificaciones es = " + totalGlobal);
                    break;

                }

            }
            continuar = false;
        }

    }
}
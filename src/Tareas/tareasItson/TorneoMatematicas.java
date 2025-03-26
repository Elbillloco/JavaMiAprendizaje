package Tareas.tareasItson;
import java.util.Scanner;
import java.util.ArrayList;

public class TorneoMatematicas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<String> participante = new ArrayList<>();
        String entradaAlumnos;
        int entradaPuntaje;
        ArrayList<Integer> puntaje = new ArrayList<>();
        int formulaPromedioPuntajeTotal = 0;
        boolean otro = true;
        boolean comenzar = true;
        boolean continuar = true;

        int sumaTotalPuntos = 0;
        while (comenzar) {

            System.out.println("--Bienvenido al torneo de Matematicas--\n");//bienvenida

            while (otro) {//inicio del bucle

                //Intrucciones

                System.out.println("Porfavor ingrese los participantes(Si quiere salir del programa, escriba (-1): ");
                System.out.println("Escriba \"Continuar\" para pasar a los puntajes\n" );

                entradaAlumnos = s.nextLine();//entrada de datos de estudiantes
                if (entradaAlumnos.equalsIgnoreCase("-1")){//si el dato es -1, cerrar programa
                    comenzar = false;
                    continuar = false;
                    break;
                }

                participante.add(entradaAlumnos);//añade arrays agregados por el usuario

                if (entradaAlumnos.equalsIgnoreCase("continuar")) {//evalua continuaciones

                    participante.remove("continuar");//evita agregar un valor indeseado al salir
                    otro = false;
                    break;
                }
            }

            while (continuar){//agrega puntajes

                System.out.println("Porfavor ingrese los puntajes de los participantes en escala de 0 a 100 " + participante + "(Si quiere salir del programa, escriba (-1): ");//instrucciones

                entradaPuntaje = s.nextInt();//entrada de puntajes

                if (entradaPuntaje <= 0){
                    System.out.println("Porfavor ingrese puntaje en escala de 0 a 100");
                    continuar = false;

                } else if (entradaPuntaje > 100) {
                    System.out.println("Porfavor ingrese puntaje en escala de 0 a 100");
                    continuar = false;

                }else if (entradaPuntaje == -1){//evalua el cerrado del programa
                    continuar = false;
                }

                puntaje.add(entradaPuntaje);//agrega arrays deseados por el usuario

                if ( puntaje.size() == participante.size() ){//al llegar a la misma cantidad de participantes y puntaje, pasa a evaluar todo
                    System.out.println("Resultados:");

                        for (int i = 0 ; i <= puntaje.size(); ){//incrementa para imprimir datos

                            System.out.println(participante.get(i) + " = " + puntaje.get(i) + " Puntos");//muestra datos

                            i++;//aumenta la ubicacion de los datos de puntaje y participantes para mostrar cada ingreso

                            if (i == puntaje.size()){//al llegar a cierto incremento cierra el proceso
                                break;
                            }
                        }

                            for (int j = 0 ; j <= puntaje.size(); ){//suma los resultados totales

                                sumaTotalPuntos += puntaje.get(j);//almacena la suma

                                j++;

                                if ( j == puntaje.size()){//cuando el incremento j llega al valor de comparacion, imprime resultados

                                    formulaPromedioPuntajeTotal = sumaTotalPuntos / participante.size() ;//formula del promedio
                                    System.out.println("Participantes del torneo = " + participante.size());//total participantes
                                    System.out.println("Total de puntos globales = " + sumaTotalPuntos);//total de puntos globales
                                    System.out.println("Promedio de puntos globales = " + formulaPromedioPuntajeTotal);//promedio de puntos globales

                                    break;//termina proceso
                                }
                            }
                            break;//termina proceso
                }
            }
            break;//termina programa
        }
    }
}

package Tareas.tareasItson;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GestionDeCalificaciones {
    public static void main(String[] args) {

        //Variables

        Scanner s = new Scanner(System.in);

        Double[] calificacion = new Double[3];
        String[] materias = new String[3];
        String[] peticion = new String[7];

        String[] ingrese = new String[3];
        Double[] formulas = new Double[2];
        boolean comenzar = true;

        String nombreAlumno;

        peticion[0] = "Ingrese el nombre del alumno: ";
        peticion[1] = "Ingrese su calificacion a la materia deseada: ";
        peticion[2] = "Bienvenido al programa de gestion de calificaciones, Empezamos?\n Empezar - Salir: ";
        peticion[3] = "Porfavor ingrese una opcion valida";
        peticion[4] = "Quieres ingresar otro alumno?\n Si/No: ";
        peticion[5] = "Gracias por usar el programa de Gestion de Calificaciones";
        peticion[6] = "La calificacion debe ser positiva...";

        calificacion[0] = 0.0;
        calificacion[1] = 0.0;
        calificacion[2] = 0.0;

        materias[0] = "Matematicas";
        materias[1] = "Ciencias";
        materias[2] = "Historia";

        //Peticiones y evaluaciones

        while (comenzar) {

            System.out.println(peticion[2]);
            ingrese[0] = s.nextLine();

            //Condicionales y manejo de errores
            if (ingrese[0].equalsIgnoreCase("empezar")) {//Empieza el programa
                System.out.println(peticion[0]);
                nombreAlumno = s.nextLine();

                //Manejo de error al salirse del límite for
                try {
                    for (int i = 0; i <= materias.length; i++) {
                        System.out.println(materias[i]);
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(peticion[1]);
                }
                try {//Manejo de error si se ingresa un dato no deseado

                    calificacion[0] = s.nextDouble();

                    if (calificacion[0] < 0) {
                        System.out.println(peticion[6] + "\n");
                        main(args);
                    }
                    System.out.println("-");

                    calificacion[1] = s.nextDouble();
                    if (calificacion[1] < 0) {
                        System.out.println(peticion[6] + "\n");
                        main(args);
                    }
                    System.out.println("-");

                    calificacion[2] = s.nextDouble();
                    if (calificacion[2] < 0) {
                        System.out.println(peticion[6] + "\n");
                        main(args);
                    }
                    System.out.println("-");

                    //Formula de promedio
                    formulas[0] = calificacion[0] + calificacion[1] + calificacion[2];
                    formulas[1] = (formulas[0] * 3) / 10;


                    //Aprovados y reprobados
                    if (formulas[1] < 6) {
                        System.out.println("El alumno " +  ">" + nombreAlumno + "<" + " Reprobado " + "Promedio final: " + formulas[1]);
                    }
                    if (formulas[1] >= 6) {
                        System.out.println("El alumno " + ">" + nombreAlumno + "<" + " Aprobado " + "Promedio final: " + formulas[1]);
                    }

                } catch (InputMismatchException e) {
                    System.out.println("!!Ingrese correctamente su calificacion porfavor!!");
                    main(args);
                }

                System.out.println(peticion[4]);
                String comenzarOpcion = s.next();
                s.nextLine();

                if (comenzarOpcion.equalsIgnoreCase("si")) {
                    comenzar = true;
                } else {
                    comenzar = false;
                }

            } else if (ingrese[0].equalsIgnoreCase("no")) {
                System.out.println(peticion[5]);
                comenzar = false;

            }else {
                System.out.println(peticion[3] + "\n");
            }
        }
    }
}


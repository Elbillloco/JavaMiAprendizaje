package Tareas;


import java.util.Scanner;
import java.util.InputMismatchException;

public class EjercicioRapidoTernario {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] peticion = new String[4];

        peticion[0] = "Introduce el primer digito: ";
        peticion[1] = "Introduce el segundo digito: ";
        peticion[2] = "Gracias por usar el programa<3\n";
        peticion[3] = "Ingrese un valor numerico porfavor...\n";

        boolean continuar = true;
        String seguir1, seguir2;

        try {

            System.out.println("Quieres empezar el programa?\n Si/No");
            seguir1 = s.nextLine();

            if (seguir1.equalsIgnoreCase("si")) {
                while (continuar) {

                    System.out.println(peticion[0]);
                    int a = s.nextInt();

                    System.out.println(peticion[1]);
                    int b = s.nextInt();

                    s.nextLine();

                    int evaluadorMayor, evaluadorMenor;

                    evaluadorMayor = (a > b) ? a : b;
                    evaluadorMenor = (a < b) ? a : b;

                    System.out.println("Orden de mayor a menor:\n " + "\r>Mayor: \n" + evaluadorMayor + "\n \r<Menor: \n" + evaluadorMenor);

                    System.out.println("Quieres terminar el programa?\nSi/No ");
                    seguir2 = s.nextLine();

                    if (seguir2.equalsIgnoreCase("si")) {
                        continuar = false;
                        System.out.println(peticion[2]);

                    } else if (seguir2.equalsIgnoreCase("no")){
                        continuar = true;
                        System.out.println(peticion[2]);
                    }
                }

            } else if (seguir1.equalsIgnoreCase("no")) {
                continuar = false;
                System.out.println(peticion[2]);
            }

            }catch(InputMismatchException e){
            System.out.println(peticion[3]);
            main(args);
        }
    }
}

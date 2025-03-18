package Tareas.Tareas;
import java.util.Scanner;

public class NumeroMenorDeMultiplesValores {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Integer[] cantidad = new Integer[10];

        System.out.println("--Bienvenido porfavor ingrese 10 numeros--");//Da la bienvenida


        int i = 0;//Empieza a contar desde 1

        for ( ;i < cantidad.length; ){

            System.out.println("Ingrese su numero porfavor: ");
            cantidad[i] = s.nextInt();
            i++;

            if (i == 10){
                for (int j = 0; j <= cantidad.length -1; j++) {
                    System.out.print("(" + cantidad[j] + ")");
                }
            }
        }

        int min = cantidad[0];

        for (int k : cantidad){
            if (k < min){
                min = k;
            }
        }
        if (min < 10){
            System.out.println("\nEl numero menor es menor que 10: " + min);
        }else {
            System.out.println("\nEl numero menor es mayor o igual que 10: " + min);
        }
    }
}

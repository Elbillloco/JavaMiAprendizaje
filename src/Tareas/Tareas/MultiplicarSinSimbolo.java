package Tareas.Tareas;

import java.util.Scanner;

public class MultiplicarSinSimbolo {
    public static void main(String[] args) {

        int a;
        int b;
        int c = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el numero para multiplicarlo sin signo: ");
        a = s.nextInt();//ingresas el numero a sumar

        System.out.println("Cuantas veces deseas sumarlo: ");
        b = s.nextInt();//ingresas las veces a sumar por si mismo

        for(int i = 0; i < b; i++){
            c += a;/*Lo suma el numero de veces que vale c, que c contiene el valor de a,
            osea que se sumara c + c, en dado caso que a valga 2, se sumaria 2 + 2, o si esta valiera
            5, seria 5 + 5 + 5 + 5 + 5, esto tambien por que esta aumentando esta variable tantas
            veces como el usuario ingreso que se sumaria el mismo numero*/
        }

        System.out.println("El resultado de sumar " + a + " Entre si mismo es: " + c);

    }
}

package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num1 = s.nextInt();

        System.out.println("ingrese un segundo numero: ");
        int num2 = s.nextInt();

        System.out.println("ingrese un tercer numero: ");
        int num3 = s.nextInt();

        System.out.println("ingrese un cuarto numero: ");
        int num4 = s.nextInt();

        max = (num1 > num2)? num1 : num2;//Si num1 es mayor a num2 se asigna num1, si no num2

        max = (max > num3)? max : num3;/* Aqui se asigna el valor del primer max, evaluandolos
        como, si el primero es mayor que el segundo, asigna el primero, si no asigna el segundo,
        dependiendo de lo que se evalue y cual sea el mayor, el resultado sera distinto por la
        evaluacion del mayor que y luego el signo de pregunta que significa cual es el que sera el
        evaluado, en este caso el numero mayor, si el numero mayor es uno u otro, se le asignara
        ese valor a la variable max, despues evaluara si el valor de max es mayor a 3, si es uno u otro,
        dependiendo de cual sea, nos lo dira en consola*/
        max = (max > num4)? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("max = " + max);
        System.out.println("Numero mayor es: " + max);
    }
}

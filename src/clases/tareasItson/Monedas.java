package tareasItson;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Monedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Moneda
        String peticion;
        double cantidad;

        //Moneda de cambio dolar
        double pesoD= 20.49;
        double euroD= 1.05;

        //Moneda de cambio peso
        double dolarP =0.049;
        double euroP = 0.047;

        //Moneda de cambio euro
        double pesoE = 0.049;
        double dolarE = 1.05;

        //Peticion moneda
        String textoPeticion = "---Ingresa la moneda de cambio en texto---\n \t \t 1.Peso 2.Dolar 3.Euro: ";
        String textoMonedas = "Ingrese la cantidad de monedas: ";

        //Peticiones
        System.out.println(textoPeticion);
        peticion = scanner.nextLine();


        System.out.println(textoMonedas);
        cantidad = scanner.nextDouble();

        //Condicionales
        if (peticion.equalsIgnoreCase("dolar")){
            System.out.println("Dolar en Pesos es >\t$" + (pesoD * cantidad) +"\n" + "Dolar en Euro es >\t$" + (euroD * cantidad));
        }
        if (peticion.equalsIgnoreCase("euro")){
            System.out.println("Euro en Pesos es >\t$" + (pesoE * cantidad) +"\n" + "Euro en Dolar es >\t$" + (dolarE * cantidad));
        }
        if (peticion.equalsIgnoreCase("peso")){
            System.out.println("Peso en Dolar es >\t$" + (dolarP * cantidad) +"\n" + "Peso en Dolar es >\t$" + (euroP * cantidad));
        }

    }
}

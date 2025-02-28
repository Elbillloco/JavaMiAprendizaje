package Tareas;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DetallesFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre o descripcion de su factura:");
        String nameFactura = scanner.nextLine();

        double a1 = 0;
        double a2 = 0;

        System.out.println("Ingrese el primer valor de su factura:");
        try{
            a1 = scanner.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("---Ingrese un valor numerico...---\n");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese el segundo valor de su factura:");
        try{
            a2 = scanner.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("---Ingrese un valor numerico...---\n");
            main(args);
            System.exit(0);
        }

        double total = a1 + a2;
        System.out.println("Total sin iva: " + "$" + total);

        double iva = total * .19 ;
        double totalIva = total + iva;
        System.out.println("Total con iva: " + "$" + totalIva);
        String textoFinal = "El monto final fue de\t" + total + "\tAñadiendole un iva de\t" + iva + "\ty siendo un total de: " + totalIva;
        System.out.println(textoFinal);
    }
}

package Primitivos;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VentanaDeDialogoScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");

        //String numeroStr = scanner.nextLine();


        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Ingrese un numero entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario ="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHexadecimal ="numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario ;
        mensaje += '\n' + mensajeHexadecimal;
        mensaje += '\n' + mensajeOctal ;

        System.out.println(mensaje);
    }
}

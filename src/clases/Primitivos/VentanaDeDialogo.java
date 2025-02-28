package Primitivos;

import javax.swing.*;

public class VentanaDeDialogo {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("///////");

        String mensajeBinario ="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("///////");

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0700;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("///////");

        String mensajeHexadecimal ="numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHex = 0x1f3;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario ;
        mensaje += '\n' + mensajeHexadecimal;
        mensaje += '\n' + mensajeOctal ;
        JOptionPane.showMessageDialog(null, mensaje);

        numeroDecimal = numeroDecimal + 9;
        System.out.println("numeroDecimal = " + numeroDecimal);
    }
}

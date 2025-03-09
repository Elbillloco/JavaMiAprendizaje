package Tareas;

import javax.swing.*;

public class ObtenerLargoTresNombres {
    public static void main(String[] args) {

        String[] nombre = new String[3];
        String[] evaluar = new String[2];
        String largo;

        nombre[0] = JOptionPane.showInputDialog(null,"Ingrese el nombre y apellido de su primer familiar\n");
        nombre[1] = JOptionPane.showInputDialog(null,"Ingrese el nombre y apellido de su segundo familiar\n");
        nombre[2] = JOptionPane.showInputDialog(null,"Ingrese el nombre y apellido de su tercer familiar\n");


        String[] separar1= nombre[0].split(" ");
        String[] separar2= nombre[1].split(" ");
        String[] separar3= nombre[2].split(" ");

        evaluar[0] = (nombre[0].length() > nombre[1].length()? nombre[0] : nombre[1]);
        evaluar[1] = (evaluar[0].length() > nombre[2].length()? evaluar[0] : nombre[2]);

        largo = evaluar[1].concat(" Tiene el nombre mas largo <3");
        System.out.println(largo);

    }
}

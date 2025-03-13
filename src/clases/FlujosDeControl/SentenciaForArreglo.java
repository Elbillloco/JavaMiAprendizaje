package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        //el corchete o [] puede ir o en el String o en el nombre de la variable pero no en ambos
        String[] nombres = {"Roberth", "Hernan", "Pedro", "Maria", "Pepe", "Lola", "Canela", "Lillia", "Filipio"};

        int count = nombres.length;/*Como buena practica es mejor dejarlo en una variable el metodo
        que utilizamos en este caso para que sea mas practico y manejable*/

        for (int i = 0; i <= count -1; i++){/*Importante dejar el -1 cuando se pone el <= debido a que son
        8 iteraciones de la variable nombre, pero empieza desde 0 para contar, entonces realmente son 7,
        entonces una forma de controlar el ArrayIndexOutOfBound osea un error, se utilizara esta forma*/

            if(nombres[i].equalsIgnoreCase("roberth")||/*En el curso utiliza el metodo .contains, que funciona
            como el .equals, solo que sirve para evaluar si la variable contiene tal valor o tal
            texto, no sirve tanto en este caso, por las mayusculas que no se ignoran*/

                nombres[i].equalsIgnoreCase("Filipio")){
                continue;/*En este caso ayuda a saltarse la iteracion expresada en el if y continuar con
                la itetacion del for*/
            }
            System.out.println(i + "-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");/*Le pregunta
        al usuario que nombre quiere buscar creando una variable que contenga ese nombre*/
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;//declaramos un boolean para evaluar si se encontro o no

        for (int i = 0; i < count; i++){/*Va incrementando de 1 en 1 en la variable nombres[] y
        evaluando 1 por 1 cada nombre puesto como valor de texto hasta encontrar su nombre ingresado...*/

            if (nombres[i].equalsIgnoreCase(buscar)){

                encontrado = true;/*En caso de encontrar su nombre, el valor cambia a true y evalua
                el primer if que imprime en una ventana de dialogo que su nombre fue encontrado junto
                con el nombre encontrado*/
                break;//Mata la peticion
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!!");
        }
        else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema!!");
        }/*De no encontrar ningun nombre le dice al usuario que no existe tal nombre en el sistema
        y termina el programa*/

    }
}

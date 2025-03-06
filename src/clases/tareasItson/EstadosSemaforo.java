package tareasItson;

import java.util.InputMismatchException;

public class EstadosSemaforo {
    public static void main(String[] args) {

        String[] estados = new String[3];
        String[] mensajes = new String[3];

        estados[0] = "--Verde--\n";
        mensajes[0] = "El semaforo esta en verde, puedes pasar!!";

        estados[1] = "--Amarillo--\n";
        mensajes[1] = "El semaforo esta en amarillo, baja la velocidad...";

        estados[2] = "--Rojo--\n";
        mensajes[2] = "El semaforo esta en Rojo, Detente!!";

        try{
            for (int i = 0; i <= estados.length; i++){
                System.out.println("\n" + estados[i].concat(mensajes[i]));

            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
            System.out.println("El programa a terminado.");
        }



//        if(obtener.equalsIgnoreCase("verde")){
//            System.out.println(estados[0].concat(mensajes[0]));
//
//        } else if (obtener.equalsIgnoreCase("amarillo")) {
//            System.out.println(estados[1].concat(mensajes[1]));
//
//        } else if (obtener.equalsIgnoreCase("rojo")) {
//            System.out.println(estados[0].concat(mensajes[2]));
//        }
    }
}

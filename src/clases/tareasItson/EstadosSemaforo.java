package tareasItson;

import java.util.Scanner;

public class EstadosSemaforo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] estados = new String[3];
        String[] mensajes = new String[3];
        String peticion = "Porfavor introduzca el estado del semaforo que desea ver... ";
        String obtener;

        estados[0] = "--Verde--\n";
        mensajes[0] = "El semaforo esta en verde, puedes pasar!!";

        estados[1] = "--Amarillo--\n";
        mensajes[1] = "El semaforo esta en amarillo, baja la velocidad...";

        estados[2] = "--Rojo--\n";
        mensajes[2] = "El semaforo esta en Rojo, Detente!!";

        System.out.println(peticion);
        obtener = s.nextLine();

        if(obtener.equalsIgnoreCase("verde")){
            System.out.println(estados[0].concat(mensajes[0]));

        } else if (obtener.equalsIgnoreCase("amarillo")) {
            System.out.println(estados[1].concat(mensajes[1]));

        } else if (obtener.equalsIgnoreCase("rojo")) {
            System.out.println(estados[0].concat(mensajes[2]));
        }
    }
}

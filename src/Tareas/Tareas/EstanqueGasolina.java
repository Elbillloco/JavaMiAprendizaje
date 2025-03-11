package Tareas.Tareas;
import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Double[] tanque = new Double[6];
        String[] indicador = new String[7];
        String[] mensaje = new String[2];
        String seguimos;
        double litrosCliente;
        boolean operador = true;

        indicador[0] = "Estanque Lleno";
        indicador[1] = "Estanque Casi lleno";
        indicador[2] = "Estanque 3/4";
        indicador[3] = "Medio Estanque";
        indicador[4] = "Estanque Suficiente";
        indicador[5] = "Estanque Insuficiente";
        indicador[6] = "Quieres seguir con el programa?\n Si/No";

        mensaje[0] = "Porfavor ingrese cuanta gasolina tiene en su tanque 0L / 70L: ";
        mensaje[1] = "Gracias por usar el programa para comprobar el Estanque de Gasolina";

        tanque[0] = 70.0;
        tanque[1] = 60.0;
        tanque[2] = 40.0;
        tanque[3] = 35.0;
        tanque[4] = 20.0;
        tanque[5] = 1.0;

        while (operador){

            System.out.println(mensaje[0]);
            litrosCliente = s.nextDouble();

            if ( litrosCliente == tanque[0] ){
                System.out.println(indicador[0]);

            }else if( (litrosCliente < tanque[0]) && (litrosCliente > tanque[2])){
                System.out.println(indicador[1]);

            }else if( (litrosCliente < tanque[1] ) && ( litrosCliente > tanque[3])){
                System.out.println(indicador[2]);

            } else if( (litrosCliente < tanque[2] ) && ( litrosCliente > tanque[4])){
                System.out.println(indicador[3]);

            }else if( (litrosCliente < tanque[3] ) && ( litrosCliente > tanque[5])) {
                System.out.println(indicador[4]);

            }else if( litrosCliente == tanque[5]) {
                System.out.println(indicador[5]);
            }

            System.out.println(indicador[6]);
            seguimos = s.next();
            s.nextLine();

            if (seguimos.equalsIgnoreCase("si")){
                operador = true;

            }else if (seguimos.equalsIgnoreCase("no")){
                System.out.println(mensaje[1]);
                operador = false;
            }
        }
    }
}
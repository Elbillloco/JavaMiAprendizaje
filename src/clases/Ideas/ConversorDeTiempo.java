package Ideas;

import java.util.Scanner;
public class ConversorDeTiempo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tiempoSegundosMinutos, tiempoHorasDias, cantidadTiempoMinutos, cantidadTiempoHoras, cantidadTiempoDias;
        String tipoDato;
        tiempoSegundosMinutos = 60;
        tiempoHorasDias = 24;

        String peticion = "Porfavor introduce tu convercion: \n" +
                "-Minutos, Horas o Dias-";

        String peticionMinutos = "Porfavor introduce su cantidad de tiempo en Segundos: ";
        String peticionHoras= "Porfavor introduce su cantidad de tiempo en Minutos: ";
        String peticionDias = "Porfavor introduce su cantidad de tiempo en Horas: ";

        System.out.println(peticion);
        tipoDato = scanner.next();

        if(tipoDato.equalsIgnoreCase("minutos")){
            System.out.println(peticionMinutos);
            cantidadTiempoMinutos = scanner.nextDouble();
            System.out.println( cantidadTiempoMinutos * ( 1 / tiempoSegundosMinutos));
        }

        if (tipoDato.equalsIgnoreCase("horas")){
            System.out.println(peticionHoras);
            cantidadTiempoHoras = scanner.nextDouble();
            System.out.println( cantidadTiempoHoras * (1 / tiempoSegundosMinutos));
        }

        if (tipoDato.equalsIgnoreCase("dias")){
            System.out.println(peticionDias);
            cantidadTiempoDias = scanner.nextDouble();
            System.out.println( cantidadTiempoDias * ( 1 / tiempoHorasDias));
        }
    }
}

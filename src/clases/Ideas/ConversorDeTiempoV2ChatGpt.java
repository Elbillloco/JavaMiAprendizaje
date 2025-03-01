package Ideas;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ConversorDeTiempoV2ChatGpt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tiempoSegundosMinutos = 60;
        double tiempoMinutosHoras = 60;
        double tiempoHorasDias = 24;

        while (true) {
            System.out.println("Por favor introduce tu conversión: \n" +
                    "- Minutos, Horas o Días - (Escribe 'salir' para terminar)");

            String tipoDato = scanner.next();

            if (tipoDato.equalsIgnoreCase("salir")) {
                System.out.println("Gracias por usar el conversor de tiempo. ¡Hasta luego!");
                break;
            }

            try {
                if (tipoDato.equalsIgnoreCase("minutos")) {
                    System.out.println("Por favor introduce la cantidad de tiempo en Segundos: ");
                    if (!scanner.hasNextDouble()) {
                        throw new InputMismatchException();
                    }
                    double cantidadTiempoSegundos = scanner.nextDouble();
                    System.out.println("Resultado: " + (cantidadTiempoSegundos / tiempoSegundosMinutos) + " minutos.");
                } else if (tipoDato.equalsIgnoreCase("horas")) {
                    System.out.println("Por favor introduce la cantidad de tiempo en Minutos: ");
                    if (!scanner.hasNextDouble()) {
                        throw new InputMismatchException();
                    }
                    double cantidadTiempoMinutos = scanner.nextDouble();
                    System.out.println("Resultado: " + (cantidadTiempoMinutos / tiempoMinutosHoras) + " horas.");
                } else if (tipoDato.equalsIgnoreCase("dias")) {
                    System.out.println("Por favor introduce la cantidad de tiempo en Horas: ");
                    if (!scanner.hasNextDouble()) {
                        throw new InputMismatchException();
                    }
                    double cantidadTiempoHoras = scanner.nextDouble();
                    System.out.println("Resultado: " + (cantidadTiempoHoras / tiempoHorasDias) + " días.");
                } else {
                    System.out.println("Entrada no válida. Por favor, introduce 'minutos', 'horas' o 'dias'.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Introduce un número válido.");
                scanner.next(); // Limpiar el buffer de entrada incorrecta
            }
        }
        scanner.close();
    }
}

package FlujosDeControl;

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while ( j <= 8 ) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": Descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", Trabajando a las " + j + "hrs.");
                j++;
            }
        }

        System.out.println("\n--------------------------------------");

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while ( j < 5 ) {
                if (i == 2) {/*Este if hace que i se salte el 2 con el continue, y la etiqueta ayuda
                a la identificacion de estos debido a que estan anidados*/
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }

        System.out.println("\n--------------------------------------");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {/*En este ejemplo lo que hace es que cuando llega al 2 la variable i,
                se termina la aplicacion o el imprimir i poor el break, a diferencia de continue que
                solo lo ignora y sigue*/
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}

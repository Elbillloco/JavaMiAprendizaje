package FlujosDeControl;

import java.util.Scanner;

public class SentenciaIfElseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un mes de 1 a 12");
       int mes = s.nextInt();
       int numeroDias= 0;
        System.out.println("Ingrese el año (YYYY)");
       int year = s.nextInt();

       /*Todo este proceso se saco de un algoritmo documentado en google por microsoft,
           muy importante en el futuro utilizar fuentes externas para poder crear codigo y no
           solo sacarlo de la cabeza, el investigar es importante para poder hacer buen codigo y
           correcto, sobre todo con calculos complejos o enrredosos que en algun momento no entiendas
           del todo*/
       if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
           numeroDias = 31;

       } else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11) {
           numeroDias = 30;

       } else if (mes == 2) {

           if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))){
               numeroDias = 29;

           }else {
               numeroDias = 28;

           }
       }
        System.out.println("Numero de dias es : " + numeroDias);
    }
}

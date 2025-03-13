package FlujosDeControl;

public class SentenciaFor {
    public static void main(String[] args) {

        int i = 0;/*Otro metodo para inicializar el for seria poner el contador fuera, osea desde
        donde va a empezar a contar la variable i y despues evaluarla e incrementarla, pero se
        recomienda siempre poner la variable incrementada dentro del for*/
        for (; i <= 5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("");
        System.out.println("i = " + i);//Se incrementa por el for
        System.out.println("");

        /*Otra forma de escribir un for es la siguiente, no es recomendada pero aun asi puede ser
        escrita asi*/
        int j = 0;
        for (; ;) {
            if (j > 5) {
                break;
            }
            System.out.println("j = " + j);

            j++;
        }
        System.out.println("");

        for (int k = 10; k >= 0;  k--){//Decrementando con for
            System.out.println("k = " + k);
        }

        System.out.println("");

        for (int l = 1, y = 10; l < y; l++, y--){//Puedes hacerlo con 2 valores a la vez en un for
            System.out.println(l + " - " + y );
        }

        System.out.println("");

        for(int r = 0; r <=10; r++){
            if ( !(r % 2 == 0) ){/*Se niega, imprimiendo solo numeros impares, si queremos pares solo
            borramos la exclamacion y los parentesis de fuera y dejamos el ==*/
                continue;//Continua con la iteracion del if a la par que incrementa con for
            }
            System.out.println("r = " + r);
        }
    }
}
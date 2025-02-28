package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento, ++a Incrementa en uno, y luego devuelve a
        int i = 1;
        int j = ++i;// i = i + 1

        System.out.println("Pre incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Incremento, a++ Devuelve a, y luego incrementa a en uno
        i = 2;
        System.out.println("Post incremento");
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento, --a Decrementa a en uno, luego devuelve a
        i = 3;
        j = --i;// i = i - 1 = 2
        System.out.println("Pre decremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento,a-- Devuelve a, luego decrementa a en uno
        i = 4;
        j = i--;
        System.out.println("Post decremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

    }
}

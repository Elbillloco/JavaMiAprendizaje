package Primitivos;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter : " + (decimal == caracter));

        System.out.println("\\\\\\\\");

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter : " + (simbolo == caracter));

        System.out.println("\\\\\\\\");

        char espacioDirecto = ' ';
        char espacioUnicode = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en \t byte:" + espacioDirecto + Character.BYTES);
        System.out.println("float en char:" + espacioUnicode + retornoCarro +  Character.BYTES);
        System.out.println("float en char =" + retroceso + retroceso + Character.SIZE);
        System.out.println("maximo valor char = " + tabulador + Character.MAX_VALUE);
        System.out.println("minimo valor char = " + System.getProperty("line.separator")+ Character.MIN_VALUE);


    }
}

package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = new String("Creando un objeto de la clase String ... que tal!") ;

        Integer num = 7;

        Boolean b1 = texto instanceof String;/* instanceof nos sirve para evaluar
        si el objeto que evaluamos es del mismo tipo al que pedimos*/

        System.out.println("Texto es del tipo String: " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object: " + b1);/*en diferente caso,
        cuando se evalua si texto es de la clase object, dara true, porque todos y cada uno
        de los objetos creados en java, derivan siempre de la clase Object*/

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer: " + b1);

        b1 = num instanceof Number;/*Aquí de igual forma con Object, pero de forma más especifica,
        Number es una instancia que contiene a Integer y en general todas las clases de tipos
        de datos numericos, sea Char, Integer, Short, Long, etc.*/
        System.out.println("num es del tipo Number: " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object: " + b1);

        Double decimal = 18.12;

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number: " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean: " + b1);
    }
}

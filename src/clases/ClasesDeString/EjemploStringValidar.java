package ClasesDeString;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;
        
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = " ";//"Programacion Java";
        }

        boolean esVacio = curso.length() == 0;/* el metodo .length ayuda a evaluar los caracteres en una expresion,
        la longitud de este*/
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();/* el metodo .isEmpty ayuda a que se evalue la variable y saber si esta vacia
        o no, osea, si tiene valor o no dentro de la variable*/
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();/* este metodo .isBlanck nos ayuda a validar si el espacio utilizado es un espacio
        y lo evalua como tal, un espacio en blanco o vacio*/
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco) { // Tambien se puede negar en un if con una exclamacion
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvcenido al curso ".concat(curso));
        }
    }
}

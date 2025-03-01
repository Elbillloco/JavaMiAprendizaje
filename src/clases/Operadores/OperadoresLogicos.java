package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false;/* Se están evaluando con logic de tablas de verdad, en este caso
        si el primero es falso, el segundo no se evalua, caso contrario daria igual falso pero por
        evaluar el segundo término que sería k > l, es falso, k no es mayor a l, caso contrario
        si l es mayor que k o k menor que l, ahora si dara true, y al final se evalua que m sea false o
        true, en el caso de que sea true, todo es false, por que m es false, no true, caso contrario,
        si m es false, dara todo true*/
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;/*Aqui se evalua si alguna de las dos son verdaderas dara verdadero,
         si la primera es verdadera, no necesitara evaluar la segunda, caso contrario si el primero es falso
         todo sera falso debido a que no se necesita evaluar el segundo, pero si el primero es falso y el segundo
         verdadero, entonces dara verdadero, por que es uno u otro verdadero, si el primero es false el segundo
         dara verdadero*/
        System.out.println("b2 = " + b2);
        
        boolean b3 = i == j && k > l || m == false;/*Aqui se utilizan varios, siendo los primeros false por
        las variables, pero al tener un or despues del and, dara true, debido a que es uno u otro, entonces
        como m == false, dara true*/
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k > l || m == false);/*Aqui cambia la prioridad debido a que primero
        se va a evaluar lo que tiene entre parentesis, entonces dara true, pero el and es false,
        entonces aplica la regla de and, el primero es falso entonces todo es falso*/
        System.out.println("b4 = " + b4);

        boolean b5 = i == j || (k < l && m == true);/* Aqui se le da prioridad al and, osea
        que primero va a evaluar el k < l && m == true, despues en or se evalua,
        osea que la expresion sera true por la prioridad del and, que si uno es verdadero todo sera
        verdadero*/
        System.out.println("b5 = " + b5);

        boolean b6 = (i == j || k < l) && m == true;/* Caso contrario aqui, debido a la prioridad
        y que un true con false en una evaluacion and, sera false, debido a los parentesis*/
        System.out.println("b6 = " + b6);

        boolean b7 = (true || true) && false;/*Esta linea de codigo explica mejor
        el ejemplo de arriba*/
        System.out.println("b7 = " + b7);

        boolean b8 = true || (false && false) || false;/*En java siempre se prioriza el and
        al evaluar, entonces primero evaluara el and y despues los or, dejandonos un true
        debido a que tambien evalua el true con el false, entonces al haber un true y false
        quedaria true por parte del and y true por parte del or*/
        System.out.println("b8 = " + b8);
    }
}

package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));/*concatena mas no suma por el funcionamiento de java en si
        pero si fuese primero el operador y luego el concatenado, si se sumara, otra forma es si se les pone
        parentesis, debido a la forma de prioridad del parentesis, dandole prioridad a lo que tiene por parentesis,
        haciendo primero lo que tiene dentro del mismo*/

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j= " + (i - j));/*esto sin parentesis no se podria hacer, esto debido
        a la forma de de java de leer de izquierda a derecha siempre, entonces al poner las
        comillas y declarar primero el String y luego concatenar, trata de concatenar con texto
        pero no se puede al ser una operacion aritmetica, entonces al poner los parentesis ya estamos
        indicando que primero ira lo que se tiene entre parentesis y ahora si lo hace correctamente*/

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j;/* aqui se trata de dividir, pero dara decimal, osea 1.25, pero las dos variables
        usadas son enteras o int, entonces...*/
        float div2 = (float)i / j;/* aqui abajo se crea otra variable con el tipo de dato float,
        forzando con un "cast" a que la variable i y j sean ahora valores de punto flotante, osea con
        decimal, y ahora si poder dar la division correctamente*/
        System.out.println("division = " + div);
        System.out.println("div2 = " + div2);
        
        int resto = i % j;/* este operador aritmetico lo que hace es calcular cuanto es lo que le falta a
        tal valor para poder llegar al valor deseado, ejemplo mas claro abajo, que se evalua 8 % 5 osea
        cuanto le falta a 5 para llegar a 8, en este caso le faltan 3 numeros, y el operador te da como
        resultado este mismo*/
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }
    }
}

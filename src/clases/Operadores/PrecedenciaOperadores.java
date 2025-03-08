package Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        
        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = (i + j + k)  / 3;/*Aqui sin los parentesis dara 14, pero se debe
        a que la divicion tiene prioridad, entonces lo recomendable es utilizar parentesis para poder
        manejar la priodidad a tu gusto*/
        System.out.println("promedio sin 10 = " + promedio);

        promedio = (i + j + k)  / 3d * 10;/*Debido a que multiplicacion y divicion tiene la misma
        prioridad, se hara en orden de izquierda a derecha dependiendo a quien se encuentre primero,
        ejemplo, primero se hara k / 3 luego se multiplicara por 10 y al final sumara los resultados
        de estos con lo demas*/
        System.out.println("promedio = " + promedio);

        promedio = i + j + k  / (3d * 10);//El resultado varia dependiendo de la prioridad. OJO!!
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k  / 3d * 10;/* Primero suma los incrementos, luego divide k por 3
        y lo multiplica por 10 y al final suma el resultado del incremento por la multiplicacion,
        se veria de la siguiente forma... (15 + 8) + 66.6 = 89.66*/
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);/*El post decremento sirve para primero imprimir en la primera
        instruccion, despues en la siguiente instruccion le quita 1, osea, si damos un valor a i = 7
        y luego le hacemus un post incremento osea i--, al poner una instruccion, seguira siendo 7,
        pero en la instruccion despues de el decremento, quedara 6, lo mismo pasa con el post incremento */
    }
}

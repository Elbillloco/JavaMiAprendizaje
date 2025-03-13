package FlujosDeControl;

public class SentenciaWhileDoWhile {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 5){//Similar a for pero se recomienda mas for por rapidez
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("");

        i = 0;
        boolean prueba = true;

        while(prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        do {/*A diferencia del while, el do while sirve para ejecutar el codigo una sola vez primero,
        y de ahi evaluar, si lo que se evalua en el while es verdadero, vuelve a imprimir y asi hasta
        que se diga lo contrario, lo veo mas como un while alrevez, osea que primero se le dice como
        actuar, lo imprime una sola vez y luego lo paras o no, en vez de imprimir infinitamente, obvio
        que si dejas en true el valor inicial y no le dices lo contrario pues si sera infinito, pero
        tienes un margen para decirle lo contrario y que no sea asi*/
            System.out.println("se ejecuta al menos una vez");
        }while (prueba);

        System.out.println("");

        prueba = true;/*Aqui se hace similar al ejemplo anterior pero aplicado con un do while,
        primero se aplican los valores de variables, se evalua con if para que en algun momento el valor
        de prueba que inicialmente es true, cambie a false con la iteracion de i == 10, se imprime
        y se incrementa, asi hasta llegar a i == 10 y cambiar el valor de prueba a false, al final
        while evalua prueba para decidir si seguir o no, y al cambiar a false, se cierra el proceso*/
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
    }
}

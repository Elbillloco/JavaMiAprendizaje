package clases.Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;// Se utiliza típicamente para comparar valores primitivos o literales
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;//declara una contraparte de su valor original, en este caso falsé
        System.out.println("b2 = " + b2);

        boolean b3 = i != j;// <>,Declara una negation
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;//Compara un booleano con una variable igual boolean
        System.out.println("b4 = " + b4);

        boolean b5 = m != true;// Compara e imprime una diferencia de su contraparte
        System.out.println("b5 = " + b5);
        
        boolean b6 = (i > j);
        System.out.println("b6 = " + b6);
        
        boolean b7 = (i < j);
        System.out.println("b7 = " + b7);

        boolean b8 = (l >= k);// siempre va después del comparativo el igual
        System.out.println("b8 = " + b8);

        boolean b9 = (l <= k);
        System.out.println("b9 = " + b9);
    }
}

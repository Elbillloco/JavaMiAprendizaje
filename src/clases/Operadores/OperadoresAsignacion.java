package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;//Basicamente se utilizan para asignar valores a variables
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;/* pero hay metodos diferentes, ejemplo este, que agrega un valor extra asignado, en este
        caso se asigna un 2 a la variable i, dando 7 en resultado, resumiendo el i = i + 2 a simplemente
        i += 2*/

        System.out.println("i = " + i);
        
        i += 5;
        System.out.println("i = " + i);
        
        j -= 4;
        System.out.println("j = " + j);

         j *= 3;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";

        sqlString += " where c.nombre = 'Roberth' ";
        sqlString += " and c,activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}

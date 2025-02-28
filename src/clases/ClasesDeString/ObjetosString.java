package ClasesDeString;

public class ObjetosString {
    public static void main(String[] args) {
        String str1 = "Hola mundo";
        String str2 = new String("Hola mundo");

        //Chequea si son el mismo objeto
        System.out.println("son el mismo objeto? " + (str1 == str2));

        //Chequea si tienen el mismo valor
        System.out.println("son el mismo objeto? " + str1.equals(str2));
        
        String curso = "Programacion Java";
        String curso2 = new String("programacion java");/*es importante ponerlo tal cual cuando se quiere
        evaluar con la funcion de String .equals, esto debido a que se esta comparando por valores iguiales, esto se ignora
        si se utiliza el metodo .equalsIgnoreCase, esto lo que hace es que simplemente ignore si la comparacion se hace
        entre palabras mayusculas y minusculas, si hay caracteres diferentes, dara false.*/

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 " + esIgual);

        esIgual = curso.equals(curso2);/*utilizar .equalsIgnoreCase para que de true y que ignore la evaluacion
        entre mayusculas y minusculas*/
        System.out.println("curso.equals(curso2) " + esIgual);
        
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 " + curso3);
    }
}

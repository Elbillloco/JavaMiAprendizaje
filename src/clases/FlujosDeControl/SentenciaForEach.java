package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros ={1, 3, 5, 7, 9, 11, 13, 15};
        for (int num : numeros){/*De manera automatica va a incrementar sin necesidad de expresarlo
        explicitamente, osea que la variable que toma en cuenta para el incremento es el arreglo
        que se usa, y mas aparte, se utiliza mayormente o siempre con arreglos*/
            System.out.println("num = " + num);
        }

        System.out.println("");

        String[] nombres = {"Roberth", "Hernan", "Pedro", "Maria", "Pepe", "Lola", "Canela", "Lillia", "Filipio"};
        /*Lo mismo pasa en este ejemplo como en el primero, se imprimen tantas veces como arreglos
        tenga la variable*/
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }

        System.out.println("");

        //Ejemplo rapido para comprobar si servia con esta sintaxis te arreglos
        String[] ola = new String[3];
        ola[0] = "iam sexi";
        ola[1] = "and";
        ola[2] = "you know it";
        for (String cancion : ola){
            System.out.println("cancion = " + cancion);
        }
    }
}

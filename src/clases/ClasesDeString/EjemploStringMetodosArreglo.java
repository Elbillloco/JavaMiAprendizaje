package clases.ClasesDeString;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());//aqui es un metodo de String
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());/* .toCharArray convierte nuestro
        String en un arreglo de caracteres */
        
        char[] arreglo = trabalenguas.toCharArray();/* el [] indica un arreglo, y el .toCharArray
        divide el arreglo de texto en caracteres*/
        int largo = arreglo.length;// lo hace entero para utilizar length, es un atributo
        System.out.println("largo = " + largo);// imprime el largo
        for(int i = 0; i < largo; i++){/*por cada caracter de trabalenguas,
        va a imprimirlo individualmente hasta crear la palabra trabalenguas con un print individual para
        cada caracter*/
            System.out.print(/*"arreglo[i] = " + */arreglo[i]);//imprime hasta que el for indique cuando parar
        }
        System.out.println();

        System.out.println("trabalenguas = " + trabalenguas.split("a"));/*.split se utiliza para separar
        los valores, osea, ver que palabras estan siendo separadas por el valor indicado*/

        String[] arreglo2 = trabalenguas.split("a");//se indica el arreglo con el metodo
        int l = arreglo2.length;// se da el atributo .length junto con el valor
        for (int j = 0 ; j < l ; j++)// se hace el incremento hasta llegar al valor deseado
            System.out.println(arreglo2[j]);// se imprime hasta que el incremento acabe

        String archivo ="alguna.image.pdf";
        String[]archivoArr =archivo.split("[.]");/*se utiliza \\ o [] con punto debido a que se utiliza
        dentro de java, entonces es importante remarcar que se esta utilizando un caracter comun y corriente y
        no el caracter reservado*/
        l = archivoArr.length;
        System.out.println("l = " + l);
        for (int j = 0 ; j < l ; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}

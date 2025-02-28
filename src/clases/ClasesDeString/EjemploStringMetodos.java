package ClasesDeString;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Roberth";

        System.out.println("nombre.length = " + nombre.length());//.length ayuda a comprender el largo de un metodo
        
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//.toUpperCase para hacer en mayuscula

        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//.toLowerCase para hacer en minuscula

        System.out.println("nombre.equals(\"Roberth\") = " + nombre.equals("Roberth"));//.equals para comparar valores dentro de una variable o clase

        System.out.println("nombre.equals(\"roberth\") = " + nombre.equals("roberth"));/*.equals sigue comparando los valores, en este caso siendo minuscula
        ya no da true, siendo que java es sensible a las mayusculas y minusculas*/

        System.out.println("nombre.equalsIgnoreCase(\"Roberth\") = " + nombre.equalsIgnoreCase("Roberth"));/*Aqui se arregla poniendo el metodo
        .equalsIgnoreCase, osea que ignora todas las mayusculas y minusculas, evaluandolo como true ahora si*/

        System.out.println("nombre.compareTo(\"Roberth\") = " + nombre.compareTo("Roberth"));/*Este funciona escencialmente
        como el .equals, con la diferencia que el .compareTo se evalua en base a los valores de la tabla unicode, osea que si
        el valor no es diferente del evaluado, dara 0 por que son iguales*/

        System.out.println("nombre.compareTo(\"Ali\") = " + nombre.compareTo("Ali"));/*Aqui compara los caracteres diferentes,
        cada uno acomodado en un orden basado en la tabla unicode, y los ordena en base a la misma*/

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));/*.charAt es un metodo que captura los caracteres individualmente
        basandose en el numero que le pongas entre los parentesis, ejemplo aqui al poner 0, capturas el primer caracter de tu
        String en este caso y lo imprime si asi se desea*/

        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));

        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));/*Aqui ejemplo utilizando otro metodo,
        haciendolo asi dinamico si quiciese conseguir  el ultimo caracter, tendria que poner .length()-1, debido a que
        obtiene todos los caracteres empezando desde el 1 y .charAt empieza desde 0, entonces al restar -1, baja un caracter, obteniendo asi
        el ultimo caracter deseado de manera automatica*/

        System.out.println("nombre.substring(1) = " + nombre.substring(1));/* el .substring toma partes del codigo,
        ejemplo, aqui si queremos tomar solo una parte del texto sin tomar en cuenta la primera letra, se utiliza este metodo e indicandole
        desde donde empezara a quitar caracteres para leer lo demas menos el caracter o caracteres restados*/

        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));/* aqui extrae todos los caracteres desde donde se le indique,
        en este caso el primer caracter hasta el 4to en adelante, dejando asi los caracteres 1, 2 y 3, esto por que
        debido a que el primer caracter siempre se cuenta como caracter 0, osea cuenta de 0 a 1, 2 ,3 etc*/

        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));/* .replace se utiliza para
        reemplazar los caracteres, siendo el primero el target a reemplazar y el segundo el caracter que va a sustituir*/

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas = " + trabalenguas.indexOf('a'));/* lo que hace .indexOf es ver si el caracter esta indexada,
        dentro de nuestra variable, osea busca dentro del valor de nuestra variable y da la posicion contando desde 0, va a retornar
        el primer valor, el primer caracter a buscar y te dara la primera ubicacion*/

        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));/* .lastIndexOf busca el caracter
        como la ultima ocurrencia, el ultimo valor dentro de nuestra variable*/

        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));/* igual cuando buscamos un valor
        String o de texto, va a ubicar desde donde empieza contando desde el 0 hasta la posicion del primer valor buscado, en este caso
        el 5to*/

        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));/*escencialmente tiene la misma
        funcion que el .indexOf, con la diferencia que solo va a aceptar Strings, valores de texto, y va a retornar un true
        o false dependiendo de si se encuentra este valor dentro de tu clase o variable*/

        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));/* .startsWitch es para indicar
        si este valor buscado inicia igual en el valor comparado, retornandolo como true o false*/

        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));/* lo mismo pero en vez
        de comparar si inicia con, este compara si termina con*/

        System.out.println("  trabalenguas  " );
        System.out.println("  trabalenguas  ".trim());/* con .trim se quitan los espacios en los textos o en tus valores*/

    }
}

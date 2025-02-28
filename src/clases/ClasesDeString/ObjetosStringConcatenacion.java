package clases.ClasesDeString;

public class ObjetosStringConcatenacion {
    public static void main(String[] args) {
        String curso = " Programacion Java ";
        String profesor = " Andres Guzman ";

        String detalle = curso + " Con el instructor " + profesor ;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5 ;
        System.out.println(detalle + (numeroA + numeroB));/*Sin parentesis se evalua todo como la primera variable usada
        en este caso "detalle" siendo un String, entonces sin parentesis, no se hace la evaluacion aritmetica, pero al poner
        parentesis, se separa el metodo String y el valor primitivo int, evaluandolo como una operacion de tuma entre 2 variables*/

        System.out.println(numeroA + numeroB + detalle);/*Aqui como todo se lee de izquierda a derecha, se evalua primero
        el valor aritmetico, se suma, y al querer hacer lo mismo con la clase String, no puede debido a que es valor de texto,
        entonces simplemente procede a imprimirlo tal cual el valor de este caso un String*/
        
        String detalle2 = curso.concat("con").concat(profesor);/* Para concatenar, la forma 1 es poner un +
        esto lo que hace es crear una instancia de .StringBuilder, cada que se pone un + para concatenar lo hace,
        mientras que el .concat es lo mismo y mas aparte se puede anidar una tras otra dentro de una variable,
        entonces, hay 2 metodos a usar, el + y el .concat, ya dependera de que se utilice.*/
        System.out.println("detalle2 = " + detalle2);
    }
}

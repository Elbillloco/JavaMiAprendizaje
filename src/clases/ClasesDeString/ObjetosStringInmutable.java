package ClasesDeString;

public class ObjetosStringInmutable {
    public static void main(String[] args) {
        String curso = " Programacion Java ";
        String profesor = " Andres Guzman ";
        
        String resultado = curso.concat(profesor);/*curso al ser declarado como un objeto de String, no cambia,
        es inmutable, entonces cuando se hace curso.concat(profesor), lo esta concatenando, pero el valor de curso
        como clase no va a cambiar a menos que se cree otra clase con esta modificacion, entonces ahi se crea una nueva
        variable de la clase de String llamada curso, no cambia el valor principal de curso pero crea un nuevo objeto
        con un metodo de concatenacion, entonces ahi ya estaria leyendo la variable de las 2 clases concatenadas, mas no
        cambiandolas*/
        System.out.println("curso = " + curso);

        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + "con" + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A");/* lo que se hace aqui es otro ejemplo
        de inmutabilidad, haciendo que la clase original no se cambie, no varia, pero cuando se crea otra clase
        siendo variante de la clase resultado, ahora si se aplican los cambios utilizando como base la clase original,
        esto sin cambiar la clase original, ningun contenido, pero a su vez creando nuevos metodos para una clase nueva
        tomando como base la original, sin cambiar la original pero creando otra con base de la original, con modificaciones,
        vease como una receta, la receta en un libro se mantiene escrita como se imprimio en el libro, pero tu en base
        a esa receta creas una variante de la que viste en el libro, tomando como base los pasos de la anterior receta pero
        con tus pasos propios creados*/

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}

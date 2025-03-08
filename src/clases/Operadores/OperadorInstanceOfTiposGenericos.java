package Operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = new String("Creando un objeto de la clase String ... que tal!") ;

        Number num = Integer.valueOf(7); //7;
        /*Basicamente para crear una instancia con la clase Integer, lo que se
        recomienda es utilizar el metodo .valueOf(), esto para poder ingresar los valores
        ya enteros y utilizables, esto se puede hacer con todos las clases de datos de Number*/

        Boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String: " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object: " + b1);

        b1 = texto instanceof Integer;/*Aqui basicamente si podemos evaluarlo,
        en el anterior ejercicio no podiamos debido a que el tipo de objeto era totalmente distinto,
        pero ahora que texto esta creado como objeto con la clase Object, se puede evaluar debido
        a que la clase Integer esta contenido asi como todas las clases dentro de la clase
        padre Object, entonces lo evalua, pero da false debido a que texto contiene un valor
        String y no numerico, entonces dara false*/

        System.out.println("Texto es del tipo Integer: " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer: " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number: " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object: " + b1);

        b1 = num instanceof Long;/*Este junto con el Double dan falso debido a que el valor
        que contiene num, es Integer o entero, entonces dara false debido a que Long y Double son
        diferentes a lo que se esta teniendo en el valor num*/
        System.out.println("num es del tipo Long: " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double: " + b1);

        Number decimal = Float.valueOf(18.12f) ;

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo decimal: " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo float: " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number: " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer: " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean: " + b1);
    }
}

package Tareas.Repasos;

public class OperadorForTernarios {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            String mensaje = (i % 2 == 0) ? "Numero par: " : "Numero Impar: ";
            System.out.println(mensaje + i);
            /*En este caso algo que no entendi es la parte de i % 2 == 0, en este caso se esta evaluando
            a i con 2, osea dividiendolo, si el resto de esta divicion es 0, es par, de lo contrario,
            si quedan decimales, es impar*/
        }

        System.out.println("");

        int suma = 0;
        for (int i = 1; i <= 10; i++){
            suma += i ;
        }
        String resultado = (suma % 2 == 0) ? "par" : "impar";
        System.out.println("La suma de los numeros del 1 al 10 es: " + suma + " Y es " + resultado);

        System.out.println("");

        String[] frutas = {"Manzana", "Banana", "Naranja", "Fresa"};
        for (int i = 0; i < frutas.length; i++){
            String mensaje = (frutas[i].length() > 6) ? "Fruta larga: ": "Fruta corta: ";
            System.out.println(mensaje + frutas[i]);
        }

        System.out.println("");

        for (int i = 5; i >= 1; i--){
            String tipo = (i % 2 == 0) ? "Numero par: " : "Numero Impar: ";
            System.out.println(tipo + i);
        }

        System.out.println("");

        for (int i = 0; i <=10; i += 2){
            String tipo = (i == 0) ? "Cero: " : "Numero: ";
            System.out.println(tipo + i);
        }
    }
}

package Repasos;

public class OperadorFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero:" + i);
        }

        System.out.println("");

        int suma = 0;
        for (int i = 1; i <= 10; i++){
            suma += i ;
        }
        System.out.println("La suma de los numeros del 1 al 10 es: " + suma);

        System.out.println("");

        String[] frutas = {"Manzana", "Banana", "Naranja", "Fresa"};
        for (int i = 0; i < frutas.length; i++){
            System.out.println("Frutas = " + frutas[i]);
        }

        System.out.println("");

        for (int i = 5; i >= 1; i--){
            System.out.println("Numero: " + i);
        }

        System.out.println("");

        for (int i = 0; i <=10; i += 2){
            System.out.println("Numero: " + i);
        }
    }
}

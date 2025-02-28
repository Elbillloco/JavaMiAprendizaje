public class HolaMundo {
    public static void main(String[] args) {

        String saludar = "Hola mundo";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        System.out.println("saludar.toLowerCase() = " + saludar.toLowerCase());

        int numero1 = 10;
        System.out.println("numero1 = " + numero1);

        boolean valor = true;
        int numero2 = 20;
        System.out.println("numero2 = " + numero2);

        if (valor = true) {
            numero2 = 30;
            System.out.println("numero2 = " + numero2);
        }
        double numero3 = 150.2;
        System.out.println("numero3 = " + numero3);

        String nombre;

        nombre = "Andres";

        if (numero1 < numero2) {
            nombre = "Juan";
            System.out.println("nombre = " + nombre);

        }

        String miNombre;

        miNombre = "roberth ali";
        System.out.println("miNombre = " + miNombre);
                
        if(numero3 > 2.2){
            miNombre = "roberth";
            System.out.println("miNombre = " + miNombre);
        }

        if (numero3 == 2.2) {
            miNombre = "ali";
            System.out.println("miNombre = " + miNombre);
        }

        if (numero3 > numero1){
            int perro = 2;
            System.out.println(perro + perro);
        }

        if (numero3 < numero1){
            int perro = 7;
            System.out.println(perro + perro);
        }
    }

}
package Operadores;
import java.util.Scanner;
public class OperadoresLogicosLogIn {
    public static void main(String[] args) {

        String username = "roberth";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Username");

        String usuario = scanner.nextLine();

        System.out.println("Ingrese el Password");

        String pass = scanner.nextLine();

        boolean esAunteticado = false;

        /*Cualquier flujo de control evalua una expresion booleana, en el ejemplo de abajo
        el and funciona para comprobar y decirle al programa que se requiere que los 2 sean
        verdaderos para correr, y el or hace que cualquiera que los 2 ingresen, que corra
        el que se ingrese correcto debido al if que funciona como comprobacion*/
        if( (username.equalsIgnoreCase(usuario) && password.equalsIgnoreCase(pass)) ||
                (username2.equalsIgnoreCase(usuario) && password2.equalsIgnoreCase(pass)) ){
            esAunteticado = true;
        }else{
            System.out.println("Username o Password incorrecto! ");
        }

        if (esAunteticado){
            System.out.println("Bienvenido usuario\n".concat(usuario).concat("!"));
        }else{
            System.out.println("Lo siento, requiere autenticacion");
        }
    }
}

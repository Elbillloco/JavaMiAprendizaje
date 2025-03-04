package Operadores;
import java.util.Scanner;

public class OperadoresLogicosLogInArreglosTernarios {
    public static void main(String[] args) {

//        String[] usernames = new String[3];/* En esta ocacion utilizaremos la forma de
//        arraigos, esto se utiliza básicamente para poder utilizar varias instancias en una
//        misma variable, invocando cada uno con un número designado en el espacio de memoria,
//        en este caso utilizando la clase String para crear un objeto con llamado usernames
//        y más adelante se crean sus instancias con sus respectivos valores como nombres*/
//
//        String[] passwords = new String[3];/*Y en este caso se utiliza pero para poner la
//        instancia de passwords y poder crear sus respectivos valores en el programa*/
//
//        usernames[0] = "roberth";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "12345";
//
//        usernames[2] = "pepe";
//        passwords[2] = "12345";

        String[] usernames = {"roberth", "admin", "pepe"};/*Esta también es una manera de poner
        arreglos, el orden de los mismos siendo de izquierda a derecha de forma cascada*/
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Username");

        String usuario = scanner.nextLine();

        System.out.println("Ingrese el Password");

        String pass = scanner.nextLine();

        boolean esAunteticado = false;

        for (int i = 0; i < usernames.length; i++){/*La primera parte del for se utiliza
        inicializar el for, esto se hace con un i para empezar el contador,
        la segunda parte es para indicar hasta donde se va a iterar, hasta donde finaliza,
        y la última parte o sea la tercera es para incrementar el contador con post incremento*/

            esAunteticado = (usernames[i].equalsIgnoreCase(usuario) && passwords[i].equalsIgnoreCase(pass)) ? true : esAunteticado;
        }

        /*Aquí básicamente lo que se hace es hacer una comprobación de los usernames y passwords,
        si estos son true, dara true él es autenticado y seguir con el programa para terminarlo,
        de lo contrario seguir imprimiendo el programa hasta que este cumpla con algunos de los datos de forma
        correcta*/

        /*Para listas de 1000 elementos es recomendable poner un If, else y break, pero
        para listas de 2 o 3 elementos como este caso, es mejor poner operadores Ternarios*/

        /*Otra cosa para aclarar es que el valor con el que estamos evaluando de manera ternaria, tienen que ser del
        mismo, o sea boolean con boolean o String con String*/



        String mensaje = esAunteticado ? "Bienvenido usuario\n".concat(usuario).concat("!") :
                    "Username o Password incorrecto! \nLo sentimos, requiere autenticacion";
        System.out.println(mensaje);

           /*Este codigo es basicamente la forma mas extensa
           de hacer lo que se hizo con el terneario, pero esta forma se utilizaria para informacion mas extensa,
           como ejemplo, 1000 usuarios, con esta forma seria mas robusto

           if( (usernames[i].equalsIgnoreCase(usuario) && passwords[i].equalsIgnoreCase(pass)) ){
              esAunteticado = true;
               break;
           }
        }*/

//        if (esAunteticado){
//            System.out.println("Bienvenido usuario\n".concat(usuario).concat("!"));
//        }else{
//            System.out.println("Username o Password incorrecto! ");
//            System.out.println("Lo siento, requiere autenticacion");
//        }
//    }

    }
}

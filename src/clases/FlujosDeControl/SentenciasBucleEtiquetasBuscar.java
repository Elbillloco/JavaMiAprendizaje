package FlujosDeControl;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres tragaban trigotrigo en un trigaltrigo";//frase
        String palabra = "trigo";//palabra a buscar

        /*Aqui se contabiliza cuantas veces se esta iterando los caracteres que se esten ingresando
        en la frase puesta*/
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;/*La parte de aqui sirve para encontrar una palabra
        aun que este unida a otra por que esta buscando letra por letra, entonces va a encontrar una
        palabra por sus letras y no por la palabra en si*/


        int cantidad = 0;//cantidad de letras encontradas

        char letra = 'r';//letra a encontrar

        buscar://etiqueta para indicar

        for(int i = 0; i <= maxFrase;){/*mide el largo de la frase, recorriendo cada palabra hasta llegar
        hasta la peticion de palabra en el if de mas abajo*/

            int k = i;//engloba el incremento de i para no romper y ayuda a la busqueda con un post incremento

            for (int j = 0; j < maxPalabra; j++){//mide el largo de la palabra

                if(frase.charAt(k++) != palabra.charAt(j)){/*Mide lo que se esta buscando, en este caso,
                buscara en la frase la palabra que se esta pidiendo e imprimira cuantas veces esta la palabra
                que se le esta pidiendo en la frase, imprimiendo asi la cantidad de veces de la palabra y
                la palabra, la palabra y la frase son divididas por caracteres con el metodo .charAt por
                que el metodo que utiliza para encontrar una palabra es basicamente comparar letra por letra la
                letra de la frase, entonces al ser todas las letras en la frase iguales a la palabra que buscamos,
                se dira que la palabra se encontro tal cantidad de veces y que palabra encontro*/
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " Veces el caracter '" + palabra + "' en la frase");
    }

}
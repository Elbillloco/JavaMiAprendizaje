package RetosProgramacion;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if ( (i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " = " + "FizzBuzz!!, Es multiplo de ambos!!");

            } else if (i % 3 == 0) {
                System.out.println(i + " = " + "Fizz!!, Es multiplo de 3!!");

            } else if (i % 5 == 0) {
                System.out.println(i + " = " + "Buzz!!, Es multiplo de 5!!");

            }
            else {
                System.out.println(i + " = No es multiplo de 3 ni de 5");
            }
        }
    }
}

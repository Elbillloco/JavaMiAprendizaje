package Primitivos;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = false;
        boolean datoLogicoClase = Boolean.FALSE;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        float f = 1.2345e2F; // 123.45

        System.out.println("////////");

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        System.out.println("////////");

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}

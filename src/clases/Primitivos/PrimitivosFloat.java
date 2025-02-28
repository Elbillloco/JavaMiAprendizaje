package Primitivos;

public class PrimitivosFloat {

    static float varDouble;

    public static void main(String[] args) {
        
        float realFloat = 1.5e6f;//15000F
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 0.00000000015f;//1.5e-10f
        System.out.println("realFloat = " + realFloat2);

        System.out.println("float en byte = " + Float.BYTES);
        System.out.println("float en bite = " + Float.SIZE);
        System.out.println("maximo valor float = " + Float.MAX_VALUE);
        System.out.println("minimo valor float = " + Float.MIN_VALUE);

        System.out.println("/////");

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double en byte = " + Double.BYTES);
        System.out.println("double en bite = " + Double.SIZE);
        System.out.println("maximo valor double = " + Double.MAX_VALUE);
        System.out.println("minimo valor double = " + Double.MIN_VALUE);

        System.out.println("/////");

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

        //float varDouble;
        System.out.println("varDouble = " + varDouble);
    }
}

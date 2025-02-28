import com.sun.jdi.Value;

public class valoresPrimitivos {
    public static void main(String[] args) {

        boolean on = true;
        System.out.println("on = " + on);

        System.out.println("Boolean no vale ningun valor en Bytes");

        boolean off = false;
        System.out.println("off = " + off);

        System.out.println("------");

        char letra = 'a';
        System.out.println("char letra = " + letra);

        System.out.println("Character o char en Byte = " + Character.BYTES);
        System.out.println("Character o char en Bites =" + Character.SIZE);

        char exclamacion = '\u0021';
        System.out.println("char exclamacion = " + exclamacion);

        System.out.println("------");

        byte a1 = 127;
        System.out.println("byte max = " + a1);

        System.out.println("Byte en Byte = " + Byte.BYTES);
        System.out.println("Byte en Bites =" + Byte.SIZE);

        byte a2 = -128;
        System.out.println("byte min = " + a2);

        System.out.println("------");

        short b1 = -32768;
        System.out.println("short min = " + b1);

        System.out.println("short en Byte = " + Short.BYTES);
        System.out.println("short en Bites =" + Short.SIZE);

        short b2 = 32767;
        System.out.println("short max = " + b2);

        System.out.println("------");

        int c1 = -2147483648;
        System.out.println("int min = " + c1);

        System.out.println("Integer en Byte = " + Integer.BYTES);
        System.out.println("Integer en Bites =" + Integer.SIZE);

        int c2 = 2147483647;
        System.out.println("int max = " + c2);

        System.out.println("------");

        long d1 = -9223372036854775808L;
        System.out.println("long min = " + d1);

        System.out.println("Long en Byte = " + Long.BYTES);
        System.out.println("Long en Bites =" + Long.SIZE);

        long d2 = 9223372036854775807L;
        System.out.println("long max = " + d2);

        System.out.println("------");

        float e1_1 = 1.4E-45F;
        System.out.println("float min = " + e1_1);

        System.out.println("Float en Byte = " + Float.BYTES);
        System.out.println("Float en Bites =" + Float.SIZE);

        float e1_2 = 3.4028235E38F;
        System.out.println("float max = " + e1_2);

        System.out.println("------");

        double e2_1 = -4.9E-324;
        System.out.println("double min = " + e2_1);

        System.out.println("Double en Byte = " + Double.BYTES);
        System.out.println("Double en Bites =" + Double.SIZE);

        double e2_2 = 1.7976931348623157E308;
        System.out.println("double max = " + e2_2);

        System.out.println("------");

        System.out.println("float = " + Float.MAX_VALUE);
    }
}

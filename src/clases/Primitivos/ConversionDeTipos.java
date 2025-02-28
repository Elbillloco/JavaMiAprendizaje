package Primitivos;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "92929.29e-3";
        double realDoble =  Double.parseDouble(realStr);
        System.out.println("realDoble = " + realDoble);
        
        String logicoStr = "true" ; //"TRUE" o "True" o "TruE tambien es valido
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);//valor

        String otroNumeroStr = Integer.toString(otroNumeroInt);//convierte a texto
        System.out.println("otroNumeroStr = " + otroNumeroStr);//texto

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);//convierte a valor
        System.out.println("otroNumeroStr = " + otroNumeroStr);//valor

        double otroRealDouble = 1.23456e2;//valor
        String otroRealStr = Double.toString(otroRealDouble);//convierte a texto
        System.out.println("otroRealStr = " + otroRealStr);//imprime
       
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 22768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}

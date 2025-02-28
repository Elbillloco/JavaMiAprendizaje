package ClasesDeString;

public class ObjetosStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);/* Aqui se esta creando ya un objeto con el metodo StringBuilder que
        utiliza java automaticamente al concatenar con +, pero con este objeto creado, puedes utilizar sus metodos
        y mas aparte este es mutable, entonces sus clases dentro ahora pueden cambiar a diferencia de como se utilizaria
        con un String normal, al declarar StringBuilder, puedes utilizar el metodo .append(), que lo que hace es concatenar
        las clases una con otras y creando asi una clase con estos metodos concatenados*/
        
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
           //c = c.concat(a).concat(b).concat("\n"); //500 => 1ms. 1000 => 4ms, 10000 => 95ms, 100000 => 3693ms
            //c += a + b + "\n"; //500 => 9ms, 1000 => 12ms, 10000 => 45ms, 100000 => 1384ms
            //sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 => 0ms, 10000 => 1ms, 100000 => 12ms
            
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());/* y aqui se esta utilizando otro de los metodos
        que se te permiten utilizar al momento de declarar el metodo StringBuilder en un objeto, en este caso sb,
        permitiendote asi poder utilizar sus metodos*/
    }
}

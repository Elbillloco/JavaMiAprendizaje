package Tareas.Tareas;
import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder famEnd = new StringBuilder();

        String i1 = "---Ingrese los nombres de los familiares--- ";
        String i2 = "Ingrese el nombre de la madre: ";
        String i3 = "Ingrese el nombre del padre: ";
        String i4 = "Ingrese el nombre del abuelo: ";
        System.out.println(i1);

        System.out.println(i2);
        String madre = scanner.nextLine();
        String madreMod = madre.substring(1, 2).toUpperCase() + "." + madre.substring(madre.length()-2).toLowerCase();
        System.out.println(madreMod);

        System.out.println(i3);
        String padre = scanner.nextLine();
        String padreMod = padre.substring(1, 2).toUpperCase() + "." + padre.substring(padre.length()-2).toLowerCase();
        System.out.println(padreMod);

        System.out.println(i4);
        String abuelo = scanner.nextLine();
        String abueloMod = abuelo.substring(1, 2).toUpperCase() + "." + abuelo.substring(abuelo.length()-2).toLowerCase();
        System.out.println(abueloMod);

        famEnd.append(madreMod).append("_").append(padreMod).append("_").append(abueloMod);
        System.out.println("Resultado final es...\n".concat(famEnd.toString()));
    }
}

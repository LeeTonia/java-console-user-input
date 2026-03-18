package run;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();


        System.out.println("Dime tu edad");
        String edad = sc.nextLine();

        System.out.println("Eres fanatico de Ian?");
        String fanaticoTexto = sc.nextLine();
        boolean fanatico = fanaticoTexto.equalsIgnoreCase("si") || fanaticoTexto.equalsIgnoreCase("sí");

        System.out.println("Apoyas la nueva idea del heredero?");
        String apoyarTexto = sc.nextLine();
        boolean apoyar = apoyarTexto.equalsIgnoreCase("si") || apoyarTexto.equalsIgnoreCase("sí");


        if (fanatico && apoyar) {
            System.out.println("Bienvenido hermano al bando de la nueva idea");
        }

        if (!fanatico && apoyar) {
            System.out.println("Muerte al Eduardista");
        }

        if (fanatico && !apoyar) {
            System.out.println("Deberia darte vergüenza " + nombre + " considerarte un ianista de corazón");
        }

        if (!fanatico && !apoyar) {
            System.out.println("No eres un ianista de confianza, vete");
        }

        sc.close();
    }
}
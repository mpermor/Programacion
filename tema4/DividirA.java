import java.util.Scanner;

public class DividirA {
     public static void main(String[] args) {
        String palabra;
        int a;
        String parte1;
        String parte2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        palabra = sc.next();
        a = palabra.indexOf('a');
        parte1 = palabra.substring(0, a);
        parte2 = palabra.substring(a + 1);
        System.out.println("Parte 1: " + parte1 + " Parte 2: " + parte2);
        sc.close();
    }
}

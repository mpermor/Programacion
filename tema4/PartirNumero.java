import java.util.Scanner;
public class PartirNumero {
    public static void main(String[] args) {
        String num;
        int posicion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un entero positivo:");
        num = sc.next();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número:");
        posicion = sc.nextInt();
        System.out.println("Los números son "+ num.substring(0, posicion) + " y el " + num.substring(posicion));
        sc.close();
    }
}

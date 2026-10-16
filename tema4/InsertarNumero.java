import java.util.Scanner;

public class InsertarNumero {
    public static void main(String[] args) {
        String num;
        int posicion;
        int digitonuevo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo:");
        num = sc.next();
        System.out.print("Introduzca la posición donde quiere insertar:");
        posicion = sc.nextInt();
        System.out.print("Introduzca el dígito que quiere insertar:");
        digitonuevo = sc.nextInt();
        System.out.println("El número es "+ num.substring(0, posicion) + digitonuevo + num.substring(posicion));
        sc.close();
    }
}
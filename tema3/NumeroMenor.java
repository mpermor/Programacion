import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Introduzca el primer número:");
        a = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        b = sc.nextInt();
        System.out.println("Introduzca el tercer número:");
        c = sc.nextInt();
        if(a < b && a < c)
            System.out.println("El primero es el menor");
        else if(b < a && b < c)
            System.out.println("El segundo es el menor");
        else
            System.out.println("El tercero es el menor");
        sc.close();
    }
}
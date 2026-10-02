import java.util.Scanner;

public class T3E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduzca el primer número:");
        a = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        b = sc.nextInt();
        if(a > b)
            System.out.println("El primer número es mayor");
        else if(a < b)
            System.out.println("El segundo número es mayor");
        else
            System.out.println("Son iguales");
        sc.close();
    }
}
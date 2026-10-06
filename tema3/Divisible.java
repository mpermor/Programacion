import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número:");
        num = sc.nextInt();
        if(num % 2 == 0 && num % 3 == 0)
            System.out.println("Es divisible por 2 y 3");
        else if(num % 2 == 0)
            System.out.println("Es divisible por 2");
        else if(num % 3 == 0)
            System.out.println("Es divisible por 3");
        else
            System.out.println("No es divisible ni por 2 ni por 3");
        sc.close();
    }
}
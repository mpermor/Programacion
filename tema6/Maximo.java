import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        System.out.println("El máximo es " + maximo(num1, num2));
        sc.close();
    }
    public static int maximo(int num1, int num2) {
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
}

import java.util.Scanner;

public class Maximo3numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        num3 = sc.nextInt();
        System.out.println("El máximo es " + maximo(num1, num2, num3));
        sc.close();
    }
    public static int maximo(int num1, int num2, int num3) {
        if(num1 >= num2 && num1 >= num3)
            return num1;
        else if(num2 >= num1 && num2 >= num3)
            return num2;
        else
            return num3;
    }
}

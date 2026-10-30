import java.util.Scanner;

public class CuadradoNumericoDescendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

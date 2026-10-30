import java.util.Scanner;

public class CuadradoNumerico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        for (int i = 1; i <= n / 2; i++){
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
            for (int k = n; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}

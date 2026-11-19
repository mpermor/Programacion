import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Introduce un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = sc.nextInt();
        System.out.println(sonamigos(n1, n2));
    }
    public static boolean sonamigos(int n1, int n2){
        int suman1 = 1;
        int suman2 = 1;
        for (int i = 2; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0) {
                suman1 += i;
                int par = n1 / i;
                if (par != i) {
                    suman1 += par;
                }
            }
        }
        
        for (int i = 2; i <= Math.sqrt(n2); i++) {
            if (n2 % i == 0) {
                suman2 += i;
                int par = n2 / i;
                if (par != i) {
                    suman2 += par;
                }
            }
        }
        if (suman1 == n2 && suman2 == n1)
            return true;
        else
            return false;
        
    }
}

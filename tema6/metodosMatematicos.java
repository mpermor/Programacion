import java.util.Scanner;

public class metodosMatematicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = 2;

        for (int i = 0; i < 64; i++)
            System.out.println(base + " elevado a " + i + " = " + potencia(base,(long) i));

        sc.close();
    }
    public static long potencia(long b, long e){
        long p = 1;
        for (int i = 1; i <= e; i++)
            p *= b;
        return p;
    }
}
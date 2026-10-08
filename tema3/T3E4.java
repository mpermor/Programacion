import java.util.Scanner;

public class T3E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int original = sc.nextInt();
        int inverso = 0;
        int n = original;
        int i = 0;
        
        while (i < 5) {
            inverso = inverso * 10 + n % 10;
            n = n / 10;
            i++;
        }


        if(inverso == original)
            System.out.println(original + " es capicúa");
        else
            System.out.println(original + " no es capicúa");
        
        sc.close();
    }
}
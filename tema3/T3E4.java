import java.util.Scanner;

public class T3E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int original = sc.nextInt();
        int inverso = 0;
        int n = original;
        
        if(original >= 100000)
            System.out.println("El número debe ser de como máximo 5 cifras");
        else if (original < 0)
            System.out.println("El número debe ser positivo");
        else{
            while (n != 0) {
                inverso = inverso * 10 + n % 10;
                n = n / 10;
            }
            if(inverso == original)
                System.out.println(original + " es capicúa");
            else
                System.out.println(original + " no es capicúa");
        }
        sc.close();
    }
}
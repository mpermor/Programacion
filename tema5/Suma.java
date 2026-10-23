import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int suma = 0;
        while(n != 0){
            System.out.print("Introduce un número (para parar introduce 0): ");
            n = sc.nextInt();
            suma += n;
        }
        System.out.println("La suma es: " + suma);
    }
}

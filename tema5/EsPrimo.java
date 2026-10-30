import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean esPrimo;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        esPrimo = true;
        if (num <= 1)
            esPrimo = false;
        else{
            for(int j = 2; j < num; j++){
                if(num % j == 0)
                    esPrimo = false;
            }
        }
        if(esPrimo){
            System.out.println(num + " es primo");
        }else{
            System.out.println(num + " no es primo");
        }
        sc.close();
    }
}

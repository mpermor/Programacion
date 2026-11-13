import java.util.Scanner;

public class DivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        System.out.println("El número tiene " + divisoresprimos(num) + " divisores primos");
    }
    public static int divisoresprimos(int num){
        int divisores = 0;
        boolean esPrimo;
        for(int i = 2; i < num; i++){
            esPrimo = true;
            if (i <= 1)
                esPrimo = false;
            else{
                for(int j = 2; j < i; j++){
                    if(i % j == 0)
                        esPrimo = false;
                    }
            }
            if(num % i == 0 && esPrimo){
                divisores++;
            }
        }
        
        return divisores;
    }
}

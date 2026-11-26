import java.util.Scanner;

public class ArrayTeclado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.print("Escribe un número: ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 9; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}

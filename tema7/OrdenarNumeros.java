import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.print("Escribe un número: ");
            numeros[i] = sc.nextInt();
        }
        java.util.Arrays.sort(numeros);

        for(int i = 0; i < 10; i++){
            System.out.println(numeros[i]);
        }
    }
}

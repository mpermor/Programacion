import java.util.Arrays;
import java.util.Scanner;

public class MultiplicarPor2EnOtroArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] multiplicado = new int[5];
        int[] ordenados = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            array1[i] = sc.nextInt();
        }
        for(int j = 0; j < 5; j++){
            multiplicado[j] = array1[j] * 2;
        }
        for(int k = 0; k < 5; k++){
            ordenados[k] = multiplicado[k];
        }
        Arrays.sort(ordenados);
        //mostrar por pantalla
        for(int i = 0; i < 5; i++){
            System.out.print(ordenados[i] + " ");
        }

        sc.close();
    }
}

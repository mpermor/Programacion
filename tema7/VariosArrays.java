import java.util.Scanner;

public class VariosArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        for(int i = 0; i < 5; i++) {
            System.out.print("Introduce un número para el array 1: ");
            array1[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            System.out.print("Introduce un número para el array 2: ");
            array2[i] = sc.nextInt();
        }
        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        for(int i = 0; i < 10; i++){
            System.out.println(array3[i]);
        }

        sc.close();
    }
}

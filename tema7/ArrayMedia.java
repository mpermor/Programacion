import java.util.Scanner;

public class ArrayMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        int media;
        for(int i = 0; i < 10; i++){
            System.out.print("Escribe un número: ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            suma += numeros[i];
        }
        media = suma / 10;
        System.out.println("La media es " + media);
    }
}

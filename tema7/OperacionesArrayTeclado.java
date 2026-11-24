import java.util.Scanner;

public class OperacionesArrayTeclado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        int resta = 0;
        int Multiplicación = 1;
        int división = 1;
        for(int i = 0; i < 10; i++){
            System.out.print("Escribe un número: ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            suma += numeros[i];
        }
        for(int i = 0; i < 10; i++){
            resta -= numeros[i];
        }
        for(int i = 0; i < 10; i++){
            Multiplicación *= numeros[i];
        }
        for(int i = 0; i < 10; i++){
            división /= numeros[i];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + Multiplicación);
        System.out.println("División: " + división);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuscar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int buscar;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Array generado: " + Arrays.toString(numeros));
        System.out.print("Introduce el número que quieres buscar:");
        buscar = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("El número " + buscar + " está en la posición " + i);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Número no encontrado");
        }

    }
}

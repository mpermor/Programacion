import java.util.Scanner;

public class Notas {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        System.out.println("Introduce la nota 1:");
        nota1 = sc.nextDouble();
        System.out.println("Introduce la nota 2:");
        nota2 = sc.nextDouble();
        System.out.println("Introduce la nota 3:");
        nota3 = sc.nextDouble();
        System.out.println("Introduce la nota 4:");
        nota4 = sc.nextDouble();
        System.out.println("Introduce la nota 5:");
        nota5 = sc.nextDouble();
        System.out.println("Nota 1: Alza = " + Math.ceil(nota1 * 10) / 10 + "   Baja = " + Math.floor(nota1 * 10) / 10 + "   Truncada = " + (int)nota1);
        System.out.println("Nota 2: Alza = " + Math.ceil(nota2 * 10) / 10 + "   Baja = " + Math.floor(nota2 * 10) / 10 + "   Truncada = " + (int)nota2);
        System.out.println("Nota 3: Alza = " + Math.ceil(nota3 * 10) / 10 + "   Baja = " + Math.floor(nota3 * 10) / 10 + "   Truncada = " + (int)nota3);
        System.out.println("Nota 4: Alza = " + Math.ceil(nota4 * 10) / 10 + "   Baja = " + Math.floor(nota4 * 10) / 10 + "   Truncada = " + (int)nota4);
        System.out.println("Nota 5: Alza = " + Math.ceil(nota5 * 10) / 10 + "   Baja = " + Math.floor(nota5 * 10) / 10 + "   Truncada = " + (int)nota5);
        System.out.println("Media: " + (nota1 + nota2 + nota3 + nota4 + nota5) / 5);
        System.out.println("Máximo: " + Math.max(nota1, Math.max(nota2, Math.max(nota3, Math.max(nota4, nota5)))));
        System.out.println("Mínimo: " + Math.min(nota1, Math.min(nota2, Math.min(nota3, Math.min(nota4, nota5)))));
        sc.close();
    }
}
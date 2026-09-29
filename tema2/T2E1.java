import java.util.Scanner;

public class T2E1 {
    public static void main(String[] args) {
        double salariosemanal = 0.0;
        double salariohora = 12.0;
        double horas = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de horas trabajadas:");
        horas = sc.nextFloat();
        salariosemanal = salariohora * horas;
        System.out.println("El salario semanal es: " + salariosemanal);
    }
}
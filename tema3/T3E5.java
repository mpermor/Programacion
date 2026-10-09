import java.util.Scanner;

public class T3E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        System.out.println("Introduce la primera nota");
        nota1 = sc.nextDouble();
        System.out.println("Introduce la segunda nota");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("La media es " + media + ", estás aprobado");
        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recuperacion = sc.next();
            if(recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Estás aprobado");
            } else {
                System.out.println("Estás suspenso");
            }
        }
        sc.close();
    }
}
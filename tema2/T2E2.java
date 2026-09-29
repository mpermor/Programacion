import java.util.Scanner;
public class T2E2 {
    public static void main(String[] args) {
        double radio;
        double altura;
        double volumen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del cono:");
        radio = sc.nextDouble();
        System.out.println("Introduce la altura del cono:");
        altura = sc.nextDouble();
        volumen = 1 / 3 * 3.14159 * radio * radio * altura;
        System.out.println("El volumen del cono es " + volumen);
    }
}
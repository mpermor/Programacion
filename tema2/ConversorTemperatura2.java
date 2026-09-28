import java.util.Scanner;

public class ConversorTemperatura2 {
	public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los grados en celsius:");
        celsius = sc.nextDouble();
        fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.println(celsius + " grados celsius son " + fahrenheit + " grados fahrenheit");
    }
}
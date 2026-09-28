import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los grados en fahrenheit:");
        fahrenheit = sc.nextDouble();
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " grados fahrenheit son " + celsius + " grados celsius");
    }
}
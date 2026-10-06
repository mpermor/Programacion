import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Introduzca un año:");
        año = sc.nextInt();
        if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))
            System.out.println("Es bisiesto");
        else
            System.out.println("No es bisiesto");
        sc.close();
    }
}
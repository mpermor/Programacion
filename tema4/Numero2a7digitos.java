import java.util.Scanner;

public class Numero2a7digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Introduce un número de 2 a 7 dígitos");
        num = sc.nextLine();
        char ch;
        boolean digitos = true;
        int i = 0;
        while (i < num.length()) {
            ch = num.charAt(i);
            if (!Character.isDigit(ch))
                digitos = false;
            i++;
        }
        if (digitos) {
            System.out.println("El número está formado por dígitos");
        } else {
            System.out.println("El número no está formado por dígitos");
        }
        if(num.length() < 2)
            System.out.println("El número tiene menos de 2 dígitos");
        else if (num.length() > 7)
            System.out.println("El número tiene más de 7 dígitos");
        else
            System.out.println("El número tiene entre 2 y 7 dígitos");

        sc.close();
    }
}

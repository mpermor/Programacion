import java.util.Scanner;

public class Numero2a7digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;
        System.out.println("Introduce un número de 2 a 7 dígitos");
        numero = sc.nextLine();
        if(numero.length() < 2)
            System.out.println("Número muy corto");
        else if (numero.length() > 7)
            System.out.println("Número muy largo");
    }
}

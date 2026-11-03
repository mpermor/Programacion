import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int vocales = 0;
        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vocales++;
        }
        System.out.println("Hay " + vocales + " vocales");
    }
}

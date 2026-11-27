import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int vocales = 0;
        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();
        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                vocales++;
            }
        }
        System.out.println("Hay " + vocales + " vocales");
    }
}
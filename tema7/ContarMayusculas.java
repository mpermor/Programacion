import java.util.Scanner;

public class ContarMayusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int mayusculas = 0;
        System.out.print("Introduce una cadena: ");
        cadena = sc.nextLine();
        for(int i = 0; i < cadena.length(); i++) {
            if(Character.isUpperCase(cadena.charAt(i))){
                mayusculas++;
            }
        }
        System.out.println("Hay " + mayusculas + " mayusculas");
    }
}
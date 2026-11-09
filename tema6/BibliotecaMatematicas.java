import java.util.Scanner;

public class BibliotecaMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1. esCapicua");
            System.out.println("2. potencia");
            System.out.println("3. digitos");
            System.out.println("4. voltea");
            System.out.println("5. quitaPorDetras");
            System.out.println("6. pegaPorDelante");
            System.out.println("7. salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        } while (opcion != 7);
    }
    public static boolean potencia(int base, int exponente){
        Math.pow(base, exponente);
    }
}
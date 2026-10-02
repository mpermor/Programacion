import java.util.Scanner;
public class RandomTest {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 10.0);
        int random2 = (int) (Math.random() * 10.0);
        int introducido;
        int resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuál es la suma de " + random1 + " + " + random2 + "?");
        introducido = sc.nextInt();
        resultado = random1 + random2;
        if (resultado == introducido)
            System.out.println("¡¡¡Correcto!!! :D");
        else 
            System.out.println("Incorrecto :(");
        sc.close();
    }
}
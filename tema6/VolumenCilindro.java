import java.util.Scanner;

public class VolumenCilindro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radio;
        int altura;
        System.out.print("Introduce el radio: ");
        radio = sc.nextInt();
        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();
        System.out.println("El volumen del cilindro es " + volumencilindro(radio, altura));
        sc.close();
    }
    public static double volumencilindro(double radio, double altura){
        return 3.14159 * Math.pow(radio, 2) * altura;
    }
}

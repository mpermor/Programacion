import java.util.Scanner;

public class T3E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        
        System.out.println("Introduzca el día de la semana:");
        dia = sc.nextInt();

        if(dia == 1)
            System.out.println("A primera hora toca lenguaje de marca");
        else if(dia == 2)
            System.out.println("A primera hora toca base de datos");
        else if(dia == 3)
            System.out.println("A primera hora toca sistemas informáticos");
        else if(dia == 4)
            System.out.println("A primera hora toca programación");
        else if(dia == 5)
            System.out.println("A primera hora toca entornos de desarrollo");
        
        sc.close();
    }
}
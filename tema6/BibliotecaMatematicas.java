import java.util.Scanner;

public class BibliotecaMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        long b;
        long e;
        int num;
        int digitos = 0;
        int digitonuevo;

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
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.println(esCapicua(num));
                    break;
                case 2:
                    System.out.print("Introduce la base: ");
                    b = sc.nextLong();
                    System.out.print("Introduce el exponente: ");
                    e = sc.nextLong();
                    System.out.println("El resultado es: " + potencia(b, e));
                    break;
                case 3:
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.println("El número tiene " + digitos(num) + " dígitos");
                    break;
                case 4:
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.println(voltea(num));
                    break;
                case 5:
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce el número de dígitos: ");
                    digitos = sc.nextInt();
                    System.out.println(quitaPorDetras(num, digitos));
                    break;
                case 6:
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce un nuevo dígito: ");
                    digitonuevo = sc.nextInt();
                    System.out.println(pegaPorDelante(num, digitonuevo));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 7);
    }
    public static boolean esCapicua(int num){
        int inverso = 0;
        int n = num;
        boolean capicua;
        
        while (n != 0) {
            inverso = inverso * 10 + n % 10;
            n = n / 10;
        }
        if(inverso == num)
            capicua = true;
        else
            capicua = false;
        return capicua;
    }
    public static long potencia(long b, long e){
        long p = 1;
        for (int i = 1; i <= e; i++)
            p *= b;
        return p;
    }
    public static int digitos(int num){
        int contador_digitos = 0;
        while(num != 0){
            num /= 10;
            contador_digitos++;
        }
        return contador_digitos;
    }
    public static int voltea(int num){
        int invertido = 0;

        while (num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return invertido;
    }
    public static int quitaPorDetras(int num, int digitos){
        return num / (int) Math.pow(10, digitos);
    }
    public static int pegaPorDelante(int num, int d){
        int k = digitos(num);
        int resultado = d * (int) Math.pow(10, k) + num;
        return resultado;
    }
}
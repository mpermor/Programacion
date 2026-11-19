import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        int dia, mes, anio;
        int n, a, b, c;
        Scanner sc = new Scanner(System.in);

        anio = LeeAñoValido();
        mes = LeeMesValido();
        dia = LeeDiaValido(anio, mes);
        System.out.println(DiaEnLetra(DiaSemana(dia, mes, anio)));
    }

    public static int LeeAñoValido(){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        while(a < 1583){
            System.out.print("Introduce un año: ");
            a = sc.nextInt();
        }
        return a;
    }

    public static int LeeMesValido(){
        int mes = 0;
        Scanner sc = new Scanner(System.in);
        while(mes < 1 || mes > 13){
            System.out.print("Introduce un mes: ");
            mes = sc.nextInt();
        }
        return mes;
    }

    public static int LeeDiaValido(int a, int m){
        int d = 0;
        boolean valido = false;
        Scanner sc = new Scanner(System.in);
        while(!valido){
            System.out.print("Introduzca un día válido:");
            d = sc.nextInt();

            if (m == 4 || m == 6 || m == 9 ||m == 11)
                if(d >= 1 && d <= 30)
                    valido = true;
                else 
                    System.out.println("Día no válido");
            else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                if(d >= 1 && d <= 31)
                    valido = true;
                else 
                    System.out.println("Día no válido");
            else if (m == 2)
                if(esBisiesto(a)) {
                    if (d >= 1 && d <= 29)
                        valido = true;
                    else
                        System.out.println("Día no válido");
                } else {
                    if (d >= 1 && d <= 28)
                        valido = true;
                    else
                        System.out.println("Día no válido");
                }
        }
        return d;
    }

    public static boolean esBisiesto(int a) {
        return (a % 4 == 0) && ((a % 100 != 0));
    }

    public static int DiaSemana(int dia, int mes, int año) {
        int a;
        int b;
        int c;
        int n;
        if(mes == 1 || mes == 2){
            a = mes + 10;
            b = (año - 1) % 100;
            c = (año - 1) / 100;
        } else {
            a = mes - 2;
            b = año % 100;
            c = año / 100;
        }
        n = (700 + (26 * a -2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;
        return n;
    }

    public static String DiaEnLetra(int nDia){
        String dia = "";
        if(nDia == 0)
            dia = "Domingo";
        else if(nDia == 1)
            dia = "Lunes";
        else if(nDia == 2)
            dia = "Martes";
        else if(nDia == 3)
            dia = "Miércoles";
        else if(nDia == 4)
            dia = "Jueves";
        else if(nDia == 5)
            dia = "Viernes";
        else if(nDia == 6)
            dia = "Sábado";
        else
            dia = "Día no válido";
        return  dia;
    }
}

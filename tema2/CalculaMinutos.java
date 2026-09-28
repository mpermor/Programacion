import java.util.Scanner;
public class CalculaMinutos {
	public static void main(String[] args) {
		int segundos;
        int minutos;
        int horas;
        int segundosRestantes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculamos el nº de minutos y segundos, dada una cantidad de segundos");
        System.out.println("Introduzca una cantidad de segundos:");
        segundos = sc.nextInt();
        minutos = segundos / 60;
        horas = minutos / 60;
        segundosRestantes = segundos % 60;
        System.out.println("El nº de horas es " + horas + ", el nº de minutos es " + minutos + " y el nº de segundos restantes es " + segundosRestantes);
	}
}
import java.util.Scanner;
public class T2E3 {
    public static void main(String[] args) {
        double mb;
        double kb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los mb:");
        mb = sc.nextDouble();
        kb = mb * 1024;
        System.out.println(mb + "MB son " + kb + "KB");
    }
}
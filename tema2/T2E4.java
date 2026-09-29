import java.util.Scanner;
public class T2E4 {
    public static void main(String[] args) {
        double mb;
        double kb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los KB:");
        kb = sc.nextDouble();
        mb = kb / 1024;
        System.out.println(kb + "KB son " + mb + "MB");
    }
}
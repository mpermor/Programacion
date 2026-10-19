import java.util.Scanner;

public class NombreYApellidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreyapellidos;
        String nombre;
        String apellido1;
        String apellido2;
        int espacio1;
        int espacio2;
        System.out.println("Introduce tu nombre y apellidos:");
        nombreyapellidos = sc.nextLine();
        espacio1 = nombreyapellidos.indexOf(" ");
        espacio2 = nombreyapellidos.indexOf(" ", espacio1 + 1);
        nombre = nombreyapellidos.substring(0, espacio1);
        apellido1 = nombreyapellidos.substring(espacio1, espacio2);
        apellido2 = nombreyapellidos.substring(espacio2);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        sc.close();
    }
}

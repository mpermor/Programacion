public class PalabraAleatoria {
    public static void main(String[] args) {
        String mayuscula = "";
        int contador = 0;
        while(contador < 5){
            char letra = (char)(Math.random() * 26 + 65);
            mayuscula = mayuscula + letra;
            contador++;
        }
        String minuscula = mayuscula.toLowerCase();
        System.out.println(mayuscula);
        System.out.println(minuscula);
    }
}

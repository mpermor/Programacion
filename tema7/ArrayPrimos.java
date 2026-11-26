public class ArrayPrimos {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for(int i = 0; i < 100; i++){
            if(esprimo(i)){
                numeros[i] = i;
            }
        }
        for(int i = 0; i < 100; i++){
            System.out.println(numeros[i]);
        }
    }
    public static boolean esprimo(int num) {
        boolean esPrimo = true;
        if (num <= 1)
            esPrimo = false;
        else {
            for (int j = 2; j <= Math.sqrt(num); j++)
                if (num % j == 0)
                    esPrimo = false;
        }
        return esPrimo;
    }
}

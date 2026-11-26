public class ArrayPares {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int i = 0;
        int j = 0;
        while (i < 100) {
            if(i % 2 == 0) {
                numeros[j] = i;
            }
            i+=2;
            j++;
        }
        for(int k = 0; k < 50; k++){
            System.out.print(numeros[k] + " ");
        }
    }
}

public class Linea2 {
    public static void main(String[] args) {
        char c = 0;
        int random = (int)(Math.random() * 6);
        int contador = 1;
        if(random == 0)
            c = '*';
        else if(random == 1)
            c = '-';
        else if(random == 2)
            c = '=';
        else if(random == 3)
            c = '.';
        else if(random == 4)
            c = '|';
        else if(random == 5)
            c = '@';
        
        while(contador <= 5){
            System.out.print(c);
            contador++;
        }
    }
}

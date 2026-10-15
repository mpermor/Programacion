public class Quiniela {
    public static void main(String[] args) {
        int num;
        int intento = 1;
        while(intento <= 15){
            intento++;
            num = (int)(Math.random() * 6);
            if(num <= 3)
                System.out.println("1");
            else if (num <= 5)
                System.out.println("X");
            else
                System.out.println("2");
        }
    }
}

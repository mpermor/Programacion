public class Baraja {
    public static void main(String[] args) {
        int palo = (int)(Math.random() * 4.0);
        int carta = (int)(Math.random() * 13.0) + 1;
        if(palo == 0){
            if(carta == 1){
                System.out.println("As de corazones");
            } else if(carta >= 2 && carta <= 10) {
                System.out.println(carta + " corazones");
            } else if(carta == 11) {
                System.out.println("Sota corazones");
            } else if(carta == 12) {
                System.out.println("Reina corazones");
            } else if(carta == 13){
                System.out.println("Rey corazones");
            }
        } else if(palo == 1){
            if(carta == 1){
                System.out.println("As de diamantes");
            }else if(carta >= 2 && carta <= 10){
                System.out.println(carta + " diamantes");
            }else if(carta == 11){
                System.out.println("Sota diamantes");
            }else if(carta == 12){
                System.out.println("Reina diamantes");
            }else if(carta == 13){
                System.out.println("Rey diamantes");
            }
        } else if(palo == 2){
            if(carta == 1){
                System.out.println("As de picas");
            }else if(carta >= 2 && carta <= 10){
                System.out.println(carta + " picas");
            }else if(carta == 11){
                System.out.println("Sota picas");
            }else if(carta == 12){
                System.out.println("Reina picas");
            }else if(carta == 13){
                System.out.println("Rey picas");
            }
        } else if(palo == 3){
            if(carta == 1){
                System.out.println("As de tréboles");
            }else if(carta >= 2 && carta <= 10){
                System.out.println(carta + " tréboles");
            }else if(carta == 11){
                System.out.println("Sota tréboles");
            }else if(carta == 12){
                System.out.println("Reina tréboles");
            }else if(carta == 13){
                System.out.println("Rey tréboles");
            }
        }
    }
}
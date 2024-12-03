package Exo5;


import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Pile pile = new Pile();
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            int a = random.nextInt(1,101);
            pile.empiler(String.valueOf(a));
        }
        System.out.println(pile.getSommet().getValeur());
        pile.depiler();
        pile.depiler();
        System.out.println(pile.getSommet().getValeur());
    }
}

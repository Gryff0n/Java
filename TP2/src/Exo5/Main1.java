package Exo5;

public class Main1 {
    public static void main(String[] args) {
        String[] alphabet = new String[] {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Pile pile  = new Pile();
        for(String s : alphabet) {
            pile.empiler(s);
        }
        System.out.println(pile.getSommet().getValeur());
        pile.depiler();
        pile.depiler();
        System.out.println(pile.getSommet().getValeur());
    }
}

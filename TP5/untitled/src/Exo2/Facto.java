package Exo2;

public class Facto {
    private static long factRec (int n) {
        assert n >= 0 : "Valeur invalide";
        if(n==0) return 1;
        else return n*factRec(n-1);
    }

    /**
     *
     * @param n
     * @return
     * @throws
     */
    public static long factorielle (int n) {
        if (n<0 || n>20) throw new IllegalArgumentException("Valeur invalide");
        return factRec(n);
    }
}

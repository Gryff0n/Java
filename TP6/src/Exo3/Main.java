package Exo3;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int n = 30;
        BigFact nfact = new BigFact(n);
        BigInteger res = nfact.factorial(n);
        System.out.println(nfact.getCache());
        System.out.println(res);
    }
}

package Exo3;

import java.math.BigInteger;
import java.util.*;

public class BigFact {
    private int n;
    private static SortedSet<BigInteger> cache = new TreeSet<BigInteger>();

    public  BigFact(int n) {
        this.n = n;
    }

    public BigInteger factorial(int n) {
        if(n==1) {
            cache.add(BigInteger.ONE);
            return BigInteger.ONE;
        }
        if(n==0) {
            cache.add(BigInteger.ONE);
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(n).multiply(factorial(n-1));
        cache.add(result);
        return result;
    }

    public Set<BigInteger> getCache() {
        return cache;
    }
}

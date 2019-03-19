package oilers.t11to20;

import java.math.BigInteger;

public class t20 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("100");
        BigInteger c = rec(b);
        System.out.println(c);
        long l = c.toString()
                .chars()
                .reduce(0, (i, j) -> i + Character.getNumericValue(j));
        System.out.println(l);
    }

    static BigInteger rec(BigInteger b) {
        if (b.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return b.multiply(rec(b.subtract(BigInteger.ONE)));
    }
}

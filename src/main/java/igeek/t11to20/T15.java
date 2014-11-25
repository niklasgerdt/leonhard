package igeek.t11to20;

import java.math.BigInteger;

/**
 * from pascal triangles
 * (40 20) => 40 choose 20 => 40!/(20!)*(40-20)!
 */
public class T15 {

    public static void main(String[] args) {
        BigInteger bb = new BigInteger("5");
        System.out.println(fac(bb));
        BigInteger n = new BigInteger("40");
        BigInteger k = new BigInteger("20");
        System.out.println(fac(n));
        System.out.println(fac(k));
        System.out.println(fac(n).divide(fac(k).multiply(fac(n.subtract(k)))));
    }

    static BigInteger fac(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == 0)
            return BigInteger.ONE;
        else {
            BigInteger nextBi = n.subtract(BigInteger.ONE);
            BigInteger next = fac(nextBi);
            return n.multiply(next);
        }
    }
}

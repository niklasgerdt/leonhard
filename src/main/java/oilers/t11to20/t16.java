package oilers.t11to20;

import java.math.BigInteger;
import java.util.Arrays;

public class t16 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("2");
        BigInteger d = b.pow(1000);
        System.out.println(d);
        long l = d.toString()
                .chars()
                .reduce(0, (i, j) -> i + Character.getNumericValue(j));
        System.out.println(l);
    }

}

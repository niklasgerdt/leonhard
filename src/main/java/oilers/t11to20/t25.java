package oilers.t11to20;

import java.math.BigInteger;
import java.util.stream.Stream;

public class t25 {

    public static void main(String[] a) {
        Stream.iterate(new Fib(2, new BigInteger("1"), new BigInteger("1")), fib -> {
            BigInteger c = fib.a.add(fib.b);
            return new Fib(fib.term + 1, fib.b, c);
        })
                .filter(s -> s.b.toString().length() >= 1000)
                .limit(1)
                .forEach(s -> System.out.println(s.term));
    }

    static class Fib {
        final long term;
        final BigInteger a;
        final BigInteger b;

        Fib(long term, BigInteger a, BigInteger b) {
            this.term = term;
            this.a = a;
            this.b = b;
        }
    }
}

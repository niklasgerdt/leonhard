package igeek.t1to10;

import java.util.stream.Stream;

import static java.lang.System.out;

public class T6 {
    public static void main(String[] args) {
        new T6();
    }

    public T6() {
        int sum = Stream.iterate(1, a -> a + 1).limit(100).reduce(0, (a, b) -> a + (b * b));
        int sqr = Stream.iterate(1, a -> a + 1).limit(100).reduce(0, (a, b) -> a + b);
        sqr = sqr * sqr;

        out.println(sum + ", " + sqr + ", " + (sqr - sum));
    }
}

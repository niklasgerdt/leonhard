//Problem 6
//        The sum of the squares of the first ten natural numbers is,
//        12 + 22 + ... + 102 = 385
//        The square of the sum of the first ten natural numbers is,
//        (1 + 2 + ... + 10)2 = 552 = 3025
//        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

package igeek;

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

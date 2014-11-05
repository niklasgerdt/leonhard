//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

package igeek;

import java.util.stream.Stream;

import static java.lang.System.out;

public class T5 {
    public static void main(String[] args) {
        new T5();
    }

    public T5() {
        Stream.iterate(1, a -> a + 1)
                .filter(a -> (a % 20 == 0 && a % 19 == 0 && a % 18 == 0 && a % 17 == 0 && a % 16 == 0 && a % 15 == 0 && a % 14 == 0 && a % 13 == 0))
                .filter(a -> (a % 12 == 0 && a % 11 == 0))
                .limit(1)
                .forEach(a -> out.println(a));
    }

}

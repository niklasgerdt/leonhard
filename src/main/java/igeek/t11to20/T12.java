package igeek.t11to20;

import java.util.*;
import java.util.stream.LongStream;

public class T12 {
    long num = 0;

    public static void main(String[] args) {
        new T12().run();
    }

    void run() {
        LongStream.iterate(1, (i -> i + 1))
                .map(i -> num = i + num)
                .map(i -> factors(i).orElse(Long.valueOf(0)))
                .filter(i -> i > 0)
                .limit(1)
                .forEach(i -> System.out.println(i));
    }

    OptionalLong factors(final long number) {
        long max = number;
        List<Long> builder = new ArrayList<>();
        for (long i = 1; i < max; i++) {
            if (number % i == 0) {
                builder.add(i);
                builder.add(number / i);
                max = number / i;
            }
        }
        if (builder.size() > 500) {
            return builder.stream().mapToLong(Long::valueOf).max();
        } else
            return OptionalLong.empty();
    }
}

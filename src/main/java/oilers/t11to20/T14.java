package oilers.t11to20;

import java.util.stream.LongStream;

public class T14 {
    long max = 0;
    long val = 0;

    public static void main(String[] a) {
        new T14().run();
    }

    public void run() {
        LongStream.rangeClosed(1, 1_000_000)
                .forEach(i -> populate(i));
        System.out.println("val " + val + " count:" + max);
    }

    void populate(long i) {
        long in = i;
        long count = 1;
        do {
            count++;
            if (i % 2 == 0)
                i = i / 2;
            else
                i = 3 * i + 1;
        } while (i != 1);
        if (count >= max) {
            max = count;
            val = in;
        }
    }
}

package oilers.t1to10;

import java.util.stream.Stream;

import static java.lang.System.out;

public class T2 {
    private static int SIZE = 4000000;

    public static void main(String[] args) {
        FibonacciSupplier fibsup = new FibonacciSupplier();
        Stream.Builder<Integer> builder = Stream.builder();

        int i = 0;
        while (i <= SIZE) {
            i = fibsup.getAsInt();
            builder.add(i);
        }

		int sum = builder.build().mapToInt(Integer::intValue).filter(j -> (j % 2 == 0)).sum();
        out.println(sum);
    }

    static class FibonacciSupplier {
        private int prev = 1;
        private int prevprev = 0;

        public int getAsInt() {
            int ret = prev + prevprev;
            prevprev = prev;
            prev = ret;
            return ret;
        }
    }
}

package oilers.t1to10;

import java.util.stream.IntStream;
import static java.lang.System.out;

public class T1 {

    public static void main(String[] args) {
        int sum = IntStream
        		.range(0, 1000)
        		.filter(i -> (i % 3 == 0 || i % 5 == 0))
        		.sum();
        out.println(sum);
    }
}

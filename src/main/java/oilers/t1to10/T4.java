package oilers.t1to10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class T4 {
    public static void main(String[] args) {
        new T4();
    }

    public T4() {
        int fac = 999;
        int max = fac * fac;
        List<Integer> list = Stream.iterate(max, i -> i - 1).
                limit(max)
                .filter(j -> isPalindrome(j))
                .filter(i -> i > 100000)
                .collect(Collectors.toList());
        for (int j = 0; j < list.size(); j++) {
            int next = list.get(j);
            int f1 = Stream.iterate(fac, i -> i - 1)
                    .filter(i -> next % i == 0)
                    .limit(1)
                    .reduce((a, b) -> a + b)
                    .orElse(1);
            int f2 = next / f1;
            long c = Stream.of(f1, f2)
                    .map(a -> String.valueOf(a))
                    .filter(s -> s.length() == 3)
                    .count();
            if (c == 2) {
                out.println(next);
                j = list.size();
            }
        }
    }

    private boolean isPalindrome(int sum) {
        String str = String.valueOf(sum);
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}
package main;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class e25 {
    int longestKnown = 6;
    BigDecimal seed = BigDecimal.ONE;
    BigDecimal end = BigDecimal.valueOf(10);
    MathContext mc = new MathContext(2000);
    Predicate<BigDecimal> rangeEnd = prev -> ((prev.compareTo(end) > 0) ? false : true);
    UnaryOperator<BigDecimal> next = prev -> prev.add(BigDecimal.ONE);
    Function<BigDecimal, BigDecimal> divide = d -> BigDecimal.ONE.divide(d, mc);
    Function<BigDecimal, String> mapToString = d -> d.movePointRight(d.scale()).toPlainString();
    Function<String, BigDecimal> getDivider = s -> BigDecimal.ONE.divide(new BigDecimal(s));

    void solve() {
        Stream
            .iterate(seed, rangeEnd, next)
            .map(divide)
            .map(mapToString)
            .filter(s -> s.length() > longestKnown)
            .map(s -> parse3(s))
            .forEach(s -> System.out.println(s));
    }

    void longest(String s) {
        if (doubleCheck(s)) {
            System.out.println(s.substring(0, longestKnown));
        }
    }

    boolean doubleCheck(String s) {
        for (int j = s.length() / 2; j > 0; j--) {
            for (int i = 0; i < s.length(); i++) {
                if (!s.substring(i * j, i * j + j).equals(s.substring(i * j + j, i * j + 2 * j))) {
                    break;
                }
                return false;
            }
        }
        return false;
    }

    String parse3(String s) {
        for (int a = longestKnown; a < s.length() / 2; a++) {
            for (int b = 0; b * a + 2 * a * a < s.length(); b++) {
                if (!s.substring(b * a, b * a + a).equals(s.substring(b * a + a, b * a + 2 * a))) {
                    break;
                }
            }
            longestKnown = a;
        }
        return s.substring(0, longestKnown);
    }

    String parse(String s) {
        for (int a = 0; a + 2 * longestKnown < s.length(); a = a + longestKnown) {
            String s1 = s.substring(a, a + longestKnown);
            String s2 = s.substring(a + longestKnown, a + 2 * longestKnown);
            if (!s1.equals(s2)) {
                new String();
            }
        }
        return s.substring(0, longestKnown);
    }

    //    Optional<String> parseNext(String s, int offset) {
    //        for (int a = 0; a + 2 * offset < s.length(); a = a + offset) {
    //
    //            String s1 = s.substring(a, a + offset);
    //            String s2 = s.substring(a + offset, a + 2 * offset);
    //            if (!s1.equals(s2)) {
    //                new Optional<>();
    //            }
    //        }
    //        return s.substring(0, longestKnown);
    //
    //    }

    public static void main(String[] a) {
        new e25().solve();
    }
}

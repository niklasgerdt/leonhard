//Largest prime factor
//Problem 3
//The prime factors of 13195 are 5,7,13and 29.
//What is the largest prime factor of the number 600851475143 ?

package igeek;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class T3 {
    private static long THENUMBER = 600851475143L;
    private static Set<Integer> factors = new HashSet<>();

    public static void main(String[] args) {
        long num = THENUMBER;
        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                num = num / factor;
                factors.add(factor);
            } else
                factor++;
        }

        out.println(factors);
    }
}

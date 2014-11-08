package igeek.t1to10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;

public class T7 {
	List<Integer> primes = new ArrayList<>();

	public T7() {
		int p = Stream
				.iterate(2, a -> a + 1)
				.filter(a -> isPrime(a))
				.peek(a -> primes.add(a))
				.limit(10001).reduce((a, b) -> b)
				.get();
		out.println(p);
	}

	boolean isPrime(int i){
    	Stream<Integer> s = 
    			primes
    			.stream()
    			.filter(a-> i % a == 0)
    			.limit(1);
    	return (s.count() == 0) ? true : false;
    }

	public static void main(String[] args) {
		new T7();
	}
}

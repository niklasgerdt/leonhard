package igeek;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class T10 {
	private int max = 200000;
	List<Integer> primes = new ArrayList<>();

	public T10() {
		Stream
		.iterate(2, a -> a + 1)
		.filter(a -> isPrime(a))
		.peek(a -> addPrime(a))
		.filter(a -> a >= max)
		.limit(1)
		.forEach(a -> out.println(a));
		
		out.println(primes.size());
		
		long l = primes.stream().parallel().mapToInt(Integer::intValue).sum();
		out.println(l);
	}
	
	void addPrime(int i){
		if (i < max)
			primes.add(i);
	}

	boolean isPrime(int i) {
		Stream<Integer> s = primes
				.stream()
				.filter(a -> i % a == 0)
				.limit(1);
		return (s.count() == 0) ? true : false;
	}

	public static void main(String[] args) {
		new T10();
	}
}

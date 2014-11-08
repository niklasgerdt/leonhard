package igeek;

import static java.lang.System.out;
import java.util.stream.IntStream;

public class T9 {
	private static final int AMAX = 332;
	private static final int AMIN = 1;
	private static final int MAX = 1000;
	private static final int BMAX = 499;
	private static final int BMIN = 2;
	private static final int CMIN = 334;
	private static final int CMAX = 997;

	public T9(){
		IntStream
		.rangeClosed(CMIN, CMAX)
		.forEach(a->IntStream
				.rangeClosed(BMIN, BMAX)
				.forEach(b-> IntStream
						.rangeClosed(AMIN, AMAX)		
						.filter(c-> (a+b+c==MAX))
						.filter(c->c*c+b*b==a*a)
						.forEach(c->out.println(a*b*c))));
	}

	public static void main(String[] args) {
		new T9();
	}
}

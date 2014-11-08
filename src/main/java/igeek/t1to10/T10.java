package igeek.t1to10;

import java.util.Arrays;

public class T10 {
	private static final int MAX = 2_000_001;
	private boolean[] arr = new boolean[MAX];
	{
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;
	}

	public T10() {
		Factor factor = new Factor(2, true);
		while (factor.found) {
			harvest(factor.val);
			factor = nextPrime(factor.val);
		}
		long sum = 0;
		for (int i = 0; i < MAX; i++) {
			if (arr[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	Factor nextPrime(int last) {
		while (++last < MAX && !arr[last]) {
		}
		if (last < MAX)
			return new Factor(last, true);
		else
			return new Factor(-1, false);
	}

	void harvest(int factor) {
		int multiplier = 2;
		while (factor * multiplier < MAX) {
			arr[factor * multiplier] = false;
			multiplier++;
		}
	}

	static class Factor {
		int val;
		boolean found;

		Factor(int value, boolean found) {
			this.found = found;
			val = value;
		}
	}

	public static void main(String[] args) {
		new T10();
	}
}

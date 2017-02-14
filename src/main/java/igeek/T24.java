package igeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T24 {
	static List<Integer> base = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	static List<String> result = new ArrayList<String>(5000000);

	static void recursivePermutator(List<Integer> rest, String res) {
		if (rest.isEmpty()) {
			result.add(res);
		} else {
			for (Integer i : rest) {
				String tempRes = res + i;
				List<Integer> tempRest = new ArrayList<>(rest);
				tempRest.remove(i);
				recursivePermutator(tempRest, tempRes);
			}
		}
	}

	public static void main(String[] a) {
		recursivePermutator(base, "");
		System.out.println(result.get(1000000-1));
	}
}

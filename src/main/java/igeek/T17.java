package igeek;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class T17 {

	public static void main(String[] a) {
		String s = IntStream.range(1, 1001).mapToObj(T17::mapper).collect(Collectors.joining());
		System.out.println(s.length());
	}

	static String mapper(Integer i) {
		String s = intToString(i);
		return s;
	}

	static String intToString(Integer i) {
		if (i < 20) {
			String s = belowTwenty(i);
			return s;
		} else if (i < 100) {
			int j = Integer.parseInt(String.valueOf(i).substring(0, 1));
			int k = Integer.parseInt(String.valueOf(i).substring(1, 2));
			String s = twodigit(j) + belowTwenty(k);
			return s;
		} else if (i < 1000) {
			int j = Integer.parseInt(String.valueOf(i).substring(0, 1));
			String s = belowTwenty(j) + "hundred";
			String z = intToString(i - j * 100);
			if (z != "") {
				s += "and" + z;
			}
			System.out.println(s);
			return s;
		} else if (i == 1000) {
			String s = "onethousand";
			return s;
		} else {
			return "";
		}
	}

	static String twodigit(int i) {
		switch (i) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		}
		return "";
	}

	static String belowTwenty(int i) {
		String s = "";
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		}
		return s;
	}
}

package oilers;

import java.util.stream.Stream;

public class T19 {

	public static void main(String a[]) {
		T19 T = new T19();
		Date d = T.new Date();
		d.year = 1900;
		d.mon = 1;
		d.day = 1;
		d.dayName = Day.MON;

		Long c = Stream.iterate(d, T::generator).limit(100 * 400).filter(x -> x.year > 1900).filter(x -> x.year < 2001)
				.filter(x -> x.day == 1).filter(x -> x.dayName == Day.SUN).count();
		System.out.println(c);
	}

	Date generator(Date d) {
		Date d2 = d.next();
		System.out.println(" D " + d.day + " M " + d.mon + " Y " + d.year);
		// try {
		// Thread.sleep(1000 / 3);
		// } catch (InterruptedException e) {
		// }
		return d2;
	}

	class Date {
		Day dayName;
		int day, mon, year;

		Date next() {
			Date d = new Date();
			d.dayName = dayName.next();
			d.day = day + 1;
			d.mon = mon;
			d.year = year;
			if (d.day >= 29 && d.mon == 2) {
				if ((d.year % 4 != 0) || ((d.year % 100 == 0) && (d.year % 400 != 0))) {
					d.day = 1;
					d.mon = d.mon + 1;
				} else if (d.day > 29) {
					d.day = 1;
					d.mon = d.mon + 1;
				}
			} else if (d.day == 31 && (d.mon == 4 || d.mon == 6 || d.mon == 9 || d.mon == 11)) {
				d.day = 1;
				d.mon = d.mon + 1;
			} else if (d.day == 32) {
				if (d.mon == 12) {
					d.year = d.year + 1;
					d.day = 1;
					d.mon = 1;
				} else {
					d.day = 1;
					d.mon = d.mon + 1;
				}
			}
			return d;
		}
	}

	private enum Day {
		MON, TUE, WED, THU, FRI, SAT, SUN;

		Day next() {
			switch (this) {
			case MON:
				return TUE;
			case TUE:
				return WED;
			case WED:
				return THU;
			case THU:
				return FRI;
			case FRI:
				return SAT;
			case SAT:
				return SUN;
			case SUN:
				return MON;
			default:
				return MON;
			}
		}
	}
}

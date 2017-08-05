package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author medany
 */

public class LeapYear {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();

		System.out.println(
				(new StringBuilder("Year ")).append(year).append(" is").append(isLeapYear(year) ? " leap" : " not leap").append(" year").toString());
		// System.out.println((new StringBuilder("Year ")).append(year).append("
		// is").append(isleapYear(year) ? " leap" : " not leap").append("
		// year").toString());

	}

	public static boolean isLeapYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

		if (noOfDays > 365) {
			return true;
		}

		return false;
	}

	public static boolean isleapYear(int year) {
		return (year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0));
	}

}

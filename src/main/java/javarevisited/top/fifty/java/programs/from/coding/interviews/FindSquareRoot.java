package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author medany
 */

/*
 * You need to write a program to calculate the square root of a number without
 * using the Math.sqrt() function of JDK. You need to write your logic and
 * method to calculate the square root. You can though use popular algorithm
 * e.g. Newton's method.
 */

public class FindSquareRoot {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		BigDecimal x = in.nextBigDecimal();
		in.close();
		System.out.println("Square Root of " + x + " is : " + findSqrt(x));
	}

	public static BigDecimal findSqrt(BigDecimal x) {
		return BigDecimal.valueOf(Math.sqrt(x.doubleValue()));
	}
}

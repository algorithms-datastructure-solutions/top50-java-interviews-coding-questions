package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Scanner;

/**
 * @author medany
 */

/*
 * Simple Java program to reverse a number in Java using loop and operator This
 * program also shows example of using division operator(/) and Remainder
 * Operator(%)
 */

public class ReverseaNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		System.out.println("Reverse of number: " + num + " is " + reveerse(num));

	}

	public static Integer reverse(Integer num) {
		int reverse = 0;
		int remainder = 0;
		do {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		} while (num > 0);

		return reverse;
	}

	public static Integer reveerse(Integer num) {

		StringBuilder sb = new StringBuilder(num.toString());
		for (int i = 0; i < sb.length() / 2; i++) {
			int end = (sb.length() - 1) - i;
			char x = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(end));
			sb.setCharAt(end, x);
		}
		return Integer.parseInt(sb.toString());
	}
}

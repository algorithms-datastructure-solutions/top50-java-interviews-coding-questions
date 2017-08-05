package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Scanner;

/**
 * @author medany
 */

public class ReverseWordsinString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();

		System.out.println("Original Array: " + s);
		System.out.println("Reversed Array: " + reverseLine(s));
	}

	private static String reverseLine(String s) {
		if (s == null || s.trim().isEmpty())
			return s;

		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = arr.length - 1; i > -1; i--) {
			sb.append(arr[i]).append(" ");
		}

		return sb.toString().trim();

	}
}

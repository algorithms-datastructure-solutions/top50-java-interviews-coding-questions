package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Scanner;

/**
 * @author medany
 */

/*
 * Write a program to check if two given String is Anagram of each other. Your
 * function should return true if two Strings are Anagram, false otherwise. A
 * string is said to be an anagram if it contains same characters and same
 * length but in different order e.g. army and Mary are anagrams. You can ignore
 * cases for this problem but you should clarify that from your interview.
 */
public class StringAnagram {

	private static int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		in.close();

		System.out.println((new StringBuilder(a)).append(isAnagram(a, b) ? " is anagram" : " not anagram").append(" of ").append(b).toString());

	}

	public static boolean isAnagram(String a, String b) {

		if (a.length() != b.length())
			return false;

		long aFact = 1, bFact = 1;
		for (int i = 0; i < a.length(); i++) {
			aFact *= primes[a.charAt(i) - 'a'];
			bFact *= primes[b.charAt(i) - 'a'];
		}

		return aFact == bFact;
	}

	public static boolean isAnagraam(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}
		char[] chars = a.toCharArray();
		for (char c : chars) {
			int index = b.indexOf(c);
			if (index != -1) {
				b = b.substring(0, index) + b.substring(index + 1, b.length());
			} else {
				return false;
			}
		}
		return b.isEmpty();

	}
}

package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author medany
 */

/*
 * You need to write a simple Java program to check if a given String is
 * palindrome or not. A Palindrome is a String which is equal to the reverse of
 * itself e.g. "Bob" is a palindrome because of the reverse of "Bob" is also
 * "Bob". Though be prepared with both recursive and iterative solution of this
 * problem. The interviewer may ask you to solve without using any library
 * method e.g. indexOf() or subString() so be prepared for that.
 */
public class StringPalindrome {

	private static int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };

	private static Stack<Character> stack = new Stack<>();
	private static Deque<Character> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		System.out.println("String : " + s + " is " + (isPalindrome2(s) ? "palindrome" : "not a palindrome"));

	}

	public static boolean isPalindrome(String input) {

		if (input == null)
			return false;
		if (input.isEmpty())
			return false;

		char[] s = input.toCharArray();

		for (char c : s) {
			stack.push(c);
			queue.add(c);
		}

		for (int i = 0; i < s.length / 2; i++) {
			if (stack.pop() != queue.removeFirst()) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome2(String input) {

		if (input == null)
			return false;
		if (input.isEmpty())
			return false;

		if (input.length() % 2 == 0) { // odd length
			return fact(input.substring(0, input.length() / 2)) == fact(input.substring((input.length() / 2), input.length()));
		} else { // even length
			return fact(input.substring(0, input.length() / 2)) == fact(input.substring((input.length() / 2) + 1, input.length()));
		}

	}

	public static long fact(String word) {
		long fact = 1;
		for (int i = 0; i < word.length(); i++) {
			fact *= primes[word.charAt(i) - 'a'];
		}
		return fact;
	}
}

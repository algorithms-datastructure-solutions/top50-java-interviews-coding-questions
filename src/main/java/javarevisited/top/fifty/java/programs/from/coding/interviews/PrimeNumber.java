package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Scanner;

/**
 * @author medany
 */

/*
 * Write a Java program to check if a given number is prime or not. Remember, a
 * prime number is a number which is not divisible by any other number e.g. 3,
 * 5, 7, 11, 13, 17 etc. Be prepared for cross e.g. checking till the square
 * root of a number etc.
 */
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Number, " + n + ", is " + (isPrime(n) ? "prime" : "not prime"));
	}

	public static boolean isPrime(int x) {
		if (x == 0 || x == 1)
			return false;
		if (x == 2 || x == 3)
			return true;

		if (x % 2 == 0)
			return false;

		int sqrt = (int) Math.sqrt(x) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;

	}
}

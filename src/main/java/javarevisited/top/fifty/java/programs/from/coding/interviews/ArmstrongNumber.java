package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Scanner;

/**
 * @author medany
 */

/*
 * A number is called an Armstrong number if it is equal to the cube of its each
 * digit. for example, 153 is an Armstrong number because 153= 1+ 125+27 which
 * is equal to 1^3+5^3+3^3. You need to write a program to check if given number
 * is Armstrong number or not.
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("Number : " + n + " is " + (isArmStrong(n) ? "armstrong number" : "not a armstrong number"));

	}

	public static boolean isArmStrong(int number) {
		int result = 0;
		int orig = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		if (orig == result) {
			return true;
		}
		return false;
	}

	public static boolean isArmstrong(int input) {

		Integer number = 0;
		char[] s = ("" + input).toCharArray();

		for (char c : s) {
			number += Integer.valueOf("" + c) * Integer.valueOf("" + c) * Integer.valueOf("" + c);
			if (number.compareTo(input) == 1) {
				return false;
			}
		}

		if (number.compareTo(input) == 0) {
			return true;
		}
		return false;
	}

}

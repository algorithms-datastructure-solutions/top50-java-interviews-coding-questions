package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author medany
 */

/*
 * This is one of the simplest programs you can expect on interviews. It is
 * generally asked to see if you can code or not. Sometimes interviewer may also
 * ask about changing a recursive solution to iterative one or vice-versa.
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger i = sc.nextBigInteger();
		sc.close();

		System.out.println("Factorial of number, " + i + ", is : " + Fact(i));
	}

	public static BigInteger fact(BigInteger num) {
		if (num.compareTo(BigInteger.ZERO) == 0)
			return BigInteger.ONE;
		BigInteger fact = BigInteger.ONE;
		for (int i = num.intValue(); i > 0; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	public static BigInteger Fact(BigInteger num) {
		if (num.compareTo(BigInteger.ZERO) == 0)
			return BigInteger.ONE;
		return num.multiply(Fact(num.subtract(BigInteger.ONE)));
	}
}

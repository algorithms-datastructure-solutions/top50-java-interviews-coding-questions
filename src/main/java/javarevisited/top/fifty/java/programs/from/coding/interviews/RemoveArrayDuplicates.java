package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Arrays;

/**
 * @author medany
 */

/*
 * Write a program to remove duplicates from an array in Java without using the
 * Java Collection API. The array can be an array of String, Integer or
 * Character, your solution should be independent of the type of array. If you
 * want to practice more array based questions then see this list of top 30
 * array interview questions from Java interviews.
 */
public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		Object[] arr = { 'a', 'a', 'd', 'c', 'b', 'c', 'e', 'd' };

		System.out.println("Array with doublicates: " + Arrays.toString(arr));
		System.out.println("Array without doublicates: " + Arrays.toString(removeDuplicates(arr)));
	}

	public static Object[] removeDuplicates(Object[] arr) {

		Arrays.sort(arr);

		Object[] result = new Object[arr.length];
		Object previous = arr[0];
		result[0] = previous;

		for (int i = 1; i < arr.length; i++) {
			Object ch = arr[i];
			if (previous != ch) {
				result[i] = ch;
			}
			previous = ch;
		}
		return result;
	}
}

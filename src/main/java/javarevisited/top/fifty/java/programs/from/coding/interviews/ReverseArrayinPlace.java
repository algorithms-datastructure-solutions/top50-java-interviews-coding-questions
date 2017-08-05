package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author medany
 */
/*
 * This is one of the testing array interview questions, which often proved
 * tricky for Java programmers. Well, you can also reverse an array in place
 * without using an additional buffer. If you know how to access array elements
 * and how to loop over an array in Java using traditional for loop, you can
 * easily solve this problem without using additional space. All you need to do
 * is loop over the array from start to the middle element and swap first
 * element to the last, second element to the second last etc. Once you reach
 * the middle element, your array is already sorted and that too without using
 * any additional space.
 */
public class ReverseArrayinPlace {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Reversed Array: " + Arrays.toString(reverseinPlace(arr)));
	}

	public static int[] reverseinPlace(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int end = (arr.length - 1) - i;
			int x = arr[i];
			arr[i] = arr[end];
			arr[end] = x;
		}
		return arr;
	}
}

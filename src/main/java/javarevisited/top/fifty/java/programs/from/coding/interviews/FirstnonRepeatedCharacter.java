package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Scanner;

/**
 * @author medany
 */

public class FirstnonRepeatedCharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();

		System.out.println("First non repeated character is " + firstNonRepeated(s));
	}

	public static char firstNonRepeated(String s) {
		int[] letters = new int[26];
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (letters[s.charAt(i) - 'a'] == 1) {
				return (char) (i + 'a');
			}
		}

		return 0;
	}
}

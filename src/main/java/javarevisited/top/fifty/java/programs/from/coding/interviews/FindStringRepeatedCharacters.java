package javarevisited.top.fifty.java.programs.from.coding.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author medany
 */

/*
 * 
 */
public class FindStringRepeatedCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		in.close();

		// Map<String, Integer> result = findDuplicates(word);
		// Map<String, Integer> result = findduplicates(word);
		Map<String, Integer> result = findduplicaates(word);
		for (String key : result.keySet()) {
			System.out.println(key + " : " + result.get(key));
		}

	}

	public static Map<String, Integer> findDuplicates(String word) {

		char[] keyword = word.toCharArray();
		Arrays.sort(keyword);

		Map<String, Integer> result = new HashMap<>();
		char previous = keyword[0];

		for (int i = 1; i < keyword.length; i++) {
			char ch = keyword[i];
			if (previous == ch) {
				if (result.get("" + ch) != null)
					result.put("" + ch, result.get("" + ch) + 1);
				else
					result.put("" + ch, 2);

			}
			previous = ch;
		}
		return result;
	}

	public static Map<String, Integer> findduplicates(String word) {

		Map<String, Integer> result = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			boolean found = false;
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					found = true;
					break;
				}
			}
			if (found)
				if (result.get("" + word.charAt(i)) != null)
					result.put("" + word.charAt(i), result.get("" + word.charAt(i)) + 1);
				else
					result.put("" + word.charAt(i), 2);

		}
		return result;
	}

	public static Map<String, Integer> findduplicaates(String word) {

		int[] letters = new int[26];
		Map<String, Integer> result = new HashMap<>();
		for (char f : word.toCharArray()) {
			letters[f - 'a']++;
			if (letters[f - 'a'] > 1) {
				if (result.get("" + f) != null)
					result.put("" + f, result.get("" + f) + 1);
				else
					result.put("" + f, 2);
			}
		}

		return result;
	}
}

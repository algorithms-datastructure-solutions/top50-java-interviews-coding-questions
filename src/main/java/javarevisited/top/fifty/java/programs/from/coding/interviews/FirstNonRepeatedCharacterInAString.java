package javarevisited.top.fifty.java.programs.from.coding.interviews;

/*Write a Java program to find the first non-repeated character in a String*/
public class FirstNonRepeatedCharacterInAString {
	
	public static char firstNonRepeatedCharacterInAString(String s) {
		char[] characters = s.toCharArray();
		int j;
		for (int i = 0; i < characters.length; i++) {
			for (j = 0; j < characters.length; j++) {
				if (i != j && characters[i] == characters[j])
					break;
			}
			if (j == characters.length)
				return characters[i];
		}
		return '0';
	}
	
	public static void main(String[] args) {
		System.out.println(firstNonRepeatedCharacterInAString("Let's try this String!"));
	}
}

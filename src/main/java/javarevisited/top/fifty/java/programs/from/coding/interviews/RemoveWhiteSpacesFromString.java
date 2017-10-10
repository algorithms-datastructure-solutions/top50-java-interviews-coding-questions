package javarevisited.top.fifty.java.programs.from.coding.interviews;

public class RemoveWhiteSpacesFromString {
	
	public static String removeWhiteSpacesFromString(String s) {
		String[] array = s.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			result.append(array[i]);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String s = "I love Java";
		System.out.println("String without white spaces is: " + removeWhiteSpacesFromString(s));
	}
}

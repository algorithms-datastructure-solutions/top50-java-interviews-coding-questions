package javarevisited.top.fifty.java.programs.from.coding.interviews;

public class ReverseAString {

	public static String reverseString(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result += s.charAt(s.length() - i - 1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		String test = "To be reversed!";
		System.out.println(reverseString(test));
	}
}

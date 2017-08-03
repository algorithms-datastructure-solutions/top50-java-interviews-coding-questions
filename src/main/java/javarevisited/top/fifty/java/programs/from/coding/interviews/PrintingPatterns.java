package javarevisited.top.fifty.java.programs.from.coding.interviews;

/**
 * @author medany
 */

/*
 * How to Print a Pattern in Java. ex. Pyramid Pattern
 */
public class PrintingPatterns {
	public static void main(String[] args) {
		drawPyrmidPattern(5, "* ");
	}

	public static void drawPyrmidPattern(int n, String block) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(block);
			}
			System.out.println();
		}
	}
}

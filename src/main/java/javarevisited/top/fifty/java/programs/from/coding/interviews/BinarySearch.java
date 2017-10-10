package javarevisited.top.fifty.java.programs.from.coding.interviews;

public class BinarySearch {

	public static int binarySearch(int number, int[] array) {
		int result = -1;
		int high = array.length;
		int low = 0;
		int mid;
		while(high >= low) {
			mid = (high + low) / 2;
			if (number < array[mid]) {
				high = mid - 1;
			} else if (number > array[mid]) {
				low = mid + 1;
			} else {
				result = mid;
				break;
			}
				
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 4, 7, 20, 29, 40, 54};
		int number = 20;
		System.out.println("Index of " + number + " in the array is " + binarySearch(number, array));
	}
}

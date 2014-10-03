package arrays;

public class SearchArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 4, 5, 5, 6, 7, 8};
		
		int index = searchArray(3, numbers);
		System.out.println(index);

	}

	private static int searchArray(int numberToSearchFor, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numberToSearchFor)
				return i;
		}
		
		return -1;
	}
}

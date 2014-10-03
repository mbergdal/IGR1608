package arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbersToSort = new int[]{3, 17, 2, 6};

		sort(numbersToSort);

		System.out.println(Arrays.toString(numbersToSort));
	}

	private static void sort(int[] unsorted) {
		for (int i = 0; i < unsorted.length - 1; i++){
			int smallestNumber = unsorted[i];
			int currentSmallestIndex = i;
			
			for (int j =  i+1; j < unsorted.length; j++){
				if (unsorted[j] < smallestNumber){
					smallestNumber = unsorted[j];
					currentSmallestIndex = j;
				}
			}
			
			if (currentSmallestIndex != i){
				unsorted[currentSmallestIndex] = unsorted[i];
				unsorted[i] = smallestNumber;
			}
		}
	}
}

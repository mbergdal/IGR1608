package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] smallArray = {1, 2, 3};
		int[] bigArray = new int[5];
		
//		for (int i = 0; i < smallArray.length; i++) {
//			bigArray[i] = smallArray[i];
//		}
		
		// or
		System.arraycopy(smallArray, 0, bigArray, 0, smallArray.length);
		
		System.out.println(Arrays.toString(smallArray));
		System.out.println(Arrays.toString(bigArray));

	}
}

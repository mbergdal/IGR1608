package arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] smallInts = {1, 2, 3};
		int[] bigInts = {101, 102, 103};
		
		for (int i=0; i<bigInts.length; i++){
			smallInts[i] = bigInts[i];		
		}		
		
		bigInts[2] = 203;
		
		System.out.println(Arrays.toString(smallInts));
		System.out.println(Arrays.toString(bigInts));
		

	}

}

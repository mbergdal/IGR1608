package arrays;

import java.util.Arrays;
import java.util.Random;

public class BiggestNumber {

	public static void main(String[] args) {
		int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100);
        }
        
        int biggest = getBiggestNumber(numbers);
        
        System.out.println(Arrays.toString(numbers));
        System.out.println("Biggest number: " + biggest);
	}

	private static int getBiggestNumber(int[] numbers) {
		int biggest = -1;
		
		for (int i = 0; i < numbers.length; i++) {
			if(biggest < numbers[i])
				biggest = numbers[i];
		}
		
		return biggest;
	}

}

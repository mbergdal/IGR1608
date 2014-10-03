package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserCreated {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of elements: ");
		int numberOfElements = scanner.nextInt();
		
		int[] elements = new int[numberOfElements];
		
		System.out.println("Enter the elements (press enter after each element)");
		
		for (int i=0; i < elements.length; i++){
			int element = scanner.nextInt();
			elements[i] = element;
		}
		
		System.out.println(Arrays.toString(elements));
		

	}

}

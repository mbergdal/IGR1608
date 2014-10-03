package arrays;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		String[] months = new String[5];

		months[0] = "Januar";
		months[1] = "Februar";
		months[2] = months[0] + " og " + months[1];
		
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("Input a number between 1 and " + months.length);

			int index = scanner.nextInt()-1;

			if (index >= 0 && index < months.length){
				System.out.println(months[index]);
			}else{
				System.out.println("Wrong input!");
			}
		}
	}
}

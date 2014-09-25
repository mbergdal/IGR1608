package application;

import java.util.Scanner;

public class Main{	
		
	public static void main(String[] args) {
		while(true){
			printPrompt();
			String input = getUserInput();
			Calculator calc = new Calculator();
			int result = calc.calculate(input);
			System.out.println(result);
			System.out.println();
		}
	}
	
	private static void printPrompt() {
		System.out.println("Enter your input: ");
		
	}

	private static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}

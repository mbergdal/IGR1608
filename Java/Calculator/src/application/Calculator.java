package application;

public class Calculator {
	int firstNumber; 
	int secondNumber;
	String operator;

	//This class should have methods for doing the calculations

	public int calculate(String input) {
		getNumbersAndOperator(input);
		
		//Now you have the two numbers and the operator stored in the
		//variables: firstNumber, secondNumber and operator.
		//Based on the operator, call methods to do the calculation
		//Hint: use a switch statement
		
		//Dummy return value
		return 0;
	}

	private void getNumbersAndOperator(String input) {
		getOperator(input);
		getNumbers(input);			
	}

	private void getOperator(String string) {
		if (string.indexOf('+') > 0){
			operator = "+";
		}else if (string.indexOf('-') > 0){
			operator = "-";
		}else if (string.indexOf('*') > 0){
			operator = "*";
		}else
			operator = "/";
	}

	private void getNumbers(String string) {
		String[] numbers = string.replace(" ", "").split("\\" + operator);
		if (numbers.length > 0){
			firstNumber = Integer.parseInt(numbers[0]);
			secondNumber = Integer.parseInt(numbers[1]);
		}
	}
}
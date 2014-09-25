package application;

public class Calculator {
	int firstNumber; 
	int secondNumber;
	String operator;

	public int add(int number1, int number2){		
		return number1 + number2;		
	}

	public int subtract(int number1, int number2){
		return number1 - number2;
	}

	public int multiply(int number1, int number2){
		return number1 * number2;
	}

	public int divide(int number1, int number2){
		return number1 / number2;
	}

	public int calculate(String input) {
		getNumbersAndOperator(input);

		switch (operator){
		case "+":
			return add(firstNumber, secondNumber);
		case "-":
			return subtract(firstNumber, secondNumber);
		case "*":
			return multiply(firstNumber, secondNumber);
		default:
			return divide(firstNumber, secondNumber);
		}
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
		String[] numbers = string.split("\\" + operator);
		if (numbers.length > 0){
			firstNumber = Integer.parseInt(numbers[0]);
			secondNumber = Integer.parseInt(numbers[1]);
		}
	}
}

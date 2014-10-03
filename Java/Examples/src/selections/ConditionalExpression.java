package selections;
import java.util.Scanner;

public class ConditionalExpression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		String answer = (number == 42) ? "Correct" : "Wrong";

		System.out.println(answer);
	}

}

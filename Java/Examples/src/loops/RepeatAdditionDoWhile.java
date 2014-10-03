package loops;
import java.util.Scanner;


public class RepeatAdditionDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int correctAnswer = number1 + number2;
		int answer = -1;
		
		do{
			System.out.printf("\nWhat is %s + %s?", number1, number2);
			answer = input.nextInt();
			if (answer == correctAnswer){
				System.out.println("Correct!!");
			}else{
				System.out.println("Wrong answer. Try again");
			}
		}while (answer != correctAnswer);
	}
}
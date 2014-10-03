package loops;
import java.util.Scanner;


public class RepeatAdditionWithBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int correctAnswer = number1 + number2;
		int answer = -1;
		System.out.printf("\nWhat is %s + %s?", number1, number2);
		
		while (true){			
			answer = input.nextInt();
			if (answer == correctAnswer){
				System.out.println("Correct!!");
				break;
			}else{
				System.out.println("Wrong answer. Try again");
			}
		}
	}
}

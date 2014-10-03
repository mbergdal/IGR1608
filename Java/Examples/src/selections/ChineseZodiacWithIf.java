package selections;
import java.util.Scanner;


public class ChineseZodiacWithIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = input.nextInt();
		int modulo = year % 12;
		if (modulo == 0){
			System.out.println("monkey");
		}else if(modulo == 1){
			System.out.println("rooster");
		}else if(modulo == 2){			
			System.out.println("dog");
		}else if(modulo == 3){			
			System.out.println("pig");
		}else if(modulo == 4){			
			System.out.println("rat");
		}else if(modulo == 5){			
			System.out.println("ox");
		}else if(modulo == 6){			
			System.out.println("tiger");
		}else if(modulo == 7){			
			System.out.println("rabbit");
		}else if(modulo == 8){			
			System.out.println("dragon");
		}else if(modulo == 9){			
			System.out.println("snake");
		}else if(modulo == 10){			
			System.out.println("snake");
		}else if(modulo == 11){			
			System.out.println("snake");
		}
	}
}

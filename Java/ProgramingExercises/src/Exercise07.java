import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
	Random random = new Random();
	int number = random.nextInt(13);

    if (number == 1) 
      System.out.println("Month is Januaray");
    else if (number == 2) 
      System.out.println("Month is Feburary");
    else if (number == 3) 
      System.out.println("Month is March");
    else if (number == 4) 
      System.out.println("Month is April");
    else if (number == 5) 
      System.out.println("Month is May");
    else if (number == 6) 
      System.out.println("Month is June");
    else if (number == 7) 
      System.out.println("Month is July");
    else if (number == 8) 
      System.out.println("Month is August");
    else if (number == 9) 
      System.out.println("Month is September");
    else if (number == 10) 
      System.out.println("Month is October");
    else if (number == 11) 
      System.out.println("Month is November");
    else // if (number == 12) 
      System.out.println("Month is December");

  }
}

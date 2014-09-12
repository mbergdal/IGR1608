public class Exercise03 {
  
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter an integer between 0 and 1000: ");
    int number = input.nextInt();

    // Find all digits in number
    int lastDigit = number % 10;
    int remainingNumber = number / 10;
    int secondLastDigit = remainingNumber % 10;
    remainingNumber = remainingNumber / 10;
    int thirdLastDigit = remainingNumber % 10;

    // Obtain the sum of all digits
    int sum = lastDigit + secondLastDigit + thirdLastDigit;

    System.out.println("The sum of all digits in " + number
      + " is " + sum);
  }
}

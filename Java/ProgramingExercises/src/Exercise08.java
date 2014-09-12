import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter weight in kilograms: ");
    double weight = input.nextDouble();
    
    System.out.print("Enter height in meters: ");
    double height = input.nextDouble();
         
    double bmi = weight / (height * height);
    
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
  }
}

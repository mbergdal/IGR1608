public class Exercise02 {

  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a number in pounds: ");
    double pounds = input.nextDouble();
    double kilograms = pounds * 0.454;

    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }
}

public class Exercise4 {
  public static void main(String[] args) {
    int headCount = 0;
    int tailCount = 0;
    int NUMBER_OF_TURNS = 1000000;

    for (int i = 0; i < NUMBER_OF_TURNS; i++) {
      int number = (int)(Math.random() * NUMBER_OF_TURNS) % 2;

      if (number == 0)
        headCount++;
      else
        tailCount++;
    }

    System.out.println("head count: " + headCount);
    System.out.println("tail count: " + tailCount);
  }
}

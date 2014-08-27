import java.util.Random;


public class Main {

	public static void main(String[] args) {
		String[] students = {"Pelle", "Bernt", "Kari"};
		
		Random rand = new Random();
		
		System.out.println(students[rand.nextInt(students.length)]);
	}

}

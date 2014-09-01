
public class DisplayHelper {
	public static void displayWinner(String winner){
		System.out.println("And the winner is...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(winner);
	}
}

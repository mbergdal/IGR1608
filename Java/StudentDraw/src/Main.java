import java.util.*;
import javafx.application.Application;

public class Main {
	
	public static void main(String[] args){
		String winner = getWinner();		
		DisplayHelper.displayWinner(winner);
		updateWinners(winner);
	}

	private static void updateWinners(String winner) {
		FileHelper.writeWinnerToFile("winners.txt", winner);
	}	

	private static String getWinner(){
		Hashtable<String, Integer> availableStudents = FileHelper.getAvailableStudents(classListFileName, notPresentFileName , winnersFileName);			
		String winner = StudentDrawEngine.draw(availableStudents);
		return winner;
	}
	
	private final static String classListFileName = "classList.txt";
	private final static String notPresentFileName = "notPresent.txt";
	private final static String winnersFileName = "winners.txt";
}
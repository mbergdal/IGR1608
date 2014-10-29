package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionsAndAnswersReader {
	public String[] getQuestionsAndAnswers(){
		ArrayList<String> qAndA = new ArrayList<String>();
		try(BufferedReader reader = new BufferedReader(new FileReader("resources/QuestionsAndAnswers.txt"))){
			String line = null;			
			while ((line = reader.readLine()) != null) {
				qAndA.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qAndA.toArray(new String[10]);
	}
}

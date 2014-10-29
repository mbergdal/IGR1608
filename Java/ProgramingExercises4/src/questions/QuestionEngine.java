package questions;

import utilities.QuestionsAndAnswersReader;

public class QuestionEngine {
	private Question[] questions = new Question[2];
	private int currentQuestionIndex = 0;
	
	public QuestionEngine(){
		questions[0] = new Question("Hovedstaden i Norge?", "Oslo");
		questions[1] = new Question("Hva heter det nye GUI rammeverket i Java?", "javafx");
	}
	
	public String getNextQuestion() {
		if(currentQuestionIndex < questions.length){
			return questions[currentQuestionIndex].getQuestionText();
		}else{
			return null;
		}
	}

	public boolean verifyAnswer(String answer) {
		if (answer.toLowerCase().equals(questions[currentQuestionIndex].getAnswer().toLowerCase())){
			currentQuestionIndex++;
			return true;
		}
		
		return false;
	}
}

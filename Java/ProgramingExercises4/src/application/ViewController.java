package application;

import questions.QuestionEngine;
import utilities.StopWatch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class ViewController {
	@FXML
	private TextField answerField;
	@FXML
	private Label questionField;
	@FXML
	private Label resultField;
	@FXML
	private Button answerButton;
	
	private QuestionEngine questionEngine;
	private StopWatch stopWatch;
	
	public ViewController(){
		questionEngine = new QuestionEngine();
		stopWatch = new StopWatch();
	}
	
	@FXML
	private void initialize() {
		stopWatch.start();
		generateNewQuestion();
		resultField.setVisible(false);
	}
	
	@FXML
    void onAnswerGiven(ActionEvent event) {
		String answer = answerField.getText();
		boolean isCorrect = questionEngine.verifyAnswer(answer);
		if (isCorrect){
			resultField.setTextFill(Color.GREEN);
			resultField.setText("Correct");
			generateNewQuestion();
		}else{
			resultField.setTextFill(Color.RED);
			resultField.setText("Incorrect. Try again");
		}
		
		answerField.setText("");
		resultField.setVisible(true);
    }

	private void generateNewQuestion() {
		String question = questionEngine.getNextQuestion();
		if (question != null){
			questionField.setText(question);
		}else{
			finishGame();
		}		
	}

	private void finishGame() {
		stopWatch.stop();
		answerButton.setDisable(true);
		resultField.setText("Finished! Good work!");
		System.out.printf(String.format("User used: %s", stopWatch.getElapsedTime()));
		stopWatch.reset();
	}
}
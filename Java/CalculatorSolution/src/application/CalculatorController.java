package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
	Calculator calculator;
	
	@FXML
	private TextField inputTextField;
	@FXML
	private TextField resultTextField;
	
	@FXML
	private void initialize() {
		calculator = new Calculator();
		
	}
	
	@FXML
	private void calculate(){
		String input = inputTextField.getText();
		if (input != ""){
			int result = calculator.calculate(input);
			resultTextField.setText(String.valueOf(result));
		}
	}
}

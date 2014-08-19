package no.dips;

import java.util.Scanner;

public class Parser {

	public void Start() {
		Translator translator = new Translator();
		while (true){
			System.out.println("Enter short form: ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			if (input.toLowerCase().equals("exit")){
				scanner.close();
				System.exit(0);
			}
			
			String translatedInput = translator.Translate(input);
			System.out.println(translatedInput);
		}
	}
}

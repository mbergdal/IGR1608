package no.dips;

public class Translator {

	public String Translate(String input) {
		String translateString = "";
		
		if (input.contains(Character.toString('+'))){
			String[] parts = input.split("\\+");
			translateString = parts[0] + " units in the morning and " + parts[1] + " units in the evening";
		}
		else{
			translateString =  "Oops! Did not understand";
		}
		
		return translateString;
	}
}

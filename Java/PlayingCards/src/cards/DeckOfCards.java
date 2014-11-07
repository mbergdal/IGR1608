package cards;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class DeckOfCards {
	private ArrayList<Card> deck = new ArrayList<Card>(); 
	private String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
	
	public DeckOfCards(){
		reset();
	}

	public Card drawRandomCard() {
		Random rand = new Random();
		int index = rand.nextInt(getNumberOfCardsInDeck());
		return deck.get(index);
	}

	public int getNumberOfCardsInDeck() {
		return deck.size();
	}

	public void reset() {
		deck.clear();
		for (int i = 0; i < suits.length; i++){
			for (int j = 0; j < 13; j++){
				deck.add(new Card(suits[i], j+1));
			}
		}
	}

	public Card[] getHand(int numberOfCardsToGet) {
		Card[] hand = new Card[numberOfCardsToGet];
		for (int i = 0; i < numberOfCardsToGet; i++){
			Card card = drawRandomCard();
			hand[i] = card;
			deck.remove(card);
		}
		
		return hand;
	}
	
	public String toString(){
		StringBuilder returnString = new StringBuilder();
		int i = 0;
		
		returnString.append(getNumberOfCardsInDeck());
		returnString.append("\n");
		
		for (Card card : deck) {
			returnString.append(String.format("[%s:%s] ", card.getSuite(), card.getValue()));
			if (i % 10 == 0 && i != 0){
				returnString.append("\n");
				i = 0;
			}
			else
				i++;
		}
		
		returnString.append("\n");
		return returnString.toString();
	}

	public void RemoveValue(int valueToRemove) {
		ValuePredicate<Card> pred = new ValuePredicate<Card>();
		pred.value = valueToRemove;
		deck.removeIf(pred);
	}

	public void removeSuite(String suiteToRemove) {
		SuitePredicate<Card> pred = new SuitePredicate<Card>();
		pred.suite = suiteToRemove;
		deck.removeIf(pred);
	}	
}

class ValuePredicate<T> implements Predicate<T>{
	int value;
	
	@Override
	public boolean test(T c) {
		Card card = (Card)c;
		if (card.getValue() == value)
			return true;
		return false;
	}
}

class SuitePredicate<T> implements Predicate<T>{
	String suite;
	
	@Override
	public boolean test(T c) {
		Card card = (Card)c;
		if (card.getSuite().toLowerCase().equals(suite.toLowerCase()))
			return true;
		return false;
	}
}
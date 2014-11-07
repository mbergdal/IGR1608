package test;

import cards.Card;
import cards.DeckOfCards;

public class TestCards {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		Card randomCard = deck.drawRandomCard();
		System.out.printf("Random card - [%s:%d] \n", randomCard.getSuite(), randomCard.getValue());
		deck.RemoveValue(1);				
		System.out.println(deck.getNumberOfCardsInDeck());
		deck.removeSuite("Hearts");
		System.out.println(deck.getNumberOfCardsInDeck());
		
		deck.reset();
		int numberToDeal = 8;
		System.out.println(deck.toString());
		Card[] hand1 = deck.getHand(numberToDeal);
		Card[] hand2 = deck.getHand(numberToDeal);
		Card[] hand3 = deck.getHand(numberToDeal);
		Card[] hand4 = deck.getHand(numberToDeal);
		
		
		System.out.println(showHand(hand1));
		System.out.println(showHand(hand2));
		System.out.println(showHand(hand3));
		System.out.println(showHand(hand4));
		
		System.out.println(deck.toString());
	}

	private static String showHand(Card[] handToShow) {
		StringBuilder returnString = new StringBuilder();
		for (int i = 0; i < handToShow.length; i++) {
			returnString.append(String.format("[%s:%s] ", 
							handToShow[i].getSuite(), 
							handToShow[i].getValue()));
		}
		
		return returnString.toString();
	}
}

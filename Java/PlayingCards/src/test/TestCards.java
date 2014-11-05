package test;

import cards.Card;
import cards.DeckOfCards;

public class TestCards {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		Card randomCard = deck.drawRandomCard();
		deck.RemoveAces();
		int numberOfCardsLeft = deck.getNumberOfCardsInDeck();
		deck.reset();
		Card[] hand = deck.getHand(7);
	}

}

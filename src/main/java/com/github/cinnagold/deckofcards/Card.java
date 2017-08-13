package com.github.cinnagold.deckofcards;

public class Card {
	private Face face;
	private Suit suit;

	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return face.toString() + " of " + suit.toString();
	}

}

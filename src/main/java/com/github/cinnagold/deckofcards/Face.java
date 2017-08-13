package com.github.cinnagold.deckofcards;

public enum Face {

	ACE("Ace"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("Jack"),
	QUEEN("Queen"),
	KING("King");

	private String name;

	Face(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}

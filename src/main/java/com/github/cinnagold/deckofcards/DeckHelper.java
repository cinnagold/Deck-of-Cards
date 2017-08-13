package com.github.cinnagold.deckofcards;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeckHelper {
	/**
	 * Return a list of face values Ace, 2-10, Jack, Queen, and King for a given suit.
	 *
	 * @param suit
	 * @return
	 */
	public static List<Card> facesForSuit(Suit suit) {
		return Arrays.stream(Face.values())
			.map(face -> new Card(face, suit))
			.collect(Collectors.toList());
	}
}

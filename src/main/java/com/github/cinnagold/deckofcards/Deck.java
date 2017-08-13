package com.github.cinnagold.deckofcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = Arrays.stream(Suit.values())
			.flatMap(suit -> DeckHelper.facesForSuit(suit).stream())
			.collect(Collectors.toCollection(ArrayList::new));
	}

	/**
	 * Shuffle based on the Fisher–Yates shuffle algorithm.
	 *
	 * @See https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
	 */
	public void shuffle() {
		//Note: Depending on how "random" this needs to be, we might consider using a more random seed
		Random random = new Random();

		int index = cards.size();

		while (--index > 0) {
			int swapWithIndex = random.nextInt(index);

			Card displacedCard = cards.set(swapWithIndex, cards.get(index));
			cards.set(index, displacedCard);
		}


	}

	/**
	 * Remove and return a card from the deck. If deck is empty, no card is dealt.
	 * @return
	 */
	public Optional<Card> dealOneCard() {
		int lastElement = cards.size() - 1;
		boolean deckIsEmpty = lastElement == -1;

		return deckIsEmpty ? Optional.empty() : Optional.of(cards.remove(lastElement));
	}

	public List<Card> cards() {
		return cards;
	}

	@Override
	public String toString() {
		return cards.stream()
			.map(Card::toString)
			.collect(Collectors.joining("\n"));
	}
}

package com.github.cinnagold.deckofcards.test;

import com.github.cinnagold.deckofcards.Card;
import com.github.cinnagold.deckofcards.Deck;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DeckTest {
	@Test
	public void initialSizeOfDeck() {
		Deck deck = new Deck();

		assertThat(deck.cards().size(), is(52));
	}

	@Test
	@Ignore("Would need to implement statistical randomness model to truly test shuffle()")
	public void shuffle() {
		Deck deck = new Deck();
		deck.shuffle();

		//For now just print so that we can manually confirm the shuffle
		System.out.println(deck.toString());
	}

	@Test
	public void dealOneCard() {
		Deck deck = new Deck();

		Optional<Card> dealtCard = deck.dealOneCard();

		assertTrue(dealtCard.isPresent());
	}

	@Test
	public void shouldDealCardsStartingFromLastIndex() {
		Deck deck = new Deck();
		List<Card> cards = deck.cards();

		Card lastCard = cards.get(cards.size() - 1);

		assertEquals(lastCard, deck.dealOneCard().get());
	}

	@Test
	public void noCardIsDealtWhenEmpty() {
		Deck deck = new Deck();

		IntStream.range(0, 52)
			.forEach(i -> deck.dealOneCard());

		assertThat(deck.cards().size(), is(0));

		assertFalse(deck.dealOneCard().isPresent());
	}
}

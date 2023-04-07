package com.skilldistillery.Blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	Rank[] ranks = Rank.values();

	Suit[] suits = Suit.values();

	public Deck() {

		for (int i = 0; i < ranks.length; i++) {

			for (int i2 = 0; i2 < suits.length; i2++) {

				deck.add(new Card(ranks[i], suits[i2]));
			}

		}

	}
	
	public int getDeckSize() {
		int size = deck.size();
		return size;
	}
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	public Card dealCard() {
		return deck.remove(0);
	}

}

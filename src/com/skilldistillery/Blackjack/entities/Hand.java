package com.skilldistillery.Blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public  abstract class Hand {
	List<Card> hand = new ArrayList<>();
	
	public Hand() {
		
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void clear() {
		hand.removeAll(hand);
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "" + hand;
	}



	
	
	
}

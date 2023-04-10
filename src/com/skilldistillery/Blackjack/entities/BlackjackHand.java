package com.skilldistillery.Blackjack.entities;

public class BlackjackHand extends Hand {
	Card card = new Card();

	public BlackjackHand() {
		
	}

	@Override
	public int getHandValue() {
		int totalValue = 0;
		for (Card c : hand) {
			int cardValue = card.getValue(c);
			totalValue = cardValue + totalValue;

		}
		return totalValue;
	}

	public boolean isBlackJack() {
		if (this.getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (this.getHandValue() > 21) {
			return true;
		} else {
			return false;
		}
	}

}

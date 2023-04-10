package com.skilldistillery.Blackjack.entities;

import java.util.Scanner;

public class Dealer {
	Deck deck = new Deck();
	BlackjackHand playerHand = new BlackjackHand();
	BlackjackHand dealerHand = new BlackjackHand();
	Card newCard = new Card();
	boolean gameEnded = false;

	public boolean startGame() {
		gameEnded = false;
		deck.shuffleDeck();

		for (int i = 0; i < 2; i++) {
			newCard = deck.dealCard();
			playerHand.addCard(newCard);
		}
		for (int i = 0; i < 2; i++) {
			newCard = deck.dealCard();
			dealerHand.addCard(newCard);
		}
		System.out.println("Your starting hand is " + playerHand + " with a value of " + playerHand.getHandValue());
		System.out.println(
				"The Dealers starting hand is " + dealerHand + " with a value of " + dealerHand.getHandValue());

		if (playerHand.isBlackJack() || dealerHand.isBust()) {
			gameOver(true);
			gameEnded = true;
		}
		if (playerHand.isBust() || dealerHand.isBlackJack()) {
			gameOver(false);
			gameEnded = true;
		}
		return gameEnded;

	}

	public boolean playerChoice() {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		gameEnded = false;

		while (keepGoing) {
			System.out.println("Would you like to draw an additional card? Y/N");
			String choice = sc.next();

			if (choice.equalsIgnoreCase("y")) {
				newCard = deck.dealCard();
				System.out.println("you drew " + newCard);
				playerHand.addCard(newCard);
				System.out.println("Your hands value is now " + playerHand.getHandValue());
				if (playerHand.isBust()) {
					gameOver(false);
					gameEnded = true;
					break;
				}
			}
			if (choice.equalsIgnoreCase("n")) {
				keepGoing = false;
			} 
		}
		return gameEnded;

	}

	public boolean dealerDraw() {
		gameEnded=false;
		while (dealerHand.getHandValue() < 17 && !gameEnded) {
			newCard = deck.dealCard();
			System.out.println("The dealer drew " + newCard);
			dealerHand.addCard(newCard);
			System.out.println("The dealers hands value is now " + dealerHand.getHandValue());

			if (dealerHand.isBust()) {
				System.out.println("The Dealer busted");
				gameEnded = true;
				gameOver(true);
			}

		}
		return gameEnded;
	}

	public void winnerCheck() {

		gameOver(playerHand.getHandValue() > dealerHand.getHandValue());
		
	}

	public void gameOver(boolean winStatus) {
		if (winStatus) {
			System.out.println("Congrats, you won this hand.");
		}
		if (!winStatus) {
			System.out.println("Youve lost this hand, better luck next time");
		}
		playerHand.clear();
		dealerHand.clear();

	}

}

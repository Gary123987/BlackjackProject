package com.skilldistillery.Blackjack.app;

import java.util.Scanner;

import com.skilldistillery.Blackjack.entities.Card;
import com.skilldistillery.Blackjack.entities.Deck;

public class BlackjackApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		Card card = new Card();
		int value = 0;

		System.out.println("how many card u want?");
		deck.shuffleDeck();
		int numOfCards = sc.nextInt();

		for (int i = 0; i < numOfCards; i++) {
			card = deck.dealCard();
			value = value + card.getValue(card);
			System.out.println("you got a " + card);
			System.out.println("your value is " + value);
		}
	}

}

package com.skilldistillery.Blackjack.app;

import java.util.Scanner;

import com.skilldistillery.Blackjack.entities.Dealer;

public class BlackjackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		boolean gameEnded = false;

		while (keepGoing) {
			Dealer dealer = new Dealer();
			gameEnded = false;
			System.out.println("Would you like to play a hand of black jack? Y/N");
			String choice = sc.next();

			if (choice.equalsIgnoreCase("y")) {
				gameEnded = dealer.startGame();
				if (!gameEnded) {
					gameEnded = dealer.playerChoice();
				}
				if (!gameEnded) {
					gameEnded = dealer.dealerDraw();
				}
				if (!gameEnded) {
					dealer.winnerCheck();
				}

			}
			if (choice.equalsIgnoreCase("n")) {
				System.out.println("Thanks for playing");
				keepGoing = false;
			}

		}

	}
}

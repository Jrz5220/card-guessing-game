package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

 /** 2/6/20 INT-2220
 * Six of the following cards - Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, and King - are selected randomly and put into a bag.
 * Two players take turns guessing which cards are in the bag.
 * The player with the most correct guesses wins the game.
 * @author Felix Lazo
 */
public class CardGame {

	public static void main(String[] args) {
		
//		System.out.println("Six cards from the following list will be put into a bag randomly: \nA, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K.");
//		System.out.println("Two players will take turns guessing which cards are in the bag.");
//		System.out.println("The first player to correctly guess all the cards wins.");
		
//		ArrayList<String> cards = new ArrayList<>(Arrays.asList("f", "6", "9", "x"));
		
		GuessCardGame newGame = new GuessCardGame();
		newGame.startGame();
		
//		String p1Card, p2Card;
//		int p1Points = 0, p2Points = 0;
//		ArrayList<String> cards = new ArrayList<>(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
//		ArrayList<String> bag = new ArrayList<>(6);
//		ArrayList<String> bagCopy = new ArrayList<>(6);
//		ArrayList<String> p1CorrectGuesses = new ArrayList<>(6);
//		ArrayList<String> p2CorrectGuesses = new ArrayList<>(6);
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Six cards from the following list will be put into a bag randomly: \nA, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K.");
//		System.out.println("Two players will take turns guessing which cards are in the bag.");
//		System.out.println("The first player to correctly guess all the cards wins.");
//		
//		addCardsToBag(cards, bag, bagCopy);
//		
//		while(true) {
//			System.out.println("\nPlayer 1: Enter a card");
//			p1Card = scan.nextLine().trim().toUpperCase();
//			if(isCorrectGuessDuplicate(p1CorrectGuesses, p2CorrectGuesses, p1Card)) {
//				System.out.println("Incorrect: " + p1Card + " has already been removed from the bag.");
//				System.out.println("Remaining cards in the bag: " + bag.size());
//			}
//			else if(isCardInBag(bag, p1Card)) {
//				System.out.println("Correct!");
//				p1Points++;
//				p1CorrectGuesses.add(p1Card);
//				bag.remove(p1Card);
//				displayPlayerScore(p1CorrectGuesses, p1Points);
//				System.out.println("Cards remaining in bag: " + bag.toString());
//				System.out.println("Remaining cards in the bag: " + bag.size());
//			} else {
//				System.out.println("Incorrect");
//				System.out.println("Remaining cards in the bag: " + bag.size());
//			}
//			if(bag.isEmpty())
//				break;
//			System.out.println("\nPlayer 2: Enter a card");
//			p2Card = scan.nextLine().trim().toUpperCase();
//			if(isCorrectGuessDuplicate(p1CorrectGuesses, p2CorrectGuesses, p2Card)) {
//				System.out.println("Incorrect: " + p2Card + " has already been removed from the bag.");
//			}
//			else if(isCardInBag(bag, p2Card)) {
//				System.out.println("Correct!");
//				p2Points++;
//				p2CorrectGuesses.add(p2Card);
//				bag.remove(p2Card);
//				displayPlayerScore(p2CorrectGuesses, p2Points);
//			} else {
//				System.out.println("Incorrect");
//			}
//			System.out.println("Cards remaining in bag: " + bag.toString());
//			System.out.println("Remaining cards in the bag: " + bag.size());
//			if(bag.isEmpty())
//				break;
//		}
//		displayWinner(p1CorrectGuesses, p2CorrectGuesses, p1Points, p2Points);
//		displayContentsOfBag(bagCopy);
//		scan.close();
	} //end main
	
//	public static void player1Turn(Scanner scan, String p1Card, String p2Card, int p1Points, int p2Points, ArrayList<String> bag, ArrayList<String> p1CorrectGuesses, ArrayList<String> p2CorrectGuesses) {
//		
//	}
//
//	public static void displayPlayerScore(ArrayList<String> pCorrectGuesses, int pPoints) {
//		System.out.println("Player current score: " + pPoints + " " + pCorrectGuesses.toString());
//	}
//
//	public static boolean isCorrectGuessDuplicate(ArrayList<String> p1CorrectGuesses, ArrayList<String> p2CorrectGuesses, String pCard) {
//		return (p1CorrectGuesses.contains(pCard) || p2CorrectGuesses.contains(pCard));
//	}

	/** 
	 * Randomly adds six cards from a list to this bag.
	 * @param gameCards The list of cards to select from.
	 * @param gameBag The bag to store the selected cards.
	 */
//	public static void addCardsToBag(ArrayList<String> gameCards, ArrayList<String> gameBag, ArrayList<String> bagCopy) {
//		Random rand = new Random();
//		for(int i = 0; i < 6; i++) {
//			int randCard = rand.nextInt(gameCards.size());
//			gameBag.add(gameCards.get(randCard));
//			bagCopy.add(gameCards.get(randCard));
//			gameCards.remove(randCard);	//shifts subsequent elements to the left.
//		}
//	}
	
	/** 
	 * Checks if the player's guessed card is in the bag. Removes the card from the bag if guess was correct.
	 * @param gameBag The bag containing six random cards
	 * @param correctCards A list containing the cards guessed correctly
	 * @param pCard The card the player guessed
	 * @return True if the player's card is in the bag, false if not
	 */
//	public static boolean isCardInBag(ArrayList<String> gameBag, String pCard) {
//		return (gameBag.contains(pCard));
//	}
	
	/** 
	 * Prints the winner of the game.
	 * @param points1 Amount of points accumulated by player 1.
	 * @param points2 Amount of points accumulated by player 2.
	 */
//	public static void displayWinner(ArrayList<String> p1CorrectGuesses, ArrayList<String> p2CorrectGuesses, int points1, int points2) {
//		String winner;
//		System.out.println("\nPlayer 1 points: " + points1 + " " + p1CorrectGuesses.toString());
//		System.out.println("Player 2 points: " + points2 + " " + p2CorrectGuesses.toString() + "\n");
//		if(points1 > points2)
//			winner = "Player 1 wins!";
//		else if(points1 < points2)
//			winner = "Player 2 wins!";
//		else
//			winner = "Game ends in a tie";
//		System.out.println(winner);
//	}
	
	/**
	 * Prints the six cards originally in the bag.
	 * @param bagCopy The six cards that were in the original bag
	 */
//	public static void displayContentsOfBag(ArrayList<String> bagCopy) {
//		System.out.println("\nContents of bag: ");
//	    for(String item : bagCopy) {
//	      System.out.print(item + " ");
//	    }
//	}

} //end CardGame

package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessCardGame {
	
	private int p1Points = 0, p2Points = 0;
	private ArrayList<String> gameCards;
	private ArrayList<String> bagOfCards;
	private ArrayList<String> bagCopy;
	private ArrayList<String> p1CorrectAnswers;
	private ArrayList<String> p2CorrectAnswers;
	
	public GuessCardGame() {
		gameCards = new ArrayList<>(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
		bagOfCards = new ArrayList<>(6);
		bagCopy = new ArrayList<>(6);
		p1CorrectAnswers = new ArrayList<>(6);
		p2CorrectAnswers = new ArrayList<>(6);
	}
	
	public GuessCardGame(ArrayList<String> newCards, int bagLimit) throws CardGameBagException {
		if(bagLimit >= newCards.size())
			throw new CardGameBagException();
		for(int i = 0; i < newCards.size(); i++) {
			newCards.set(i, newCards.get(i).toUpperCase());
		}
		gameCards = newCards;
		bagOfCards = new ArrayList<>(bagLimit);
		bagCopy = new ArrayList<>(bagLimit);
		p1CorrectAnswers = new ArrayList<>(bagLimit);
		p2CorrectAnswers = new ArrayList<>(bagLimit);
	}
	
	public void startGame() {
		Scanner scan = new Scanner(System.in);
		addCardsToBag(gameCards, bagOfCards, bagCopy);
		while(true) {
			playerTurn(scan, p1CorrectAnswers, 1, p1Points);
			if(bagOfCards.isEmpty())
				break;
			playerTurn(scan, p2CorrectAnswers, 2, p2Points);
			if(bagOfCards.isEmpty())
				break;
		}
		displayGameResults(p1CorrectAnswers, p2CorrectAnswers, p1Points, p2Points);
		System.out.println("\nCards in the bag: ");
		displayContentsOfBag(bagCopy);
		scan.close();
	}
	
	private void addCardsToBag(ArrayList<String> newCards, ArrayList<String> newBag, ArrayList<String> newBagCopy) {
		Random rand = new Random();
		for(int i = 0; i < newCards.size(); i++) {
			int randCard = rand.nextInt(newCards.size());
			newBag.add(newCards.get(randCard));
			newBagCopy.add(newCards.get(randCard));
			newCards.remove(randCard);	//shifts subsequent elements to the left.
		}
	}
	
	private void playerTurn(Scanner pScan, ArrayList<String> pAnswers, int turnPlayer, int pPoints) {
		System.out.println("\nPlayer " + turnPlayer + ": Enter a card");
		String pCard = pScan.nextLine().trim().toUpperCase();
		if(isDuplicateAnswer(p1CorrectAnswers, p2CorrectAnswers, pCard))
			System.out.println("Incorrect: " + pCard + " has already been removed from the bag.");
		else if(isCardInBag(pCard, bagOfCards)) {
			System.out.println("Correct!");
			setPlayerPoints(turnPlayer);
			pAnswers.add(pCard);
			bagOfCards.remove(pCard);
			displayPlayerScore(turnPlayer, pAnswers);
		} else
			System.out.println("Incorrect");
		System.out.println("Remaining cards in the bag: " + bagOfCards.size());
	}

	private void displayGameResults(ArrayList<String> p1Answers, ArrayList<String> p2Answers, int points1, int points2) {
		System.out.println("\nPlayer 1 points: " + points1 + " " + p1Answers.toString());
		System.out.println("Player 2 points: " + points2 + " " + p2Answers.toString() + "\n");
		if(points1 > points2)
			System.out.println("Player 1 wins!");
		else if(points1 < points2)
			System.out.println("Player 2 wins!");
		else
			System.out.println("Game ends in a tie");
	}
	
	private void displayContentsOfBag(ArrayList<String> bagCopy2) {
		for(String card : bagCopy) {
			System.out.print(card + " ");
		}
	}
	
	private boolean isDuplicateAnswer(ArrayList<String> p1Answers, ArrayList<String> p2Answers, String card) {
		return (p1Answers.contains(card) || p2Answers.contains(card));
	}

	private void setPlayerPoints(int turnPlayer) {
		if(turnPlayer == 1)
			p1Points++;
		else if(turnPlayer == 2)
			p2Points++;
	}

	private void displayPlayerScore(int player, ArrayList<String> answers) {
		if(player == 1)
			System.out.println("Player 1 current score: " + p1Points + " " + answers.toString());
		else if(player == 2)
			System.out.println("Player 2 current score: " + p2Points + " " + answers.toString());
	}

	private boolean isCardInBag(String card, ArrayList<String> bag) {
		return (bag.contains(card));
	}

	public ArrayList<String> getGameCards() {
		return gameCards;
	}

	public ArrayList<String> getBagOfCards() {
		return bagCopy;
	}

	public int getP1Points() {
		return p1Points;
	}

	public int getP2Points() {
		return p2Points;
	}

	public ArrayList<String> getP1CorrectAnswers() {
		return p1CorrectAnswers;
	}

	public ArrayList<String> getP2CorrectAnswers() {
		return p2CorrectAnswers;
	}

}

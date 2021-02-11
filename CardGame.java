public class CardGame {

	public static void main(String[] args) {
		
		System.out.println("Six cards from the following list will be put into a bag randomly: \nA, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K.");
		System.out.println("Two players will take turns guessing which cards are in the bag.");
		System.out.println("The first player to correctly guess all the cards wins.");
		
		GuessCardGame newGame = new GuessCardGame();
		newGame.startGame();
	}

}

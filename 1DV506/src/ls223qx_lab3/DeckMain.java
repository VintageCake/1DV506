package ls223qx_lab3;

public class DeckMain {

	public static void main(String[] args) {
		Deck deck = new Deck(); // Call a deck
		deck.shuffle(); // Shuffle it
		
		for (int i = 0; i < 5; i++) { // Pick 5 cards and display them.
			System.out.println(deck.getCard().getInfo());
		}
		System.out.println("Cards used: " + deck.cardsUsed()); // Find out how many cards we just used.
		System.out.println("Cards remaining: " + deck.cardsRemaining()); // Find out how many are left in the deck.
	}

}

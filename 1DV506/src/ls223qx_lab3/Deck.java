package ls223qx_lab3;

public class Deck {
	private Card[] cards = new Card[52]; // Array-like variable which holds indexes for all of the later generated cards.
	private int cardsUsed = 0; // Keeps track of how many cards you have 'used up'.
	
	public Deck() { // Constructor will call 52 card objects.
		int cardTracker = 0;
		
		for (int i = 1; i < 14; i++) {
			cards[cardTracker] = new Card(i, Card.Suit.SPADES);
			cardTracker++;
		}
		for (int i = 1; i < 14; i++) {
			cards[cardTracker] = new Card(i, Card.Suit.DIAMONDS);
			cardTracker++;
		}
		for (int i = 1; i < 14; i++) {
			cards[cardTracker] = new Card(i, Card.Suit.CLUBS);
			cardTracker++;
		}
		for (int i = 1; i < 14; i++) {
			cards[cardTracker] = new Card(i, Card.Suit.HEARTS);
			cardTracker++;
		}
	}
	
	public Card getCard() {
		cardsUsed++;
		return cards[cardsUsed-1];
	}
	
	public int cardsUsed() { 
		return cardsUsed;
	}
	
	public int cardsRemaining() {
		return 52 - cardsUsed;
	}
	
    public void shuffle() {
        for (int i = cards.length-1; i > 0; i--) { // Shuffle solution is from https://math.hws.edu/javanotes/source/chapter5/Deck.java, unknown author.
            int random = (int)(Math.random()*(i+1)); // Pick a random number from 0 to 51. (Randomly pick a card)
            Card temp = cards[i]; // Remember the card at the position i.
            cards[i] = cards[random]; // Replace card at index I with the randomly picked card.
            cards[random] = temp; // Put the remembered card in the position of the randomly picked card.
            
            // Effectively, they will switch places.
        }
        cardsUsed = 0; // Because cards aren't physically removed and stored somewhere else when we get a card, shuffling it means we put it all back. Thus, we have reset the card counter.
    }



}

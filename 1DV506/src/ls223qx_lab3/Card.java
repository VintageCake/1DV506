package ls223qx_lab3;

public class Card {
	public enum Suit{ // An enum which can later be used as a property for the card suits.
		SPADES, HEARTS, CLUBS, DIAMONDS
	}
	
	private int number; // Fields for card number and suit
	private Suit suit;
	public Card() {
		
	}
	public Card(int n, Suit s) { // No error control for this constructor!
		number = n;
		suit = s;
	}
	public int getRank() { // Return the current rank of this card
		return number;
	}
	public Suit getSuit() { // Return the current suit of this card
		return suit;
	}
	
	public void setNumber(int n) { // Set the rank for this card
		number = n;
	}
	public void setSuit(Suit s) { // Set the suit for this card
		suit = s;
	}
	
	public String getInfo() { // Returns a string which has both suit and number.
		return number + " " + suit;
	}
	
	

}

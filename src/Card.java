import java.util.ArrayList;
import java.util.List;

public class Card {
	
	private Rank rank;
	private Suit suit;
	
	public enum Rank {
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING,
		ACE;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public enum Suit {
		CLUBS,
		DIAMONDS,
		HEARTS,
		SPADES;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return rank + " of " + suit;
	}
}

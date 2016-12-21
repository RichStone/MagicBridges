import java.util.ArrayList;
import java.util.Arrays;

public class Play {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.newDeck();
		deck.initializeActionCards();
		deck.printDeck();
	}
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Deck 
{
	private final ArrayList<Card> protoDeck = new ArrayList<Card>();
	private Stack<Card> currDeck = new Stack<Card>();
	
	//Initialize prototype deck
	public void newDeck()
	{
		for(Card.Suit suit : Card.Suit.values()){ 
			for(Card.Rank rank : Card.Rank.values()) {
				protoDeck.add(new Card(rank, suit));
			}
		}
		for(Card card : protoDeck) {
			currDeck.push(card);
		}
	}
	
	public void initializeActionCards() 
	{
		for(Card card : protoDeck) {
			if(card.toString().startsWith("SEVEN")) {
				card = new ActionCard(card, "take two cards", 2);
				System.out.println(((ActionCard) card).getDescription());
				System.out.println(card);
			}
		}
	}
	
	public void printDeck() 
	{
		int count = 1;
		for(Card card : currDeck) {
			System.out.println((count++) + " - " + card.toString());
		}
	}
	
	public void shuffle() 
	{
		Random rnd = new Random();
		ArrayList<Card> copyDeck = new ArrayList<Card>(protoDeck);
		Stack<Card> newDeck = new Stack<Card>();
		
		for(int i = 0; i < copyDeck.size(); ) {
			int cardNumber = rnd.nextInt(copyDeck.size());
			newDeck.push(copyDeck.get(cardNumber));
			copyDeck.remove(cardNumber);
		}
		currDeck = newDeck;
	}
}

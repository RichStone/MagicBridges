
public class ActionCard extends Card 
{
	private String description;
	private Suit chooseSuit = null;
	private int takeCards = 0;
	private boolean mustCover;
	
	public ActionCard(Rank rank, Suit suit, String description) 
	{
		super(rank, suit);
		this.description = description;
	}
	
	public ActionCard(Card card) 
	{
		super(card.getRank(), card.getSuit());
	}
	
	public ActionCard(Card card, String description, int nrOfCards) 
	{
		super(card.getRank(), card.getSuit());
		this.description = description;
		this.takeCards = nrOfCards;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getDescription() {
		String description = this.description;
		description += (mustCover) ? " and it is your opponent's turn.":" and you must cover your card.";
		return description;
	}
}

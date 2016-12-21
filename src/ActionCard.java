
public class ActionCard extends Card 
{
	private String description;
	
	public ActionCard(Rank rank, Suit suit, String description) 
	{
		super(rank, suit);
		this.description = description;
	}
	
}

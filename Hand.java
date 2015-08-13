import java.util.LinkedList;
import java.util.List;


public class Hand {
	private List<Card> cards;
	
	public Hand() {
		this.cards = new LinkedList<Card>();
	}
	
	public List<Card> getCards() {
		return this.cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public int size() {
		return cards.size();
	}
	
	public String toString() {
		String output = "";
		for (Card card : cards) {
			output += (card.toString() + "\n");
		}
		return output;
	}
}

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class Deck {
	private static List<Card> deck;
	public static int totalNumberOfCards = 52;
	
	public Deck() {
		deck = new LinkedList<Card>();
		setup();
	}
	
	public static void setup() {
		for (Card.Rank rank : Card.Rank.values()) {
			for (Card.Suit suit : Card.Suit.values()) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	public Card takeCard() {
		return deck.remove(0);
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	
	public void resetDeck() {

	}
	
	public void printDeck() {
		for (Card card : deck) {
			System.out.println(card.toString());
		}
	}
	
	public int size() {
		return deck.size();
	}
}

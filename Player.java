import java.util.List;

public class Player {
	private String name;
	private Hand hand;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.hand = new Hand();
		this.score = 0;
	}
	
	public Hand getCards() {
		return this.hand;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void seeCards() {
		  List<Card> cards = hand.getCards();
		  for (Card card : cards) {
		    System.out.println(card.toString());
		}
	}
	
	
	public void hit() {
		System.out.println("Calling Dealer.hit(hand)");
		Dealer.hit(hand);
		System.out.println("Successfuly called!");
	}
	
	public void stay() {
		System.out.println("Player chose to stay.");
	}
	
	public void addFive() {
		this.score += 5;
	}
	
	public void addTen() {
		this.score += 10;
	}
	
	public void addFifteen() {
		this.score += 15;
	}
}




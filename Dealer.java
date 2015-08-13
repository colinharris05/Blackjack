public class Dealer {
	
	private static Deck deck;
	
	public Dealer() {
		this.deck = new Deck();
	}
	
	/*
	 * This method deals two cards to a player from the top
	 * of the deck.
	 * player is the Player who receives the hand.
	 */
	public void dealHand(Player player) {
		for (int i = 0; i < 2; i++) {
			Card card = deck.takeCard();
			player.getCards().addCard(card);
		}
	}
	
	/*
	 *  This method gives a card to a particular hand.
	 *  hand is the Hand to take the top card
	// Probably wont be static
	 */
	public static void hit(Hand hand) {
		Card card = deck.takeCard();
		hand.addCard(card);
	}

}

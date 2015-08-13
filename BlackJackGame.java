import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BlackJackGame {

	
	public static void main(String[] args) {
		// Create objects
		Deck deck = new Deck();
		Dealer dealer = new Dealer();
		deck.shuffleDeck();
		// Prompt main menu, and get array of player objects
		Player[] players = mainMenu(dealer);
		
		/* Testing stuff
		deck.printDeck();
		deck.shuffleDeck();
		System.out.println("***********************************");
		deck.printDeck();
		System.out.println("Calling dealer.dealHand");
		dealer.dealHand(player);
		player.seeCards();
		System.out.println("Deck created");
		*/

		for (Player player : players) {
			dealer.dealHand(player);
			System.out.println(player.getName() + ", your cards are: ");
			System.out.println(player.getCards().toString());
		}
		System.out.println("Asking player for move!");
		
		for (Player player : players) {
			askPlayerForMove(player);
		}
		System.out.println("Asked player for move.");
	}
	

	
	public static Player[] mainMenu(Dealer dealer) {
		System.out.println("Welcome to Blackjack!");
				boolean done = false;
				Scanner input = null;
				boolean validInput = false;
				int numPlayers = 0;
				Player[] players = null;
			
				System.out.print("How many people are playing? ");
				try {
					input = new Scanner(System.in);
					while (!validInput) {
						
						if (input.hasNextInt()) {
							numPlayers = input.nextInt();
							validInput = true;
							players = new Player[numPlayers];
						} else {
							System.out.print("Please enter the number of players: ");
							input.nextLine();
						}
					}
					
					for (int i = 1; i <= numPlayers; i++) {
						System.out.print("Enter name of Player " + i + ": ");
						String name = input.next();
						players[i-1] = new Player(name);
					}
				
					// System.out.println("Number of player objects: " + players.length);
					input.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				// System.out.println("Number of players: " + numPlayers);
				System.out.println("Let the game begin!\n");
				
				
				return players;
	}
	
	public static void askPlayerForMove(Player player) {
		Scanner input;
		boolean valid = false;
		int userChoice = 0;
		try {
			input = new Scanner(System.in);
			System.out.print("Please select hit (1) or stay (2): ");
			
			
			// Prompt the user to either hit or stay until they enter valid input
			while (!valid) {
				if (input.hasNext()) {
					userChoice = input.nextInt();
					switch (userChoice) {
						case 1: player.hit();
						System.out.println("Called hit");
			    	    	valid = true;
						    break;
						case 2: player.stay();
						System.out.println("Called ");
							valid = true;
							break;
						default: System.out.print("Please enter 1 for hit or 2 for stay: ");
							System.out.println();
							break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (userChoice == 1) {
			System.out.println("You chose to hit. Your cards are:");
			System.out.println(player.getCards().toString());
		} else {
			System.out.println("You chose to stay.");
		}
			
		
		
				
	}

}

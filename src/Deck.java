// import java.io.*;
import java.util.*;
// import java.math.*;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		reset();
		shuffleDeck();
	}
	
	public void reset() {
		this.deck.clear();
		
		// Adding in spades suit
		for (int k = 2; k < 15; k++) {
			deck.add(new Card(k,"Spades"));
		}
		
		// Adding in clubs suit
		for (int l = 2; l < 15; l++) {
			deck.add(new Card(l,"Clubs"));
		}
		
		// Adding in diamonds suit
		for (int j = 2; j < 15; j++) {
			deck.add(new Card(j,"Diamonds"));
		}
		
		// Adding in hearts suit
		for (int i = 2; i < 15; i++) {
			deck.add(new Card(i,"Hearts"));
		}
	}
	
	public void shuffleDeck() {
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		while (this.deck.size() > 0) {
			int randomIndex = ((int) (Math.random() * 100)) % this.deck.size();
			tempDeck.add(this.deck.remove(randomIndex));
		}
		this.deck = tempDeck;
	}

	public Card getNextCard() {
		return this.deck.remove(this.deck.size()-1);
	}
	
	public int getRemainingCardCount() {
		return this.deck.size();
	}

}
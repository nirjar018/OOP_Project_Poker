// import java.util.*;
// import java.io.*;
// import java.math.*;

public class Card {
	private int rank;
	private String suit;
	private String color;
    private boolean isFlipped;                     
	
	public Card(int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		if (this.suit.equals("Diamonds") || this.suit.equals("Hearts")) {
			this.color = "Red";
		}
		if (this.suit.equals("Clubs") || this.suit.equals("Spades")) {
			this.color = "Black";
		}
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	public String getColor() {
		return this.color;
	}

    public void flip(){                             
        isFlipped = !(isFlipped);
    }
	
	public String convertRankToName() {
		switch(this.rank) {
			case 1: return "Ace";
			case 2: return "Two";
			case 3: return "Three";
			case 4: return "Four";
			case 5: return "Five";
			case 6: return "Six";
			case 7: return "Seven";
			case 8: return "Eight";
			case 9: return "Nine";
			case 10: return "Ten";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			case 14: return "Ace";
			default: return "Invalid";
		}
	}
	
	public String toString() {
		return (convertRankToName() + " of " + this.suit);
	}

}
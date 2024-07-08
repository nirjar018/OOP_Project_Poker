import java.util.*;
// import java.io.*;
// import java.math.*;

public class Player {
	private String name;
	private int balance;
	private Card[] holeCards = new Card[2];
	private boolean isInGame;
	
	public Player(String name, int balance, Card[] holeCards) {
		this.name = name;
		this.balance = balance;
		this.holeCards = holeCards;
		this.isInGame = true;
	}
	
	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}
	
	public void addToBalance(int additionAmount) {
		this.balance += additionAmount;
	}
	
	public void reduceFromBalance(int reduceAmount) {
		this.balance -= reduceAmount;
	}
	
	public Card[] getHoleCards() {
		return this.holeCards;
	}
	
	public void setHoleCards(Card[] holeCards) {
		this.holeCards = holeCards;
	}
	
	public boolean getIsInGame() {
		return this.isInGame;
	}
	
	public void setIsInGame(boolean isInGame) {
		this.isInGame = isInGame;
	}

	public String toString() {
		return ("Player: " + this.name + " has a balance of " + this.balance + 
				".\nHole cards: " + Arrays.toString(this.holeCards) + ".\nIn the game: " + this.isInGame);
	}

}
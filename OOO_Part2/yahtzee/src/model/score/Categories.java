package model.score;

import model.turn.Turn;

public enum Categories {
	
	ACES("Aces", null),
	TWOS("Twos", null),
	THREES("Threes", null),
	FOURS("Fours", null),
	FIVES("Fives", null),
	SIXES("Sixes", null),
	THREE_OF_A_KIND("Three of a kind", null),
	FOUR_OF_A_KIND("Four of a kind", null),
	FULL_HOUSE("Full house", null),
	SMALL_STRAIGHT("Small straight", null),
	LARGE_STRAIGHT("Large straight", null),
	YAHTZEE("Yahtzee", null),
	CHANCE("Chance", null);
	
	private String categorie;
	private String score;
	private Turn turn;
	
	Categories(String categorie, String score){
		this.categorie = categorie;
		this.score = score;
	}
	
	public String getCategorie() {
	    return categorie;
	}
	
	public String getScore(){
		return score;
	}

}

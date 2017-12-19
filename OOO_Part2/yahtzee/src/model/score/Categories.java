package model.score;

public enum Categories {
	
	ACES("Aces", "0"),
	TWOS("Twos", "0"),
	THREES("Threes", "0"),
	FOURS("Fours", "0"),
	FIVES("Fives", "0"),
	SIXES("Sixes", "0"),
	THREE_OF_A_KIND("Three of a kind", "0"),
	FOUR_OF_A_KIND("Four of a kind", "0"),
	FULL_HOUSE("Full house", "0"),
	SMALL_STRAIGHT("Small straight", "0"),
	LARGE_STRAIGHT("Large straight", "0"),
	YAHTZEE("Yahtzee", "0"),
	CHANCE("Chance", "0");
	
	private String categorie;
	private String score;
	
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

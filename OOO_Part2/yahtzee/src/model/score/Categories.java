package model.score;

public enum Categories {
	
	ACES("Aces"),
	TWOS("Twos"),
	THREES("Threes"),
	FOURS("Fours"),
	FIVES("Fives"),
	SIXES("Sixes"),
	THREE_OF_A_KIND("Three of a kind"),
	FOUR_OF_A_KIND("Four of a kind"),
	FULL_HOUSE("Full house"),
	SMALL_STRAIGHT("Small straight"),
	LARGE_STRAIGHT("Large straight"),
	YAHTZEE("Yahtzee"),
	CHANCE("Chance");
	
	private String categorie;
	
	Categories(String categorie){
		this.categorie = categorie;
	}
	
	public String getCategorie() {
	    return categorie;
	}

}

package model.score;



public enum Categories {
	
	ACES("Aces", 0),
	TWOS("Twos", 1),
	THREES("Threes", 2),
	FOURS("Fours", 3),
	FIVES("Fives", 4),
	SIXES("Sixes", 5),
	THREE_OF_A_KIND("Three of a kind", 6),
	FOUR_OF_A_KIND("Four of a kind", 7),
	FULL_HOUSE("Full house", 8),
	SMALL_STRAIGHT("Small straight", 9),
	LARGE_STRAIGHT("Large straight", 10),
	YAHTZEE("Yahtzee", 11),
	CHANCE("Chance", 12), 
	YAHTZEE_BONUS("Yahtzee bonus", 13);
	
	private String categorie;
	private int score;
	
	Categories(String categorie, int score){
		this.categorie = categorie;
		this.score = score;
	}
	
	public Categories getCategorie(String category) {
		Categories returnCategory = null;
	    for (Categories c : Categories.values()) {
	    	if(c.toString().equals(category.toUpperCase()))returnCategory = c;
	    }
	    return returnCategory;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getCategorie(int score){
		if(score == this.score){
			return categorie;
		}
		return categorie;
	}
}

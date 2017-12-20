package view.wrapper;

import model.score.Categories;

public class CategoryScore {
    
	private Categories category;
	private int score;
		    
	public CategoryScore(Categories cat, int score) {
		this.category = cat;
		this.score = score;
	}

	public Categories getCategory() {
		return category;
	}
		    
	public int getScore() {
		return score;
	}
		    
}
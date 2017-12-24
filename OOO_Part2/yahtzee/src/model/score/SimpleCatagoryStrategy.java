package model.score;

public class SimpleCatagoryStrategy {
	Category category;
	
	
	public Category catagory(Categories category) {
		
		if (category.equals(Categories.ACES)){
			return new Aces();
		} else if(category.equals(Categories.TWOS)){
			return new Twos();
		} else if(category.equals(Categories.THREES)){
			return new Threes();
		} else if(category.equals(Categories.FOURS)){
			return new Fours();	
		} else if(category.equals(Categories.FIVES)){
			return new Fives();
		} else if(category.equals(Categories.SIXES)){
			return new Sixes();
		} else if(category.equals(Categories.THREE_OF_A_KIND)){
			return new ThreeOfAKind();
		} else if(category.equals(Categories.FOUR_OF_A_KIND)){
			return new FourOfAKind();
		} else if(category.equals(Categories.FULL_HOUSE)){
			return new FullHouse();
		} else if(category.equals(Categories.SMALL_STRAIGHT)){
			return new SmallStraight();
		} else if(category.equals(Categories.LARGE_STRAIGHT)){
			return new LargeStraight();
		} else if(category.equals(Categories.CHANCE)){
			return new Chance();
		} else if(category.equals(Categories.YAHTZEE)){
			return new Yahtzee();
		}else if(category.equals(Categories.YAHTZEE_BONUS)){
			return new YahtzeeBonus();
		}
		return null;
	}
	
	
}

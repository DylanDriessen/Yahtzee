package model.score;

import java.util.List;

import exception.DomainException;
import model.board.Dice;
import model.enums.Categories;

public class Score {
	int score = 0;
	

	public Score() {
	}

	public int getScore() {
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}
	
	public void addScore(List<Dice> dices, String catagory) {
		int score = 0;
		
		if(catagory == null || catagory.trim().isEmpty()) throw new DomainException("Select a catagory");
		
		if(catagory.equals("aces")) {
			score = aces(dices);
		} else if(catagory.equals("twos")) {
			score = twos(dices);
		} else if(catagory.equals("threes")) {
			score = threes(dices);
		} else if(catagory.equals("fours")) {
			score = fours(dices);
		} else if(catagory.equals("fives")) {
			score = fives(dices);
		} else if(catagory.equals("sixes")) {
			score = sixes(dices);
		}
		
		this.score = this.score + score;
	}
	
	//Categories
	//Uppers section score
	
	private int aces(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 1) score++;
		}
		
		return score;
	}
	
	
	private int twos(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 2) score = score + 2;
		}
		
		return score;
	}
	
	private int threes(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 3) score = score + 3;
		}
		
		return score;
	}
	
	private int fours(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 4) score = score + 4;
		}
		
		return score;
	}
	
	private int fives(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 5) score = score + 5;
		}
		
		return score;
	}
	
	private int sixes(List<Dice> dices) {
		int score = 0;
		
		for (Dice dice : dices) {
			if(dice.getEyes() == 6) score = score + 6;
		}
		
		return score;
	}
	
	
	//Lower section score
	
	private int threeOfAKind(List<Dice> dices) {
		int score = 0;
		int sameDice = 0;
		
		for(Dice dice : dices) {
			sameDice = 0;
			
			for(Dice dice2 : dices) {
				if(dice.getEyes() == dice2.getEyes()) sameDice++;
			}
		}
		
		if(sameDice < 5)throw new DomainException("Only possible if you have dices with the same value");
		
		return score;
	}
	
	
}

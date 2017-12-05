package model.score;

import java.util.List;

import model.board.Dice;

public class Chance implements Category{

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;
		for(Dice dice : dices) {
			score = score + dice.getEyes();
		}
		return score;
	}

}

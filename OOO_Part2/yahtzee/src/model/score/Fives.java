package model.score;

import java.util.List;


import model.board.Dice;

public class Fives implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;

		for (Dice dice : dices) {
			if (dice.getEyes() == 5)
				score = score + 5;
		}

		return score;
	}

}

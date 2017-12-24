package model.score;

import java.util.List;


import model.board.Dice;

public class Threes implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;

		for (Dice dice : dices) {
			if (dice.getEyes() == 3)
				score = score + 3;
		}

		return score;
	}

}

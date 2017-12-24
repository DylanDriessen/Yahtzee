package model.score;

import java.util.List;


import model.board.Dice;

public class Twos implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;

		for (Dice dice : dices) {
			if (dice.getEyes() == 2)
				score = score + 2;
		}

		return score;
	}

}

package model.score;

import java.util.List;


import model.board.Dice;

public class Sixes implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int score = 0;

		for (Dice dice : dices) {
			if (dice.getEyes() == 6)
				score = score + 6;
		}
		return score;
	}

}

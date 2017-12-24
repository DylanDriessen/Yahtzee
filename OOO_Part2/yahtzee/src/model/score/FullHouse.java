package model.score;

import java.util.List;


import model.board.Dice;

public class FullHouse implements Category {

	@Override
	public int getPoints(List<Dice> dices) {
		int threeSameDices = 0;
		int twoSameDices = 0;
		int testDice = 0;

		for (Dice dice : dices) {
			testDice = 0;
			for (Dice dice2 : dices) {
				if (dice.getEyes() == dice2.getEyes())
					testDice++;
			}

			if (testDice == 3)
				threeSameDices = testDice;
			if (testDice == 2)
				twoSameDices = testDice;
		}

		if (twoSameDices == 0 || threeSameDices == 0)
			return 0;

		return 25;
	}

}
